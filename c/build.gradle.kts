import org.gradle.nativeplatform.Linkage
import org.gradle.nativeplatform.test.cpp.CppTestExecutable
import org.gradle.nativeplatform.toolchain.Clang
import org.gradle.nativeplatform.toolchain.Gcc
import org.gradle.nativeplatform.toolchain.NativeToolChain
import org.gradle.nativeplatform.toolchain.VisualCpp

plugins {
    `cpp-library`
    `cpp-unit-test`
}

// cpp-library compiles with the C++ driver; "-x c" (Gcc/Clang) and "/TC" (VisualCpp) switch it to C.
fun compilerArgsFor(toolChain: NativeToolChain): List<String> =
    when (toolChain) {
//        is Gcc, is Clang -> listOf("-x", "c", "-std=c11", "-Wall", "-Wextra", "-Werror", "-O3", "-pedantic")
        is Gcc, is Clang -> listOf("-x", "c", "-std=c11", "-Wall", "-Wextra", "-O3", "-pedantic")
        is VisualCpp -> listOf("/TC", "/Wall", "/Wx", "/O1", "/O2", "/Ox")
        else -> emptyList()
    }

library {
    baseName.set("main")
    linkage.set(listOf(Linkage.STATIC, Linkage.SHARED))
    publicHeaders.from("src/main/include")

    binaries.configureEach {
        compileTask.get().source.from(fileTree("src/main/c") { include("**/*.c") })
        compileTask.get().compilerArgs.addAll(compilerArgsFor(toolChain))
    }
}

tasks.named("assemble") {
    dependsOn("assembleDebugStatic", "assembleDebugShared")
}

unitTest {
    baseName.set("mainTest")
    dependencies {
        implementation(project(":googletest"))
    }
    binaries.configureEach(CppTestExecutable::class.java) {
        val tc = toolChain
        // The tests are C++ (GoogleTest 1.15 requires C++14), so they do not get the library's "-x c" C flags.
        compileTask.get().compilerArgs.addAll(
            when {
                tc is Gcc || tc is Clang -> listOf("-std=c++14", "-Wall", "-Wextra", "-O3", "-pedantic")
                tc is VisualCpp -> listOf("/std:c++14", "/Wall", "/Wx", "/O1", "/O2", "/Ox")
                else -> emptyList()
            }
        )
        if (targetMachine.operatingSystemFamily.isLinux) {
            linkTask.get().linkerArgs.add("-pthread")
        }
    }
}
