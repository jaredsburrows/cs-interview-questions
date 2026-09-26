import org.gradle.nativeplatform.Linkage
import org.gradle.nativeplatform.toolchain.Clang
import org.gradle.nativeplatform.toolchain.Gcc
import org.gradle.nativeplatform.toolchain.VisualCpp
import java.io.File
import java.security.MessageDigest

fun File.sha256(): String {
    val digest = MessageDigest.getInstance("SHA-256")
    inputStream().use { input ->
        val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
        while (true) {
            val read = input.read(buffer)
            if (read <= 0) break
            digest.update(buffer, 0, read)
        }
    }
    return digest.digest().joinToString("") { "%02x".format(it) }
}

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
    inputs.files(googleTestArchive)
    doLast {
        val archiveFile = googleTestArchive.resolve().single()
        val actual = archiveFile.sha256()
        check(actual.equals(googleTestSha256, ignoreCase = true)) {
            "Checksum verification failed for ${archiveFile.name}. Expected $googleTestSha256, got $actual"
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
