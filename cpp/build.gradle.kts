import org.gradle.nativeplatform.Linkage
import org.gradle.nativeplatform.test.cpp.CppTestExecutable
import org.gradle.nativeplatform.test.cpp.CppTestSuite
import org.gradle.nativeplatform.toolchain.Clang
import org.gradle.nativeplatform.toolchain.Gcc
import org.gradle.nativeplatform.toolchain.NativeToolChain
import org.gradle.nativeplatform.toolchain.VisualCpp

plugins {
    `cpp-library`
}

val gTestInclude = file("/usr/local/Cellar/gtest/include")
val gTestLibrary = file("/usr/local/Cellar/gtest/libgtest.a")
val hasGTest = gTestInclude.isDirectory

if (hasGTest) {
    apply(plugin = "cpp-unit-test")
}

fun compilerArgsFor(toolChain: NativeToolChain): List<String> =
    when (toolChain) {
//        is Gcc, is Clang -> listOf("-std=c++11", "-Wall", "-Wextra", "-Werror", "-O3", "-pedantic")
        is Gcc, is Clang -> listOf("-std=c++11", "-Wall", "-Wextra", "-O3", "-pedantic")
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

if (hasGTest) {
    configure<CppTestSuite> {
        baseName.set("mainTest")
        privateHeaders.from("src/test/include")

        binaries.configureEach(CppTestExecutable::class.java) {
            compileTask.get().compilerArgs.addAll(compilerArgsFor(toolChain))
            compileTask.get().includes.from(gTestInclude)
            linkTask.get().libs.from(gTestLibrary)
        }
    }
}
