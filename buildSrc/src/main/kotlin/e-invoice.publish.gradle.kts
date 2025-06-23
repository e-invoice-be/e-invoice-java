plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("e-invoice.be Peppol Access Point API")
                description.set("An SDK library for e-invoice")
                url.set("https://api.e-invoice.be")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("E Invoice")
                        email.set("support@e-invoice.be")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/e-invoice-be/e-invoice-java.git")
                    developerConnection.set("scm:git:git://github.com/e-invoice-be/e-invoice-java.git")
                    url.set("https://github.com/e-invoice-be/e-invoice-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
