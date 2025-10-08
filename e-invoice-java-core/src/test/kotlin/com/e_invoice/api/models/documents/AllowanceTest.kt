// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AllowanceTest {

    @Test
    fun create() {
        val allowance =
            Allowance.builder()
                .amount("amount")
                .baseAmount("base_amount")
                .multiplierFactor("multiplier_factor")
                .reason("reason")
                .reasonCode("reason_code")
                .taxCode(Allowance.TaxCode.AE)
                .taxRate("tax_rate")
                .build()

        assertThat(allowance.amount()).contains("amount")
        assertThat(allowance.baseAmount()).contains("base_amount")
        assertThat(allowance.multiplierFactor()).contains("multiplier_factor")
        assertThat(allowance.reason()).contains("reason")
        assertThat(allowance.reasonCode()).contains("reason_code")
        assertThat(allowance.taxCode()).contains(Allowance.TaxCode.AE)
        assertThat(allowance.taxRate()).contains("tax_rate")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val allowance =
            Allowance.builder()
                .amount("amount")
                .baseAmount("base_amount")
                .multiplierFactor("multiplier_factor")
                .reason("reason")
                .reasonCode("reason_code")
                .taxCode(Allowance.TaxCode.AE)
                .taxRate("tax_rate")
                .build()

        val roundtrippedAllowance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(allowance),
                jacksonTypeRef<Allowance>(),
            )

        assertThat(roundtrippedAllowance).isEqualTo(allowance)
    }
}
