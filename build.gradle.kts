// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("maven-publish")
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.library") version "8.1.4" apply false
}



publishing {
    publications {
        create("maven_public", MavenPublication::class) {
            groupId = "org.gradle.sample"
            artifactId = "library"
            version = "1.1"
//            from(components.getByName("java"))
        }
    }
}
