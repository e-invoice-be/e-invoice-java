// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.validate

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateValidatePeppolIdResponseTest {

    @Test
    fun create() {
        val validateValidatePeppolIdResponse =
            ValidateValidatePeppolIdResponse.builder()
                .businessCardValid(true)
                .dnsValid(true)
                .isValid_(true)
                .addSupportedDocumentType(
                    "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2::Invoice##urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0::2.1"
                )
                .businessCard(
                    ValidateValidatePeppolIdResponse.BusinessCard.builder()
                        .countryCode("BE")
                        .name("Example Corporation Ltd")
                        .registrationDate(LocalDate.parse("2021-06-15"))
                        .build()
                )
                .build()

        assertThat(validateValidatePeppolIdResponse.businessCardValid()).isEqualTo(true)
        assertThat(validateValidatePeppolIdResponse.dnsValid()).isEqualTo(true)
        assertThat(validateValidatePeppolIdResponse.isValid_()).isEqualTo(true)
        assertThat(validateValidatePeppolIdResponse.supportedDocumentTypes())
            .containsExactly(
                "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2::Invoice##urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0::2.1"
            )
        assertThat(validateValidatePeppolIdResponse.businessCard())
            .contains(
                ValidateValidatePeppolIdResponse.BusinessCard.builder()
                    .countryCode("BE")
                    .name("Example Corporation Ltd")
                    .registrationDate(LocalDate.parse("2021-06-15"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val validateValidatePeppolIdResponse =
            ValidateValidatePeppolIdResponse.builder()
                .businessCardValid(true)
                .dnsValid(true)
                .isValid_(true)
                .addSupportedDocumentType(
                    "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2::Invoice##urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0::2.1"
                )
                .businessCard(
                    ValidateValidatePeppolIdResponse.BusinessCard.builder()
                        .countryCode("BE")
                        .name("Example Corporation Ltd")
                        .registrationDate(LocalDate.parse("2021-06-15"))
                        .build()
                )
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
