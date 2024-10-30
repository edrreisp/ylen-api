plugins {
    id("java")
    id("org.springframework.boot") version "3.1.2"
    id("io.spring.dependency-management") version "1.1.3"
    java
}

group = "com.reispsolutions"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")
}
tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.reispsolutions.Main"
    }
}

tasks.test {
    useJUnitPlatform()
}