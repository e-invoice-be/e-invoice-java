// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.checkKnown
import com.e_invoice.api.core.toImmutable
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.e_invoice.api.models.inbox.DocumentState
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DocumentCreateFromPdfResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowances: JsonField<List<Allowance>>,
    private val amountDue: JsonField<String>,
    private val attachments: JsonField<List<DocumentAttachmentCreate>>,
    private val billingAddress: JsonField<String>,
    private val billingAddressRecipient: JsonField<String>,
    private val charges: JsonField<List<Charge>>,
    private val currency: JsonField<CurrencyCode>,
    private val customerAddress: JsonField<String>,
    private val customerAddressRecipient: JsonField<String>,
    private val customerEmail: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerName: JsonField<String>,
    private val customerTaxId: JsonField<String>,
    private val direction: JsonField<DocumentDirection>,
    private val documentType: JsonField<DocumentType>,
    private val dueDate: JsonField<LocalDate>,
    private val invoiceDate: JsonField<LocalDate>,
    private val invoiceId: JsonField<String>,
    private val invoiceTotal: JsonField<String>,
    private val items: JsonField<List<Item>>,
    private val note: JsonField<String>,
    private val paymentDetails: JsonField<List<PaymentDetailCreate>>,
    private val paymentTerm: JsonField<String>,
    private val previousUnpaidBalance: JsonField<String>,
    private val purchaseOrder: JsonField<String>,
    private val remittanceAddress: JsonField<String>,
    private val remittanceAddressRecipient: JsonField<String>,
    private val serviceAddress: JsonField<String>,
    private val serviceAddressRecipient: JsonField<String>,
    private val serviceEndDate: JsonField<LocalDate>,
    private val serviceStartDate: JsonField<LocalDate>,
    private val shippingAddress: JsonField<String>,
    private val shippingAddressRecipient: JsonField<String>,
    private val state: JsonField<DocumentState>,
    private val subtotal: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val taxCode: JsonField<TaxCode>,
    private val taxDetails: JsonField<List<TaxDetail>>,
    private val totalDiscount: JsonField<String>,
    private val totalTax: JsonField<String>,
    private val ublDocument: JsonField<String>,
    private val vatex: JsonField<Vatex>,
    private val vatexNote: JsonField<String>,
    private val vendorAddress: JsonField<String>,
    private val vendorAddressRecipient: JsonField<String>,
    private val vendorEmail: JsonField<String>,
    private val vendorName: JsonField<String>,
    private val vendorTaxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowances")
        @ExcludeMissing
        allowances: JsonField<List<Allowance>> = JsonMissing.of(),
        @JsonProperty("amount_due") @ExcludeMissing amountDue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<DocumentAttachmentCreate>> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_address_recipient")
        @ExcludeMissing
        billingAddressRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("charges")
        @ExcludeMissing
        charges: JsonField<List<Charge>> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        currency: JsonField<CurrencyCode> = JsonMissing.of(),
        @JsonProperty("customer_address")
        @ExcludeMissing
        customerAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_address_recipient")
        @ExcludeMissing
        customerAddressRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_email")
        @ExcludeMissing
        customerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_name")
        @ExcludeMissing
        customerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_tax_id")
        @ExcludeMissing
        customerTaxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<DocumentDirection> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<DocumentType> = JsonMissing.of(),
        @JsonProperty("due_date") @ExcludeMissing dueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("invoice_date")
        @ExcludeMissing
        invoiceDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_total")
        @ExcludeMissing
        invoiceTotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_details")
        @ExcludeMissing
        paymentDetails: JsonField<List<PaymentDetailCreate>> = JsonMissing.of(),
        @JsonProperty("payment_term")
        @ExcludeMissing
        paymentTerm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_unpaid_balance")
        @ExcludeMissing
        previousUnpaidBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchase_order")
        @ExcludeMissing
        purchaseOrder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remittance_address")
        @ExcludeMissing
        remittanceAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remittance_address_recipient")
        @ExcludeMissing
        remittanceAddressRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_address")
        @ExcludeMissing
        serviceAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_address_recipient")
        @ExcludeMissing
        serviceAddressRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_end_date")
        @ExcludeMissing
        serviceEndDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("service_start_date")
        @ExcludeMissing
        serviceStartDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        shippingAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_address_recipient")
        @ExcludeMissing
        shippingAddressRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<DocumentState> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tax_code") @ExcludeMissing taxCode: JsonField<TaxCode> = JsonMissing.of(),
        @JsonProperty("tax_details")
        @ExcludeMissing
        taxDetails: JsonField<List<TaxDetail>> = JsonMissing.of(),
        @JsonProperty("total_discount")
        @ExcludeMissing
        totalDiscount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_tax") @ExcludeMissing totalTax: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ubl_document")
        @ExcludeMissing
        ublDocument: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vatex") @ExcludeMissing vatex: JsonField<Vatex> = JsonMissing.of(),
        @JsonProperty("vatex_note") @ExcludeMissing vatexNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_address")
        @ExcludeMissing
        vendorAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_address_recipient")
        @ExcludeMissing
        vendorAddressRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_email")
        @ExcludeMissing
        vendorEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_name")
        @ExcludeMissing
        vendorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_tax_id")
        @ExcludeMissing
        vendorTaxId: JsonField<String> = JsonMissing.of(),
    ) : this(
        allowances,
        amountDue,
        attachments,
        billingAddress,
        billingAddressRecipient,
        charges,
        currency,
        customerAddress,
        customerAddressRecipient,
        customerEmail,
        customerId,
        customerName,
        customerTaxId,
        direction,
        documentType,
        dueDate,
        invoiceDate,
        invoiceId,
        invoiceTotal,
        items,
        note,
        paymentDetails,
        paymentTerm,
        previousUnpaidBalance,
        purchaseOrder,
        remittanceAddress,
        remittanceAddressRecipient,
        serviceAddress,
        serviceAddressRecipient,
        serviceEndDate,
        serviceStartDate,
        shippingAddress,
        shippingAddressRecipient,
        state,
        subtotal,
        success,
        taxCode,
        taxDetails,
        totalDiscount,
        totalTax,
        ublDocument,
        vatex,
        vatexNote,
        vendorAddress,
        vendorAddressRecipient,
        vendorEmail,
        vendorName,
        vendorTaxId,
        mutableMapOf(),
    )

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowances(): Optional<List<Allowance>> = allowances.getOptional("allowances")

    /**
     * The amount due of the invoice. Must be positive and rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountDue(): Optional<String> = amountDue.getOptional("amount_due")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<DocumentAttachmentCreate>> =
        attachments.getOptional("attachments")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingAddress(): Optional<String> = billingAddress.getOptional("billing_address")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingAddressRecipient(): Optional<String> =
        billingAddressRecipient.getOptional("billing_address_recipient")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun charges(): Optional<List<Charge>> = charges.getOptional("charges")

    /**
     * Currency of the invoice
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<CurrencyCode> = currency.getOptional("currency")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerAddress(): Optional<String> = customerAddress.getOptional("customer_address")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerAddressRecipient(): Optional<String> =
        customerAddressRecipient.getOptional("customer_address_recipient")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerEmail(): Optional<String> = customerEmail.getOptional("customer_email")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = customerId.getOptional("customer_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerName(): Optional<String> = customerName.getOptional("customer_name")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerTaxId(): Optional<String> = customerTaxId.getOptional("customer_tax_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun direction(): Optional<DocumentDirection> = direction.getOptional("direction")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentType(): Optional<DocumentType> = documentType.getOptional("document_type")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dueDate(): Optional<LocalDate> = dueDate.getOptional("due_date")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceDate(): Optional<LocalDate> = invoiceDate.getOptional("invoice_date")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

    /**
     * The total amount of the invoice (so invoice_total = subtotal + total_tax + total_discount).
     * Must be positive and rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceTotal(): Optional<String> = invoiceTotal.getOptional("invoice_total")

    /**
     * At least one line item is required
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<List<Item>> = items.getOptional("items")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun note(): Optional<String> = note.getOptional("note")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentDetails(): Optional<List<PaymentDetailCreate>> =
        paymentDetails.getOptional("payment_details")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentTerm(): Optional<String> = paymentTerm.getOptional("payment_term")

    /**
     * The previous unpaid balance of the invoice, if any. Must be positive and rounded to maximum 2
     * decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousUnpaidBalance(): Optional<String> =
        previousUnpaidBalance.getOptional("previous_unpaid_balance")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchaseOrder(): Optional<String> = purchaseOrder.getOptional("purchase_order")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remittanceAddress(): Optional<String> = remittanceAddress.getOptional("remittance_address")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remittanceAddressRecipient(): Optional<String> =
        remittanceAddressRecipient.getOptional("remittance_address_recipient")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceAddress(): Optional<String> = serviceAddress.getOptional("service_address")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceAddressRecipient(): Optional<String> =
        serviceAddressRecipient.getOptional("service_address_recipient")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceEndDate(): Optional<LocalDate> = serviceEndDate.getOptional("service_end_date")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceStartDate(): Optional<LocalDate> = serviceStartDate.getOptional("service_start_date")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shippingAddress(): Optional<String> = shippingAddress.getOptional("shipping_address")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shippingAddressRecipient(): Optional<String> =
        shippingAddressRecipient.getOptional("shipping_address_recipient")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<DocumentState> = state.getOptional("state")

    /**
     * The taxable base of the invoice. Should be the sum of all line items - allowances (for
     * example commercial discounts) + charges with impact on VAT. Must be positive and rounded to
     * maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtotal(): Optional<String> = subtotal.getOptional("subtotal")

    /**
     * Whether the PDF was successfully converted into a compliant e-invoice
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Tax category code of the invoice
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxCode(): Optional<TaxCode> = taxCode.getOptional("tax_code")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxDetails(): Optional<List<TaxDetail>> = taxDetails.getOptional("tax_details")

    /**
     * The total financial discount of the invoice (so discounts not subject to VAT). Must be
     * positive and rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalDiscount(): Optional<String> = totalDiscount.getOptional("total_discount")

    /**
     * The total tax of the invoice. Must be positive and rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTax(): Optional<String> = totalTax.getOptional("total_tax")

    /**
     * The UBL document as an XML string
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ublDocument(): Optional<String> = ublDocument.getOptional("ubl_document")

    /**
     * VATEX code list for VAT exemption reasons
     *
     * Agency: CEF Identifier: vatex
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vatex(): Optional<Vatex> = vatex.getOptional("vatex")

    /**
     * VAT exemption note of the invoice
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vatexNote(): Optional<String> = vatexNote.getOptional("vatex_note")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorAddress(): Optional<String> = vendorAddress.getOptional("vendor_address")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorAddressRecipient(): Optional<String> =
        vendorAddressRecipient.getOptional("vendor_address_recipient")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorEmail(): Optional<String> = vendorEmail.getOptional("vendor_email")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorName(): Optional<String> = vendorName.getOptional("vendor_name")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorTaxId(): Optional<String> = vendorTaxId.getOptional("vendor_tax_id")

    /**
     * Returns the raw JSON value of [allowances].
     *
     * Unlike [allowances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowances")
    @ExcludeMissing
    fun _allowances(): JsonField<List<Allowance>> = allowances

    /**
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<String> = amountDue

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<List<DocumentAttachmentCreate>> = attachments

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<String> = billingAddress

    /**
     * Returns the raw JSON value of [billingAddressRecipient].
     *
     * Unlike [billingAddressRecipient], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billing_address_recipient")
    @ExcludeMissing
    fun _billingAddressRecipient(): JsonField<String> = billingAddressRecipient

    /**
     * Returns the raw JSON value of [charges].
     *
     * Unlike [charges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charges") @ExcludeMissing fun _charges(): JsonField<List<Charge>> = charges

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<CurrencyCode> = currency

    /**
     * Returns the raw JSON value of [customerAddress].
     *
     * Unlike [customerAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_address")
    @ExcludeMissing
    fun _customerAddress(): JsonField<String> = customerAddress

    /**
     * Returns the raw JSON value of [customerAddressRecipient].
     *
     * Unlike [customerAddressRecipient], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customer_address_recipient")
    @ExcludeMissing
    fun _customerAddressRecipient(): JsonField<String> = customerAddressRecipient

    /**
     * Returns the raw JSON value of [customerEmail].
     *
     * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_email")
    @ExcludeMissing
    fun _customerEmail(): JsonField<String> = customerEmail

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [customerName].
     *
     * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_name")
    @ExcludeMissing
    fun _customerName(): JsonField<String> = customerName

    /**
     * Returns the raw JSON value of [customerTaxId].
     *
     * Unlike [customerTaxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    fun _customerTaxId(): JsonField<String> = customerTaxId

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<DocumentDirection> = direction

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<DocumentType> = documentType

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

    /**
     * Returns the raw JSON value of [invoiceDate].
     *
     * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_date")
    @ExcludeMissing
    fun _invoiceDate(): JsonField<LocalDate> = invoiceDate

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [invoiceTotal].
     *
     * Unlike [invoiceTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_total")
    @ExcludeMissing
    fun _invoiceTotal(): JsonField<String> = invoiceTotal

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /**
     * Returns the raw JSON value of [note].
     *
     * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

    /**
     * Returns the raw JSON value of [paymentDetails].
     *
     * Unlike [paymentDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_details")
    @ExcludeMissing
    fun _paymentDetails(): JsonField<List<PaymentDetailCreate>> = paymentDetails

    /**
     * Returns the raw JSON value of [paymentTerm].
     *
     * Unlike [paymentTerm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_term")
    @ExcludeMissing
    fun _paymentTerm(): JsonField<String> = paymentTerm

    /**
     * Returns the raw JSON value of [previousUnpaidBalance].
     *
     * Unlike [previousUnpaidBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_unpaid_balance")
    @ExcludeMissing
    fun _previousUnpaidBalance(): JsonField<String> = previousUnpaidBalance

    /**
     * Returns the raw JSON value of [purchaseOrder].
     *
     * Unlike [purchaseOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purchase_order")
    @ExcludeMissing
    fun _purchaseOrder(): JsonField<String> = purchaseOrder

    /**
     * Returns the raw JSON value of [remittanceAddress].
     *
     * Unlike [remittanceAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remittance_address")
    @ExcludeMissing
    fun _remittanceAddress(): JsonField<String> = remittanceAddress

    /**
     * Returns the raw JSON value of [remittanceAddressRecipient].
     *
     * Unlike [remittanceAddressRecipient], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("remittance_address_recipient")
    @ExcludeMissing
    fun _remittanceAddressRecipient(): JsonField<String> = remittanceAddressRecipient

    /**
     * Returns the raw JSON value of [serviceAddress].
     *
     * Unlike [serviceAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_address")
    @ExcludeMissing
    fun _serviceAddress(): JsonField<String> = serviceAddress

    /**
     * Returns the raw JSON value of [serviceAddressRecipient].
     *
     * Unlike [serviceAddressRecipient], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("service_address_recipient")
    @ExcludeMissing
    fun _serviceAddressRecipient(): JsonField<String> = serviceAddressRecipient

    /**
     * Returns the raw JSON value of [serviceEndDate].
     *
     * Unlike [serviceEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_end_date")
    @ExcludeMissing
    fun _serviceEndDate(): JsonField<LocalDate> = serviceEndDate

    /**
     * Returns the raw JSON value of [serviceStartDate].
     *
     * Unlike [serviceStartDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("service_start_date")
    @ExcludeMissing
    fun _serviceStartDate(): JsonField<LocalDate> = serviceStartDate

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<String> = shippingAddress

    /**
     * Returns the raw JSON value of [shippingAddressRecipient].
     *
     * Unlike [shippingAddressRecipient], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("shipping_address_recipient")
    @ExcludeMissing
    fun _shippingAddressRecipient(): JsonField<String> = shippingAddressRecipient

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<DocumentState> = state

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [taxCode].
     *
     * Unlike [taxCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_code") @ExcludeMissing fun _taxCode(): JsonField<TaxCode> = taxCode

    /**
     * Returns the raw JSON value of [taxDetails].
     *
     * Unlike [taxDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_details")
    @ExcludeMissing
    fun _taxDetails(): JsonField<List<TaxDetail>> = taxDetails

    /**
     * Returns the raw JSON value of [totalDiscount].
     *
     * Unlike [totalDiscount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_discount")
    @ExcludeMissing
    fun _totalDiscount(): JsonField<String> = totalDiscount

    /**
     * Returns the raw JSON value of [totalTax].
     *
     * Unlike [totalTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tax") @ExcludeMissing fun _totalTax(): JsonField<String> = totalTax

    /**
     * Returns the raw JSON value of [ublDocument].
     *
     * Unlike [ublDocument], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ubl_document")
    @ExcludeMissing
    fun _ublDocument(): JsonField<String> = ublDocument

    /**
     * Returns the raw JSON value of [vatex].
     *
     * Unlike [vatex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vatex") @ExcludeMissing fun _vatex(): JsonField<Vatex> = vatex

    /**
     * Returns the raw JSON value of [vatexNote].
     *
     * Unlike [vatexNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vatex_note") @ExcludeMissing fun _vatexNote(): JsonField<String> = vatexNote

    /**
     * Returns the raw JSON value of [vendorAddress].
     *
     * Unlike [vendorAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_address")
    @ExcludeMissing
    fun _vendorAddress(): JsonField<String> = vendorAddress

    /**
     * Returns the raw JSON value of [vendorAddressRecipient].
     *
     * Unlike [vendorAddressRecipient], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("vendor_address_recipient")
    @ExcludeMissing
    fun _vendorAddressRecipient(): JsonField<String> = vendorAddressRecipient

    /**
     * Returns the raw JSON value of [vendorEmail].
     *
     * Unlike [vendorEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_email")
    @ExcludeMissing
    fun _vendorEmail(): JsonField<String> = vendorEmail

    /**
     * Returns the raw JSON value of [vendorName].
     *
     * Unlike [vendorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_name") @ExcludeMissing fun _vendorName(): JsonField<String> = vendorName

    /**
     * Returns the raw JSON value of [vendorTaxId].
     *
     * Unlike [vendorTaxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_tax_id")
    @ExcludeMissing
    fun _vendorTaxId(): JsonField<String> = vendorTaxId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DocumentCreateFromPdfResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentCreateFromPdfResponse]. */
    class Builder internal constructor() {

        private var allowances: JsonField<MutableList<Allowance>>? = null
        private var amountDue: JsonField<String> = JsonMissing.of()
        private var attachments: JsonField<MutableList<DocumentAttachmentCreate>>? = null
        private var billingAddress: JsonField<String> = JsonMissing.of()
        private var billingAddressRecipient: JsonField<String> = JsonMissing.of()
        private var charges: JsonField<MutableList<Charge>>? = null
        private var currency: JsonField<CurrencyCode> = JsonMissing.of()
        private var customerAddress: JsonField<String> = JsonMissing.of()
        private var customerAddressRecipient: JsonField<String> = JsonMissing.of()
        private var customerEmail: JsonField<String> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var customerName: JsonField<String> = JsonMissing.of()
        private var customerTaxId: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<DocumentDirection> = JsonMissing.of()
        private var documentType: JsonField<DocumentType> = JsonMissing.of()
        private var dueDate: JsonField<LocalDate> = JsonMissing.of()
        private var invoiceDate: JsonField<LocalDate> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var invoiceTotal: JsonField<String> = JsonMissing.of()
        private var items: JsonField<MutableList<Item>>? = null
        private var note: JsonField<String> = JsonMissing.of()
        private var paymentDetails: JsonField<MutableList<PaymentDetailCreate>>? = null
        private var paymentTerm: JsonField<String> = JsonMissing.of()
        private var previousUnpaidBalance: JsonField<String> = JsonMissing.of()
        private var purchaseOrder: JsonField<String> = JsonMissing.of()
        private var remittanceAddress: JsonField<String> = JsonMissing.of()
        private var remittanceAddressRecipient: JsonField<String> = JsonMissing.of()
        private var serviceAddress: JsonField<String> = JsonMissing.of()
        private var serviceAddressRecipient: JsonField<String> = JsonMissing.of()
        private var serviceEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var serviceStartDate: JsonField<LocalDate> = JsonMissing.of()
        private var shippingAddress: JsonField<String> = JsonMissing.of()
        private var shippingAddressRecipient: JsonField<String> = JsonMissing.of()
        private var state: JsonField<DocumentState> = JsonMissing.of()
        private var subtotal: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var taxCode: JsonField<TaxCode> = JsonMissing.of()
        private var taxDetails: JsonField<MutableList<TaxDetail>>? = null
        private var totalDiscount: JsonField<String> = JsonMissing.of()
        private var totalTax: JsonField<String> = JsonMissing.of()
        private var ublDocument: JsonField<String> = JsonMissing.of()
        private var vatex: JsonField<Vatex> = JsonMissing.of()
        private var vatexNote: JsonField<String> = JsonMissing.of()
        private var vendorAddress: JsonField<String> = JsonMissing.of()
        private var vendorAddressRecipient: JsonField<String> = JsonMissing.of()
        private var vendorEmail: JsonField<String> = JsonMissing.of()
        private var vendorName: JsonField<String> = JsonMissing.of()
        private var vendorTaxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentCreateFromPdfResponse: DocumentCreateFromPdfResponse) = apply {
            allowances = documentCreateFromPdfResponse.allowances.map { it.toMutableList() }
            amountDue = documentCreateFromPdfResponse.amountDue
            attachments = documentCreateFromPdfResponse.attachments.map { it.toMutableList() }
            billingAddress = documentCreateFromPdfResponse.billingAddress
            billingAddressRecipient = documentCreateFromPdfResponse.billingAddressRecipient
            charges = documentCreateFromPdfResponse.charges.map { it.toMutableList() }
            currency = documentCreateFromPdfResponse.currency
            customerAddress = documentCreateFromPdfResponse.customerAddress
            customerAddressRecipient = documentCreateFromPdfResponse.customerAddressRecipient
            customerEmail = documentCreateFromPdfResponse.customerEmail
            customerId = documentCreateFromPdfResponse.customerId
            customerName = documentCreateFromPdfResponse.customerName
            customerTaxId = documentCreateFromPdfResponse.customerTaxId
            direction = documentCreateFromPdfResponse.direction
            documentType = documentCreateFromPdfResponse.documentType
            dueDate = documentCreateFromPdfResponse.dueDate
            invoiceDate = documentCreateFromPdfResponse.invoiceDate
            invoiceId = documentCreateFromPdfResponse.invoiceId
            invoiceTotal = documentCreateFromPdfResponse.invoiceTotal
            items = documentCreateFromPdfResponse.items.map { it.toMutableList() }
            note = documentCreateFromPdfResponse.note
            paymentDetails = documentCreateFromPdfResponse.paymentDetails.map { it.toMutableList() }
            paymentTerm = documentCreateFromPdfResponse.paymentTerm
            previousUnpaidBalance = documentCreateFromPdfResponse.previousUnpaidBalance
            purchaseOrder = documentCreateFromPdfResponse.purchaseOrder
            remittanceAddress = documentCreateFromPdfResponse.remittanceAddress
            remittanceAddressRecipient = documentCreateFromPdfResponse.remittanceAddressRecipient
            serviceAddress = documentCreateFromPdfResponse.serviceAddress
            serviceAddressRecipient = documentCreateFromPdfResponse.serviceAddressRecipient
            serviceEndDate = documentCreateFromPdfResponse.serviceEndDate
            serviceStartDate = documentCreateFromPdfResponse.serviceStartDate
            shippingAddress = documentCreateFromPdfResponse.shippingAddress
            shippingAddressRecipient = documentCreateFromPdfResponse.shippingAddressRecipient
            state = documentCreateFromPdfResponse.state
            subtotal = documentCreateFromPdfResponse.subtotal
            success = documentCreateFromPdfResponse.success
            taxCode = documentCreateFromPdfResponse.taxCode
            taxDetails = documentCreateFromPdfResponse.taxDetails.map { it.toMutableList() }
            totalDiscount = documentCreateFromPdfResponse.totalDiscount
            totalTax = documentCreateFromPdfResponse.totalTax
            ublDocument = documentCreateFromPdfResponse.ublDocument
            vatex = documentCreateFromPdfResponse.vatex
            vatexNote = documentCreateFromPdfResponse.vatexNote
            vendorAddress = documentCreateFromPdfResponse.vendorAddress
            vendorAddressRecipient = documentCreateFromPdfResponse.vendorAddressRecipient
            vendorEmail = documentCreateFromPdfResponse.vendorEmail
            vendorName = documentCreateFromPdfResponse.vendorName
            vendorTaxId = documentCreateFromPdfResponse.vendorTaxId
            additionalProperties = documentCreateFromPdfResponse.additionalProperties.toMutableMap()
        }

        fun allowances(allowances: List<Allowance>?) = allowances(JsonField.ofNullable(allowances))

        /** Alias for calling [Builder.allowances] with `allowances.orElse(null)`. */
        fun allowances(allowances: Optional<List<Allowance>>) = allowances(allowances.getOrNull())

        /**
         * Sets [Builder.allowances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowances] with a well-typed `List<Allowance>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowances(allowances: JsonField<List<Allowance>>) = apply {
            this.allowances = allowances.map { it.toMutableList() }
        }

        /**
         * Adds a single [Allowance] to [allowances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowance(allowance: Allowance) = apply {
            allowances =
                (allowances ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowances", it).add(allowance)
                }
        }

        /** The amount due of the invoice. Must be positive and rounded to maximum 2 decimals */
        fun amountDue(amountDue: String?) = amountDue(JsonField.ofNullable(amountDue))

        /** Alias for calling [Builder.amountDue] with `amountDue.orElse(null)`. */
        fun amountDue(amountDue: Optional<String>) = amountDue(amountDue.getOrNull())

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

        fun attachments(attachments: List<DocumentAttachmentCreate>?) =
            attachments(JsonField.ofNullable(attachments))

        /** Alias for calling [Builder.attachments] with `attachments.orElse(null)`. */
        fun attachments(attachments: Optional<List<DocumentAttachmentCreate>>) =
            attachments(attachments.getOrNull())

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed
         * `List<DocumentAttachmentCreate>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun attachments(attachments: JsonField<List<DocumentAttachmentCreate>>) = apply {
            this.attachments = attachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [DocumentAttachmentCreate] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: DocumentAttachmentCreate) = apply {
            attachments =
                (attachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attachments", it).add(attachment)
                }
        }

        fun billingAddress(billingAddress: String?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
        fun billingAddress(billingAddress: Optional<String>) =
            billingAddress(billingAddress.getOrNull())

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<String>) = apply {
            this.billingAddress = billingAddress
        }

        fun billingAddressRecipient(billingAddressRecipient: String?) =
            billingAddressRecipient(JsonField.ofNullable(billingAddressRecipient))

        /**
         * Alias for calling [Builder.billingAddressRecipient] with
         * `billingAddressRecipient.orElse(null)`.
         */
        fun billingAddressRecipient(billingAddressRecipient: Optional<String>) =
            billingAddressRecipient(billingAddressRecipient.getOrNull())

        /**
         * Sets [Builder.billingAddressRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddressRecipient] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingAddressRecipient(billingAddressRecipient: JsonField<String>) = apply {
            this.billingAddressRecipient = billingAddressRecipient
        }

        fun charges(charges: List<Charge>?) = charges(JsonField.ofNullable(charges))

        /** Alias for calling [Builder.charges] with `charges.orElse(null)`. */
        fun charges(charges: Optional<List<Charge>>) = charges(charges.getOrNull())

        /**
         * Sets [Builder.charges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charges] with a well-typed `List<Charge>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun charges(charges: JsonField<List<Charge>>) = apply {
            this.charges = charges.map { it.toMutableList() }
        }

        /**
         * Adds a single [Charge] to [charges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCharge(charge: Charge) = apply {
            charges =
                (charges ?: JsonField.of(mutableListOf())).also {
                    checkKnown("charges", it).add(charge)
                }
        }

        /** Currency of the invoice */
        fun currency(currency: CurrencyCode) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [CurrencyCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currency(currency: JsonField<CurrencyCode>) = apply { this.currency = currency }

        fun customerAddress(customerAddress: String?) =
            customerAddress(JsonField.ofNullable(customerAddress))

        /** Alias for calling [Builder.customerAddress] with `customerAddress.orElse(null)`. */
        fun customerAddress(customerAddress: Optional<String>) =
            customerAddress(customerAddress.getOrNull())

        /**
         * Sets [Builder.customerAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerAddress(customerAddress: JsonField<String>) = apply {
            this.customerAddress = customerAddress
        }

        fun customerAddressRecipient(customerAddressRecipient: String?) =
            customerAddressRecipient(JsonField.ofNullable(customerAddressRecipient))

        /**
         * Alias for calling [Builder.customerAddressRecipient] with
         * `customerAddressRecipient.orElse(null)`.
         */
        fun customerAddressRecipient(customerAddressRecipient: Optional<String>) =
            customerAddressRecipient(customerAddressRecipient.getOrNull())

        /**
         * Sets [Builder.customerAddressRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerAddressRecipient] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customerAddressRecipient(customerAddressRecipient: JsonField<String>) = apply {
            this.customerAddressRecipient = customerAddressRecipient
        }

        fun customerEmail(customerEmail: String?) =
            customerEmail(JsonField.ofNullable(customerEmail))

        /** Alias for calling [Builder.customerEmail] with `customerEmail.orElse(null)`. */
        fun customerEmail(customerEmail: Optional<String>) =
            customerEmail(customerEmail.getOrNull())

        /**
         * Sets [Builder.customerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            this.customerEmail = customerEmail
        }

        fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun customerName(customerName: String?) = customerName(JsonField.ofNullable(customerName))

        /** Alias for calling [Builder.customerName] with `customerName.orElse(null)`. */
        fun customerName(customerName: Optional<String>) = customerName(customerName.getOrNull())

        /**
         * Sets [Builder.customerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerName(customerName: JsonField<String>) = apply {
            this.customerName = customerName
        }

        fun customerTaxId(customerTaxId: String?) =
            customerTaxId(JsonField.ofNullable(customerTaxId))

        /** Alias for calling [Builder.customerTaxId] with `customerTaxId.orElse(null)`. */
        fun customerTaxId(customerTaxId: Optional<String>) =
            customerTaxId(customerTaxId.getOrNull())

        /**
         * Sets [Builder.customerTaxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerTaxId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerTaxId(customerTaxId: JsonField<String>) = apply {
            this.customerTaxId = customerTaxId
        }

        fun direction(direction: DocumentDirection) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [DocumentDirection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun direction(direction: JsonField<DocumentDirection>) = apply {
            this.direction = direction
        }

        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        fun dueDate(dueDate: LocalDate?) = dueDate(JsonField.ofNullable(dueDate))

        /** Alias for calling [Builder.dueDate] with `dueDate.orElse(null)`. */
        fun dueDate(dueDate: Optional<LocalDate>) = dueDate(dueDate.getOrNull())

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

        fun invoiceDate(invoiceDate: LocalDate?) = invoiceDate(JsonField.ofNullable(invoiceDate))

        /** Alias for calling [Builder.invoiceDate] with `invoiceDate.orElse(null)`. */
        fun invoiceDate(invoiceDate: Optional<LocalDate>) = invoiceDate(invoiceDate.getOrNull())

        /**
         * Sets [Builder.invoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceDate(invoiceDate: JsonField<LocalDate>) = apply {
            this.invoiceDate = invoiceDate
        }

        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /** Alias for calling [Builder.invoiceId] with `invoiceId.orElse(null)`. */
        fun invoiceId(invoiceId: Optional<String>) = invoiceId(invoiceId.getOrNull())

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /**
         * The total amount of the invoice (so invoice_total = subtotal + total_tax +
         * total_discount). Must be positive and rounded to maximum 2 decimals
         */
        fun invoiceTotal(invoiceTotal: String?) = invoiceTotal(JsonField.ofNullable(invoiceTotal))

        /** Alias for calling [Builder.invoiceTotal] with `invoiceTotal.orElse(null)`. */
        fun invoiceTotal(invoiceTotal: Optional<String>) = invoiceTotal(invoiceTotal.getOrNull())

        /**
         * Sets [Builder.invoiceTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceTotal] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceTotal(invoiceTotal: JsonField<String>) = apply {
            this.invoiceTotal = invoiceTotal
        }

        /** At least one line item is required */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        fun note(note: String?) = note(JsonField.ofNullable(note))

        /** Alias for calling [Builder.note] with `note.orElse(null)`. */
        fun note(note: Optional<String>) = note(note.getOrNull())

        /**
         * Sets [Builder.note] to an arbitrary JSON value.
         *
         * You should usually call [Builder.note] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun note(note: JsonField<String>) = apply { this.note = note }

        fun paymentDetails(paymentDetails: List<PaymentDetailCreate>?) =
            paymentDetails(JsonField.ofNullable(paymentDetails))

        /** Alias for calling [Builder.paymentDetails] with `paymentDetails.orElse(null)`. */
        fun paymentDetails(paymentDetails: Optional<List<PaymentDetailCreate>>) =
            paymentDetails(paymentDetails.getOrNull())

        /**
         * Sets [Builder.paymentDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentDetails] with a well-typed
         * `List<PaymentDetailCreate>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun paymentDetails(paymentDetails: JsonField<List<PaymentDetailCreate>>) = apply {
            this.paymentDetails = paymentDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentDetailCreate] to [paymentDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentDetail(paymentDetail: PaymentDetailCreate) = apply {
            paymentDetails =
                (paymentDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentDetails", it).add(paymentDetail)
                }
        }

        fun paymentTerm(paymentTerm: String?) = paymentTerm(JsonField.ofNullable(paymentTerm))

        /** Alias for calling [Builder.paymentTerm] with `paymentTerm.orElse(null)`. */
        fun paymentTerm(paymentTerm: Optional<String>) = paymentTerm(paymentTerm.getOrNull())

        /**
         * Sets [Builder.paymentTerm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentTerm] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentTerm(paymentTerm: JsonField<String>) = apply { this.paymentTerm = paymentTerm }

        /**
         * The previous unpaid balance of the invoice, if any. Must be positive and rounded to
         * maximum 2 decimals
         */
        fun previousUnpaidBalance(previousUnpaidBalance: String?) =
            previousUnpaidBalance(JsonField.ofNullable(previousUnpaidBalance))

        /**
         * Alias for calling [Builder.previousUnpaidBalance] with
         * `previousUnpaidBalance.orElse(null)`.
         */
        fun previousUnpaidBalance(previousUnpaidBalance: Optional<String>) =
            previousUnpaidBalance(previousUnpaidBalance.getOrNull())

        /**
         * Sets [Builder.previousUnpaidBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousUnpaidBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousUnpaidBalance(previousUnpaidBalance: JsonField<String>) = apply {
            this.previousUnpaidBalance = previousUnpaidBalance
        }

        fun purchaseOrder(purchaseOrder: String?) =
            purchaseOrder(JsonField.ofNullable(purchaseOrder))

        /** Alias for calling [Builder.purchaseOrder] with `purchaseOrder.orElse(null)`. */
        fun purchaseOrder(purchaseOrder: Optional<String>) =
            purchaseOrder(purchaseOrder.getOrNull())

        /**
         * Sets [Builder.purchaseOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseOrder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun purchaseOrder(purchaseOrder: JsonField<String>) = apply {
            this.purchaseOrder = purchaseOrder
        }

        fun remittanceAddress(remittanceAddress: String?) =
            remittanceAddress(JsonField.ofNullable(remittanceAddress))

        /** Alias for calling [Builder.remittanceAddress] with `remittanceAddress.orElse(null)`. */
        fun remittanceAddress(remittanceAddress: Optional<String>) =
            remittanceAddress(remittanceAddress.getOrNull())

        /**
         * Sets [Builder.remittanceAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceAddress(remittanceAddress: JsonField<String>) = apply {
            this.remittanceAddress = remittanceAddress
        }

        fun remittanceAddressRecipient(remittanceAddressRecipient: String?) =
            remittanceAddressRecipient(JsonField.ofNullable(remittanceAddressRecipient))

        /**
         * Alias for calling [Builder.remittanceAddressRecipient] with
         * `remittanceAddressRecipient.orElse(null)`.
         */
        fun remittanceAddressRecipient(remittanceAddressRecipient: Optional<String>) =
            remittanceAddressRecipient(remittanceAddressRecipient.getOrNull())

        /**
         * Sets [Builder.remittanceAddressRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceAddressRecipient] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun remittanceAddressRecipient(remittanceAddressRecipient: JsonField<String>) = apply {
            this.remittanceAddressRecipient = remittanceAddressRecipient
        }

        fun serviceAddress(serviceAddress: String?) =
            serviceAddress(JsonField.ofNullable(serviceAddress))

        /** Alias for calling [Builder.serviceAddress] with `serviceAddress.orElse(null)`. */
        fun serviceAddress(serviceAddress: Optional<String>) =
            serviceAddress(serviceAddress.getOrNull())

        /**
         * Sets [Builder.serviceAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceAddress(serviceAddress: JsonField<String>) = apply {
            this.serviceAddress = serviceAddress
        }

        fun serviceAddressRecipient(serviceAddressRecipient: String?) =
            serviceAddressRecipient(JsonField.ofNullable(serviceAddressRecipient))

        /**
         * Alias for calling [Builder.serviceAddressRecipient] with
         * `serviceAddressRecipient.orElse(null)`.
         */
        fun serviceAddressRecipient(serviceAddressRecipient: Optional<String>) =
            serviceAddressRecipient(serviceAddressRecipient.getOrNull())

        /**
         * Sets [Builder.serviceAddressRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceAddressRecipient] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun serviceAddressRecipient(serviceAddressRecipient: JsonField<String>) = apply {
            this.serviceAddressRecipient = serviceAddressRecipient
        }

        fun serviceEndDate(serviceEndDate: LocalDate?) =
            serviceEndDate(JsonField.ofNullable(serviceEndDate))

        /** Alias for calling [Builder.serviceEndDate] with `serviceEndDate.orElse(null)`. */
        fun serviceEndDate(serviceEndDate: Optional<LocalDate>) =
            serviceEndDate(serviceEndDate.getOrNull())

        /**
         * Sets [Builder.serviceEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceEndDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceEndDate(serviceEndDate: JsonField<LocalDate>) = apply {
            this.serviceEndDate = serviceEndDate
        }

        fun serviceStartDate(serviceStartDate: LocalDate?) =
            serviceStartDate(JsonField.ofNullable(serviceStartDate))

        /** Alias for calling [Builder.serviceStartDate] with `serviceStartDate.orElse(null)`. */
        fun serviceStartDate(serviceStartDate: Optional<LocalDate>) =
            serviceStartDate(serviceStartDate.getOrNull())

        /**
         * Sets [Builder.serviceStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceStartDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceStartDate(serviceStartDate: JsonField<LocalDate>) = apply {
            this.serviceStartDate = serviceStartDate
        }

        fun shippingAddress(shippingAddress: String?) =
            shippingAddress(JsonField.ofNullable(shippingAddress))

        /** Alias for calling [Builder.shippingAddress] with `shippingAddress.orElse(null)`. */
        fun shippingAddress(shippingAddress: Optional<String>) =
            shippingAddress(shippingAddress.getOrNull())

        /**
         * Sets [Builder.shippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shippingAddress(shippingAddress: JsonField<String>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun shippingAddressRecipient(shippingAddressRecipient: String?) =
            shippingAddressRecipient(JsonField.ofNullable(shippingAddressRecipient))

        /**
         * Alias for calling [Builder.shippingAddressRecipient] with
         * `shippingAddressRecipient.orElse(null)`.
         */
        fun shippingAddressRecipient(shippingAddressRecipient: Optional<String>) =
            shippingAddressRecipient(shippingAddressRecipient.getOrNull())

        /**
         * Sets [Builder.shippingAddressRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddressRecipient] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shippingAddressRecipient(shippingAddressRecipient: JsonField<String>) = apply {
            this.shippingAddressRecipient = shippingAddressRecipient
        }

        fun state(state: DocumentState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [DocumentState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun state(state: JsonField<DocumentState>) = apply { this.state = state }

        /**
         * The taxable base of the invoice. Should be the sum of all line items - allowances (for
         * example commercial discounts) + charges with impact on VAT. Must be positive and rounded
         * to maximum 2 decimals
         */
        fun subtotal(subtotal: String?) = subtotal(JsonField.ofNullable(subtotal))

        /** Alias for calling [Builder.subtotal] with `subtotal.orElse(null)`. */
        fun subtotal(subtotal: Optional<String>) = subtotal(subtotal.getOrNull())

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /** Whether the PDF was successfully converted into a compliant e-invoice */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Tax category code of the invoice */
        fun taxCode(taxCode: TaxCode) = taxCode(JsonField.of(taxCode))

        /**
         * Sets [Builder.taxCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCode] with a well-typed [TaxCode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxCode(taxCode: JsonField<TaxCode>) = apply { this.taxCode = taxCode }

        fun taxDetails(taxDetails: List<TaxDetail>?) = taxDetails(JsonField.ofNullable(taxDetails))

        /** Alias for calling [Builder.taxDetails] with `taxDetails.orElse(null)`. */
        fun taxDetails(taxDetails: Optional<List<TaxDetail>>) = taxDetails(taxDetails.getOrNull())

        /**
         * Sets [Builder.taxDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxDetails] with a well-typed `List<TaxDetail>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxDetails(taxDetails: JsonField<List<TaxDetail>>) = apply {
            this.taxDetails = taxDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [TaxDetail] to [taxDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTaxDetail(taxDetail: TaxDetail) = apply {
            taxDetails =
                (taxDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("taxDetails", it).add(taxDetail)
                }
        }

        /**
         * The total financial discount of the invoice (so discounts not subject to VAT). Must be
         * positive and rounded to maximum 2 decimals
         */
        fun totalDiscount(totalDiscount: String?) =
            totalDiscount(JsonField.ofNullable(totalDiscount))

        /** Alias for calling [Builder.totalDiscount] with `totalDiscount.orElse(null)`. */
        fun totalDiscount(totalDiscount: Optional<String>) =
            totalDiscount(totalDiscount.getOrNull())

        /**
         * Sets [Builder.totalDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalDiscount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalDiscount(totalDiscount: JsonField<String>) = apply {
            this.totalDiscount = totalDiscount
        }

        /** The total tax of the invoice. Must be positive and rounded to maximum 2 decimals */
        fun totalTax(totalTax: String?) = totalTax(JsonField.ofNullable(totalTax))

        /** Alias for calling [Builder.totalTax] with `totalTax.orElse(null)`. */
        fun totalTax(totalTax: Optional<String>) = totalTax(totalTax.getOrNull())

        /**
         * Sets [Builder.totalTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTax] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalTax(totalTax: JsonField<String>) = apply { this.totalTax = totalTax }

        /** The UBL document as an XML string */
        fun ublDocument(ublDocument: String?) = ublDocument(JsonField.ofNullable(ublDocument))

        /** Alias for calling [Builder.ublDocument] with `ublDocument.orElse(null)`. */
        fun ublDocument(ublDocument: Optional<String>) = ublDocument(ublDocument.getOrNull())

        /**
         * Sets [Builder.ublDocument] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ublDocument] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ublDocument(ublDocument: JsonField<String>) = apply { this.ublDocument = ublDocument }

        /**
         * VATEX code list for VAT exemption reasons
         *
         * Agency: CEF Identifier: vatex
         */
        fun vatex(vatex: Vatex?) = vatex(JsonField.ofNullable(vatex))

        /** Alias for calling [Builder.vatex] with `vatex.orElse(null)`. */
        fun vatex(vatex: Optional<Vatex>) = vatex(vatex.getOrNull())

        /**
         * Sets [Builder.vatex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vatex] with a well-typed [Vatex] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vatex(vatex: JsonField<Vatex>) = apply { this.vatex = vatex }

        /** VAT exemption note of the invoice */
        fun vatexNote(vatexNote: String?) = vatexNote(JsonField.ofNullable(vatexNote))

        /** Alias for calling [Builder.vatexNote] with `vatexNote.orElse(null)`. */
        fun vatexNote(vatexNote: Optional<String>) = vatexNote(vatexNote.getOrNull())

        /**
         * Sets [Builder.vatexNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vatexNote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vatexNote(vatexNote: JsonField<String>) = apply { this.vatexNote = vatexNote }

        fun vendorAddress(vendorAddress: String?) =
            vendorAddress(JsonField.ofNullable(vendorAddress))

        /** Alias for calling [Builder.vendorAddress] with `vendorAddress.orElse(null)`. */
        fun vendorAddress(vendorAddress: Optional<String>) =
            vendorAddress(vendorAddress.getOrNull())

        /**
         * Sets [Builder.vendorAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorAddress(vendorAddress: JsonField<String>) = apply {
            this.vendorAddress = vendorAddress
        }

        fun vendorAddressRecipient(vendorAddressRecipient: String?) =
            vendorAddressRecipient(JsonField.ofNullable(vendorAddressRecipient))

        /**
         * Alias for calling [Builder.vendorAddressRecipient] with
         * `vendorAddressRecipient.orElse(null)`.
         */
        fun vendorAddressRecipient(vendorAddressRecipient: Optional<String>) =
            vendorAddressRecipient(vendorAddressRecipient.getOrNull())

        /**
         * Sets [Builder.vendorAddressRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorAddressRecipient] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorAddressRecipient(vendorAddressRecipient: JsonField<String>) = apply {
            this.vendorAddressRecipient = vendorAddressRecipient
        }

        fun vendorEmail(vendorEmail: String?) = vendorEmail(JsonField.ofNullable(vendorEmail))

        /** Alias for calling [Builder.vendorEmail] with `vendorEmail.orElse(null)`. */
        fun vendorEmail(vendorEmail: Optional<String>) = vendorEmail(vendorEmail.getOrNull())

        /**
         * Sets [Builder.vendorEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorEmail(vendorEmail: JsonField<String>) = apply { this.vendorEmail = vendorEmail }

        fun vendorName(vendorName: String?) = vendorName(JsonField.ofNullable(vendorName))

        /** Alias for calling [Builder.vendorName] with `vendorName.orElse(null)`. */
        fun vendorName(vendorName: Optional<String>) = vendorName(vendorName.getOrNull())

        /**
         * Sets [Builder.vendorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorName(vendorName: JsonField<String>) = apply { this.vendorName = vendorName }

        fun vendorTaxId(vendorTaxId: String?) = vendorTaxId(JsonField.ofNullable(vendorTaxId))

        /** Alias for calling [Builder.vendorTaxId] with `vendorTaxId.orElse(null)`. */
        fun vendorTaxId(vendorTaxId: Optional<String>) = vendorTaxId(vendorTaxId.getOrNull())

        /**
         * Sets [Builder.vendorTaxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorTaxId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorTaxId(vendorTaxId: JsonField<String>) = apply { this.vendorTaxId = vendorTaxId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [DocumentCreateFromPdfResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentCreateFromPdfResponse =
            DocumentCreateFromPdfResponse(
                (allowances ?: JsonMissing.of()).map { it.toImmutable() },
                amountDue,
                (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                billingAddress,
                billingAddressRecipient,
                (charges ?: JsonMissing.of()).map { it.toImmutable() },
                currency,
                customerAddress,
                customerAddressRecipient,
                customerEmail,
                customerId,
                customerName,
                customerTaxId,
                direction,
                documentType,
                dueDate,
                invoiceDate,
                invoiceId,
                invoiceTotal,
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                note,
                (paymentDetails ?: JsonMissing.of()).map { it.toImmutable() },
                paymentTerm,
                previousUnpaidBalance,
                purchaseOrder,
                remittanceAddress,
                remittanceAddressRecipient,
                serviceAddress,
                serviceAddressRecipient,
                serviceEndDate,
                serviceStartDate,
                shippingAddress,
                shippingAddressRecipient,
                state,
                subtotal,
                success,
                taxCode,
                (taxDetails ?: JsonMissing.of()).map { it.toImmutable() },
                totalDiscount,
                totalTax,
                ublDocument,
                vatex,
                vatexNote,
                vendorAddress,
                vendorAddressRecipient,
                vendorEmail,
                vendorName,
                vendorTaxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentCreateFromPdfResponse = apply {
        if (validated) {
            return@apply
        }

        allowances().ifPresent { it.forEach { it.validate() } }
        amountDue()
        attachments().ifPresent { it.forEach { it.validate() } }
        billingAddress()
        billingAddressRecipient()
        charges().ifPresent { it.forEach { it.validate() } }
        currency().ifPresent { it.validate() }
        customerAddress()
        customerAddressRecipient()
        customerEmail()
        customerId()
        customerName()
        customerTaxId()
        direction().ifPresent { it.validate() }
        documentType().ifPresent { it.validate() }
        dueDate()
        invoiceDate()
        invoiceId()
        invoiceTotal()
        items().ifPresent { it.forEach { it.validate() } }
        note()
        paymentDetails().ifPresent { it.forEach { it.validate() } }
        paymentTerm()
        previousUnpaidBalance()
        purchaseOrder()
        remittanceAddress()
        remittanceAddressRecipient()
        serviceAddress()
        serviceAddressRecipient()
        serviceEndDate()
        serviceStartDate()
        shippingAddress()
        shippingAddressRecipient()
        state().ifPresent { it.validate() }
        subtotal()
        success()
        taxCode().ifPresent { it.validate() }
        taxDetails().ifPresent { it.forEach { it.validate() } }
        totalDiscount()
        totalTax()
        ublDocument()
        vatex().ifPresent { it.validate() }
        vatexNote()
        vendorAddress()
        vendorAddressRecipient()
        vendorEmail()
        vendorName()
        vendorTaxId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: EInvoiceInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (allowances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (amountDue.asKnown().isPresent) 1 else 0) +
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (billingAddress.asKnown().isPresent) 1 else 0) +
            (if (billingAddressRecipient.asKnown().isPresent) 1 else 0) +
            (charges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customerAddress.asKnown().isPresent) 1 else 0) +
            (if (customerAddressRecipient.asKnown().isPresent) 1 else 0) +
            (if (customerEmail.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (customerName.asKnown().isPresent) 1 else 0) +
            (if (customerTaxId.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (documentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dueDate.asKnown().isPresent) 1 else 0) +
            (if (invoiceDate.asKnown().isPresent) 1 else 0) +
            (if (invoiceId.asKnown().isPresent) 1 else 0) +
            (if (invoiceTotal.asKnown().isPresent) 1 else 0) +
            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (note.asKnown().isPresent) 1 else 0) +
            (paymentDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paymentTerm.asKnown().isPresent) 1 else 0) +
            (if (previousUnpaidBalance.asKnown().isPresent) 1 else 0) +
            (if (purchaseOrder.asKnown().isPresent) 1 else 0) +
            (if (remittanceAddress.asKnown().isPresent) 1 else 0) +
            (if (remittanceAddressRecipient.asKnown().isPresent) 1 else 0) +
            (if (serviceAddress.asKnown().isPresent) 1 else 0) +
            (if (serviceAddressRecipient.asKnown().isPresent) 1 else 0) +
            (if (serviceEndDate.asKnown().isPresent) 1 else 0) +
            (if (serviceStartDate.asKnown().isPresent) 1 else 0) +
            (if (shippingAddress.asKnown().isPresent) 1 else 0) +
            (if (shippingAddressRecipient.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subtotal.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (taxCode.asKnown().getOrNull()?.validity() ?: 0) +
            (taxDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalDiscount.asKnown().isPresent) 1 else 0) +
            (if (totalTax.asKnown().isPresent) 1 else 0) +
            (if (ublDocument.asKnown().isPresent) 1 else 0) +
            (vatex.asKnown().getOrNull()?.validity() ?: 0) +
            (if (vatexNote.asKnown().isPresent) 1 else 0) +
            (if (vendorAddress.asKnown().isPresent) 1 else 0) +
            (if (vendorAddressRecipient.asKnown().isPresent) 1 else 0) +
            (if (vendorEmail.asKnown().isPresent) 1 else 0) +
            (if (vendorName.asKnown().isPresent) 1 else 0) +
            (if (vendorTaxId.asKnown().isPresent) 1 else 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowances: JsonField<List<Allowance>>,
        private val amount: JsonField<String>,
        private val charges: JsonField<List<Charge>>,
        private val date: JsonField<Void>,
        private val description: JsonField<String>,
        private val productCode: JsonField<String>,
        private val quantity: JsonField<String>,
        private val tax: JsonField<String>,
        private val taxRate: JsonField<String>,
        private val unit: JsonField<UnitOfMeasureCode>,
        private val unitPrice: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowances")
            @ExcludeMissing
            allowances: JsonField<List<Allowance>> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("charges")
            @ExcludeMissing
            charges: JsonField<List<Charge>> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<Void> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_code")
            @ExcludeMissing
            productCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate") @ExcludeMissing taxRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit")
            @ExcludeMissing
            unit: JsonField<UnitOfMeasureCode> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<String> = JsonMissing.of(),
        ) : this(
            allowances,
            amount,
            charges,
            date,
            description,
            productCode,
            quantity,
            tax,
            taxRate,
            unit,
            unitPrice,
            mutableMapOf(),
        )

        /**
         * The allowances of the line item.
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowances(): Optional<List<Allowance>> = allowances.getOptional("allowances")

        /**
         * The total amount of the line item, exclusive of VAT, after subtracting line level
         * allowances and adding line level charges. Must be rounded to maximum 2 decimals
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * The charges of the line item.
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun charges(): Optional<List<Charge>> = charges.getOptional("charges")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun date(): Optional<Void> = date.getOptional("date")

        /**
         * The description of the line item.
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The product code of the line item.
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productCode(): Optional<String> = productCode.getOptional("product_code")

        /**
         * The quantity of items (goods or services) that is the subject of the line item. Must be
         * rounded to maximum 4 decimals
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<String> = quantity.getOptional("quantity")

        /**
         * The total VAT amount for the line item. Must be rounded to maximum 2 decimals
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tax(): Optional<String> = tax.getOptional("tax")

        /**
         * The VAT rate of the line item expressed as percentage with 2 decimals
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxRate(): Optional<String> = taxRate.getOptional("tax_rate")

        /**
         * Unit of Measure Codes from UNECERec20 used in Peppol BIS Billing 3.0.
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unit(): Optional<UnitOfMeasureCode> = unit.getOptional("unit")

        /**
         * The unit price of the line item. Must be rounded to maximum 2 decimals
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitPrice(): Optional<String> = unitPrice.getOptional("unit_price")

        /**
         * Returns the raw JSON value of [allowances].
         *
         * Unlike [allowances], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allowances")
        @ExcludeMissing
        fun _allowances(): JsonField<List<Allowance>> = allowances

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [charges].
         *
         * Unlike [charges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charges") @ExcludeMissing fun _charges(): JsonField<List<Charge>> = charges

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<Void> = date

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [productCode].
         *
         * Unlike [productCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_code")
        @ExcludeMissing
        fun _productCode(): JsonField<String> = productCode

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<String> = tax

        /**
         * Returns the raw JSON value of [taxRate].
         *
         * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<String> = taxRate

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<UnitOfMeasureCode> = unit

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<String> = unitPrice

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Item]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var allowances: JsonField<MutableList<Allowance>>? = null
            private var amount: JsonField<String> = JsonMissing.of()
            private var charges: JsonField<MutableList<Charge>>? = null
            private var date: JsonField<Void> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var productCode: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<String> = JsonMissing.of()
            private var tax: JsonField<String> = JsonMissing.of()
            private var taxRate: JsonField<String> = JsonMissing.of()
            private var unit: JsonField<UnitOfMeasureCode> = JsonMissing.of()
            private var unitPrice: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                allowances = item.allowances.map { it.toMutableList() }
                amount = item.amount
                charges = item.charges.map { it.toMutableList() }
                date = item.date
                description = item.description
                productCode = item.productCode
                quantity = item.quantity
                tax = item.tax
                taxRate = item.taxRate
                unit = item.unit
                unitPrice = item.unitPrice
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The allowances of the line item. */
            fun allowances(allowances: List<Allowance>?) =
                allowances(JsonField.ofNullable(allowances))

            /** Alias for calling [Builder.allowances] with `allowances.orElse(null)`. */
            fun allowances(allowances: Optional<List<Allowance>>) =
                allowances(allowances.getOrNull())

            /**
             * Sets [Builder.allowances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowances] with a well-typed `List<Allowance>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowances(allowances: JsonField<List<Allowance>>) = apply {
                this.allowances = allowances.map { it.toMutableList() }
            }

            /**
             * Adds a single [Allowance] to [allowances].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowance(allowance: Allowance) = apply {
                allowances =
                    (allowances ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowances", it).add(allowance)
                    }
            }

            /**
             * The total amount of the line item, exclusive of VAT, after subtracting line level
             * allowances and adding line level charges. Must be rounded to maximum 2 decimals
             */
            fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<String>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The charges of the line item. */
            fun charges(charges: List<Charge>?) = charges(JsonField.ofNullable(charges))

            /** Alias for calling [Builder.charges] with `charges.orElse(null)`. */
            fun charges(charges: Optional<List<Charge>>) = charges(charges.getOrNull())

            /**
             * Sets [Builder.charges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.charges] with a well-typed `List<Charge>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun charges(charges: JsonField<List<Charge>>) = apply {
                this.charges = charges.map { it.toMutableList() }
            }

            /**
             * Adds a single [Charge] to [charges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCharge(charge: Charge) = apply {
                charges =
                    (charges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("charges", it).add(charge)
                    }
            }

            fun date(date: Void?) = date(JsonField.ofNullable(date))

            /** Alias for calling [Builder.date] with `date.orElse(null)`. */
            fun date(date: Optional<Void>) = date(date.getOrNull())

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [Void] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun date(date: JsonField<Void>) = apply { this.date = date }

            /** The description of the line item. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The product code of the line item. */
            fun productCode(productCode: String?) = productCode(JsonField.ofNullable(productCode))

            /** Alias for calling [Builder.productCode] with `productCode.orElse(null)`. */
            fun productCode(productCode: Optional<String>) = productCode(productCode.getOrNull())

            /**
             * Sets [Builder.productCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productCode(productCode: JsonField<String>) = apply {
                this.productCode = productCode
            }

            /**
             * The quantity of items (goods or services) that is the subject of the line item. Must
             * be rounded to maximum 4 decimals
             */
            fun quantity(quantity: String?) = quantity(JsonField.ofNullable(quantity))

            /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
            fun quantity(quantity: Optional<String>) = quantity(quantity.getOrNull())

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

            /** The total VAT amount for the line item. Must be rounded to maximum 2 decimals */
            fun tax(tax: String?) = tax(JsonField.ofNullable(tax))

            /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
            fun tax(tax: Optional<String>) = tax(tax.getOrNull())

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<String>) = apply { this.tax = tax }

            /** The VAT rate of the line item expressed as percentage with 2 decimals */
            fun taxRate(taxRate: String?) = taxRate(JsonField.ofNullable(taxRate))

            /** Alias for calling [Builder.taxRate] with `taxRate.orElse(null)`. */
            fun taxRate(taxRate: Optional<String>) = taxRate(taxRate.getOrNull())

            /**
             * Sets [Builder.taxRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxRate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxRate(taxRate: JsonField<String>) = apply { this.taxRate = taxRate }

            /** Unit of Measure Codes from UNECERec20 used in Peppol BIS Billing 3.0. */
            fun unit(unit: UnitOfMeasureCode?) = unit(JsonField.ofNullable(unit))

            /** Alias for calling [Builder.unit] with `unit.orElse(null)`. */
            fun unit(unit: Optional<UnitOfMeasureCode>) = unit(unit.getOrNull())

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [UnitOfMeasureCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unit(unit: JsonField<UnitOfMeasureCode>) = apply { this.unit = unit }

            /** The unit price of the line item. Must be rounded to maximum 2 decimals */
            fun unitPrice(unitPrice: String?) = unitPrice(JsonField.ofNullable(unitPrice))

            /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
            fun unitPrice(unitPrice: Optional<String>) = unitPrice(unitPrice.getOrNull())

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<String>) = apply { this.unitPrice = unitPrice }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Item =
                Item(
                    (allowances ?: JsonMissing.of()).map { it.toImmutable() },
                    amount,
                    (charges ?: JsonMissing.of()).map { it.toImmutable() },
                    date,
                    description,
                    productCode,
                    quantity,
                    tax,
                    taxRate,
                    unit,
                    unitPrice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            allowances().ifPresent { it.forEach { it.validate() } }
            amount()
            charges().ifPresent { it.forEach { it.validate() } }
            date()
            description()
            productCode()
            quantity()
            tax()
            taxRate()
            unit().ifPresent { it.validate() }
            unitPrice()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EInvoiceInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (allowances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (charges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (productCode.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (tax.asKnown().isPresent) 1 else 0) +
                (if (taxRate.asKnown().isPresent) 1 else 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                allowances == other.allowances &&
                amount == other.amount &&
                charges == other.charges &&
                date == other.date &&
                description == other.description &&
                productCode == other.productCode &&
                quantity == other.quantity &&
                tax == other.tax &&
                taxRate == other.taxRate &&
                unit == other.unit &&
                unitPrice == other.unitPrice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowances,
                amount,
                charges,
                date,
                description,
                productCode,
                quantity,
                tax,
                taxRate,
                unit,
                unitPrice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{allowances=$allowances, amount=$amount, charges=$charges, date=$date, description=$description, productCode=$productCode, quantity=$quantity, tax=$tax, taxRate=$taxRate, unit=$unit, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    /** Tax category code of the invoice */
    class TaxCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AE = of("AE")

            @JvmField val E = of("E")

            @JvmField val S = of("S")

            @JvmField val Z = of("Z")

            @JvmField val G = of("G")

            @JvmField val O = of("O")

            @JvmField val K = of("K")

            @JvmField val L = of("L")

            @JvmField val M = of("M")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TaxCode(JsonField.of(value))
        }

        /** An enum containing [TaxCode]'s known values. */
        enum class Known {
            AE,
            E,
            S,
            Z,
            G,
            O,
            K,
            L,
            M,
            B,
        }

        /**
         * An enum containing [TaxCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AE,
            E,
            S,
            Z,
            G,
            O,
            K,
            L,
            M,
            B,
            /** An enum member indicating that [TaxCode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AE -> Value.AE
                E -> Value.E
                S -> Value.S
                Z -> Value.Z
                G -> Value.G
                O -> Value.O
                K -> Value.K
                L -> Value.L
                M -> Value.M
                B -> Value.B
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AE -> Known.AE
                E -> Known.E
                S -> Known.S
                Z -> Known.Z
                G -> Known.G
                O -> Known.O
                K -> Known.K
                L -> Known.L
                M -> Known.M
                B -> Known.B
                else -> throw EInvoiceInvalidDataException("Unknown TaxCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                EInvoiceInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): TaxCode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EInvoiceInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TaxDetail
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val rate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
        ) : this(amount, rate, mutableMapOf())

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rate(): Optional<String> = rate.getOptional("rate")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [TaxDetail]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TaxDetail]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(taxDetail: TaxDetail) = apply {
                amount = taxDetail.amount
                rate = taxDetail.rate
                additionalProperties = taxDetail.additionalProperties.toMutableMap()
            }

            fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<String>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun rate(rate: String?) = rate(JsonField.ofNullable(rate))

            /** Alias for calling [Builder.rate] with `rate.orElse(null)`. */
            fun rate(rate: Optional<String>) = rate(rate.getOrNull())

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [TaxDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TaxDetail = TaxDetail(amount, rate, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): TaxDetail = apply {
            if (validated) {
                return@apply
            }

            amount()
            rate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EInvoiceInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) + (if (rate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxDetail &&
                amount == other.amount &&
                rate == other.rate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, rate, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxDetail{amount=$amount, rate=$rate, additionalProperties=$additionalProperties}"
    }

    /**
     * VATEX code list for VAT exemption reasons
     *
     * Agency: CEF Identifier: vatex
     */
    class Vatex @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val VATEX_EU_79_C = of("VATEX-EU-79-C")

            @JvmField val VATEX_EU_132 = of("VATEX-EU-132")

            @JvmField val VATEX_EU_132_1_A = of("VATEX-EU-132-1A")

            @JvmField val VATEX_EU_132_1_B = of("VATEX-EU-132-1B")

            @JvmField val VATEX_EU_132_1_C = of("VATEX-EU-132-1C")

            @JvmField val VATEX_EU_132_1_D = of("VATEX-EU-132-1D")

            @JvmField val VATEX_EU_132_1_E = of("VATEX-EU-132-1E")

            @JvmField val VATEX_EU_132_1_F = of("VATEX-EU-132-1F")

            @JvmField val VATEX_EU_132_1_G = of("VATEX-EU-132-1G")

            @JvmField val VATEX_EU_132_1_H = of("VATEX-EU-132-1H")

            @JvmField val VATEX_EU_132_1_I = of("VATEX-EU-132-1I")

            @JvmField val VATEX_EU_132_1_J = of("VATEX-EU-132-1J")

            @JvmField val VATEX_EU_132_1_K = of("VATEX-EU-132-1K")

            @JvmField val VATEX_EU_132_1_L = of("VATEX-EU-132-1L")

            @JvmField val VATEX_EU_132_1_M = of("VATEX-EU-132-1M")

            @JvmField val VATEX_EU_132_1_N = of("VATEX-EU-132-1N")

            @JvmField val VATEX_EU_132_1_O = of("VATEX-EU-132-1O")

            @JvmField val VATEX_EU_132_1_P = of("VATEX-EU-132-1P")

            @JvmField val VATEX_EU_132_1_Q = of("VATEX-EU-132-1Q")

            @JvmField val VATEX_EU_143 = of("VATEX-EU-143")

            @JvmField val VATEX_EU_143_1_A = of("VATEX-EU-143-1A")

            @JvmField val VATEX_EU_143_1_B = of("VATEX-EU-143-1B")

            @JvmField val VATEX_EU_143_1_C = of("VATEX-EU-143-1C")

            @JvmField val VATEX_EU_143_1_D = of("VATEX-EU-143-1D")

            @JvmField val VATEX_EU_143_1_E = of("VATEX-EU-143-1E")

            @JvmField val VATEX_EU_143_1_F = of("VATEX-EU-143-1F")

            @JvmField val VATEX_EU_143_1_FA = of("VATEX-EU-143-1FA")

            @JvmField val VATEX_EU_143_1_G = of("VATEX-EU-143-1G")

            @JvmField val VATEX_EU_143_1_H = of("VATEX-EU-143-1H")

            @JvmField val VATEX_EU_143_1_I = of("VATEX-EU-143-1I")

            @JvmField val VATEX_EU_143_1_J = of("VATEX-EU-143-1J")

            @JvmField val VATEX_EU_143_1_K = of("VATEX-EU-143-1K")

            @JvmField val VATEX_EU_143_1_L = of("VATEX-EU-143-1L")

            @JvmField val VATEX_EU_144 = of("VATEX-EU-144")

            @JvmField val VATEX_EU_146_1_E = of("VATEX-EU-146-1E")

            @JvmField val VATEX_EU_148 = of("VATEX-EU-148")

            @JvmField val VATEX_EU_148_A = of("VATEX-EU-148-A")

            @JvmField val VATEX_EU_148_B = of("VATEX-EU-148-B")

            @JvmField val VATEX_EU_148_C = of("VATEX-EU-148-C")

            @JvmField val VATEX_EU_148_D = of("VATEX-EU-148-D")

            @JvmField val VATEX_EU_148_E = of("VATEX-EU-148-E")

            @JvmField val VATEX_EU_148_F = of("VATEX-EU-148-F")

            @JvmField val VATEX_EU_148_G = of("VATEX-EU-148-G")

            @JvmField val VATEX_EU_151 = of("VATEX-EU-151")

            @JvmField val VATEX_EU_151_1_A = of("VATEX-EU-151-1A")

            @JvmField val VATEX_EU_151_1_AA = of("VATEX-EU-151-1AA")

            @JvmField val VATEX_EU_151_1_B = of("VATEX-EU-151-1B")

            @JvmField val VATEX_EU_151_1_C = of("VATEX-EU-151-1C")

            @JvmField val VATEX_EU_151_1_D = of("VATEX-EU-151-1D")

            @JvmField val VATEX_EU_151_1_E = of("VATEX-EU-151-1E")

            @JvmField val VATEX_EU_159 = of("VATEX-EU-159")

            @JvmField val VATEX_EU_309 = of("VATEX-EU-309")

            @JvmField val VATEX_EU_AE = of("VATEX-EU-AE")

            @JvmField val VATEX_EU_D = of("VATEX-EU-D")

            @JvmField val VATEX_EU_F = of("VATEX-EU-F")

            @JvmField val VATEX_EU_G = of("VATEX-EU-G")

            @JvmField val VATEX_EU_I = of("VATEX-EU-I")

            @JvmField val VATEX_EU_IC = of("VATEX-EU-IC")

            @JvmField val VATEX_EU_O = of("VATEX-EU-O")

            @JvmField val VATEX_EU_J = of("VATEX-EU-J")

            @JvmField val VATEX_FR_FRANCHISE = of("VATEX-FR-FRANCHISE")

            @JvmField val VATEX_FR_CNWVAT = of("VATEX-FR-CNWVAT")

            @JvmStatic fun of(value: String) = Vatex(JsonField.of(value))
        }

        /** An enum containing [Vatex]'s known values. */
        enum class Known {
            VATEX_EU_79_C,
            VATEX_EU_132,
            VATEX_EU_132_1_A,
            VATEX_EU_132_1_B,
            VATEX_EU_132_1_C,
            VATEX_EU_132_1_D,
            VATEX_EU_132_1_E,
            VATEX_EU_132_1_F,
            VATEX_EU_132_1_G,
            VATEX_EU_132_1_H,
            VATEX_EU_132_1_I,
            VATEX_EU_132_1_J,
            VATEX_EU_132_1_K,
            VATEX_EU_132_1_L,
            VATEX_EU_132_1_M,
            VATEX_EU_132_1_N,
            VATEX_EU_132_1_O,
            VATEX_EU_132_1_P,
            VATEX_EU_132_1_Q,
            VATEX_EU_143,
            VATEX_EU_143_1_A,
            VATEX_EU_143_1_B,
            VATEX_EU_143_1_C,
            VATEX_EU_143_1_D,
            VATEX_EU_143_1_E,
            VATEX_EU_143_1_F,
            VATEX_EU_143_1_FA,
            VATEX_EU_143_1_G,
            VATEX_EU_143_1_H,
            VATEX_EU_143_1_I,
            VATEX_EU_143_1_J,
            VATEX_EU_143_1_K,
            VATEX_EU_143_1_L,
            VATEX_EU_144,
            VATEX_EU_146_1_E,
            VATEX_EU_148,
            VATEX_EU_148_A,
            VATEX_EU_148_B,
            VATEX_EU_148_C,
            VATEX_EU_148_D,
            VATEX_EU_148_E,
            VATEX_EU_148_F,
            VATEX_EU_148_G,
            VATEX_EU_151,
            VATEX_EU_151_1_A,
            VATEX_EU_151_1_AA,
            VATEX_EU_151_1_B,
            VATEX_EU_151_1_C,
            VATEX_EU_151_1_D,
            VATEX_EU_151_1_E,
            VATEX_EU_159,
            VATEX_EU_309,
            VATEX_EU_AE,
            VATEX_EU_D,
            VATEX_EU_F,
            VATEX_EU_G,
            VATEX_EU_I,
            VATEX_EU_IC,
            VATEX_EU_O,
            VATEX_EU_J,
            VATEX_FR_FRANCHISE,
            VATEX_FR_CNWVAT,
        }

        /**
         * An enum containing [Vatex]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Vatex] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VATEX_EU_79_C,
            VATEX_EU_132,
            VATEX_EU_132_1_A,
            VATEX_EU_132_1_B,
            VATEX_EU_132_1_C,
            VATEX_EU_132_1_D,
            VATEX_EU_132_1_E,
            VATEX_EU_132_1_F,
            VATEX_EU_132_1_G,
            VATEX_EU_132_1_H,
            VATEX_EU_132_1_I,
            VATEX_EU_132_1_J,
            VATEX_EU_132_1_K,
            VATEX_EU_132_1_L,
            VATEX_EU_132_1_M,
            VATEX_EU_132_1_N,
            VATEX_EU_132_1_O,
            VATEX_EU_132_1_P,
            VATEX_EU_132_1_Q,
            VATEX_EU_143,
            VATEX_EU_143_1_A,
            VATEX_EU_143_1_B,
            VATEX_EU_143_1_C,
            VATEX_EU_143_1_D,
            VATEX_EU_143_1_E,
            VATEX_EU_143_1_F,
            VATEX_EU_143_1_FA,
            VATEX_EU_143_1_G,
            VATEX_EU_143_1_H,
            VATEX_EU_143_1_I,
            VATEX_EU_143_1_J,
            VATEX_EU_143_1_K,
            VATEX_EU_143_1_L,
            VATEX_EU_144,
            VATEX_EU_146_1_E,
            VATEX_EU_148,
            VATEX_EU_148_A,
            VATEX_EU_148_B,
            VATEX_EU_148_C,
            VATEX_EU_148_D,
            VATEX_EU_148_E,
            VATEX_EU_148_F,
            VATEX_EU_148_G,
            VATEX_EU_151,
            VATEX_EU_151_1_A,
            VATEX_EU_151_1_AA,
            VATEX_EU_151_1_B,
            VATEX_EU_151_1_C,
            VATEX_EU_151_1_D,
            VATEX_EU_151_1_E,
            VATEX_EU_159,
            VATEX_EU_309,
            VATEX_EU_AE,
            VATEX_EU_D,
            VATEX_EU_F,
            VATEX_EU_G,
            VATEX_EU_I,
            VATEX_EU_IC,
            VATEX_EU_O,
            VATEX_EU_J,
            VATEX_FR_FRANCHISE,
            VATEX_FR_CNWVAT,
            /** An enum member indicating that [Vatex] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                VATEX_EU_79_C -> Value.VATEX_EU_79_C
                VATEX_EU_132 -> Value.VATEX_EU_132
                VATEX_EU_132_1_A -> Value.VATEX_EU_132_1_A
                VATEX_EU_132_1_B -> Value.VATEX_EU_132_1_B
                VATEX_EU_132_1_C -> Value.VATEX_EU_132_1_C
                VATEX_EU_132_1_D -> Value.VATEX_EU_132_1_D
                VATEX_EU_132_1_E -> Value.VATEX_EU_132_1_E
                VATEX_EU_132_1_F -> Value.VATEX_EU_132_1_F
                VATEX_EU_132_1_G -> Value.VATEX_EU_132_1_G
                VATEX_EU_132_1_H -> Value.VATEX_EU_132_1_H
                VATEX_EU_132_1_I -> Value.VATEX_EU_132_1_I
                VATEX_EU_132_1_J -> Value.VATEX_EU_132_1_J
                VATEX_EU_132_1_K -> Value.VATEX_EU_132_1_K
                VATEX_EU_132_1_L -> Value.VATEX_EU_132_1_L
                VATEX_EU_132_1_M -> Value.VATEX_EU_132_1_M
                VATEX_EU_132_1_N -> Value.VATEX_EU_132_1_N
                VATEX_EU_132_1_O -> Value.VATEX_EU_132_1_O
                VATEX_EU_132_1_P -> Value.VATEX_EU_132_1_P
                VATEX_EU_132_1_Q -> Value.VATEX_EU_132_1_Q
                VATEX_EU_143 -> Value.VATEX_EU_143
                VATEX_EU_143_1_A -> Value.VATEX_EU_143_1_A
                VATEX_EU_143_1_B -> Value.VATEX_EU_143_1_B
                VATEX_EU_143_1_C -> Value.VATEX_EU_143_1_C
                VATEX_EU_143_1_D -> Value.VATEX_EU_143_1_D
                VATEX_EU_143_1_E -> Value.VATEX_EU_143_1_E
                VATEX_EU_143_1_F -> Value.VATEX_EU_143_1_F
                VATEX_EU_143_1_FA -> Value.VATEX_EU_143_1_FA
                VATEX_EU_143_1_G -> Value.VATEX_EU_143_1_G
                VATEX_EU_143_1_H -> Value.VATEX_EU_143_1_H
                VATEX_EU_143_1_I -> Value.VATEX_EU_143_1_I
                VATEX_EU_143_1_J -> Value.VATEX_EU_143_1_J
                VATEX_EU_143_1_K -> Value.VATEX_EU_143_1_K
                VATEX_EU_143_1_L -> Value.VATEX_EU_143_1_L
                VATEX_EU_144 -> Value.VATEX_EU_144
                VATEX_EU_146_1_E -> Value.VATEX_EU_146_1_E
                VATEX_EU_148 -> Value.VATEX_EU_148
                VATEX_EU_148_A -> Value.VATEX_EU_148_A
                VATEX_EU_148_B -> Value.VATEX_EU_148_B
                VATEX_EU_148_C -> Value.VATEX_EU_148_C
                VATEX_EU_148_D -> Value.VATEX_EU_148_D
                VATEX_EU_148_E -> Value.VATEX_EU_148_E
                VATEX_EU_148_F -> Value.VATEX_EU_148_F
                VATEX_EU_148_G -> Value.VATEX_EU_148_G
                VATEX_EU_151 -> Value.VATEX_EU_151
                VATEX_EU_151_1_A -> Value.VATEX_EU_151_1_A
                VATEX_EU_151_1_AA -> Value.VATEX_EU_151_1_AA
                VATEX_EU_151_1_B -> Value.VATEX_EU_151_1_B
                VATEX_EU_151_1_C -> Value.VATEX_EU_151_1_C
                VATEX_EU_151_1_D -> Value.VATEX_EU_151_1_D
                VATEX_EU_151_1_E -> Value.VATEX_EU_151_1_E
                VATEX_EU_159 -> Value.VATEX_EU_159
                VATEX_EU_309 -> Value.VATEX_EU_309
                VATEX_EU_AE -> Value.VATEX_EU_AE
                VATEX_EU_D -> Value.VATEX_EU_D
                VATEX_EU_F -> Value.VATEX_EU_F
                VATEX_EU_G -> Value.VATEX_EU_G
                VATEX_EU_I -> Value.VATEX_EU_I
                VATEX_EU_IC -> Value.VATEX_EU_IC
                VATEX_EU_O -> Value.VATEX_EU_O
                VATEX_EU_J -> Value.VATEX_EU_J
                VATEX_FR_FRANCHISE -> Value.VATEX_FR_FRANCHISE
                VATEX_FR_CNWVAT -> Value.VATEX_FR_CNWVAT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                VATEX_EU_79_C -> Known.VATEX_EU_79_C
                VATEX_EU_132 -> Known.VATEX_EU_132
                VATEX_EU_132_1_A -> Known.VATEX_EU_132_1_A
                VATEX_EU_132_1_B -> Known.VATEX_EU_132_1_B
                VATEX_EU_132_1_C -> Known.VATEX_EU_132_1_C
                VATEX_EU_132_1_D -> Known.VATEX_EU_132_1_D
                VATEX_EU_132_1_E -> Known.VATEX_EU_132_1_E
                VATEX_EU_132_1_F -> Known.VATEX_EU_132_1_F
                VATEX_EU_132_1_G -> Known.VATEX_EU_132_1_G
                VATEX_EU_132_1_H -> Known.VATEX_EU_132_1_H
                VATEX_EU_132_1_I -> Known.VATEX_EU_132_1_I
                VATEX_EU_132_1_J -> Known.VATEX_EU_132_1_J
                VATEX_EU_132_1_K -> Known.VATEX_EU_132_1_K
                VATEX_EU_132_1_L -> Known.VATEX_EU_132_1_L
                VATEX_EU_132_1_M -> Known.VATEX_EU_132_1_M
                VATEX_EU_132_1_N -> Known.VATEX_EU_132_1_N
                VATEX_EU_132_1_O -> Known.VATEX_EU_132_1_O
                VATEX_EU_132_1_P -> Known.VATEX_EU_132_1_P
                VATEX_EU_132_1_Q -> Known.VATEX_EU_132_1_Q
                VATEX_EU_143 -> Known.VATEX_EU_143
                VATEX_EU_143_1_A -> Known.VATEX_EU_143_1_A
                VATEX_EU_143_1_B -> Known.VATEX_EU_143_1_B
                VATEX_EU_143_1_C -> Known.VATEX_EU_143_1_C
                VATEX_EU_143_1_D -> Known.VATEX_EU_143_1_D
                VATEX_EU_143_1_E -> Known.VATEX_EU_143_1_E
                VATEX_EU_143_1_F -> Known.VATEX_EU_143_1_F
                VATEX_EU_143_1_FA -> Known.VATEX_EU_143_1_FA
                VATEX_EU_143_1_G -> Known.VATEX_EU_143_1_G
                VATEX_EU_143_1_H -> Known.VATEX_EU_143_1_H
                VATEX_EU_143_1_I -> Known.VATEX_EU_143_1_I
                VATEX_EU_143_1_J -> Known.VATEX_EU_143_1_J
                VATEX_EU_143_1_K -> Known.VATEX_EU_143_1_K
                VATEX_EU_143_1_L -> Known.VATEX_EU_143_1_L
                VATEX_EU_144 -> Known.VATEX_EU_144
                VATEX_EU_146_1_E -> Known.VATEX_EU_146_1_E
                VATEX_EU_148 -> Known.VATEX_EU_148
                VATEX_EU_148_A -> Known.VATEX_EU_148_A
                VATEX_EU_148_B -> Known.VATEX_EU_148_B
                VATEX_EU_148_C -> Known.VATEX_EU_148_C
                VATEX_EU_148_D -> Known.VATEX_EU_148_D
                VATEX_EU_148_E -> Known.VATEX_EU_148_E
                VATEX_EU_148_F -> Known.VATEX_EU_148_F
                VATEX_EU_148_G -> Known.VATEX_EU_148_G
                VATEX_EU_151 -> Known.VATEX_EU_151
                VATEX_EU_151_1_A -> Known.VATEX_EU_151_1_A
                VATEX_EU_151_1_AA -> Known.VATEX_EU_151_1_AA
                VATEX_EU_151_1_B -> Known.VATEX_EU_151_1_B
                VATEX_EU_151_1_C -> Known.VATEX_EU_151_1_C
                VATEX_EU_151_1_D -> Known.VATEX_EU_151_1_D
                VATEX_EU_151_1_E -> Known.VATEX_EU_151_1_E
                VATEX_EU_159 -> Known.VATEX_EU_159
                VATEX_EU_309 -> Known.VATEX_EU_309
                VATEX_EU_AE -> Known.VATEX_EU_AE
                VATEX_EU_D -> Known.VATEX_EU_D
                VATEX_EU_F -> Known.VATEX_EU_F
                VATEX_EU_G -> Known.VATEX_EU_G
                VATEX_EU_I -> Known.VATEX_EU_I
                VATEX_EU_IC -> Known.VATEX_EU_IC
                VATEX_EU_O -> Known.VATEX_EU_O
                VATEX_EU_J -> Known.VATEX_EU_J
                VATEX_FR_FRANCHISE -> Known.VATEX_FR_FRANCHISE
                VATEX_FR_CNWVAT -> Known.VATEX_FR_CNWVAT
                else -> throw EInvoiceInvalidDataException("Unknown Vatex: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                EInvoiceInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Vatex = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EInvoiceInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Vatex && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentCreateFromPdfResponse &&
            allowances == other.allowances &&
            amountDue == other.amountDue &&
            attachments == other.attachments &&
            billingAddress == other.billingAddress &&
            billingAddressRecipient == other.billingAddressRecipient &&
            charges == other.charges &&
            currency == other.currency &&
            customerAddress == other.customerAddress &&
            customerAddressRecipient == other.customerAddressRecipient &&
            customerEmail == other.customerEmail &&
            customerId == other.customerId &&
            customerName == other.customerName &&
            customerTaxId == other.customerTaxId &&
            direction == other.direction &&
            documentType == other.documentType &&
            dueDate == other.dueDate &&
            invoiceDate == other.invoiceDate &&
            invoiceId == other.invoiceId &&
            invoiceTotal == other.invoiceTotal &&
            items == other.items &&
            note == other.note &&
            paymentDetails == other.paymentDetails &&
            paymentTerm == other.paymentTerm &&
            previousUnpaidBalance == other.previousUnpaidBalance &&
            purchaseOrder == other.purchaseOrder &&
            remittanceAddress == other.remittanceAddress &&
            remittanceAddressRecipient == other.remittanceAddressRecipient &&
            serviceAddress == other.serviceAddress &&
            serviceAddressRecipient == other.serviceAddressRecipient &&
            serviceEndDate == other.serviceEndDate &&
            serviceStartDate == other.serviceStartDate &&
            shippingAddress == other.shippingAddress &&
            shippingAddressRecipient == other.shippingAddressRecipient &&
            state == other.state &&
            subtotal == other.subtotal &&
            success == other.success &&
            taxCode == other.taxCode &&
            taxDetails == other.taxDetails &&
            totalDiscount == other.totalDiscount &&
            totalTax == other.totalTax &&
            ublDocument == other.ublDocument &&
            vatex == other.vatex &&
            vatexNote == other.vatexNote &&
            vendorAddress == other.vendorAddress &&
            vendorAddressRecipient == other.vendorAddressRecipient &&
            vendorEmail == other.vendorEmail &&
            vendorName == other.vendorName &&
            vendorTaxId == other.vendorTaxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowances,
            amountDue,
            attachments,
            billingAddress,
            billingAddressRecipient,
            charges,
            currency,
            customerAddress,
            customerAddressRecipient,
            customerEmail,
            customerId,
            customerName,
            customerTaxId,
            direction,
            documentType,
            dueDate,
            invoiceDate,
            invoiceId,
            invoiceTotal,
            items,
            note,
            paymentDetails,
            paymentTerm,
            previousUnpaidBalance,
            purchaseOrder,
            remittanceAddress,
            remittanceAddressRecipient,
            serviceAddress,
            serviceAddressRecipient,
            serviceEndDate,
            serviceStartDate,
            shippingAddress,
            shippingAddressRecipient,
            state,
            subtotal,
            success,
            taxCode,
            taxDetails,
            totalDiscount,
            totalTax,
            ublDocument,
            vatex,
            vatexNote,
            vendorAddress,
            vendorAddressRecipient,
            vendorEmail,
            vendorName,
            vendorTaxId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentCreateFromPdfResponse{allowances=$allowances, amountDue=$amountDue, attachments=$attachments, billingAddress=$billingAddress, billingAddressRecipient=$billingAddressRecipient, charges=$charges, currency=$currency, customerAddress=$customerAddress, customerAddressRecipient=$customerAddressRecipient, customerEmail=$customerEmail, customerId=$customerId, customerName=$customerName, customerTaxId=$customerTaxId, direction=$direction, documentType=$documentType, dueDate=$dueDate, invoiceDate=$invoiceDate, invoiceId=$invoiceId, invoiceTotal=$invoiceTotal, items=$items, note=$note, paymentDetails=$paymentDetails, paymentTerm=$paymentTerm, previousUnpaidBalance=$previousUnpaidBalance, purchaseOrder=$purchaseOrder, remittanceAddress=$remittanceAddress, remittanceAddressRecipient=$remittanceAddressRecipient, serviceAddress=$serviceAddress, serviceAddressRecipient=$serviceAddressRecipient, serviceEndDate=$serviceEndDate, serviceStartDate=$serviceStartDate, shippingAddress=$shippingAddress, shippingAddressRecipient=$shippingAddressRecipient, state=$state, subtotal=$subtotal, success=$success, taxCode=$taxCode, taxDetails=$taxDetails, totalDiscount=$totalDiscount, totalTax=$totalTax, ublDocument=$ublDocument, vatex=$vatex, vatexNote=$vatexNote, vendorAddress=$vendorAddress, vendorAddressRecipient=$vendorAddressRecipient, vendorEmail=$vendorEmail, vendorName=$vendorName, vendorTaxId=$vendorTaxId, additionalProperties=$additionalProperties}"
}
