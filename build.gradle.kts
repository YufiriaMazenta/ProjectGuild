plugins {
    id("java-library")
    id("com.github.johnrengelman.shadow").version("7.1.2")
}

repositories {
    //CrypticLib
    maven("http://repo.crypticlib.com:8081/repository/maven-public/") {
        isAllowInsecureProtocol = true
    }
}

dependencies {
    implementation(project(":common"))
    implementation(project(":bungee"))
    implementation(project(":bukkit"))
}

group = "com.yufiria"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8

subprojects {
    apply(plugin = "java")
    tasks {
        compileJava {
            java.sourceCompatibility = JavaVersion.VERSION_1_8
            java.targetCompatibility = JavaVersion.VERSION_1_8
            dependsOn(clean)
        }
        compileJava {
            dependsOn(clean)
        }
    }
}

tasks {
    shadowJar {
        relocate("crypticlib", "com.yufiria.guild.crypticlib")
        archiveFileName.set("${rootProject.name}-${version}.jar")
    }
    assemble {
        dependsOn(shadowJar)
    }
}
