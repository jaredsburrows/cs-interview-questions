plugins {
    alias(libs.plugins.versions)
    alias(libs.plugins.license) apply false
    `test-report-aggregation`
    idea
}

idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}

tasks.withType<Wrapper>().configureEach {
    distributionType = Wrapper.DistributionType.ALL
}

tasks.register<TestReport>("testReport") {
    description = "Runs the test report."
    destinationDirectory.set(layout.buildDirectory.dir("reports/tests/aggregate"))
    subprojects.forEach { sub ->
        sub.tasks.withType<Test>().forEach { testTask ->
            testResults.from(testTask)
        }
    }
}

tasks.register<Delete>("clean") {
    description = "Cleans the project."
    delete(layout.buildDirectory)
}
