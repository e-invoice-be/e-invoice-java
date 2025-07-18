// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services

import com.e_invoice.api.client.EInvoiceClient
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.jsonMapper
import com.e_invoice.api.errors.BadRequestException
import com.e_invoice.api.errors.EInvoiceException
import com.e_invoice.api.errors.InternalServerException
import com.e_invoice.api.errors.NotFoundException
import com.e_invoice.api.errors.PermissionDeniedException
import com.e_invoice.api.errors.RateLimitException
import com.e_invoice.api.errors.UnauthorizedException
import com.e_invoice.api.errors.UnexpectedStatusCodeException
import com.e_invoice.api.errors.UnprocessableEntityException
import com.e_invoice.api.models.documents.CurrencyCode
import com.e_invoice.api.models.documents.DocumentAttachmentCreate
import com.e_invoice.api.models.documents.DocumentCreate
import com.e_invoice.api.models.documents.DocumentCreateParams
import com.e_invoice.api.models.documents.DocumentDirection
import com.e_invoice.api.models.documents.DocumentType
import com.e_invoice.api.models.documents.PaymentDetailCreate
import com.e_invoice.api.models.documents.UnitOfMeasureCode
import com.e_invoice.api.models.inbox.DocumentState
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: EInvoiceClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate400() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate400WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate401() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate401WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate403() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate403WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate404() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate404WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate422() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate422WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate429() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate429WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate500() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate500WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate999() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreate999WithRawResponse() {
        val documentService = client.documents().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun documentsCreateInvalidJsonBody() {
        val documentService = client.documents()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<EInvoiceException> {
                documentService.create(
                    DocumentCreateParams.builder()
                        .documentCreate(
                            DocumentCreate.builder()
                                .amountDue(0.0)
                                .addAttachment(
                                    DocumentAttachmentCreate.builder()
                                        .fileName("file_name")
                                        .fileData("file_data")
                                        .fileSize(0L)
                                        .fileType("file_type")
                                        .build()
                                )
                                .billingAddress("billing_address")
                                .billingAddressRecipient("billing_address_recipient")
                                .currency(CurrencyCode.EUR)
                                .customerAddress("customer_address")
                                .customerAddressRecipient("customer_address_recipient")
                                .customerEmail("customer_email")
                                .customerId("customer_id")
                                .customerName("customer_name")
                                .customerTaxId("customer_tax_id")
                                .direction(DocumentDirection.INBOUND)
                                .documentType(DocumentType.INVOICE)
                                .dueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .invoiceId("invoice_id")
                                .invoiceTotal(0.0)
                                .addItem(
                                    DocumentCreate.Item.builder()
                                        .amount(0.0)
                                        .date(null)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .tax(0.0)
                                        .taxRate("tax_rate")
                                        .unit(UnitOfMeasureCode._10)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .note("note")
                                .addPaymentDetail(
                                    PaymentDetailCreate.builder()
                                        .bankAccountNumber("bank_account_number")
                                        .iban("iban")
                                        .paymentReference("payment_reference")
                                        .swift("swift")
                                        .build()
                                )
                                .paymentTerm("payment_term")
                                .previousUnpaidBalance(0.0)
                                .purchaseOrder("purchase_order")
                                .remittanceAddress("remittance_address")
                                .remittanceAddressRecipient("remittance_address_recipient")
                                .serviceAddress("service_address")
                                .serviceAddressRecipient("service_address_recipient")
                                .serviceEndDate(LocalDate.parse("2019-12-27"))
                                .serviceStartDate(LocalDate.parse("2019-12-27"))
                                .shippingAddress("shipping_address")
                                .shippingAddressRecipient("shipping_address_recipient")
                                .state(DocumentState.DRAFT)
                                .subtotal(0.0)
                                .addTaxDetail(
                                    DocumentCreate.TaxDetail.builder()
                                        .amount(0.0)
                                        .rate("rate")
                                        .build()
                                )
                                .totalDiscount(0.0)
                                .totalTax(0.0)
                                .vendorAddress("vendor_address")
                                .vendorAddressRecipient("vendor_address_recipient")
                                .vendorEmail("vendor_email")
                                .vendorName("vendor_name")
                                .vendorTaxId("vendor_tax_id")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
