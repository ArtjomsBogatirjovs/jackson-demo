plugins {
    val kotlinVersion = "2.2.0"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    id("org.springframework.boot") version "3.5.4"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.reflections:reflections:0.10.2")

    val jacksonVersion = "2.14.2"
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:${jacksonVersion}")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:${jacksonVersion}")
    implementation("com.fasterxml.jackson.core:jackson-databind:${jacksonVersion}")
    implementation("com.fasterxml.jackson.module:jackson-module-parameter-names:${jacksonVersion}")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:${jacksonVersion}")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${jacksonVersion}")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
