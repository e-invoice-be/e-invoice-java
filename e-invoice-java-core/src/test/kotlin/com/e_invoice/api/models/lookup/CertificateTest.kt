// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.lookup

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CertificateTest {

    @Test
    fun create() {
        val certificate =
            Certificate.builder()
                .status("success")
                .details(
                    Certificate.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .error("Certificate expired")
                .build()

        assertThat(certificate.status()).isEqualTo("success")
        assertThat(certificate.details())
            .contains(
                Certificate.Details.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(certificate.error()).contains("Certificate expired")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val certificate =
            Certificate.builder()
                .status("success")
                .details(
                    Certificate.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .error("Certificate expired")
                .build()

        val roundtrippedCertificate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(certificate),
                jacksonTypeRef<Certificate>(),
            )

        assertThat(roundtrippedCertificate).isEqualTo(certificate)
    }
}
