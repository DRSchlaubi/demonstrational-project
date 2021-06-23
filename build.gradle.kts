import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0"
}

group = "me.micha"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation("net.dv8tion:JDA:4.2.1_269")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.5.0")
    implementation("dev.kord:kord-core:0.7.x-SNAPSHOT")
    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}