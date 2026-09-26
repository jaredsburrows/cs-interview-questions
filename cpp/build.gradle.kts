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

fun compilerArgsFor(toolChain: NativeToolChain): List<String> =
    when (toolChain) {
//        is Gcc, is Clang -> listOf("-std=c++20", "-Wall", "-Wextra", "-Werror", "-O3", "-pedantic")
        is Gcc, is Clang -> listOf("-std=c++20", "-Wall", "-Wextra", "-O3", "-pedantic")
        is VisualCpp -> listOf("/Wall", "/Wx", "/O1", "/O2", "/Ox")
        else -> emptyList()
    }

library {
    baseName.set("main")
    linkage.set(listOf(Linkage.STATIC, Linkage.SHARED))
    publicHeaders.from("src/main/include")

    binaries.configureEach {
        compileTask.get().compilerArgs.addAll(compilerArgsFor(toolChain))
    }
}

tasks.named("assemble") {
    dependsOn("assembleDebugStatic", "assembleDebugShared")
}

unitTest {
    baseName.set("mainTest")
    privateHeaders.from("src/test/include")
    dependencies {
        implementation(project(":googletest"))
    }
    binaries.configureEach(CppTestExecutable::class.java) {
        val tc = toolChain
        // The project compiles C++ as C++20, so the test binary uses the same standard as the library.
        compileTask.get().compilerArgs.addAll(
            when {
                tc is Gcc || tc is Clang -> listOf("-std=c++20", "-Wall", "-Wextra", "-O3", "-pedantic")
                tc is VisualCpp -> listOf("/std:c++20", "/Wall", "/Wx", "/O1", "/O2", "/Ox")
                else -> emptyList()
            }
        )
        if (targetMachine.operatingSystemFamily.isLinux) {
            linkTask.get().linkerArgs.add("-pthread")
        }
    }
}
