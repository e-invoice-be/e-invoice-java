// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.me

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeRetrieveResponseTest {

    @Test
    fun create() {
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .creditBalance(0L)
                .name("name")
                .plan(MeRetrieveResponse.Plan.STARTER)
                .bccRecipientEmail("bcc_recipient_email")
                .companyAddress("Brusselsesteenweg 119/A")
                .companyCity("Zemst")
                .companyCountry("Belgium")
                .companyEmail("info@e-invoice.be")
                .companyName("E-INVOICE BV")
                .companyNumber("1018265814")
                .companyTaxId("BE1018265814")
                .companyZip("1980")
                .description("description")
                .addIban("string")
                .addPeppolId("string")
                .smpRegistration(true)
                .smpRegistrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(meRetrieveResponse.creditBalance()).isEqualTo(0L)
        assertThat(meRetrieveResponse.name()).isEqualTo("name")
        assertThat(meRetrieveResponse.plan()).isEqualTo(MeRetrieveResponse.Plan.STARTER)
        assertThat(meRetrieveResponse.bccRecipientEmail()).contains("bcc_recipient_email")
        assertThat(meRetrieveResponse.companyAddress()).contains("Brusselsesteenweg 119/A")
        assertThat(meRetrieveResponse.companyCity()).contains("Zemst")
        assertThat(meRetrieveResponse.companyCountry()).contains("Belgium")
        assertThat(meRetrieveResponse.companyEmail()).contains("info@e-invoice.be")
        assertThat(meRetrieveResponse.companyName()).contains("E-INVOICE BV")
        assertThat(meRetrieveResponse.companyNumber()).contains("1018265814")
        assertThat(meRetrieveResponse.companyTaxId()).contains("BE1018265814")
        assertThat(meRetrieveResponse.companyZip()).contains("1980")
        assertThat(meRetrieveResponse.description()).contains("description")
        assertThat(meRetrieveResponse.ibans().getOrNull()).containsExactly("string")
        assertThat(meRetrieveResponse.peppolIds().getOrNull()).containsExactly("string")
        assertThat(meRetrieveResponse.smpRegistration()).contains(true)
        assertThat(meRetrieveResponse.smpRegistrationDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .creditBalance(0L)
                .name("name")
                .plan(MeRetrieveResponse.Plan.STARTER)
                .bccRecipientEmail("bcc_recipient_email")
                .companyAddress("Brusselsesteenweg 119/A")
                .companyCity("Zemst")
                .companyCountry("Belgium")
                .companyEmail("info@e-invoice.be")
                .companyName("E-INVOICE BV")
                .companyNumber("1018265814")
                .companyTaxId("BE1018265814")
                .companyZip("1980")
                .description("description")
                .addIban("string")
                .addPeppolId("string")
                .smpRegistration(true)
                .smpRegistrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meRetrieveResponse),
                jacksonTypeRef<MeRetrieveResponse>(),
            )

        assertThat(roundtrippedMeRetrieveResponse).isEqualTo(meRetrieveResponse)
    }
}
