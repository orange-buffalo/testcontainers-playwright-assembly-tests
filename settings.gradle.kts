plugins {
    id("com.gradle.enterprise") version ("3.13.2")
}

rootProject.name = "testcontainers-playwright-assembly-tests"
include("java-basic")
include("java-custom-playwright")
include("kotlin-basic")
include("kotlin-8-basic")

