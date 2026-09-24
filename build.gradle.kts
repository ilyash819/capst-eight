plugins {
    id("java")
    id("application")
    id("com.gradleup.shadow") version "8.3.6"
}

group = "com.example.game"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

dependencies {
    implementation("de.gurkenlabs:litiengine:0.12.0")
    testImplementation("org.junit.jupiter:junit-jupiter:6.0.0")
}

application {
    mainClass.set("com.example.game.Main")
    applicationDefaultJvmArgs = listOf("--enable-native-access=ALL-UNNAMED")
}

tasks.shadowJar {
    archiveClassifier.set("all")
    manifest {
        attributes["Main-Class"] = "com.example.game.Main"
    }
}

tasks.test {
    useJUnitPlatform()
}