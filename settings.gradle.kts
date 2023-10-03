pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "algorithms"
include("sorting:java-code")
findProject(":sorting:java-code")?.name = "java-code"
include("sorting:kotlin-code")
findProject(":sorting:kotlin-code")?.name = "kotlin-code"
include("search:java-code")
findProject(":search:java-code")?.name = "java-code"
