import java.io.ByteArrayOutputStream
import org.gradle.nativeplatform.Linkage
import org.gradle.nativeplatform.test.cpp.CppTestExecutable
import org.gradle.nativeplatform.test.tasks.RunTestExecutable
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

// Print nothing when the tests pass; print GoogleTest's failure output and fail the task otherwise.
tasks.withType<RunTestExecutable>().configureEach {
    args("--gtest_brief=1")
    isIgnoreExitValue = true
    doFirst {
        val captured = ByteArrayOutputStream()
        standardOutput = captured
        errorOutput = captured
    }
    doLast {
        val exitValue = executionResult.get().exitValue
        if (exitValue != 0) {
            logger.error(standardOutput.toString())
            throw GradleException("$path failed with exit code $exitValue")
        }
    }
}
