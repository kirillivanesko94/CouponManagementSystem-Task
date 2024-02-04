plugins {
	java
	id("org.springframework.boot") version "2.7.10"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springdoc:springdoc-openapi-ui:1.6.3")
	implementation("com.zaxxer:HikariCP")
	implementation("org.postgresql:postgresql")
	implementation("org.jdbi:jdbi3-core:3.41.3")
	implementation("org.jdbi:jdbi3-postgres:3.41.3")
	implementation("org.flywaydb:flyway-core:8.5.11")
	implementation("org.apache.cxf:cxf-spring-boot-starter-jaxws:3.5.2")
	implementation("org.springframework.boot:spring-boot-devtools")
	implementation("jakarta.jws:jakarta.jws-api:2.1.0")
	implementation("jakarta.xml.ws:jakarta.xml.ws-api:2.3.3")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
