// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeTest {

    @Test
    fun create() {
        val charge =
            Charge.builder()
                .amount("amount")
                .baseAmount("base_amount")
                .multiplierFactor("multiplier_factor")
                .reason("reason")
                .reasonCode("reason_code")
                .taxCode(Charge.TaxCode.AE)
                .taxRate("tax_rate")
                .build()

        assertThat(charge.amount()).contains("amount")
        assertThat(charge.baseAmount()).contains("base_amount")
        assertThat(charge.multiplierFactor()).contains("multiplier_factor")
        assertThat(charge.reason()).contains("reason")
        assertThat(charge.reasonCode()).contains("reason_code")
        assertThat(charge.taxCode()).contains(Charge.TaxCode.AE)
        assertThat(charge.taxRate()).contains("tax_rate")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val charge =
            Charge.builder()
                .amount("amount")
                .baseAmount("base_amount")
                .multiplierFactor("multiplier_factor")
                .reason("reason")
                .reasonCode("reason_code")
                .taxCode(Charge.TaxCode.AE)
                .taxRate("tax_rate")
                .build()

        val roundtrippedCharge =
            jsonMapper.readValue(jsonMapper.writeValueAsString(charge), jacksonTypeRef<Charge>())

        assertThat(roundtrippedCharge).isEqualTo(charge)
    }
}
