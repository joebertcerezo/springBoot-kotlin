import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	kotlin("plugin.jpa") version "1.9.25"
	id("org.springframework.boot") version "3.4.4"
	id("io.spring.dependency-management") version "1.1.7"
	// id("org.flywaydb.flyway") version "10.0.0"
}

group = "com.try"
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
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.postgresql:postgresql")
	implementation("org.flywaydb:flyway-database-postgresql")

	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += "-Xjsr305=strict"
  }
}

// flyway {
//     url = System.getenv("DB_URL") ?: "jdbc:postgresql://localhost:5432/spring_kot"
//     user = System.getenv("DB_USER") ?: "jlcerezo"
//     password = System.getenv("DB_PASS") ?: ""
//     locations = arrayOf("classpath:/db/migration")
// }
