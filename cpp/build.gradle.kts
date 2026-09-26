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
        is Gcc, is Clang -> listOf("-std=c++17", "-Wall", "-Wextra", "-O3", "-pedantic")
        is VisualCpp -> listOf("/Wall", "/Wx", "/O1", "/O2", "/Ox")
        else -> emptyList()
    }

library {
    baseName.set("main")
    linkage.set(listOf(Linkage.STATIC, Linkage.SHARED))

    binaries.configureEach {
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
        compileTask.get().compilerArgs.addAll(compilerArgsFor(toolChain))
        if (targetMachine.operatingSystemFamily.isLinux) {
            linkTask.get().linkerArgs.add("-pthread")
        }
    }
}
