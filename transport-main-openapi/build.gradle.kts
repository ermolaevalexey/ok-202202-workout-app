plugins {
    kotlin("jvm") version "1.6.20"
}

group = "ru.otus.otuskotlin.workoutapp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("junit:junit:4.13.1")
    testImplementation(kotlin("test"))
}