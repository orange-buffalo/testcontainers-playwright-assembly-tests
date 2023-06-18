// this project uses the higher major kotlin version - 8, while the lib is on 7
plugins {
    kotlin("jvm") version "1.8.21"
}

kotlin {
    jvmToolchain(11)
}
