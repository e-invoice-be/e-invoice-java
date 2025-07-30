// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.proguard

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.core.jsonMapper
import com.e_invoice.api.models.documents.CurrencyCode
import com.e_invoice.api.models.documents.DocumentAttachmentCreate
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/e-invoice-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.documents()).isNotNull()
        assertThat(client.inbox()).isNotNull()
        assertThat(client.outbox()).isNotNull()
        assertThat(client.validate()).isNotNull()
        assertThat(client.lookup()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun documentAttachmentCreateRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentAttachmentCreate =
            DocumentAttachmentCreate.builder()
                .fileName("file_name")
                .fileData("file_data")
                .fileSize(0L)
                .fileType("file_type")
                .build()

        val roundtrippedDocumentAttachmentCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentAttachmentCreate),
                jacksonTypeRef<DocumentAttachmentCreate>(),
            )

        assertThat(roundtrippedDocumentAttachmentCreate).isEqualTo(documentAttachmentCreate)
    }

    @Test
    fun currencyCodeRoundtrip() {
        val jsonMapper = jsonMapper()
        val currencyCode = CurrencyCode.EUR

        val roundtrippedCurrencyCode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyCode),
                jacksonTypeRef<CurrencyCode>(),
            )

        assertThat(roundtrippedCurrencyCode).isEqualTo(currencyCode)
    }
}
