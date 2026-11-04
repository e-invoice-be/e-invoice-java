package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/** Covers fields added to the document schemas after the initial generated SDK. */
internal class DocumentSyncedFieldsTest {

    @Test
    fun documentCreateRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentCreate =
            DocumentCreate.builder()
                .buyerReference("buyer_reference")
                .customerPhone("+32 2 123 45 67")
                .vendorPhone("+32 2 765 43 21")
                .salesOrder("SO-1")
                .precedingInvoiceId("INV-0")
                .precedingInvoiceDate(LocalDate.parse("2026-01-01"))
                .taxCurrency("EUR")
                .totalTaxInTaxCurrency(21.0)
                .roundingAmount("0.01")
                .addItem(
                    DocumentCreate.Item.builder()
                        .name("Widget")
                        .description("A widget")
                        .priceBaseQuantity(1.0)
                        .date(LocalDate.parse("2026-01-02"))
                        .build()
                )
                .build()

        val json = jsonMapper.writeValueAsString(documentCreate)
        val node = jsonMapper.readTree(json)
        assertThat(node["buyer_reference"].asText()).isEqualTo("buyer_reference")
        assertThat(node["customer_phone"].asText()).isEqualTo("+32 2 123 45 67")
        assertThat(node["vendor_phone"].asText()).isEqualTo("+32 2 765 43 21")
        assertThat(node["sales_order"].asText()).isEqualTo("SO-1")
        assertThat(node["preceding_invoice_id"].asText()).isEqualTo("INV-0")
        assertThat(node["preceding_invoice_date"].asText()).isEqualTo("2026-01-01")
        assertThat(node["tax_currency"].asText()).isEqualTo("EUR")
        assertThat(node["total_tax_in_tax_currency"].asDouble()).isEqualTo(21.0)
        assertThat(node["rounding_amount"].asText()).isEqualTo("0.01")
        assertThat(node["items"][0]["name"].asText()).isEqualTo("Widget")
        assertThat(node["items"][0]["price_base_quantity"].asDouble()).isEqualTo(1.0)
        assertThat(node["items"][0]["date"].asText()).isEqualTo("2026-01-02")

        val roundtripped = jsonMapper.readValue(json, jacksonTypeRef<DocumentCreate>())
        assertThat(roundtripped).isEqualTo(documentCreate)
        roundtripped.validate()
        assertThat(roundtripped.totalTaxInTaxCurrency().get().number()).contains(21.0)
        assertThat(roundtripped.roundingAmount().get().string()).contains("0.01")
        assertThat(roundtripped.items().get()[0].priceBaseQuantity().get().number()).contains(1.0)
    }

    @Test
    fun documentResponseDeserialize() {
        val json =
            """
            {
              "id": "doc_1",
              "buyer_reference": "buyer_reference",
              "customer_phone": "+32 2 123 45 67",
              "vendor_phone": null,
              "sales_order": "SO-1",
              "preceding_invoice_id": "INV-0",
              "preceding_invoice_date": "2026-01-01",
              "tax_currency": "USD",
              "total_tax_in_tax_currency": "22.50",
              "rounding_amount": "0.00",
              "items": [{"name": "Widget", "price_base_quantity": "1", "date": "2026-01-02"}]
            }
            """
                .trimIndent()

        val response = jsonMapper().readValue(json, jacksonTypeRef<DocumentResponse>())

        assertThat(response.buyerReference()).contains("buyer_reference")
        assertThat(response.customerPhone()).contains("+32 2 123 45 67")
        assertThat(response.vendorPhone()).isEmpty
        assertThat(response.salesOrder()).contains("SO-1")
        assertThat(response.precedingInvoiceId()).contains("INV-0")
        assertThat(response.precedingInvoiceDate()).contains(LocalDate.parse("2026-01-01"))
        assertThat(response.taxCurrency()).contains("USD")
        assertThat(response.totalTaxInTaxCurrency()).contains("22.50")
        assertThat(response.roundingAmount()).contains("0.00")
        val item = response.items().get()[0]
        assertThat(item.name()).contains("Widget")
        assertThat(item.priceBaseQuantity()).contains("1")
        assertThat(item.date()).contains(LocalDate.parse("2026-01-02"))
    }

    @Test
    fun documentCreateFromPdfResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val response =
            DocumentCreateFromPdfResponse.builder()
                .buyerReference("buyer_reference")
                .customerPhone("customer_phone")
                .vendorPhone("vendor_phone")
                .salesOrder("sales_order")
                .precedingInvoiceId("preceding_invoice_id")
                .precedingInvoiceDate(LocalDate.parse("2026-01-01"))
                .taxCurrency("EUR")
                .totalTaxInTaxCurrency("1.00")
                .roundingAmount("0.01")
                .addItem(
                    DocumentCreateFromPdfResponse.Item.builder()
                        .name("name")
                        .priceBaseQuantity("1")
                        .build()
                )
                .build()

        val roundtripped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(response),
                jacksonTypeRef<DocumentCreateFromPdfResponse>(),
            )

        assertThat(roundtripped).isEqualTo(response)
        assertThat(roundtripped.items().get()[0].name()).contains("name")
    }
}
