import org.gradle.nativeplatform.Linkage
import org.gradle.nativeplatform.toolchain.Clang
import org.gradle.nativeplatform.toolchain.Gcc
import org.gradle.nativeplatform.toolchain.VisualCpp

plugins {
    `cpp-library`
}

// Pinned here rather than in the version catalog: the artifact comes from GitHub releases, not a Maven repository.
val googleTestVersion = "1.18.0"

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

val unpackGoogleTest = tasks.register<Sync>("unpackGoogleTest") {
    description = "Unpacks the Google Test archive"
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
