plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.junit:junit-bom:5.9.1"))
    testRuntimeOnly(platform("org.junit:junit-bom:5.9.1"))
    implementation("org.junit.jupiter:junit-jupiter")
    implementation("com.codeborne:selenide:7.0.2")
    implementation("io.github.bonigarcia:webdrivermanager:5.6.2")
    implementation("org.testng:testng:7.8.0")
    testRuntimeOnly("org.junit.support:testng-engine:1.0.4")
    implementation("junit:junit:4.13.1")
}

tasks.test {
    useJUnitPlatform()
}