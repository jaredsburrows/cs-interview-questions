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

val cUnitInclude = file("/usr/local/Cellar/cunit/2.1-3/include")
val cUnitLibrary = file("/usr/local/Cellar/cunit/2.1-3/lib/libcunit.a")
val hasCUnit = cUnitInclude.isDirectory

if (hasCUnit) {
    apply(plugin = "cpp-unit-test")
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

if (hasCUnit) {
    // Replaces the launcher the software-model cunit-test-suite plugin used to generate.
    val generateCUnitLauncher = tasks.register("generateCUnitLauncher") {
        val outputDir = layout.buildDirectory.dir("generated/cunit")
        outputs.dir(outputDir)
        doLast {
            val dir = outputDir.get()
            dir.file("include/gradle_cunit_register.h").asFile.apply {
                parentFile.mkdirs()
                writeText(
                    """
                    |#ifndef GRADLE_CUNIT_REGISTER_H
                    |#define GRADLE_CUNIT_REGISTER_H
                    |
                    |void gradle_cunit_register(void);
                    |
                    |#endif
                    |""".trimMargin(),
                )
            }
            dir.file("c/gradle_cunit_main.c").asFile.apply {
                parentFile.mkdirs()
                writeText(
                    """
                    |#include <CUnit/Basic.h>
                    |#include "gradle_cunit_register.h"
                    |
                    |int main(void) {
                    |    if (CU_initialize_registry() != CUE_SUCCESS) {
                    |        return CU_get_error();
                    |    }
                    |
                    |    gradle_cunit_register();
                    |
                    |    CU_basic_set_mode(CU_BRM_VERBOSE);
                    |    CU_basic_run_tests();
                    |
                    |    unsigned int failureCount = CU_get_number_of_failures();
                    |    CU_cleanup_registry();
                    |    return failureCount == 0 ? 0 : 1;
                    |}
                    |""".trimMargin(),
                )
            }
        }
    }
    val cUnitLauncherDir = generateCUnitLauncher.map { layout.buildDirectory.dir("generated/cunit").get() }

    configure<CppTestSuite> {
        baseName.set("mainTest")
        privateHeaders.from("src/test/include")

        binaries.configureEach(CppTestExecutable::class.java) {
            compileTask.get().source.from(fileTree("src/test/c") { include("**/*.c") })
            compileTask.get().source.from(cUnitLauncherDir.map { it.file("c/gradle_cunit_main.c") })
            compileTask.get().includes.from(cUnitLauncherDir.map { it.dir("include") })
            compileTask.get().includes.from(cUnitInclude)
            compileTask.get().compilerArgs.addAll(compilerArgsFor(toolChain))
            linkTask.get().libs.from(cUnitLibrary)
        }
    }
}
