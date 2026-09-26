pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("com.gradle.develocity") version "4.6.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenCentral()
        gradlePluginPortal()
        exclusiveContent {
            forRepository {
                ivy {
                    name = "googletest-releases"
                    url = uri("https://github.com/google/googletest/releases/download/")
                    patternLayout { artifact("v[revision]/[artifact]-[revision].[ext]") }
                    metadataSources { artifact() }
                }
            }
            filter { includeGroup("com.google.googletest") }
        }
    }
}

develocity {
    buildScan {
        termsOfUseUrl.set("https://gradle.com/terms-of-service")
        termsOfUseAgree.set("yes")
        val isCI = System.getenv("CI") != null
        publishing.onlyIf { isCI }
    }
}

rootProject.name = "cs-interview-questions"

include("c")
include("cpp")
include("googletest")
include("java")
include("kotlin")
//include("python") // com.linkedin.python is having problems
