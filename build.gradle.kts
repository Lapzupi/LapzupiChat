plugins {
    `java-library`
    `maven-publish`
}

group = "com.lapzupi.dev.chat"
version = "1.0.0"


dependencies {
    compileOnly(libs.paper.api)
    compileOnly(libs.placeholder.api)

    api(libs.bundles.adventure)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }

    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = groupId
            artifactId = artifactId
            version = version

            from(components["java"])
        }
    }
}