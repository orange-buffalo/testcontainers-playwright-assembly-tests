group = "io.orange-buffalo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val testcontainersPlaywrightVersion = findProperty("testcontainersPlaywrightVersion")?.toString() ?: "0.10.3"

subprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    apply(plugin = "java")

    val testImplementation by configurations
    val testRuntimeOnly by configurations

    dependencies {
        testImplementation("io.orange-buffalo:testcontainers-playwright:${testcontainersPlaywrightVersion}")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
        testRuntimeOnly("ch.qos.logback:logback-classic:1.4.7")
    }

    tasks.withType(Test::class.java) {
        useJUnitPlatform()
    }

    configure<JavaPluginExtension> {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
