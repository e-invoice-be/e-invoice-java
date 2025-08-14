// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.documents.CurrencyCode
import com.e_invoice.api.models.documents.DocumentAttachmentCreate
import com.e_invoice.api.models.documents.DocumentCreate
import com.e_invoice.api.models.documents.DocumentDirection
import com.e_invoice.api.models.documents.DocumentType
import com.e_invoice.api.models.documents.PaymentDetailCreate
import com.e_invoice.api.models.documents.UnitOfMeasureCode
import com.e_invoice.api.models.inbox.DocumentState
import com.e_invoice.api.models.validate.ValidateValidateJsonParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdParams
import com.e_invoice.api.models.validate.ValidateValidateUblParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ValidateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun validateJson() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val validateServiceAsync = client.validate()

        val ublDocumentValidationFuture =
            validateServiceAsync.validateJson(
                ValidateValidateJsonParams.builder()
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
                                DocumentCreate.TaxDetail.builder().amount(0.0).rate("rate").build()
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

        val ublDocumentValidation = ublDocumentValidationFuture.get()
        ublDocumentValidation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validatePeppolId() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val validateServiceAsync = client.validate()

        val responseFuture =
            validateServiceAsync.validatePeppolId(
                ValidateValidatePeppolIdParams.builder().peppolId("peppol_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validateUbl() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val validateServiceAsync = client.validate()

        val ublDocumentValidationFuture =
            validateServiceAsync.validateUbl(
                ValidateValidateUblParams.builder().file("some content".byteInputStream()).build()
            )

        val ublDocumentValidation = ublDocumentValidationFuture.get()
        ublDocumentValidation.validate()
    }
}
