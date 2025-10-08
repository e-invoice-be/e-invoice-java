// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.me

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.checkKnown
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.core.toImmutable
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MeRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditBalance: JsonField<Long>,
    private val name: JsonField<String>,
    private val plan: JsonField<Plan>,
    private val bccRecipientEmail: JsonField<String>,
    private val companyAddress: JsonField<String>,
    private val companyCity: JsonField<String>,
    private val companyCountry: JsonField<String>,
    private val companyEmail: JsonField<String>,
    private val companyName: JsonField<String>,
    private val companyNumber: JsonField<String>,
    private val companyZip: JsonField<String>,
    private val description: JsonField<String>,
    private val ibans: JsonField<List<String>>,
    private val peppolIds: JsonField<List<String>>,
    private val smpRegistration: JsonField<Boolean>,
    private val smpRegistrationDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_balance")
        @ExcludeMissing
        creditBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("bcc_recipient_email")
        @ExcludeMissing
        bccRecipientEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_address")
        @ExcludeMissing
        companyAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_city")
        @ExcludeMissing
        companyCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_country")
        @ExcludeMissing
        companyCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_email")
        @ExcludeMissing
        companyEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_name")
        @ExcludeMissing
        companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_number")
        @ExcludeMissing
        companyNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_zip")
        @ExcludeMissing
        companyZip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ibans") @ExcludeMissing ibans: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("peppol_ids")
        @ExcludeMissing
        peppolIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("smp_registration")
        @ExcludeMissing
        smpRegistration: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("smp_registration_date")
        @ExcludeMissing
        smpRegistrationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        creditBalance,
        name,
        plan,
        bccRecipientEmail,
        companyAddress,
        companyCity,
        companyCountry,
        companyEmail,
        companyName,
        companyNumber,
        companyZip,
        description,
        ibans,
        peppolIds,
        smpRegistration,
        smpRegistrationDate,
        mutableMapOf(),
    )

    /**
     * Credit balance of the tenant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditBalance(): Long = creditBalance.getRequired("credit_balance")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Plan of the tenant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /**
     * BCC recipient email to deliver documents
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bccRecipientEmail(): Optional<String> = bccRecipientEmail.getOptional("bcc_recipient_email")

    /**
     * Address of the company
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyAddress(): Optional<String> = companyAddress.getOptional("company_address")

    /**
     * City of the company
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyCity(): Optional<String> = companyCity.getOptional("company_city")

    /**
     * Country of the company
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyCountry(): Optional<String> = companyCountry.getOptional("company_country")

    /**
     * Email of the company
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyEmail(): Optional<String> = companyEmail.getOptional("company_email")

    /**
     * Name of the company
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = companyName.getOptional("company_name")

    /**
     * Company number
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyNumber(): Optional<String> = companyNumber.getOptional("company_number")

    /**
     * Zip code of the company
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyZip(): Optional<String> = companyZip.getOptional("company_zip")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * IBANs of the tenant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ibans(): Optional<List<String>> = ibans.getOptional("ibans")

    /**
     * Peppol IDs of the tenant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun peppolIds(): Optional<List<String>> = peppolIds.getOptional("peppol_ids")

    /**
     * Whether the tenant is registered on our SMP
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smpRegistration(): Optional<Boolean> = smpRegistration.getOptional("smp_registration")

    /**
     * Date when the tenant was registered on SMP
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smpRegistrationDate(): Optional<OffsetDateTime> =
        smpRegistrationDate.getOptional("smp_registration_date")

    /**
     * Returns the raw JSON value of [creditBalance].
     *
     * Unlike [creditBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_balance")
    @ExcludeMissing
    fun _creditBalance(): JsonField<Long> = creditBalance

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [bccRecipientEmail].
     *
     * Unlike [bccRecipientEmail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bcc_recipient_email")
    @ExcludeMissing
    fun _bccRecipientEmail(): JsonField<String> = bccRecipientEmail

    /**
     * Returns the raw JSON value of [companyAddress].
     *
     * Unlike [companyAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_address")
    @ExcludeMissing
    fun _companyAddress(): JsonField<String> = companyAddress

    /**
     * Returns the raw JSON value of [companyCity].
     *
     * Unlike [companyCity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_city")
    @ExcludeMissing
    fun _companyCity(): JsonField<String> = companyCity

    /**
     * Returns the raw JSON value of [companyCountry].
     *
     * Unlike [companyCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_country")
    @ExcludeMissing
    fun _companyCountry(): JsonField<String> = companyCountry

    /**
     * Returns the raw JSON value of [companyEmail].
     *
     * Unlike [companyEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_email")
    @ExcludeMissing
    fun _companyEmail(): JsonField<String> = companyEmail

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName(): JsonField<String> = companyName

    /**
     * Returns the raw JSON value of [companyNumber].
     *
     * Unlike [companyNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_number")
    @ExcludeMissing
    fun _companyNumber(): JsonField<String> = companyNumber

    /**
     * Returns the raw JSON value of [companyZip].
     *
     * Unlike [companyZip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_zip") @ExcludeMissing fun _companyZip(): JsonField<String> = companyZip

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [ibans].
     *
     * Unlike [ibans], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ibans") @ExcludeMissing fun _ibans(): JsonField<List<String>> = ibans

    /**
     * Returns the raw JSON value of [peppolIds].
     *
     * Unlike [peppolIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("peppol_ids")
    @ExcludeMissing
    fun _peppolIds(): JsonField<List<String>> = peppolIds

    /**
     * Returns the raw JSON value of [smpRegistration].
     *
     * Unlike [smpRegistration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("smp_registration")
    @ExcludeMissing
    fun _smpRegistration(): JsonField<Boolean> = smpRegistration

    /**
     * Returns the raw JSON value of [smpRegistrationDate].
     *
     * Unlike [smpRegistrationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("smp_registration_date")
    @ExcludeMissing
    fun _smpRegistrationDate(): JsonField<OffsetDateTime> = smpRegistrationDate

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
         * Returns a mutable builder for constructing an instance of [MeRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .creditBalance()
         * .name()
         * .plan()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeRetrieveResponse]. */
    class Builder internal constructor() {

        private var creditBalance: JsonField<Long>? = null
        private var name: JsonField<String>? = null
        private var plan: JsonField<Plan>? = null
        private var bccRecipientEmail: JsonField<String> = JsonMissing.of()
        private var companyAddress: JsonField<String> = JsonMissing.of()
        private var companyCity: JsonField<String> = JsonMissing.of()
        private var companyCountry: JsonField<String> = JsonMissing.of()
        private var companyEmail: JsonField<String> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var companyNumber: JsonField<String> = JsonMissing.of()
        private var companyZip: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var ibans: JsonField<MutableList<String>>? = null
        private var peppolIds: JsonField<MutableList<String>>? = null
        private var smpRegistration: JsonField<Boolean> = JsonMissing.of()
        private var smpRegistrationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meRetrieveResponse: MeRetrieveResponse) = apply {
            creditBalance = meRetrieveResponse.creditBalance
            name = meRetrieveResponse.name
            plan = meRetrieveResponse.plan
            bccRecipientEmail = meRetrieveResponse.bccRecipientEmail
            companyAddress = meRetrieveResponse.companyAddress
            companyCity = meRetrieveResponse.companyCity
            companyCountry = meRetrieveResponse.companyCountry
            companyEmail = meRetrieveResponse.companyEmail
            companyName = meRetrieveResponse.companyName
            companyNumber = meRetrieveResponse.companyNumber
            companyZip = meRetrieveResponse.companyZip
            description = meRetrieveResponse.description
            ibans = meRetrieveResponse.ibans.map { it.toMutableList() }
            peppolIds = meRetrieveResponse.peppolIds.map { it.toMutableList() }
            smpRegistration = meRetrieveResponse.smpRegistration
            smpRegistrationDate = meRetrieveResponse.smpRegistrationDate
            additionalProperties = meRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Credit balance of the tenant */
        fun creditBalance(creditBalance: Long) = creditBalance(JsonField.of(creditBalance))

        /**
         * Sets [Builder.creditBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditBalance(creditBalance: JsonField<Long>) = apply {
            this.creditBalance = creditBalance
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Plan of the tenant */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** BCC recipient email to deliver documents */
        fun bccRecipientEmail(bccRecipientEmail: String?) =
            bccRecipientEmail(JsonField.ofNullable(bccRecipientEmail))

        /** Alias for calling [Builder.bccRecipientEmail] with `bccRecipientEmail.orElse(null)`. */
        fun bccRecipientEmail(bccRecipientEmail: Optional<String>) =
            bccRecipientEmail(bccRecipientEmail.getOrNull())

        /**
         * Sets [Builder.bccRecipientEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bccRecipientEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bccRecipientEmail(bccRecipientEmail: JsonField<String>) = apply {
            this.bccRecipientEmail = bccRecipientEmail
        }

        /** Address of the company */
        fun companyAddress(companyAddress: String?) =
            companyAddress(JsonField.ofNullable(companyAddress))

        /** Alias for calling [Builder.companyAddress] with `companyAddress.orElse(null)`. */
        fun companyAddress(companyAddress: Optional<String>) =
            companyAddress(companyAddress.getOrNull())

        /**
         * Sets [Builder.companyAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyAddress(companyAddress: JsonField<String>) = apply {
            this.companyAddress = companyAddress
        }

        /** City of the company */
        fun companyCity(companyCity: String?) = companyCity(JsonField.ofNullable(companyCity))

        /** Alias for calling [Builder.companyCity] with `companyCity.orElse(null)`. */
        fun companyCity(companyCity: Optional<String>) = companyCity(companyCity.getOrNull())

        /**
         * Sets [Builder.companyCity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyCity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyCity(companyCity: JsonField<String>) = apply { this.companyCity = companyCity }

        /** Country of the company */
        fun companyCountry(companyCountry: String?) =
            companyCountry(JsonField.ofNullable(companyCountry))

        /** Alias for calling [Builder.companyCountry] with `companyCountry.orElse(null)`. */
        fun companyCountry(companyCountry: Optional<String>) =
            companyCountry(companyCountry.getOrNull())

        /**
         * Sets [Builder.companyCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyCountry(companyCountry: JsonField<String>) = apply {
            this.companyCountry = companyCountry
        }

        /** Email of the company */
        fun companyEmail(companyEmail: String?) = companyEmail(JsonField.ofNullable(companyEmail))

        /** Alias for calling [Builder.companyEmail] with `companyEmail.orElse(null)`. */
        fun companyEmail(companyEmail: Optional<String>) = companyEmail(companyEmail.getOrNull())

        /**
         * Sets [Builder.companyEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyEmail(companyEmail: JsonField<String>) = apply {
            this.companyEmail = companyEmail
        }

        /** Name of the company */
        fun companyName(companyName: String?) = companyName(JsonField.ofNullable(companyName))

        /** Alias for calling [Builder.companyName] with `companyName.orElse(null)`. */
        fun companyName(companyName: Optional<String>) = companyName(companyName.getOrNull())

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /** Company number */
        fun companyNumber(companyNumber: String?) =
            companyNumber(JsonField.ofNullable(companyNumber))

        /** Alias for calling [Builder.companyNumber] with `companyNumber.orElse(null)`. */
        fun companyNumber(companyNumber: Optional<String>) =
            companyNumber(companyNumber.getOrNull())

        /**
         * Sets [Builder.companyNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyNumber(companyNumber: JsonField<String>) = apply {
            this.companyNumber = companyNumber
        }

        /** Zip code of the company */
        fun companyZip(companyZip: String?) = companyZip(JsonField.ofNullable(companyZip))

        /** Alias for calling [Builder.companyZip] with `companyZip.orElse(null)`. */
        fun companyZip(companyZip: Optional<String>) = companyZip(companyZip.getOrNull())

        /**
         * Sets [Builder.companyZip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyZip] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyZip(companyZip: JsonField<String>) = apply { this.companyZip = companyZip }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** IBANs of the tenant */
        fun ibans(ibans: List<String>?) = ibans(JsonField.ofNullable(ibans))

        /** Alias for calling [Builder.ibans] with `ibans.orElse(null)`. */
        fun ibans(ibans: Optional<List<String>>) = ibans(ibans.getOrNull())

        /**
         * Sets [Builder.ibans] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ibans] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ibans(ibans: JsonField<List<String>>) = apply {
            this.ibans = ibans.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [ibans].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIban(iban: String) = apply {
            ibans =
                (ibans ?: JsonField.of(mutableListOf())).also { checkKnown("ibans", it).add(iban) }
        }

        /** Peppol IDs of the tenant */
        fun peppolIds(peppolIds: List<String>?) = peppolIds(JsonField.ofNullable(peppolIds))

        /** Alias for calling [Builder.peppolIds] with `peppolIds.orElse(null)`. */
        fun peppolIds(peppolIds: Optional<List<String>>) = peppolIds(peppolIds.getOrNull())

        /**
         * Sets [Builder.peppolIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.peppolIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun peppolIds(peppolIds: JsonField<List<String>>) = apply {
            this.peppolIds = peppolIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [peppolIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPeppolId(peppolId: String) = apply {
            peppolIds =
                (peppolIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("peppolIds", it).add(peppolId)
                }
        }

        /** Whether the tenant is registered on our SMP */
        fun smpRegistration(smpRegistration: Boolean?) =
            smpRegistration(JsonField.ofNullable(smpRegistration))

        /**
         * Alias for [Builder.smpRegistration].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun smpRegistration(smpRegistration: Boolean) = smpRegistration(smpRegistration as Boolean?)

        /** Alias for calling [Builder.smpRegistration] with `smpRegistration.orElse(null)`. */
        fun smpRegistration(smpRegistration: Optional<Boolean>) =
            smpRegistration(smpRegistration.getOrNull())

        /**
         * Sets [Builder.smpRegistration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smpRegistration] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun smpRegistration(smpRegistration: JsonField<Boolean>) = apply {
            this.smpRegistration = smpRegistration
        }

        /** Date when the tenant was registered on SMP */
        fun smpRegistrationDate(smpRegistrationDate: OffsetDateTime?) =
            smpRegistrationDate(JsonField.ofNullable(smpRegistrationDate))

        /**
         * Alias for calling [Builder.smpRegistrationDate] with `smpRegistrationDate.orElse(null)`.
         */
        fun smpRegistrationDate(smpRegistrationDate: Optional<OffsetDateTime>) =
            smpRegistrationDate(smpRegistrationDate.getOrNull())

        /**
         * Sets [Builder.smpRegistrationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smpRegistrationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun smpRegistrationDate(smpRegistrationDate: JsonField<OffsetDateTime>) = apply {
            this.smpRegistrationDate = smpRegistrationDate
        }

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
         * Returns an immutable instance of [MeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creditBalance()
         * .name()
         * .plan()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeRetrieveResponse =
            MeRetrieveResponse(
                checkRequired("creditBalance", creditBalance),
                checkRequired("name", name),
                checkRequired("plan", plan),
                bccRecipientEmail,
                companyAddress,
                companyCity,
                companyCountry,
                companyEmail,
                companyName,
                companyNumber,
                companyZip,
                description,
                (ibans ?: JsonMissing.of()).map { it.toImmutable() },
                (peppolIds ?: JsonMissing.of()).map { it.toImmutable() },
                smpRegistration,
                smpRegistrationDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        creditBalance()
        name()
        plan().validate()
        bccRecipientEmail()
        companyAddress()
        companyCity()
        companyCountry()
        companyEmail()
        companyName()
        companyNumber()
        companyZip()
        description()
        ibans()
        peppolIds()
        smpRegistration()
        smpRegistrationDate()
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
        (if (creditBalance.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (plan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (bccRecipientEmail.asKnown().isPresent) 1 else 0) +
            (if (companyAddress.asKnown().isPresent) 1 else 0) +
            (if (companyCity.asKnown().isPresent) 1 else 0) +
            (if (companyCountry.asKnown().isPresent) 1 else 0) +
            (if (companyEmail.asKnown().isPresent) 1 else 0) +
            (if (companyName.asKnown().isPresent) 1 else 0) +
            (if (companyNumber.asKnown().isPresent) 1 else 0) +
            (if (companyZip.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (ibans.asKnown().getOrNull()?.size ?: 0) +
            (peppolIds.asKnown().getOrNull()?.size ?: 0) +
            (if (smpRegistration.asKnown().isPresent) 1 else 0) +
            (if (smpRegistrationDate.asKnown().isPresent) 1 else 0)

    /** Plan of the tenant */
    class Plan @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val STARTER = of("starter")

            @JvmField val PRO = of("pro")

            @JvmField val ENTERPRISE = of("enterprise")

            @JvmStatic fun of(value: String) = Plan(JsonField.of(value))
        }

        /** An enum containing [Plan]'s known values. */
        enum class Known {
            STARTER,
            PRO,
            ENTERPRISE,
        }

        /**
         * An enum containing [Plan]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Plan] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STARTER,
            PRO,
            ENTERPRISE,
            /** An enum member indicating that [Plan] was instantiated with an unknown value. */
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
                STARTER -> Value.STARTER
                PRO -> Value.PRO
                ENTERPRISE -> Value.ENTERPRISE
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
                STARTER -> Known.STARTER
                PRO -> Known.PRO
                ENTERPRISE -> Known.ENTERPRISE
                else -> throw EInvoiceInvalidDataException("Unknown Plan: $value")
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

        fun validate(): Plan = apply {
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

            return other is Plan && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeRetrieveResponse &&
            creditBalance == other.creditBalance &&
            name == other.name &&
            plan == other.plan &&
            bccRecipientEmail == other.bccRecipientEmail &&
            companyAddress == other.companyAddress &&
            companyCity == other.companyCity &&
            companyCountry == other.companyCountry &&
            companyEmail == other.companyEmail &&
            companyName == other.companyName &&
            companyNumber == other.companyNumber &&
            companyZip == other.companyZip &&
            description == other.description &&
            ibans == other.ibans &&
            peppolIds == other.peppolIds &&
            smpRegistration == other.smpRegistration &&
            smpRegistrationDate == other.smpRegistrationDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            creditBalance,
            name,
            plan,
            bccRecipientEmail,
            companyAddress,
            companyCity,
            companyCountry,
            companyEmail,
            companyName,
            companyNumber,
            companyZip,
            description,
            ibans,
            peppolIds,
            smpRegistration,
            smpRegistrationDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeRetrieveResponse{creditBalance=$creditBalance, name=$name, plan=$plan, bccRecipientEmail=$bccRecipientEmail, companyAddress=$companyAddress, companyCity=$companyCity, companyCountry=$companyCountry, companyEmail=$companyEmail, companyName=$companyName, companyNumber=$companyNumber, companyZip=$companyZip, description=$description, ibans=$ibans, peppolIds=$peppolIds, smpRegistration=$smpRegistration, smpRegistrationDate=$smpRegistrationDate, additionalProperties=$additionalProperties}"
}
