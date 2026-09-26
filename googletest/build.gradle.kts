import org.gradle.nativeplatform.Linkage
import org.gradle.nativeplatform.toolchain.Clang
import org.gradle.nativeplatform.toolchain.Gcc
import org.gradle.nativeplatform.toolchain.VisualCpp
import java.io.File
import java.security.MessageDigest

plugins {
    `cpp-library`
}

// Pinned here rather than in the version catalog: the artifact comes from GitHub releases, not a Maven repository.
val googleTestVersion = "1.18.0"
// SHA-256 for com.google.googletest:googletest:1.18.0@tar.gz
val googleTestSha256 = "6e3191c1455468b3fc35a417fb565c1c5071aee1b7e7f85e30cf48a98d37d8b5"

val googleTestArchive = configurations.create("googleTestArchive") {
    isCanBeConsumed = false
    isCanBeResolved = true
}

dependencies {
    googleTestArchive("com.google.googletest:googletest:$googleTestVersion@tar.gz")
}

interface ArchiveOperationsProvider {
    @get:Inject
    val archiveOperations: ArchiveOperations
}

val archiveOperations = objects.newInstance<ArchiveOperationsProvider>().archiveOperations

val verifyGoogleTestArchive = tasks.register("verifyGoogleTestArchive") {
    description = "Verifies SHA-256 of the downloaded Google Test archive"
    val archive = googleTestArchive.elements.map { it.single().asFile }
    val expected = googleTestSha256
    inputs.files(googleTestArchive)
    doLast {
        val file = archive.get()
        val digest = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { input ->
            val buffer = ByteArray(8192)
            var read = input.read(buffer)
            while (read > 0) {
                digest.update(buffer, 0, read)
                read = input.read(buffer)
            }
        }
        val actual = digest.digest().joinToString("") { "%02x".format(it) }
        check(actual.equals(expected, ignoreCase = true)) {
            "Checksum verification failed for ${file.name}. Expected $expected, got $actual"
        }
    }
}

val unpackGoogleTest = tasks.register<Sync>("unpackGoogleTest") {
    description = "Unpacks the Google Test archive"
    dependsOn(verifyGoogleTestArchive)
    val archives = archiveOperations
    from(googleTestArchive.elements.map { elements -> archives.tarTree(archives.gzip(elements.single().asFile)) })
    into(layout.buildDirectory.dir("unpacked"))
}

val googleTestRoot = unpackGoogleTest.map { it.destinationDir.resolve("googletest-$googleTestVersion/googletest") }

library {
    baseName.set("gtest")
    linkage.set(listOf(Linkage.STATIC))
    source.from(googleTestRoot.map { it.resolve("src/gtest-all.cc") })
    publicHeaders.from(googleTestRoot.map { it.resolve("include") })
    privateHeaders.from(googleTestRoot)
    binaries.configureEach {
        val tc = toolChain
        compileTask.get().compilerArgs.addAll(
            when (tc) {
                is Gcc, is Clang -> listOf("-std=c++17")
                is VisualCpp -> listOf("/std:c++17")
                else -> emptyList()
            }
        )
    }
}
