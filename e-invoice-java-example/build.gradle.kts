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
    mainClass = "com.e_invoice_api.api.example.Main"
}
