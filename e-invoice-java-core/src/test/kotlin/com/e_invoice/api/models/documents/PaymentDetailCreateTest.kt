// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentDetailCreateTest {

    @Test
    fun create() {
        val paymentDetailCreate =
            PaymentDetailCreate.builder()
                .bankAccountNumber("bank_account_number")
                .iban("iban")
                .paymentReference("payment_reference")
                .swift("swift")
                .build()

        assertThat(paymentDetailCreate.bankAccountNumber()).contains("bank_account_number")
        assertThat(paymentDetailCreate.iban()).contains("iban")
        assertThat(paymentDetailCreate.paymentReference()).contains("payment_reference")
        assertThat(paymentDetailCreate.swift()).contains("swift")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentDetailCreate =
            PaymentDetailCreate.builder()
                .bankAccountNumber("bank_account_number")
                .iban("iban")
                .paymentReference("payment_reference")
                .swift("swift")
                .build()

        val roundtrippedPaymentDetailCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentDetailCreate),
                jacksonTypeRef<PaymentDetailCreate>(),
            )

        assertThat(roundtrippedPaymentDetailCreate).isEqualTo(paymentDetailCreate)
    }
}
