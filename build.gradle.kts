plugins {
    kotlin("jvm") version "1.9.23"
}

group = "ie.setu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.slf4j:slf4j-simple:2.0.16")
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(16)
}