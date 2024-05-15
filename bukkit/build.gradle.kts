import java.text.SimpleDateFormat

repositories {
    mavenLocal()
    //spigot api
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    //CrypticLib
    maven("http://repo.crypticlib.com:8081/repository/maven-public/") {
        isAllowInsecureProtocol = true
    }
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.1")
    compileOnly("org.spigotmc:spigot-api:1.20.4-R0.1-SNAPSHOT")
    implementation("com.crypticlib:CrypticLib:0.17.5")
}

tasks {
    val pluginVersion: String = rootProject.version.toString() + "-" + SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis())
    val props = HashMap<String, String>()
    props["version"] = pluginVersion
    processResources {
        filesMatching("plugin.yml") {
            expand(props)
        }
    }
}