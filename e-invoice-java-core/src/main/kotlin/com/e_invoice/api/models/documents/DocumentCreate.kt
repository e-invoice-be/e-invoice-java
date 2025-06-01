// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.BaseDeserializer
import com.e_invoice.api.core.BaseSerializer
import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.allMaxBy
import com.e_invoice.api.core.checkKnown
import com.e_invoice.api.core.getOrThrow
import com.e_invoice.api.core.toImmutable
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.e_invoice.api.models.inbox.DocumentState
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DocumentCreate
private constructor(
    private val amountDue: JsonField<AmountDue>,
    private val attachments: JsonField<List<DocumentAttachmentCreate>>,
    private val billingAddress: JsonField<String>,
    private val billingAddressRecipient: JsonField<String>,
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
    private val invoiceTotal: JsonField<InvoiceTotal>,
    private val items: JsonField<List<Item>>,
    private val note: JsonField<String>,
    private val paymentDetails: JsonField<List<PaymentDetailCreate>>,
    private val paymentTerm: JsonField<String>,
    private val previousUnpaidBalance: JsonField<PreviousUnpaidBalance>,
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
    private val subtotal: JsonField<Subtotal>,
    private val taxDetails: JsonField<List<TaxDetail>>,
    private val totalDiscount: JsonField<TotalDiscount>,
    private val totalTax: JsonField<TotalTax>,
    private val vendorAddress: JsonField<String>,
    private val vendorAddressRecipient: JsonField<String>,
    private val vendorEmail: JsonField<String>,
    private val vendorName: JsonField<String>,
    private val vendorTaxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount_due")
        @ExcludeMissing
        amountDue: JsonField<AmountDue> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<DocumentAttachmentCreate>> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_address_recipient")
        @ExcludeMissing
        billingAddressRecipient: JsonField<String> = JsonMissing.of(),
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
        invoiceTotal: JsonField<InvoiceTotal> = JsonMissing.of(),
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
        previousUnpaidBalance: JsonField<PreviousUnpaidBalance> = JsonMissing.of(),
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
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Subtotal> = JsonMissing.of(),
        @JsonProperty("tax_details")
        @ExcludeMissing
        taxDetails: JsonField<List<TaxDetail>> = JsonMissing.of(),
        @JsonProperty("total_discount")
        @ExcludeMissing
        totalDiscount: JsonField<TotalDiscount> = JsonMissing.of(),
        @JsonProperty("total_tax") @ExcludeMissing totalTax: JsonField<TotalTax> = JsonMissing.of(),
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
        amountDue,
        attachments,
        billingAddress,
        billingAddressRecipient,
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
        taxDetails,
        totalDiscount,
        totalTax,
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
    fun amountDue(): Optional<AmountDue> = amountDue.getOptional("amount_due")

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
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceTotal(): Optional<InvoiceTotal> = invoiceTotal.getOptional("invoice_total")

    /**
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
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousUnpaidBalance(): Optional<PreviousUnpaidBalance> =
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
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtotal(): Optional<Subtotal> = subtotal.getOptional("subtotal")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxDetails(): Optional<List<TaxDetail>> = taxDetails.getOptional("tax_details")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalDiscount(): Optional<TotalDiscount> = totalDiscount.getOptional("total_discount")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTax(): Optional<TotalTax> = totalTax.getOptional("total_tax")

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
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<AmountDue> = amountDue

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
    fun _invoiceTotal(): JsonField<InvoiceTotal> = invoiceTotal

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
    fun _previousUnpaidBalance(): JsonField<PreviousUnpaidBalance> = previousUnpaidBalance

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
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Subtotal> = subtotal

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
    fun _totalDiscount(): JsonField<TotalDiscount> = totalDiscount

    /**
     * Returns the raw JSON value of [totalTax].
     *
     * Unlike [totalTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tax") @ExcludeMissing fun _totalTax(): JsonField<TotalTax> = totalTax

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

        /** Returns a mutable builder for constructing an instance of [DocumentCreate]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentCreate]. */
    class Builder internal constructor() {

        private var amountDue: JsonField<AmountDue> = JsonMissing.of()
        private var attachments: JsonField<MutableList<DocumentAttachmentCreate>>? = null
        private var billingAddress: JsonField<String> = JsonMissing.of()
        private var billingAddressRecipient: JsonField<String> = JsonMissing.of()
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
        private var invoiceTotal: JsonField<InvoiceTotal> = JsonMissing.of()
        private var items: JsonField<MutableList<Item>>? = null
        private var note: JsonField<String> = JsonMissing.of()
        private var paymentDetails: JsonField<MutableList<PaymentDetailCreate>>? = null
        private var paymentTerm: JsonField<String> = JsonMissing.of()
        private var previousUnpaidBalance: JsonField<PreviousUnpaidBalance> = JsonMissing.of()
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
        private var subtotal: JsonField<Subtotal> = JsonMissing.of()
        private var taxDetails: JsonField<MutableList<TaxDetail>>? = null
        private var totalDiscount: JsonField<TotalDiscount> = JsonMissing.of()
        private var totalTax: JsonField<TotalTax> = JsonMissing.of()
        private var vendorAddress: JsonField<String> = JsonMissing.of()
        private var vendorAddressRecipient: JsonField<String> = JsonMissing.of()
        private var vendorEmail: JsonField<String> = JsonMissing.of()
        private var vendorName: JsonField<String> = JsonMissing.of()
        private var vendorTaxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentCreate: DocumentCreate) = apply {
            amountDue = documentCreate.amountDue
            attachments = documentCreate.attachments.map { it.toMutableList() }
            billingAddress = documentCreate.billingAddress
            billingAddressRecipient = documentCreate.billingAddressRecipient
            currency = documentCreate.currency
            customerAddress = documentCreate.customerAddress
            customerAddressRecipient = documentCreate.customerAddressRecipient
            customerEmail = documentCreate.customerEmail
            customerId = documentCreate.customerId
            customerName = documentCreate.customerName
            customerTaxId = documentCreate.customerTaxId
            direction = documentCreate.direction
            documentType = documentCreate.documentType
            dueDate = documentCreate.dueDate
            invoiceDate = documentCreate.invoiceDate
            invoiceId = documentCreate.invoiceId
            invoiceTotal = documentCreate.invoiceTotal
            items = documentCreate.items.map { it.toMutableList() }
            note = documentCreate.note
            paymentDetails = documentCreate.paymentDetails.map { it.toMutableList() }
            paymentTerm = documentCreate.paymentTerm
            previousUnpaidBalance = documentCreate.previousUnpaidBalance
            purchaseOrder = documentCreate.purchaseOrder
            remittanceAddress = documentCreate.remittanceAddress
            remittanceAddressRecipient = documentCreate.remittanceAddressRecipient
            serviceAddress = documentCreate.serviceAddress
            serviceAddressRecipient = documentCreate.serviceAddressRecipient
            serviceEndDate = documentCreate.serviceEndDate
            serviceStartDate = documentCreate.serviceStartDate
            shippingAddress = documentCreate.shippingAddress
            shippingAddressRecipient = documentCreate.shippingAddressRecipient
            state = documentCreate.state
            subtotal = documentCreate.subtotal
            taxDetails = documentCreate.taxDetails.map { it.toMutableList() }
            totalDiscount = documentCreate.totalDiscount
            totalTax = documentCreate.totalTax
            vendorAddress = documentCreate.vendorAddress
            vendorAddressRecipient = documentCreate.vendorAddressRecipient
            vendorEmail = documentCreate.vendorEmail
            vendorName = documentCreate.vendorName
            vendorTaxId = documentCreate.vendorTaxId
            additionalProperties = documentCreate.additionalProperties.toMutableMap()
        }

        fun amountDue(amountDue: AmountDue?) = amountDue(JsonField.ofNullable(amountDue))

        /** Alias for calling [Builder.amountDue] with `amountDue.orElse(null)`. */
        fun amountDue(amountDue: Optional<AmountDue>) = amountDue(amountDue.getOrNull())

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [AmountDue] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountDue(amountDue: JsonField<AmountDue>) = apply { this.amountDue = amountDue }

        /** Alias for calling [amountDue] with `AmountDue.ofNumber(number)`. */
        fun amountDue(number: Double) = amountDue(AmountDue.ofNumber(number))

        /** Alias for calling [amountDue] with `AmountDue.ofString(string)`. */
        fun amountDue(string: String) = amountDue(AmountDue.ofString(string))

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

        fun invoiceTotal(invoiceTotal: InvoiceTotal?) =
            invoiceTotal(JsonField.ofNullable(invoiceTotal))

        /** Alias for calling [Builder.invoiceTotal] with `invoiceTotal.orElse(null)`. */
        fun invoiceTotal(invoiceTotal: Optional<InvoiceTotal>) =
            invoiceTotal(invoiceTotal.getOrNull())

        /**
         * Sets [Builder.invoiceTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceTotal] with a well-typed [InvoiceTotal] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceTotal(invoiceTotal: JsonField<InvoiceTotal>) = apply {
            this.invoiceTotal = invoiceTotal
        }

        /** Alias for calling [invoiceTotal] with `InvoiceTotal.ofNumber(number)`. */
        fun invoiceTotal(number: Double) = invoiceTotal(InvoiceTotal.ofNumber(number))

        /** Alias for calling [invoiceTotal] with `InvoiceTotal.ofString(string)`. */
        fun invoiceTotal(string: String) = invoiceTotal(InvoiceTotal.ofString(string))

        fun items(items: List<Item>?) = items(JsonField.ofNullable(items))

        /** Alias for calling [Builder.items] with `items.orElse(null)`. */
        fun items(items: Optional<List<Item>>) = items(items.getOrNull())

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

        fun previousUnpaidBalance(previousUnpaidBalance: PreviousUnpaidBalance?) =
            previousUnpaidBalance(JsonField.ofNullable(previousUnpaidBalance))

        /**
         * Alias for calling [Builder.previousUnpaidBalance] with
         * `previousUnpaidBalance.orElse(null)`.
         */
        fun previousUnpaidBalance(previousUnpaidBalance: Optional<PreviousUnpaidBalance>) =
            previousUnpaidBalance(previousUnpaidBalance.getOrNull())

        /**
         * Sets [Builder.previousUnpaidBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousUnpaidBalance] with a well-typed
         * [PreviousUnpaidBalance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun previousUnpaidBalance(previousUnpaidBalance: JsonField<PreviousUnpaidBalance>) = apply {
            this.previousUnpaidBalance = previousUnpaidBalance
        }

        /**
         * Alias for calling [previousUnpaidBalance] with `PreviousUnpaidBalance.ofNumber(number)`.
         */
        fun previousUnpaidBalance(number: Double) =
            previousUnpaidBalance(PreviousUnpaidBalance.ofNumber(number))

        /**
         * Alias for calling [previousUnpaidBalance] with `PreviousUnpaidBalance.ofString(string)`.
         */
        fun previousUnpaidBalance(string: String) =
            previousUnpaidBalance(PreviousUnpaidBalance.ofString(string))

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

        fun subtotal(subtotal: Subtotal?) = subtotal(JsonField.ofNullable(subtotal))

        /** Alias for calling [Builder.subtotal] with `subtotal.orElse(null)`. */
        fun subtotal(subtotal: Optional<Subtotal>) = subtotal(subtotal.getOrNull())

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [Subtotal] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subtotal(subtotal: JsonField<Subtotal>) = apply { this.subtotal = subtotal }

        /** Alias for calling [subtotal] with `Subtotal.ofNumber(number)`. */
        fun subtotal(number: Double) = subtotal(Subtotal.ofNumber(number))

        /** Alias for calling [subtotal] with `Subtotal.ofString(string)`. */
        fun subtotal(string: String) = subtotal(Subtotal.ofString(string))

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

        fun totalDiscount(totalDiscount: TotalDiscount?) =
            totalDiscount(JsonField.ofNullable(totalDiscount))

        /** Alias for calling [Builder.totalDiscount] with `totalDiscount.orElse(null)`. */
        fun totalDiscount(totalDiscount: Optional<TotalDiscount>) =
            totalDiscount(totalDiscount.getOrNull())

        /**
         * Sets [Builder.totalDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalDiscount] with a well-typed [TotalDiscount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalDiscount(totalDiscount: JsonField<TotalDiscount>) = apply {
            this.totalDiscount = totalDiscount
        }

        /** Alias for calling [totalDiscount] with `TotalDiscount.ofNumber(number)`. */
        fun totalDiscount(number: Double) = totalDiscount(TotalDiscount.ofNumber(number))

        /** Alias for calling [totalDiscount] with `TotalDiscount.ofString(string)`. */
        fun totalDiscount(string: String) = totalDiscount(TotalDiscount.ofString(string))

        fun totalTax(totalTax: TotalTax?) = totalTax(JsonField.ofNullable(totalTax))

        /** Alias for calling [Builder.totalTax] with `totalTax.orElse(null)`. */
        fun totalTax(totalTax: Optional<TotalTax>) = totalTax(totalTax.getOrNull())

        /**
         * Sets [Builder.totalTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTax] with a well-typed [TotalTax] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTax(totalTax: JsonField<TotalTax>) = apply { this.totalTax = totalTax }

        /** Alias for calling [totalTax] with `TotalTax.ofNumber(number)`. */
        fun totalTax(number: Double) = totalTax(TotalTax.ofNumber(number))

        /** Alias for calling [totalTax] with `TotalTax.ofString(string)`. */
        fun totalTax(string: String) = totalTax(TotalTax.ofString(string))

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
         * Returns an immutable instance of [DocumentCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentCreate =
            DocumentCreate(
                amountDue,
                (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                billingAddress,
                billingAddressRecipient,
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
                (taxDetails ?: JsonMissing.of()).map { it.toImmutable() },
                totalDiscount,
                totalTax,
                vendorAddress,
                vendorAddressRecipient,
                vendorEmail,
                vendorName,
                vendorTaxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentCreate = apply {
        if (validated) {
            return@apply
        }

        amountDue().ifPresent { it.validate() }
        attachments().ifPresent { it.forEach { it.validate() } }
        billingAddress()
        billingAddressRecipient()
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
        invoiceTotal().ifPresent { it.validate() }
        items().ifPresent { it.forEach { it.validate() } }
        note()
        paymentDetails().ifPresent { it.forEach { it.validate() } }
        paymentTerm()
        previousUnpaidBalance().ifPresent { it.validate() }
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
        subtotal().ifPresent { it.validate() }
        taxDetails().ifPresent { it.forEach { it.validate() } }
        totalDiscount().ifPresent { it.validate() }
        totalTax().ifPresent { it.validate() }
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
        (amountDue.asKnown().getOrNull()?.validity() ?: 0) +
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (billingAddress.asKnown().isPresent) 1 else 0) +
            (if (billingAddressRecipient.asKnown().isPresent) 1 else 0) +
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
            (invoiceTotal.asKnown().getOrNull()?.validity() ?: 0) +
            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (note.asKnown().isPresent) 1 else 0) +
            (paymentDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paymentTerm.asKnown().isPresent) 1 else 0) +
            (previousUnpaidBalance.asKnown().getOrNull()?.validity() ?: 0) +
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
            (subtotal.asKnown().getOrNull()?.validity() ?: 0) +
            (taxDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (totalDiscount.asKnown().getOrNull()?.validity() ?: 0) +
            (totalTax.asKnown().getOrNull()?.validity() ?: 0) +
            (if (vendorAddress.asKnown().isPresent) 1 else 0) +
            (if (vendorAddressRecipient.asKnown().isPresent) 1 else 0) +
            (if (vendorEmail.asKnown().isPresent) 1 else 0) +
            (if (vendorName.asKnown().isPresent) 1 else 0) +
            (if (vendorTaxId.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = AmountDue.Deserializer::class)
    @JsonSerialize(using = AmountDue.Serializer::class)
    class AmountDue
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AmountDue = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AmountDue && number == other.number && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

        override fun toString(): String =
            when {
                number != null -> "AmountDue{number=$number}"
                string != null -> "AmountDue{string=$string}"
                _json != null -> "AmountDue{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AmountDue")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = AmountDue(number = number)

            @JvmStatic fun ofString(string: String) = AmountDue(string = string)
        }

        /**
         * An interface that defines how to map each variant of [AmountDue] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [AmountDue] to a value of type [T].
             *
             * An instance of [AmountDue] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws EInvoiceInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw EInvoiceInvalidDataException("Unknown AmountDue: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<AmountDue>(AmountDue::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AmountDue {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                AmountDue(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                AmountDue(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> AmountDue(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<AmountDue>(AmountDue::class) {

            override fun serialize(
                value: AmountDue,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AmountDue")
                }
            }
        }
    }

    @JsonDeserialize(using = InvoiceTotal.Deserializer::class)
    @JsonSerialize(using = InvoiceTotal.Serializer::class)
    class InvoiceTotal
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): InvoiceTotal = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceTotal && number == other.number && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

        override fun toString(): String =
            when {
                number != null -> "InvoiceTotal{number=$number}"
                string != null -> "InvoiceTotal{string=$string}"
                _json != null -> "InvoiceTotal{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InvoiceTotal")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = InvoiceTotal(number = number)

            @JvmStatic fun ofString(string: String) = InvoiceTotal(string = string)
        }

        /**
         * An interface that defines how to map each variant of [InvoiceTotal] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [InvoiceTotal] to a value of type [T].
             *
             * An instance of [InvoiceTotal] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws EInvoiceInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw EInvoiceInvalidDataException("Unknown InvoiceTotal: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<InvoiceTotal>(InvoiceTotal::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InvoiceTotal {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                InvoiceTotal(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                InvoiceTotal(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> InvoiceTotal(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<InvoiceTotal>(InvoiceTotal::class) {

            override fun serialize(
                value: InvoiceTotal,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InvoiceTotal")
                }
            }
        }
    }

    class Item
    private constructor(
        private val amount: JsonField<Amount>,
        private val date: JsonField<Void>,
        private val description: JsonField<String>,
        private val productCode: JsonField<String>,
        private val quantity: JsonField<Quantity>,
        private val tax: JsonField<Tax>,
        private val taxRate: JsonField<String>,
        private val unit: JsonField<UnitOfMeasureCode>,
        private val unitPrice: JsonField<UnitPrice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Amount> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<Void> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_code")
            @ExcludeMissing
            productCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Quantity> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Tax> = JsonMissing.of(),
            @JsonProperty("tax_rate") @ExcludeMissing taxRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit")
            @ExcludeMissing
            unit: JsonField<UnitOfMeasureCode> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<UnitPrice> = JsonMissing.of(),
        ) : this(
            amount,
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
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Amount> = amount.getOptional("amount")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun date(): Optional<Void> = date.getOptional("date")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productCode(): Optional<String> = productCode.getOptional("product_code")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<Quantity> = quantity.getOptional("quantity")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tax(): Optional<Tax> = tax.getOptional("tax")

        /**
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
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitPrice(): Optional<UnitPrice> = unitPrice.getOptional("unit_price")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Amount> = amount

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
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Quantity> = quantity

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

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
        @JsonProperty("unit_price")
        @ExcludeMissing
        fun _unitPrice(): JsonField<UnitPrice> = unitPrice

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

            private var amount: JsonField<Amount> = JsonMissing.of()
            private var date: JsonField<Void> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var productCode: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Quantity> = JsonMissing.of()
            private var tax: JsonField<Tax> = JsonMissing.of()
            private var taxRate: JsonField<String> = JsonMissing.of()
            private var unit: JsonField<UnitOfMeasureCode> = JsonMissing.of()
            private var unitPrice: JsonField<UnitPrice> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                amount = item.amount
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

            fun amount(amount: Amount?) = amount(JsonField.ofNullable(amount))

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<Amount>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Amount] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

            /** Alias for calling [amount] with `Amount.ofNumber(number)`. */
            fun amount(number: Double) = amount(Amount.ofNumber(number))

            /** Alias for calling [amount] with `Amount.ofString(string)`. */
            fun amount(string: String) = amount(Amount.ofString(string))

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

            fun quantity(quantity: Quantity?) = quantity(JsonField.ofNullable(quantity))

            /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
            fun quantity(quantity: Optional<Quantity>) = quantity(quantity.getOrNull())

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Quantity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Quantity>) = apply { this.quantity = quantity }

            /** Alias for calling [quantity] with `Quantity.ofNumber(number)`. */
            fun quantity(number: Double) = quantity(Quantity.ofNumber(number))

            /** Alias for calling [quantity] with `Quantity.ofString(string)`. */
            fun quantity(string: String) = quantity(Quantity.ofString(string))

            fun tax(tax: Tax?) = tax(JsonField.ofNullable(tax))

            /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
            fun tax(tax: Optional<Tax>) = tax(tax.getOrNull())

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Tax] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Tax>) = apply { this.tax = tax }

            /** Alias for calling [tax] with `Tax.ofNumber(number)`. */
            fun tax(number: Double) = tax(Tax.ofNumber(number))

            /** Alias for calling [tax] with `Tax.ofString(string)`. */
            fun tax(string: String) = tax(Tax.ofString(string))

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

            fun unitPrice(unitPrice: UnitPrice?) = unitPrice(JsonField.ofNullable(unitPrice))

            /** Alias for calling [Builder.unitPrice] with `unitPrice.orElse(null)`. */
            fun unitPrice(unitPrice: Optional<UnitPrice>) = unitPrice(unitPrice.getOrNull())

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [UnitPrice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<UnitPrice>) = apply { this.unitPrice = unitPrice }

            /** Alias for calling [unitPrice] with `UnitPrice.ofNumber(number)`. */
            fun unitPrice(number: Double) = unitPrice(UnitPrice.ofNumber(number))

            /** Alias for calling [unitPrice] with `UnitPrice.ofString(string)`. */
            fun unitPrice(string: String) = unitPrice(UnitPrice.ofString(string))

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
                    amount,
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

            amount().ifPresent { it.validate() }
            date()
            description()
            productCode()
            quantity().ifPresent { it.validate() }
            tax().ifPresent { it.validate() }
            taxRate()
            unit().ifPresent { it.validate() }
            unitPrice().ifPresent { it.validate() }
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
            (amount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (productCode.asKnown().isPresent) 1 else 0) +
                (quantity.asKnown().getOrNull()?.validity() ?: 0) +
                (tax.asKnown().getOrNull()?.validity() ?: 0) +
                (if (taxRate.asKnown().isPresent) 1 else 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                (unitPrice.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = Amount.Deserializer::class)
        @JsonSerialize(using = Amount.Serializer::class)
        class Amount
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Amount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Amount && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "Amount{number=$number}"
                    string != null -> "Amount{string=$string}"
                    _json != null -> "Amount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Amount")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = Amount(number = number)

                @JvmStatic fun ofString(string: String) = Amount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Amount] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Amount] to a value of type [T].
                 *
                 * An instance of [Amount] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws EInvoiceInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw EInvoiceInvalidDataException("Unknown Amount: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Amount>(Amount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Amount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Amount(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Amount(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Amount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Amount>(Amount::class) {

                override fun serialize(
                    value: Amount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Amount")
                    }
                }
            }
        }

        @JsonDeserialize(using = Quantity.Deserializer::class)
        @JsonSerialize(using = Quantity.Serializer::class)
        class Quantity
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Quantity = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Quantity && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "Quantity{number=$number}"
                    string != null -> "Quantity{string=$string}"
                    _json != null -> "Quantity{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Quantity")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = Quantity(number = number)

                @JvmStatic fun ofString(string: String) = Quantity(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Quantity] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Quantity] to a value of type [T].
                 *
                 * An instance of [Quantity] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws EInvoiceInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw EInvoiceInvalidDataException("Unknown Quantity: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Quantity>(Quantity::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Quantity {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Quantity(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Quantity(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Quantity(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Quantity>(Quantity::class) {

                override fun serialize(
                    value: Quantity,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Quantity")
                    }
                }
            }
        }

        @JsonDeserialize(using = Tax.Deserializer::class)
        @JsonSerialize(using = Tax.Serializer::class)
        class Tax
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tax && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "Tax{number=$number}"
                    string != null -> "Tax{string=$string}"
                    _json != null -> "Tax{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Tax")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = Tax(number = number)

                @JvmStatic fun ofString(string: String) = Tax(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Tax] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Tax] to a value of type [T].
                 *
                 * An instance of [Tax] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws EInvoiceInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw EInvoiceInvalidDataException("Unknown Tax: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Tax>(Tax::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Tax {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Tax(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Tax(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Tax(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Tax>(Tax::class) {

                override fun serialize(
                    value: Tax,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Tax")
                    }
                }
            }
        }

        @JsonDeserialize(using = UnitPrice.Deserializer::class)
        @JsonSerialize(using = UnitPrice.Serializer::class)
        class UnitPrice
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): UnitPrice = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitPrice && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "UnitPrice{number=$number}"
                    string != null -> "UnitPrice{string=$string}"
                    _json != null -> "UnitPrice{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid UnitPrice")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = UnitPrice(number = number)

                @JvmStatic fun ofString(string: String) = UnitPrice(string = string)
            }

            /**
             * An interface that defines how to map each variant of [UnitPrice] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [UnitPrice] to a value of type [T].
                 *
                 * An instance of [UnitPrice] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws EInvoiceInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw EInvoiceInvalidDataException("Unknown UnitPrice: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<UnitPrice>(UnitPrice::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): UnitPrice {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    UnitPrice(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    UnitPrice(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> UnitPrice(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<UnitPrice>(UnitPrice::class) {

                override fun serialize(
                    value: UnitPrice,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid UnitPrice")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Item && amount == other.amount && date == other.date && description == other.description && productCode == other.productCode && quantity == other.quantity && tax == other.tax && taxRate == other.taxRate && unit == other.unit && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, date, description, productCode, quantity, tax, taxRate, unit, unitPrice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{amount=$amount, date=$date, description=$description, productCode=$productCode, quantity=$quantity, tax=$tax, taxRate=$taxRate, unit=$unit, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = PreviousUnpaidBalance.Deserializer::class)
    @JsonSerialize(using = PreviousUnpaidBalance.Serializer::class)
    class PreviousUnpaidBalance
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): PreviousUnpaidBalance = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PreviousUnpaidBalance && number == other.number && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

        override fun toString(): String =
            when {
                number != null -> "PreviousUnpaidBalance{number=$number}"
                string != null -> "PreviousUnpaidBalance{string=$string}"
                _json != null -> "PreviousUnpaidBalance{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PreviousUnpaidBalance")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = PreviousUnpaidBalance(number = number)

            @JvmStatic fun ofString(string: String) = PreviousUnpaidBalance(string = string)
        }

        /**
         * An interface that defines how to map each variant of [PreviousUnpaidBalance] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [PreviousUnpaidBalance] to a value of type [T].
             *
             * An instance of [PreviousUnpaidBalance] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws EInvoiceInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw EInvoiceInvalidDataException("Unknown PreviousUnpaidBalance: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<PreviousUnpaidBalance>(PreviousUnpaidBalance::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PreviousUnpaidBalance {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                PreviousUnpaidBalance(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                PreviousUnpaidBalance(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> PreviousUnpaidBalance(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<PreviousUnpaidBalance>(PreviousUnpaidBalance::class) {

            override fun serialize(
                value: PreviousUnpaidBalance,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PreviousUnpaidBalance")
                }
            }
        }
    }

    @JsonDeserialize(using = Subtotal.Deserializer::class)
    @JsonSerialize(using = Subtotal.Serializer::class)
    class Subtotal
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Subtotal = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subtotal && number == other.number && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

        override fun toString(): String =
            when {
                number != null -> "Subtotal{number=$number}"
                string != null -> "Subtotal{string=$string}"
                _json != null -> "Subtotal{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Subtotal")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Subtotal(number = number)

            @JvmStatic fun ofString(string: String) = Subtotal(string = string)
        }

        /**
         * An interface that defines how to map each variant of [Subtotal] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Subtotal] to a value of type [T].
             *
             * An instance of [Subtotal] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws EInvoiceInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw EInvoiceInvalidDataException("Unknown Subtotal: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Subtotal>(Subtotal::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Subtotal {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Subtotal(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Subtotal(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Subtotal(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Subtotal>(Subtotal::class) {

            override fun serialize(
                value: Subtotal,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Subtotal")
                }
            }
        }
    }

    class TaxDetail
    private constructor(
        private val amount: JsonField<Amount>,
        private val rate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Amount> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
        ) : this(amount, rate, mutableMapOf())

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Amount> = amount.getOptional("amount")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Amount> = amount

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

            private var amount: JsonField<Amount> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(taxDetail: TaxDetail) = apply {
                amount = taxDetail.amount
                rate = taxDetail.rate
                additionalProperties = taxDetail.additionalProperties.toMutableMap()
            }

            fun amount(amount: Amount?) = amount(JsonField.ofNullable(amount))

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<Amount>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Amount] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

            /** Alias for calling [amount] with `Amount.ofNumber(number)`. */
            fun amount(number: Double) = amount(Amount.ofNumber(number))

            /** Alias for calling [amount] with `Amount.ofString(string)`. */
            fun amount(string: String) = amount(Amount.ofString(string))

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

            amount().ifPresent { it.validate() }
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
            (amount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rate.asKnown().isPresent) 1 else 0)

        @JsonDeserialize(using = Amount.Deserializer::class)
        @JsonSerialize(using = Amount.Serializer::class)
        class Amount
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Amount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Amount && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "Amount{number=$number}"
                    string != null -> "Amount{string=$string}"
                    _json != null -> "Amount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Amount")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = Amount(number = number)

                @JvmStatic fun ofString(string: String) = Amount(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Amount] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Amount] to a value of type [T].
                 *
                 * An instance of [Amount] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws EInvoiceInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw EInvoiceInvalidDataException("Unknown Amount: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Amount>(Amount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Amount {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Amount(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Amount(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Amount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Amount>(Amount::class) {

                override fun serialize(
                    value: Amount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Amount")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxDetail && amount == other.amount && rate == other.rate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, rate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxDetail{amount=$amount, rate=$rate, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = TotalDiscount.Deserializer::class)
    @JsonSerialize(using = TotalDiscount.Serializer::class)
    class TotalDiscount
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TotalDiscount = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TotalDiscount && number == other.number && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

        override fun toString(): String =
            when {
                number != null -> "TotalDiscount{number=$number}"
                string != null -> "TotalDiscount{string=$string}"
                _json != null -> "TotalDiscount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TotalDiscount")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = TotalDiscount(number = number)

            @JvmStatic fun ofString(string: String) = TotalDiscount(string = string)
        }

        /**
         * An interface that defines how to map each variant of [TotalDiscount] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [TotalDiscount] to a value of type [T].
             *
             * An instance of [TotalDiscount] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws EInvoiceInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw EInvoiceInvalidDataException("Unknown TotalDiscount: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TotalDiscount>(TotalDiscount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TotalDiscount {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                TotalDiscount(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                TotalDiscount(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> TotalDiscount(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<TotalDiscount>(TotalDiscount::class) {

            override fun serialize(
                value: TotalDiscount,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TotalDiscount")
                }
            }
        }
    }

    @JsonDeserialize(using = TotalTax.Deserializer::class)
    @JsonSerialize(using = TotalTax.Serializer::class)
    class TotalTax
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TotalTax = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TotalTax && number == other.number && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

        override fun toString(): String =
            when {
                number != null -> "TotalTax{number=$number}"
                string != null -> "TotalTax{string=$string}"
                _json != null -> "TotalTax{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TotalTax")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = TotalTax(number = number)

            @JvmStatic fun ofString(string: String) = TotalTax(string = string)
        }

        /**
         * An interface that defines how to map each variant of [TotalTax] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [TotalTax] to a value of type [T].
             *
             * An instance of [TotalTax] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws EInvoiceInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw EInvoiceInvalidDataException("Unknown TotalTax: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TotalTax>(TotalTax::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TotalTax {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                TotalTax(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                TotalTax(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> TotalTax(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<TotalTax>(TotalTax::class) {

            override fun serialize(
                value: TotalTax,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TotalTax")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentCreate && amountDue == other.amountDue && attachments == other.attachments && billingAddress == other.billingAddress && billingAddressRecipient == other.billingAddressRecipient && currency == other.currency && customerAddress == other.customerAddress && customerAddressRecipient == other.customerAddressRecipient && customerEmail == other.customerEmail && customerId == other.customerId && customerName == other.customerName && customerTaxId == other.customerTaxId && direction == other.direction && documentType == other.documentType && dueDate == other.dueDate && invoiceDate == other.invoiceDate && invoiceId == other.invoiceId && invoiceTotal == other.invoiceTotal && items == other.items && note == other.note && paymentDetails == other.paymentDetails && paymentTerm == other.paymentTerm && previousUnpaidBalance == other.previousUnpaidBalance && purchaseOrder == other.purchaseOrder && remittanceAddress == other.remittanceAddress && remittanceAddressRecipient == other.remittanceAddressRecipient && serviceAddress == other.serviceAddress && serviceAddressRecipient == other.serviceAddressRecipient && serviceEndDate == other.serviceEndDate && serviceStartDate == other.serviceStartDate && shippingAddress == other.shippingAddress && shippingAddressRecipient == other.shippingAddressRecipient && state == other.state && subtotal == other.subtotal && taxDetails == other.taxDetails && totalDiscount == other.totalDiscount && totalTax == other.totalTax && vendorAddress == other.vendorAddress && vendorAddressRecipient == other.vendorAddressRecipient && vendorEmail == other.vendorEmail && vendorName == other.vendorName && vendorTaxId == other.vendorTaxId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amountDue, attachments, billingAddress, billingAddressRecipient, currency, customerAddress, customerAddressRecipient, customerEmail, customerId, customerName, customerTaxId, direction, documentType, dueDate, invoiceDate, invoiceId, invoiceTotal, items, note, paymentDetails, paymentTerm, previousUnpaidBalance, purchaseOrder, remittanceAddress, remittanceAddressRecipient, serviceAddress, serviceAddressRecipient, serviceEndDate, serviceStartDate, shippingAddress, shippingAddressRecipient, state, subtotal, taxDetails, totalDiscount, totalTax, vendorAddress, vendorAddressRecipient, vendorEmail, vendorName, vendorTaxId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentCreate{amountDue=$amountDue, attachments=$attachments, billingAddress=$billingAddress, billingAddressRecipient=$billingAddressRecipient, currency=$currency, customerAddress=$customerAddress, customerAddressRecipient=$customerAddressRecipient, customerEmail=$customerEmail, customerId=$customerId, customerName=$customerName, customerTaxId=$customerTaxId, direction=$direction, documentType=$documentType, dueDate=$dueDate, invoiceDate=$invoiceDate, invoiceId=$invoiceId, invoiceTotal=$invoiceTotal, items=$items, note=$note, paymentDetails=$paymentDetails, paymentTerm=$paymentTerm, previousUnpaidBalance=$previousUnpaidBalance, purchaseOrder=$purchaseOrder, remittanceAddress=$remittanceAddress, remittanceAddressRecipient=$remittanceAddressRecipient, serviceAddress=$serviceAddress, serviceAddressRecipient=$serviceAddressRecipient, serviceEndDate=$serviceEndDate, serviceStartDate=$serviceStartDate, shippingAddress=$shippingAddress, shippingAddressRecipient=$shippingAddressRecipient, state=$state, subtotal=$subtotal, taxDetails=$taxDetails, totalDiscount=$totalDiscount, totalTax=$totalTax, vendorAddress=$vendorAddress, vendorAddressRecipient=$vendorAddressRecipient, vendorEmail=$vendorEmail, vendorName=$vendorName, vendorTaxId=$vendorTaxId, additionalProperties=$additionalProperties}"
}
