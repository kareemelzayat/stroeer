plugins {
    id("org.jetbrains.kotlin.plugin.allopen") version "2.1.20"
    id("org.jetbrains.kotlin.plugin.jpa") version "2.1.20"
    id("com.google.devtools.ksp") version "2.1.20-2.0.1"
    id("org.jetbrains.kotlin.jvm") version "2.1.20"

    id("io.micronaut.test-resources") version "4.5.3"
    id("io.micronaut.application") version "4.5.3"
    id("io.micronaut.aot") version "4.5.3"

    id("com.gradleup.shadow") version "8.3.6"
}

version = "0.1"
group = "com.stroeer"

val kotlinVersion = project.properties["kotlinVersion"]
repositories {
    mavenCentral()
}

dependencies {
    ksp("io.micronaut:micronaut-http-validation")
    ksp("io.micronaut.data:micronaut-data-processor")
    ksp("io.micronaut.serde:micronaut-serde-processor")
    ksp("io.micronaut.validation:micronaut-validation-processor")

    implementation("io.micronaut:micronaut-aop")
    implementation("io.micronaut:micronaut-retry")
    implementation("io.micronaut.reactor:micronaut-reactor")
    implementation("io.micronaut:micronaut-jackson-databind")

    implementation("io.micronaut.validation:micronaut-validation")
    implementation("io.micronaut.liquibase:micronaut-liquibase")

    // Micronaut Kotlin
    implementation("io.micronaut.kotlin:micronaut-kotlin-extension-functions")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")

    // Micronaut HTTP Client
    implementation("io.micronaut:micronaut-http-client")

    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test")

    // Micronaut Data
    implementation("io.micronaut.data:micronaut-data-hibernate-jpa")
    testImplementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    runtimeOnly("com.h2database:h2")

    // Logging
    runtimeOnly("ch.qos.logback:logback-classic")
}

application {
    mainClass.set("com.stroeer.ApplicationKt")
}

java {
    sourceCompatibility = JavaVersion.toVersion("21")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

graalvmNative.toolchainDetection.set(false)
micronaut {
    runtime("netty")
    testRuntime("kotest5")
    processing {
        incremental(true)
        annotations("com.stroeer.*")
    }
    aot {
        // Please review carefully the optimizations enabled below
        // Check https://micronaut-projects.github.io/micronaut-aot/latest/guide/ for more details
        optimizeServiceLoading = false
        convertYamlToJava = false
        precomputeOperations = true
        cacheEnvironment = true
        optimizeClassLoading = true
        deduceEnvironment = true
        optimizeNetty = true
        replaceLogbackXml = true
    }
}

allOpen {
    annotation("io.micronaut.transaction.annotation.Transactional")
}
