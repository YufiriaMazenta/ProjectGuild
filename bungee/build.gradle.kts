import java.text.SimpleDateFormat

tasks {
    val pluginVersion: String = rootProject.version.toString() + "-" + SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis())
    val props = HashMap<String, String>()
    props["version"] = pluginVersion
    processResources {
        filesMatching("bungee-plugin.yml") {
            expand(props)
        }
    }
}