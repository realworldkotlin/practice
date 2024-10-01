import org.gradle.api.JavaVersion.VERSION_21

plugins {
    kotlin("jvm") version "2.0.20"
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }

    tasks {
        java {
            sourceCompatibility = VERSION_21
            targetCompatibility = VERSION_21
        }

        withType<Test> {
            useJUnitPlatform()
        }
    }

    dependencies {
        api("org.jetbrains.kotlin:kotlin-reflect:2.0.20")
        testImplementation(platform("org.junit:junit-bom:5.11.0"))

        testImplementation("org.junit.jupiter:junit-jupiter-api")
        testImplementation("org.junit.jupiter:junit-jupiter-engine")
        testImplementation("org.hamcrest:hamcrest:3.0")
    }

    sourceSets {
        main {
            java {
                srcDirs("src/main/exercises")
            }
            kotlin {
                srcDirs("src/slides")
                srcDirs("src/handouts")
                srcDirs("src/main/exercises")
                srcDirs("src/main/solutions")
            }
        }
        test {
            kotlin {
                srcDirs("src/test/exercises")
                srcDirs("src/test/solutions")
            }
        }
    }
}
