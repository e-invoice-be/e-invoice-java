plugins {
    id("e-invoice.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":e-invoice-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :e-invoice-java-example:run` to run `Main`
    // Use `./gradlew :e-invoice-java-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "com.e_invoice.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
