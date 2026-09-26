import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    `java-library`
    groovy
    alias(libs.plugins.license)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile>().configureEach {
    options.apply {
        compilerArgs.addAll(listOf("-Xlint:all", "-Xlint:-options"))
        encoding = "UTF-8"
        isFork = true
    }
}

tasks.withType<GroovyCompile>().configureEach {
    options.apply {
        compilerArgs.addAll(listOf("-Xlint:all", "-Xlint:-options"))
        encoding = "UTF-8"
        isFork = true
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()

    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        events = setOf(TestLogEvent.FAILED, TestLogEvent.SKIPPED)
        showCauses = true
        showExceptions = true
        showStackTraces = true
    }

    val maxWorkerCount = gradle.startParameter.maxWorkerCount
    maxParallelForks = if (maxWorkerCount < 2) 1 else maxWorkerCount / 2
}

dependencies {
    compileOnly(libs.findbugs)

    testImplementation(platform(libs.junit.bom))
    testRuntimeOnly(libs.junit.platform.launcher)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.vintage.engine)

    testImplementation(localGroovy())
    testImplementation(libs.spockcore) { exclude(module = "groovy-all") } // Use localGroovy()
    testImplementation(libs.equalsverifier)
}
