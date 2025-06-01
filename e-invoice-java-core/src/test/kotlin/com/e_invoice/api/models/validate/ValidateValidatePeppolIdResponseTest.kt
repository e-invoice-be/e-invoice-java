// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.validate

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValidateValidatePeppolIdResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val validateValidatePeppolIdResponse =
            ValidateValidatePeppolIdResponse.builder()
                .businessCard(
                    ValidateValidatePeppolIdResponse.BusinessCard.builder()
                        .countryCode("BE")
                        .name("Example Corporation Ltd")
                        .registrationDate(LocalDate.parse("2021-06-15"))
                        .build()
                )
                .businessCardValid(true)
                .dnsValid(true)
                .isValid(true)
                .addSupportedDocumentType("string")
                .build()

        assertThat(validateValidatePeppolIdResponse.businessCard())
            .contains(
                ValidateValidatePeppolIdResponse.BusinessCard.builder()
                    .countryCode("BE")
                    .name("Example Corporation Ltd")
                    .registrationDate(LocalDate.parse("2021-06-15"))
                    .build()
            )
        assertThat(validateValidatePeppolIdResponse.businessCardValid()).isEqualTo(true)
        assertThat(validateValidatePeppolIdResponse.dnsValid()).isEqualTo(true)
        assertThat(validateValidatePeppolIdResponse.isValid()).isEqualTo(true)
        assertThat(validateValidatePeppolIdResponse.supportedDocumentTypes().getOrNull())
            .containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val validateValidatePeppolIdResponse =
            ValidateValidatePeppolIdResponse.builder()
                .businessCard(
                    ValidateValidatePeppolIdResponse.BusinessCard.builder()
                        .countryCode("BE")
                        .name("Example Corporation Ltd")
                        .registrationDate(LocalDate.parse("2021-06-15"))
                        .build()
                )
                .businessCardValid(true)
                .dnsValid(true)
                .isValid(true)
                .addSupportedDocumentType("string")
                .build()

        val roundtrippedValidateValidatePeppolIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(validateValidatePeppolIdResponse),
                jacksonTypeRef<ValidateValidatePeppolIdResponse>(),
            )

        assertThat(roundtrippedValidateValidatePeppolIdResponse)
            .isEqualTo(validateValidatePeppolIdResponse)
    }
}
