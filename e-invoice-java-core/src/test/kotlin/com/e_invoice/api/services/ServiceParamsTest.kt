// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services

import com.e_invoice.api.client.EInvoiceClient
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
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
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.LocalDate
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: EInvoiceClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val documentService = client.documents()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        documentService.create(
            DocumentCreateParams.builder()
                .documentCreate(
                    DocumentCreate.builder()
                        .addAllowance(
                            DocumentCreate.Allowance.builder()
                                .amount(0.0)
                                .baseAmount(0.0)
                                .multiplierFactor(0.0)
                                .reason("reason")
                                .reasonCode(DocumentCreate.Allowance.ReasonCode._41)
                                .taxCode(DocumentCreate.Allowance.TaxCode.AE)
                                .taxRate(0.0)
                                .build()
                        )
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
                        .addCharge(
                            DocumentCreate.Charge.builder()
                                .amount(0.0)
                                .baseAmount(0.0)
                                .multiplierFactor(0.0)
                                .reason("reason")
                                .reasonCode(DocumentCreate.Charge.ReasonCode.AA)
                                .taxCode(DocumentCreate.Charge.TaxCode.AE)
                                .taxRate("21.00")
                                .build()
                        )
                        .currency(CurrencyCode.EUR)
                        .customerAddress("customer_address")
                        .customerAddressRecipient("customer_address_recipient")
                        .customerCompanyId("1018265814")
                        .customerEmail("customer_email")
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .customerTaxId("BE1018265814")
                        .direction(DocumentDirection.INBOUND)
                        .documentType(DocumentType.INVOICE)
                        .dueDate(LocalDate.parse("2019-12-27"))
                        .invoiceDate(LocalDate.parse("2019-12-27"))
                        .invoiceId("invoice_id")
                        .invoiceTotal(0.0)
                        .addItem(
                            DocumentCreate.Item.builder()
                                .addAllowance(
                                    DocumentCreate.Item.Allowance.builder()
                                        .amount(0.0)
                                        .baseAmount(0.0)
                                        .multiplierFactor(0.0)
                                        .reason("reason")
                                        .reasonCode(DocumentCreate.Item.Allowance.ReasonCode._41)
                                        .taxCode(DocumentCreate.Item.Allowance.TaxCode.AE)
                                        .taxRate(0.0)
                                        .build()
                                )
                                .amount(0.0)
                                .addCharge(
                                    DocumentCreate.Item.Charge.builder()
                                        .amount(0.0)
                                        .baseAmount(0.0)
                                        .multiplierFactor(0.0)
                                        .reason("reason")
                                        .reasonCode(DocumentCreate.Item.Charge.ReasonCode.AA)
                                        .taxCode(DocumentCreate.Item.Charge.TaxCode.AE)
                                        .taxRate("21.00")
                                        .build()
                                )
                                .date(null)
                                .description("description")
                                .productCode("product_code")
                                .quantity(0.0)
                                .tax(0.0)
                                .taxRate("21.00")
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
                        .taxCode(DocumentCreate.TaxCode.AE)
                        .addTaxDetail(
                            DocumentCreate.TaxDetail.builder().amount(0.0).rate("rate").build()
                        )
                        .totalDiscount(0.0)
                        .totalTax(0.0)
                        .vatex(DocumentCreate.Vatex.VATEX_EU_79_C)
                        .vatexNote("vatex_note")
                        .vendorAddress("vendor_address")
                        .vendorAddressRecipient("vendor_address_recipient")
                        .vendorCompanyId("1018265814")
                        .vendorEmail("vendor_email")
                        .vendorName("vendor_name")
                        .vendorTaxId("BE1018265814")
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
