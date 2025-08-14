// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.validate

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response for a Peppol ID validation request.
 *
 * This model represents the validation result of a Peppol ID in the Peppol network, including
 * whether the ID is valid and what document types it supports.
 */
class ValidateValidatePeppolIdResponse
private constructor(
    private val businessCard: JsonField<BusinessCard>,
    private val businessCardValid: JsonField<Boolean>,
    private val dnsValid: JsonField<Boolean>,
    private val isValid: JsonField<Boolean>,
    private val supportedDocumentTypes: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_card")
        @ExcludeMissing
        businessCard: JsonField<BusinessCard> = JsonMissing.of(),
        @JsonProperty("business_card_valid")
        @ExcludeMissing
        businessCardValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dns_valid") @ExcludeMissing dnsValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_valid") @ExcludeMissing isValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supported_document_types")
        @ExcludeMissing
        supportedDocumentTypes: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        businessCard,
        businessCardValid,
        dnsValid,
        isValid,
        supportedDocumentTypes,
        mutableMapOf(),
    )

    /**
     * Business card information for the Peppol ID
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessCard(): Optional<BusinessCard> = businessCard.getOptional("business_card")

    /**
     * Whether a business card is set at the SMP
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessCardValid(): Boolean = businessCardValid.getRequired("business_card_valid")

    /**
     * Whether the DNS resolves to a valid SMP
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dnsValid(): Boolean = dnsValid.getRequired("dns_valid")

    /**
     * Whether the Peppol ID is valid and registered in the Peppol network
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isValid(): Boolean = isValid.getRequired("is_valid")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportedDocumentTypes(): Optional<List<String>> =
        supportedDocumentTypes.getOptional("supported_document_types")

    /**
     * Returns the raw JSON value of [businessCard].
     *
     * Unlike [businessCard], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_card")
    @ExcludeMissing
    fun _businessCard(): JsonField<BusinessCard> = businessCard

    /**
     * Returns the raw JSON value of [businessCardValid].
     *
     * Unlike [businessCardValid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("business_card_valid")
    @ExcludeMissing
    fun _businessCardValid(): JsonField<Boolean> = businessCardValid

    /**
     * Returns the raw JSON value of [dnsValid].
     *
     * Unlike [dnsValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dns_valid") @ExcludeMissing fun _dnsValid(): JsonField<Boolean> = dnsValid

    /**
     * Returns the raw JSON value of [isValid].
     *
     * Unlike [isValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_valid") @ExcludeMissing fun _isValid(): JsonField<Boolean> = isValid

    /**
     * Returns the raw JSON value of [supportedDocumentTypes].
     *
     * Unlike [supportedDocumentTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supported_document_types")
    @ExcludeMissing
    fun _supportedDocumentTypes(): JsonField<List<String>> = supportedDocumentTypes

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
         * [ValidateValidatePeppolIdResponse].
         *
         * The following fields are required:
         * ```java
         * .businessCard()
         * .businessCardValid()
         * .dnsValid()
         * .isValid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValidateValidatePeppolIdResponse]. */
    class Builder internal constructor() {

        private var businessCard: JsonField<BusinessCard>? = null
        private var businessCardValid: JsonField<Boolean>? = null
        private var dnsValid: JsonField<Boolean>? = null
        private var isValid: JsonField<Boolean>? = null
        private var supportedDocumentTypes: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(validateValidatePeppolIdResponse: ValidateValidatePeppolIdResponse) =
            apply {
                businessCard = validateValidatePeppolIdResponse.businessCard
                businessCardValid = validateValidatePeppolIdResponse.businessCardValid
                dnsValid = validateValidatePeppolIdResponse.dnsValid
                isValid = validateValidatePeppolIdResponse.isValid
                supportedDocumentTypes =
                    validateValidatePeppolIdResponse.supportedDocumentTypes.map {
                        it.toMutableList()
                    }
                additionalProperties =
                    validateValidatePeppolIdResponse.additionalProperties.toMutableMap()
            }

        /** Business card information for the Peppol ID */
        fun businessCard(businessCard: BusinessCard?) =
            businessCard(JsonField.ofNullable(businessCard))

        /** Alias for calling [Builder.businessCard] with `businessCard.orElse(null)`. */
        fun businessCard(businessCard: Optional<BusinessCard>) =
            businessCard(businessCard.getOrNull())

        /**
         * Sets [Builder.businessCard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessCard] with a well-typed [BusinessCard] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessCard(businessCard: JsonField<BusinessCard>) = apply {
            this.businessCard = businessCard
        }

        /** Whether a business card is set at the SMP */
        fun businessCardValid(businessCardValid: Boolean) =
            businessCardValid(JsonField.of(businessCardValid))

        /**
         * Sets [Builder.businessCardValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessCardValid] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessCardValid(businessCardValid: JsonField<Boolean>) = apply {
            this.businessCardValid = businessCardValid
        }

        /** Whether the DNS resolves to a valid SMP */
        fun dnsValid(dnsValid: Boolean) = dnsValid(JsonField.of(dnsValid))

        /**
         * Sets [Builder.dnsValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsValid] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dnsValid(dnsValid: JsonField<Boolean>) = apply { this.dnsValid = dnsValid }

        /** Whether the Peppol ID is valid and registered in the Peppol network */
        fun isValid(isValid: Boolean) = isValid(JsonField.of(isValid))

        /**
         * Sets [Builder.isValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isValid] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isValid(isValid: JsonField<Boolean>) = apply { this.isValid = isValid }

        fun supportedDocumentTypes(supportedDocumentTypes: List<String>) =
            supportedDocumentTypes(JsonField.of(supportedDocumentTypes))

        /**
         * Sets [Builder.supportedDocumentTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedDocumentTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportedDocumentTypes(supportedDocumentTypes: JsonField<List<String>>) = apply {
            this.supportedDocumentTypes = supportedDocumentTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [supportedDocumentTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedDocumentType(supportedDocumentType: String) = apply {
            supportedDocumentTypes =
                (supportedDocumentTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedDocumentTypes", it).add(supportedDocumentType)
                }
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
         * Returns an immutable instance of [ValidateValidatePeppolIdResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessCard()
         * .businessCardValid()
         * .dnsValid()
         * .isValid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ValidateValidatePeppolIdResponse =
            ValidateValidatePeppolIdResponse(
                checkRequired("businessCard", businessCard),
                checkRequired("businessCardValid", businessCardValid),
                checkRequired("dnsValid", dnsValid),
                checkRequired("isValid", isValid),
                (supportedDocumentTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ValidateValidatePeppolIdResponse = apply {
        if (validated) {
            return@apply
        }

        businessCard().ifPresent { it.validate() }
        businessCardValid()
        dnsValid()
        isValid()
        supportedDocumentTypes()
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
        (businessCard.asKnown().getOrNull()?.validity() ?: 0) +
            (if (businessCardValid.asKnown().isPresent) 1 else 0) +
            (if (dnsValid.asKnown().isPresent) 1 else 0) +
            (if (isValid.asKnown().isPresent) 1 else 0) +
            (supportedDocumentTypes.asKnown().getOrNull()?.size ?: 0)

    /** Business card information for the Peppol ID */
    class BusinessCard
    private constructor(
        private val countryCode: JsonField<String>,
        private val name: JsonField<String>,
        private val registrationDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_date")
            @ExcludeMissing
            registrationDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(countryCode, name, registrationDate, mutableMapOf())

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registrationDate(): Optional<LocalDate> =
            registrationDate.getOptional("registration_date")

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [registrationDate].
         *
         * Unlike [registrationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_date")
        @ExcludeMissing
        fun _registrationDate(): JsonField<LocalDate> = registrationDate

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

            /** Returns a mutable builder for constructing an instance of [BusinessCard]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BusinessCard]. */
        class Builder internal constructor() {

            private var countryCode: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var registrationDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(businessCard: BusinessCard) = apply {
                countryCode = businessCard.countryCode
                name = businessCard.name
                registrationDate = businessCard.registrationDate
                additionalProperties = businessCard.additionalProperties.toMutableMap()
            }

            fun countryCode(countryCode: String?) = countryCode(JsonField.ofNullable(countryCode))

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun registrationDate(registrationDate: LocalDate?) =
                registrationDate(JsonField.ofNullable(registrationDate))

            /**
             * Alias for calling [Builder.registrationDate] with `registrationDate.orElse(null)`.
             */
            fun registrationDate(registrationDate: Optional<LocalDate>) =
                registrationDate(registrationDate.getOrNull())

            /**
             * Sets [Builder.registrationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun registrationDate(registrationDate: JsonField<LocalDate>) = apply {
                this.registrationDate = registrationDate
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
             * Returns an immutable instance of [BusinessCard].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BusinessCard =
                BusinessCard(
                    countryCode,
                    name,
                    registrationDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BusinessCard = apply {
            if (validated) {
                return@apply
            }

            countryCode()
            name()
            registrationDate()
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
            (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (registrationDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BusinessCard &&
                countryCode == other.countryCode &&
                name == other.name &&
                registrationDate == other.registrationDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(countryCode, name, registrationDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BusinessCard{countryCode=$countryCode, name=$name, registrationDate=$registrationDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValidateValidatePeppolIdResponse &&
            businessCard == other.businessCard &&
            businessCardValid == other.businessCardValid &&
            dnsValid == other.dnsValid &&
            isValid == other.isValid &&
            supportedDocumentTypes == other.supportedDocumentTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            businessCard,
            businessCardValid,
            dnsValid,
            isValid,
            supportedDocumentTypes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValidateValidatePeppolIdResponse{businessCard=$businessCard, businessCardValid=$businessCardValid, dnsValid=$dnsValid, isValid=$isValid, supportedDocumentTypes=$supportedDocumentTypes, additionalProperties=$additionalProperties}"
}
