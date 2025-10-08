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
                .companyAddress("company_address")
                .companyCity("company_city")
                .companyCountry("company_country")
                .companyEmail("company_email")
                .companyName("company_name")
                .companyNumber("company_number")
                .companyZip("company_zip")
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
        assertThat(meRetrieveResponse.companyAddress()).contains("company_address")
        assertThat(meRetrieveResponse.companyCity()).contains("company_city")
        assertThat(meRetrieveResponse.companyCountry()).contains("company_country")
        assertThat(meRetrieveResponse.companyEmail()).contains("company_email")
        assertThat(meRetrieveResponse.companyName()).contains("company_name")
        assertThat(meRetrieveResponse.companyNumber()).contains("company_number")
        assertThat(meRetrieveResponse.companyZip()).contains("company_zip")
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
                .companyAddress("company_address")
                .companyCity("company_city")
                .companyCountry("company_country")
                .companyEmail("company_email")
                .companyName("company_name")
                .companyNumber("company_number")
                .companyZip("company_zip")
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
