plugins {
    id("java")
}

group = "com.vd.algorithms"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.jetbrains:annotations:24.0.0")
    testImplementation("org.jetbrains:annotations:24.0.0")
}

tasks.test {
    useJUnitPlatform()
}