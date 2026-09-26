import org.asciidoctor.gradle.jvm.AsciidoctorTask

plugins {
    alias(libs.plugins.asciidoctor)
}

tasks.named<AsciidoctorTask>("asciidoctor").configure {
    val gitCommitCount = providers.exec {
        workingDir(rootDir)
        commandLine("git", "rev-list", "--count", "HEAD", "origin/master")
        isIgnoreExitValue = true
    }
    if (gitCommitCount.result.get().exitValue != 0) {
        throw GradleException("Error executing Git command: ${gitCommitCount.standardError.asText.get().trim()}")
    }

    baseDirFollowsSourceDir()
    setSourceDir(file("src/main/asciidoc"))

    setAttributes(
        mapOf(
            "title" to "CS Interview Practice",
            "author" to "Jared Burrows",
            "email" to "jaredsburrows@gmail.com",
            "toc" to "left",
            "toclevels" to 2,
            "revnumber" to gitCommitCount.standardOutput.asText.get().trim(),
        ),
    )
}
