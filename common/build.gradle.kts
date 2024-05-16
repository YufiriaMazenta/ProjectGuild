repositories {
    mavenCentral()
}
dependencies {
    compileOnly("mysql:mysql-connector-java:8.0.29")
    implementation("com.zaxxer:HikariCP:5.1.0")
}