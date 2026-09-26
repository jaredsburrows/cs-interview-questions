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
    dependsOn(project(":docs").tasks.named("asciidoctor"))
    destinationDirectory.set(project(":docs").file("build/docs/asciidoc/tests"))
    subprojects.forEach { sub ->
        sub.tasks.withType<Test>().forEach { testTask ->
            testResults.from(testTask)
        }
    }
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}
