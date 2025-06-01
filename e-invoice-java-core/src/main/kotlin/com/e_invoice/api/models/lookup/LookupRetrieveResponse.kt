// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.lookup

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response from a Peppol ID lookup operation.
 *
 * This model represents the complete result of validating and looking up a Peppol ID in the Peppol
 * network, including DNS information, service metadata, business card details, and certificate
 * information.
 *
 * Example: A successful lookup for a Peppol ID "0192:991825827" would return DNS information,
 * service metadata with supported document types and processes, business card information with
 * organization details, and certificate data.
 */
class LookupRetrieveResponse
private constructor(
    private val businessCard: JsonField<BusinessCard>,
    private val certificates: JsonField<List<Certificate>>,
    private val dnsInfo: JsonField<DnsInfo>,
    private val errors: JsonField<List<String>>,
    private val executionTimeMs: JsonField<Double>,
    private val queryMetadata: JsonField<QueryMetadata>,
    private val serviceMetadata: JsonField<ServiceMetadata>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("businessCard")
        @ExcludeMissing
        businessCard: JsonField<BusinessCard> = JsonMissing.of(),
        @JsonProperty("certificates")
        @ExcludeMissing
        certificates: JsonField<List<Certificate>> = JsonMissing.of(),
        @JsonProperty("dnsInfo") @ExcludeMissing dnsInfo: JsonField<DnsInfo> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("executionTimeMs")
        @ExcludeMissing
        executionTimeMs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("queryMetadata")
        @ExcludeMissing
        queryMetadata: JsonField<QueryMetadata> = JsonMissing.of(),
        @JsonProperty("serviceMetadata")
        @ExcludeMissing
        serviceMetadata: JsonField<ServiceMetadata> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(
        businessCard,
        certificates,
        dnsInfo,
        errors,
        executionTimeMs,
        queryMetadata,
        serviceMetadata,
        status,
        mutableMapOf(),
    )

    /**
     * Business card information for the Peppol participant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessCard(): BusinessCard = businessCard.getRequired("businessCard")

    /**
     * List of certificates found for the Peppol participant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun certificates(): List<Certificate> = certificates.getRequired("certificates")

    /**
     * Information about the DNS lookup performed
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dnsInfo(): DnsInfo = dnsInfo.getRequired("dnsInfo")

    /**
     * List of error messages if any errors occurred during the lookup
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): List<String> = errors.getRequired("errors")

    /**
     * Total execution time of the lookup operation in milliseconds
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun executionTimeMs(): Double = executionTimeMs.getRequired("executionTimeMs")

    /**
     * Metadata about the query that was performed
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queryMetadata(): QueryMetadata = queryMetadata.getRequired("queryMetadata")

    /**
     * Service metadata information for the Peppol participant
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serviceMetadata(): ServiceMetadata = serviceMetadata.getRequired("serviceMetadata")

    /**
     * Overall status of the lookup: 'success' or 'error'
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * Returns the raw JSON value of [businessCard].
     *
     * Unlike [businessCard], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessCard")
    @ExcludeMissing
    fun _businessCard(): JsonField<BusinessCard> = businessCard

    /**
     * Returns the raw JSON value of [certificates].
     *
     * Unlike [certificates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("certificates")
    @ExcludeMissing
    fun _certificates(): JsonField<List<Certificate>> = certificates

    /**
     * Returns the raw JSON value of [dnsInfo].
     *
     * Unlike [dnsInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dnsInfo") @ExcludeMissing fun _dnsInfo(): JsonField<DnsInfo> = dnsInfo

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

    /**
     * Returns the raw JSON value of [executionTimeMs].
     *
     * Unlike [executionTimeMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executionTimeMs")
    @ExcludeMissing
    fun _executionTimeMs(): JsonField<Double> = executionTimeMs

    /**
     * Returns the raw JSON value of [queryMetadata].
     *
     * Unlike [queryMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queryMetadata")
    @ExcludeMissing
    fun _queryMetadata(): JsonField<QueryMetadata> = queryMetadata

    /**
     * Returns the raw JSON value of [serviceMetadata].
     *
     * Unlike [serviceMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serviceMetadata")
    @ExcludeMissing
    fun _serviceMetadata(): JsonField<ServiceMetadata> = serviceMetadata

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
         * Returns a mutable builder for constructing an instance of [LookupRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .businessCard()
         * .certificates()
         * .dnsInfo()
         * .errors()
         * .executionTimeMs()
         * .queryMetadata()
         * .serviceMetadata()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupRetrieveResponse]. */
    class Builder internal constructor() {

        private var businessCard: JsonField<BusinessCard>? = null
        private var certificates: JsonField<MutableList<Certificate>>? = null
        private var dnsInfo: JsonField<DnsInfo>? = null
        private var errors: JsonField<MutableList<String>>? = null
        private var executionTimeMs: JsonField<Double>? = null
        private var queryMetadata: JsonField<QueryMetadata>? = null
        private var serviceMetadata: JsonField<ServiceMetadata>? = null
        private var status: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lookupRetrieveResponse: LookupRetrieveResponse) = apply {
            businessCard = lookupRetrieveResponse.businessCard
            certificates = lookupRetrieveResponse.certificates.map { it.toMutableList() }
            dnsInfo = lookupRetrieveResponse.dnsInfo
            errors = lookupRetrieveResponse.errors.map { it.toMutableList() }
            executionTimeMs = lookupRetrieveResponse.executionTimeMs
            queryMetadata = lookupRetrieveResponse.queryMetadata
            serviceMetadata = lookupRetrieveResponse.serviceMetadata
            status = lookupRetrieveResponse.status
            additionalProperties = lookupRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Business card information for the Peppol participant */
        fun businessCard(businessCard: BusinessCard) = businessCard(JsonField.of(businessCard))

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

        /** List of certificates found for the Peppol participant */
        fun certificates(certificates: List<Certificate>) = certificates(JsonField.of(certificates))

        /**
         * Sets [Builder.certificates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificates] with a well-typed `List<Certificate>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun certificates(certificates: JsonField<List<Certificate>>) = apply {
            this.certificates = certificates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Certificate] to [certificates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCertificate(certificate: Certificate) = apply {
            certificates =
                (certificates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("certificates", it).add(certificate)
                }
        }

        /** Information about the DNS lookup performed */
        fun dnsInfo(dnsInfo: DnsInfo) = dnsInfo(JsonField.of(dnsInfo))

        /**
         * Sets [Builder.dnsInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsInfo] with a well-typed [DnsInfo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dnsInfo(dnsInfo: JsonField<DnsInfo>) = apply { this.dnsInfo = dnsInfo }

        /** List of error messages if any errors occurred during the lookup */
        fun errors(errors: List<String>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<String>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: String) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** Total execution time of the lookup operation in milliseconds */
        fun executionTimeMs(executionTimeMs: Double) =
            executionTimeMs(JsonField.of(executionTimeMs))

        /**
         * Sets [Builder.executionTimeMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionTimeMs] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executionTimeMs(executionTimeMs: JsonField<Double>) = apply {
            this.executionTimeMs = executionTimeMs
        }

        /** Metadata about the query that was performed */
        fun queryMetadata(queryMetadata: QueryMetadata) = queryMetadata(JsonField.of(queryMetadata))

        /**
         * Sets [Builder.queryMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryMetadata] with a well-typed [QueryMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun queryMetadata(queryMetadata: JsonField<QueryMetadata>) = apply {
            this.queryMetadata = queryMetadata
        }

        /** Service metadata information for the Peppol participant */
        fun serviceMetadata(serviceMetadata: ServiceMetadata) =
            serviceMetadata(JsonField.of(serviceMetadata))

        /**
         * Sets [Builder.serviceMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceMetadata] with a well-typed [ServiceMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun serviceMetadata(serviceMetadata: JsonField<ServiceMetadata>) = apply {
            this.serviceMetadata = serviceMetadata
        }

        /** Overall status of the lookup: 'success' or 'error' */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [LookupRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessCard()
         * .certificates()
         * .dnsInfo()
         * .errors()
         * .executionTimeMs()
         * .queryMetadata()
         * .serviceMetadata()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupRetrieveResponse =
            LookupRetrieveResponse(
                checkRequired("businessCard", businessCard),
                checkRequired("certificates", certificates).map { it.toImmutable() },
                checkRequired("dnsInfo", dnsInfo),
                checkRequired("errors", errors).map { it.toImmutable() },
                checkRequired("executionTimeMs", executionTimeMs),
                checkRequired("queryMetadata", queryMetadata),
                checkRequired("serviceMetadata", serviceMetadata),
                checkRequired("status", status),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LookupRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        businessCard().validate()
        certificates().forEach { it.validate() }
        dnsInfo().validate()
        errors()
        executionTimeMs()
        queryMetadata().validate()
        serviceMetadata().validate()
        status()
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
            (certificates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (dnsInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (errors.asKnown().getOrNull()?.size ?: 0) +
            (if (executionTimeMs.asKnown().isPresent) 1 else 0) +
            (queryMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (serviceMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** Business card information for the Peppol participant */
    class BusinessCard
    private constructor(
        private val entities: JsonField<List<Entity>>,
        private val queryTimeMs: JsonField<Double>,
        private val status: JsonField<String>,
        private val error: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entities")
            @ExcludeMissing
            entities: JsonField<List<Entity>> = JsonMissing.of(),
            @JsonProperty("queryTimeMs")
            @ExcludeMissing
            queryTimeMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        ) : this(entities, queryTimeMs, status, error, mutableMapOf())

        /**
         * List of business entities associated with the Peppol ID
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entities(): List<Entity> = entities.getRequired("entities")

        /**
         * Time taken to query the business card in milliseconds
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun queryTimeMs(): Double = queryTimeMs.getRequired("queryTimeMs")

        /**
         * Status of the business card lookup: 'success', 'error', or 'pending'
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Error message if business card lookup failed
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Returns the raw JSON value of [entities].
         *
         * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entities")
        @ExcludeMissing
        fun _entities(): JsonField<List<Entity>> = entities

        /**
         * Returns the raw JSON value of [queryTimeMs].
         *
         * Unlike [queryTimeMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queryTimeMs")
        @ExcludeMissing
        fun _queryTimeMs(): JsonField<Double> = queryTimeMs

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
             * Returns a mutable builder for constructing an instance of [BusinessCard].
             *
             * The following fields are required:
             * ```java
             * .entities()
             * .queryTimeMs()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BusinessCard]. */
        class Builder internal constructor() {

            private var entities: JsonField<MutableList<Entity>>? = null
            private var queryTimeMs: JsonField<Double>? = null
            private var status: JsonField<String>? = null
            private var error: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(businessCard: BusinessCard) = apply {
                entities = businessCard.entities.map { it.toMutableList() }
                queryTimeMs = businessCard.queryTimeMs
                status = businessCard.status
                error = businessCard.error
                additionalProperties = businessCard.additionalProperties.toMutableMap()
            }

            /** List of business entities associated with the Peppol ID */
            fun entities(entities: List<Entity>) = entities(JsonField.of(entities))

            /**
             * Sets [Builder.entities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entities] with a well-typed `List<Entity>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entities(entities: JsonField<List<Entity>>) = apply {
                this.entities = entities.map { it.toMutableList() }
            }

            /**
             * Adds a single [Entity] to [entities].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntity(entity: Entity) = apply {
                entities =
                    (entities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entities", it).add(entity)
                    }
            }

            /** Time taken to query the business card in milliseconds */
            fun queryTimeMs(queryTimeMs: Double) = queryTimeMs(JsonField.of(queryTimeMs))

            /**
             * Sets [Builder.queryTimeMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queryTimeMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queryTimeMs(queryTimeMs: JsonField<Double>) = apply {
                this.queryTimeMs = queryTimeMs
            }

            /** Status of the business card lookup: 'success', 'error', or 'pending' */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Error message if business card lookup failed */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

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
             *
             * The following fields are required:
             * ```java
             * .entities()
             * .queryTimeMs()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BusinessCard =
                BusinessCard(
                    checkRequired("entities", entities).map { it.toImmutable() },
                    checkRequired("queryTimeMs", queryTimeMs),
                    checkRequired("status", status),
                    error,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BusinessCard = apply {
            if (validated) {
                return@apply
            }

            entities().forEach { it.validate() }
            queryTimeMs()
            status()
            error()
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
            (entities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (queryTimeMs.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0)

        /** Business entity information in the Peppol network. */
        class Entity
        private constructor(
            private val additionalInformation: JsonField<List<String>>,
            private val countryCode: JsonField<String>,
            private val name: JsonField<String>,
            private val registrationDate: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("additionalInformation")
                @ExcludeMissing
                additionalInformation: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("countryCode")
                @ExcludeMissing
                countryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("registrationDate")
                @ExcludeMissing
                registrationDate: JsonField<String> = JsonMissing.of(),
            ) : this(additionalInformation, countryCode, name, registrationDate, mutableMapOf())

            /**
             * Additional information about the business entity
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun additionalInformation(): Optional<List<String>> =
                additionalInformation.getOptional("additionalInformation")

            /**
             * ISO 3166-1 alpha-2 country code of the business entity
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

            /**
             * Name of the business entity
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * ISO 8601 date of when the entity was registered in Peppol
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun registrationDate(): Optional<String> =
                registrationDate.getOptional("registrationDate")

            /**
             * Returns the raw JSON value of [additionalInformation].
             *
             * Unlike [additionalInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("additionalInformation")
            @ExcludeMissing
            fun _additionalInformation(): JsonField<List<String>> = additionalInformation

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("countryCode")
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
             * Unlike [registrationDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("registrationDate")
            @ExcludeMissing
            fun _registrationDate(): JsonField<String> = registrationDate

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

                /** Returns a mutable builder for constructing an instance of [Entity]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entity]. */
            class Builder internal constructor() {

                private var additionalInformation: JsonField<MutableList<String>>? = null
                private var countryCode: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var registrationDate: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entity: Entity) = apply {
                    additionalInformation = entity.additionalInformation.map { it.toMutableList() }
                    countryCode = entity.countryCode
                    name = entity.name
                    registrationDate = entity.registrationDate
                    additionalProperties = entity.additionalProperties.toMutableMap()
                }

                /** Additional information about the business entity */
                fun additionalInformation(additionalInformation: List<String>?) =
                    additionalInformation(JsonField.ofNullable(additionalInformation))

                /**
                 * Alias for calling [Builder.additionalInformation] with
                 * `additionalInformation.orElse(null)`.
                 */
                fun additionalInformation(additionalInformation: Optional<List<String>>) =
                    additionalInformation(additionalInformation.getOrNull())

                /**
                 * Sets [Builder.additionalInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.additionalInformation] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun additionalInformation(additionalInformation: JsonField<List<String>>) = apply {
                    this.additionalInformation = additionalInformation.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.additionalInformation].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAdditionalInformation(additionalInformation: String) = apply {
                    this.additionalInformation =
                        (this.additionalInformation ?: JsonField.of(mutableListOf())).also {
                            checkKnown("additionalInformation", it).add(additionalInformation)
                        }
                }

                /** ISO 3166-1 alpha-2 country code of the business entity */
                fun countryCode(countryCode: String?) =
                    countryCode(JsonField.ofNullable(countryCode))

                /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
                fun countryCode(countryCode: Optional<String>) =
                    countryCode(countryCode.getOrNull())

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<String>) = apply {
                    this.countryCode = countryCode
                }

                /** Name of the business entity */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** ISO 8601 date of when the entity was registered in Peppol */
                fun registrationDate(registrationDate: String?) =
                    registrationDate(JsonField.ofNullable(registrationDate))

                /**
                 * Alias for calling [Builder.registrationDate] with
                 * `registrationDate.orElse(null)`.
                 */
                fun registrationDate(registrationDate: Optional<String>) =
                    registrationDate(registrationDate.getOrNull())

                /**
                 * Sets [Builder.registrationDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.registrationDate] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun registrationDate(registrationDate: JsonField<String>) = apply {
                    this.registrationDate = registrationDate
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Entity].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Entity =
                    Entity(
                        (additionalInformation ?: JsonMissing.of()).map { it.toImmutable() },
                        countryCode,
                        name,
                        registrationDate,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entity = apply {
                if (validated) {
                    return@apply
                }

                additionalInformation()
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
                (additionalInformation.asKnown().getOrNull()?.size ?: 0) +
                    (if (countryCode.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (registrationDate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entity && additionalInformation == other.additionalInformation && countryCode == other.countryCode && name == other.name && registrationDate == other.registrationDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalInformation, countryCode, name, registrationDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entity{additionalInformation=$additionalInformation, countryCode=$countryCode, name=$name, registrationDate=$registrationDate, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BusinessCard && entities == other.entities && queryTimeMs == other.queryTimeMs && status == other.status && error == other.error && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entities, queryTimeMs, status, error, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BusinessCard{entities=$entities, queryTimeMs=$queryTimeMs, status=$status, error=$error, additionalProperties=$additionalProperties}"
    }

    /** Information about the DNS lookup performed */
    class DnsInfo
    private constructor(
        private val dnsRecords: JsonField<List<DnsRecord>>,
        private val smlHostname: JsonField<String>,
        private val status: JsonField<String>,
        private val error: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dnsRecords")
            @ExcludeMissing
            dnsRecords: JsonField<List<DnsRecord>> = JsonMissing.of(),
            @JsonProperty("smlHostname")
            @ExcludeMissing
            smlHostname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        ) : this(dnsRecords, smlHostname, status, error, mutableMapOf())

        /**
         * List of DNS records found for the Peppol participant
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dnsRecords(): List<DnsRecord> = dnsRecords.getRequired("dnsRecords")

        /**
         * Hostname of the SML used for the query
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun smlHostname(): String = smlHostname.getRequired("smlHostname")

        /**
         * Status of the DNS lookup: 'success', 'error', or 'pending'
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Error message if the DNS lookup failed
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Returns the raw JSON value of [dnsRecords].
         *
         * Unlike [dnsRecords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dnsRecords")
        @ExcludeMissing
        fun _dnsRecords(): JsonField<List<DnsRecord>> = dnsRecords

        /**
         * Returns the raw JSON value of [smlHostname].
         *
         * Unlike [smlHostname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smlHostname")
        @ExcludeMissing
        fun _smlHostname(): JsonField<String> = smlHostname

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
             * Returns a mutable builder for constructing an instance of [DnsInfo].
             *
             * The following fields are required:
             * ```java
             * .dnsRecords()
             * .smlHostname()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DnsInfo]. */
        class Builder internal constructor() {

            private var dnsRecords: JsonField<MutableList<DnsRecord>>? = null
            private var smlHostname: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var error: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dnsInfo: DnsInfo) = apply {
                dnsRecords = dnsInfo.dnsRecords.map { it.toMutableList() }
                smlHostname = dnsInfo.smlHostname
                status = dnsInfo.status
                error = dnsInfo.error
                additionalProperties = dnsInfo.additionalProperties.toMutableMap()
            }

            /** List of DNS records found for the Peppol participant */
            fun dnsRecords(dnsRecords: List<DnsRecord>) = dnsRecords(JsonField.of(dnsRecords))

            /**
             * Sets [Builder.dnsRecords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnsRecords] with a well-typed `List<DnsRecord>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dnsRecords(dnsRecords: JsonField<List<DnsRecord>>) = apply {
                this.dnsRecords = dnsRecords.map { it.toMutableList() }
            }

            /**
             * Adds a single [DnsRecord] to [dnsRecords].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDnsRecord(dnsRecord: DnsRecord) = apply {
                dnsRecords =
                    (dnsRecords ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dnsRecords", it).add(dnsRecord)
                    }
            }

            /** Hostname of the SML used for the query */
            fun smlHostname(smlHostname: String) = smlHostname(JsonField.of(smlHostname))

            /**
             * Sets [Builder.smlHostname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smlHostname] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun smlHostname(smlHostname: JsonField<String>) = apply {
                this.smlHostname = smlHostname
            }

            /** Status of the DNS lookup: 'success', 'error', or 'pending' */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Error message if the DNS lookup failed */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

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
             * Returns an immutable instance of [DnsInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dnsRecords()
             * .smlHostname()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DnsInfo =
                DnsInfo(
                    checkRequired("dnsRecords", dnsRecords).map { it.toImmutable() },
                    checkRequired("smlHostname", smlHostname),
                    checkRequired("status", status),
                    error,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DnsInfo = apply {
            if (validated) {
                return@apply
            }

            dnsRecords().forEach { it.validate() }
            smlHostname()
            status()
            error()
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
            (dnsRecords.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (smlHostname.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0)

        /** DNS record information for a Peppol participant. */
        class DnsRecord
        private constructor(
            private val ip: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of()
            ) : this(ip, mutableMapOf())

            /**
             * IP address found in the DNS record
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ip(): String = ip.getRequired("ip")

            /**
             * Returns the raw JSON value of [ip].
             *
             * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

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
                 * Returns a mutable builder for constructing an instance of [DnsRecord].
                 *
                 * The following fields are required:
                 * ```java
                 * .ip()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DnsRecord]. */
            class Builder internal constructor() {

                private var ip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dnsRecord: DnsRecord) = apply {
                    ip = dnsRecord.ip
                    additionalProperties = dnsRecord.additionalProperties.toMutableMap()
                }

                /** IP address found in the DNS record */
                fun ip(ip: String) = ip(JsonField.of(ip))

                /**
                 * Sets [Builder.ip] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ip] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ip(ip: JsonField<String>) = apply { this.ip = ip }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DnsRecord].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .ip()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DnsRecord =
                    DnsRecord(checkRequired("ip", ip), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): DnsRecord = apply {
                if (validated) {
                    return@apply
                }

                ip()
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
            @JvmSynthetic internal fun validity(): Int = (if (ip.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DnsRecord && ip == other.ip && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(ip, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DnsRecord{ip=$ip, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DnsInfo && dnsRecords == other.dnsRecords && smlHostname == other.smlHostname && status == other.status && error == other.error && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dnsRecords, smlHostname, status, error, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DnsInfo{dnsRecords=$dnsRecords, smlHostname=$smlHostname, status=$status, error=$error, additionalProperties=$additionalProperties}"
    }

    /** Metadata about the query that was performed */
    class QueryMetadata
    private constructor(
        private val identifierScheme: JsonField<String>,
        private val identifierValue: JsonField<String>,
        private val smlDomain: JsonField<String>,
        private val timestamp: JsonField<String>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("identifierScheme")
            @ExcludeMissing
            identifierScheme: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identifierValue")
            @ExcludeMissing
            identifierValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("smlDomain")
            @ExcludeMissing
            smlDomain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(identifierScheme, identifierValue, smlDomain, timestamp, version, mutableMapOf())

        /**
         * Scheme of the identifier, typically 'iso6523-actorid-upis'
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun identifierScheme(): String = identifierScheme.getRequired("identifierScheme")

        /**
         * The actual Peppol ID value being queried
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun identifierValue(): String = identifierValue.getRequired("identifierValue")

        /**
         * Domain of the SML (Service Metadata Locator) used for the lookup
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun smlDomain(): String = smlDomain.getRequired("smlDomain")

        /**
         * ISO 8601 timestamp of when the query was executed
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): String = timestamp.getRequired("timestamp")

        /**
         * Version of the API used for the lookup
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): String = version.getRequired("version")

        /**
         * Returns the raw JSON value of [identifierScheme].
         *
         * Unlike [identifierScheme], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("identifierScheme")
        @ExcludeMissing
        fun _identifierScheme(): JsonField<String> = identifierScheme

        /**
         * Returns the raw JSON value of [identifierValue].
         *
         * Unlike [identifierValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("identifierValue")
        @ExcludeMissing
        fun _identifierValue(): JsonField<String> = identifierValue

        /**
         * Returns the raw JSON value of [smlDomain].
         *
         * Unlike [smlDomain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smlDomain") @ExcludeMissing fun _smlDomain(): JsonField<String> = smlDomain

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
             * Returns a mutable builder for constructing an instance of [QueryMetadata].
             *
             * The following fields are required:
             * ```java
             * .identifierScheme()
             * .identifierValue()
             * .smlDomain()
             * .timestamp()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [QueryMetadata]. */
        class Builder internal constructor() {

            private var identifierScheme: JsonField<String>? = null
            private var identifierValue: JsonField<String>? = null
            private var smlDomain: JsonField<String>? = null
            private var timestamp: JsonField<String>? = null
            private var version: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(queryMetadata: QueryMetadata) = apply {
                identifierScheme = queryMetadata.identifierScheme
                identifierValue = queryMetadata.identifierValue
                smlDomain = queryMetadata.smlDomain
                timestamp = queryMetadata.timestamp
                version = queryMetadata.version
                additionalProperties = queryMetadata.additionalProperties.toMutableMap()
            }

            /** Scheme of the identifier, typically 'iso6523-actorid-upis' */
            fun identifierScheme(identifierScheme: String) =
                identifierScheme(JsonField.of(identifierScheme))

            /**
             * Sets [Builder.identifierScheme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifierScheme] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifierScheme(identifierScheme: JsonField<String>) = apply {
                this.identifierScheme = identifierScheme
            }

            /** The actual Peppol ID value being queried */
            fun identifierValue(identifierValue: String) =
                identifierValue(JsonField.of(identifierValue))

            /**
             * Sets [Builder.identifierValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifierValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifierValue(identifierValue: JsonField<String>) = apply {
                this.identifierValue = identifierValue
            }

            /** Domain of the SML (Service Metadata Locator) used for the lookup */
            fun smlDomain(smlDomain: String) = smlDomain(JsonField.of(smlDomain))

            /**
             * Sets [Builder.smlDomain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smlDomain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun smlDomain(smlDomain: JsonField<String>) = apply { this.smlDomain = smlDomain }

            /** ISO 8601 timestamp of when the query was executed */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

            /** Version of the API used for the lookup */
            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [QueryMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .identifierScheme()
             * .identifierValue()
             * .smlDomain()
             * .timestamp()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): QueryMetadata =
                QueryMetadata(
                    checkRequired("identifierScheme", identifierScheme),
                    checkRequired("identifierValue", identifierValue),
                    checkRequired("smlDomain", smlDomain),
                    checkRequired("timestamp", timestamp),
                    checkRequired("version", version),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): QueryMetadata = apply {
            if (validated) {
                return@apply
            }

            identifierScheme()
            identifierValue()
            smlDomain()
            timestamp()
            version()
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
            (if (identifierScheme.asKnown().isPresent) 1 else 0) +
                (if (identifierValue.asKnown().isPresent) 1 else 0) +
                (if (smlDomain.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is QueryMetadata && identifierScheme == other.identifierScheme && identifierValue == other.identifierValue && smlDomain == other.smlDomain && timestamp == other.timestamp && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(identifierScheme, identifierValue, smlDomain, timestamp, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "QueryMetadata{identifierScheme=$identifierScheme, identifierValue=$identifierValue, smlDomain=$smlDomain, timestamp=$timestamp, version=$version, additionalProperties=$additionalProperties}"
    }

    /** Service metadata information for the Peppol participant */
    class ServiceMetadata
    private constructor(
        private val endpoints: JsonField<List<Endpoint>>,
        private val queryTimeMs: JsonField<Double>,
        private val status: JsonField<String>,
        private val error: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("endpoints")
            @ExcludeMissing
            endpoints: JsonField<List<Endpoint>> = JsonMissing.of(),
            @JsonProperty("queryTimeMs")
            @ExcludeMissing
            queryTimeMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        ) : this(endpoints, queryTimeMs, status, error, mutableMapOf())

        /**
         * List of endpoints found for the Peppol participant
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endpoints(): List<Endpoint> = endpoints.getRequired("endpoints")

        /**
         * Time taken to query the service metadata in milliseconds
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun queryTimeMs(): Double = queryTimeMs.getRequired("queryTimeMs")

        /**
         * Status of the service metadata lookup: 'success', 'error', or 'pending'
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Error message if service metadata lookup failed
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Returns the raw JSON value of [endpoints].
         *
         * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoints")
        @ExcludeMissing
        fun _endpoints(): JsonField<List<Endpoint>> = endpoints

        /**
         * Returns the raw JSON value of [queryTimeMs].
         *
         * Unlike [queryTimeMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queryTimeMs")
        @ExcludeMissing
        fun _queryTimeMs(): JsonField<Double> = queryTimeMs

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
             * Returns a mutable builder for constructing an instance of [ServiceMetadata].
             *
             * The following fields are required:
             * ```java
             * .endpoints()
             * .queryTimeMs()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ServiceMetadata]. */
        class Builder internal constructor() {

            private var endpoints: JsonField<MutableList<Endpoint>>? = null
            private var queryTimeMs: JsonField<Double>? = null
            private var status: JsonField<String>? = null
            private var error: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(serviceMetadata: ServiceMetadata) = apply {
                endpoints = serviceMetadata.endpoints.map { it.toMutableList() }
                queryTimeMs = serviceMetadata.queryTimeMs
                status = serviceMetadata.status
                error = serviceMetadata.error
                additionalProperties = serviceMetadata.additionalProperties.toMutableMap()
            }

            /** List of endpoints found for the Peppol participant */
            fun endpoints(endpoints: List<Endpoint>) = endpoints(JsonField.of(endpoints))

            /**
             * Sets [Builder.endpoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpoints] with a well-typed `List<Endpoint>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpoints(endpoints: JsonField<List<Endpoint>>) = apply {
                this.endpoints = endpoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [Endpoint] to [endpoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEndpoint(endpoint: Endpoint) = apply {
                endpoints =
                    (endpoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("endpoints", it).add(endpoint)
                    }
            }

            /** Time taken to query the service metadata in milliseconds */
            fun queryTimeMs(queryTimeMs: Double) = queryTimeMs(JsonField.of(queryTimeMs))

            /**
             * Sets [Builder.queryTimeMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queryTimeMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queryTimeMs(queryTimeMs: JsonField<Double>) = apply {
                this.queryTimeMs = queryTimeMs
            }

            /** Status of the service metadata lookup: 'success', 'error', or 'pending' */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Error message if service metadata lookup failed */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

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
             * Returns an immutable instance of [ServiceMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endpoints()
             * .queryTimeMs()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ServiceMetadata =
                ServiceMetadata(
                    checkRequired("endpoints", endpoints).map { it.toImmutable() },
                    checkRequired("queryTimeMs", queryTimeMs),
                    checkRequired("status", status),
                    error,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ServiceMetadata = apply {
            if (validated) {
                return@apply
            }

            endpoints().forEach { it.validate() }
            queryTimeMs()
            status()
            error()
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
            (endpoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (queryTimeMs.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0)

        /** Information about a Peppol participant's endpoint. */
        class Endpoint
        private constructor(
            private val documentTypes: JsonField<List<DocumentType>>,
            private val status: JsonField<String>,
            private val url: JsonField<String>,
            private val error: JsonField<String>,
            private val processes: JsonField<List<Process>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("documentTypes")
                @ExcludeMissing
                documentTypes: JsonField<List<DocumentType>> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
                @JsonProperty("processes")
                @ExcludeMissing
                processes: JsonField<List<Process>> = JsonMissing.of(),
            ) : this(documentTypes, status, url, error, processes, mutableMapOf())

            /**
             * List of document types supported by this endpoint
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentTypes(): List<DocumentType> = documentTypes.getRequired("documentTypes")

            /**
             * Status of the endpoint lookup: 'success', 'error', or 'pending'
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): String = status.getRequired("status")

            /**
             * URL of the endpoint
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Error message if endpoint lookup failed
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun error(): Optional<String> = error.getOptional("error")

            /**
             * List of processes supported by this endpoint
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun processes(): Optional<List<Process>> = processes.getOptional("processes")

            /**
             * Returns the raw JSON value of [documentTypes].
             *
             * Unlike [documentTypes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("documentTypes")
            @ExcludeMissing
            fun _documentTypes(): JsonField<List<DocumentType>> = documentTypes

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

            /**
             * Returns the raw JSON value of [processes].
             *
             * Unlike [processes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("processes")
            @ExcludeMissing
            fun _processes(): JsonField<List<Process>> = processes

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
                 * Returns a mutable builder for constructing an instance of [Endpoint].
                 *
                 * The following fields are required:
                 * ```java
                 * .documentTypes()
                 * .status()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Endpoint]. */
            class Builder internal constructor() {

                private var documentTypes: JsonField<MutableList<DocumentType>>? = null
                private var status: JsonField<String>? = null
                private var url: JsonField<String>? = null
                private var error: JsonField<String> = JsonMissing.of()
                private var processes: JsonField<MutableList<Process>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(endpoint: Endpoint) = apply {
                    documentTypes = endpoint.documentTypes.map { it.toMutableList() }
                    status = endpoint.status
                    url = endpoint.url
                    error = endpoint.error
                    processes = endpoint.processes.map { it.toMutableList() }
                    additionalProperties = endpoint.additionalProperties.toMutableMap()
                }

                /** List of document types supported by this endpoint */
                fun documentTypes(documentTypes: List<DocumentType>) =
                    documentTypes(JsonField.of(documentTypes))

                /**
                 * Sets [Builder.documentTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentTypes] with a well-typed
                 * `List<DocumentType>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun documentTypes(documentTypes: JsonField<List<DocumentType>>) = apply {
                    this.documentTypes = documentTypes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [DocumentType] to [documentTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDocumentType(documentType: DocumentType) = apply {
                    documentTypes =
                        (documentTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("documentTypes", it).add(documentType)
                        }
                }

                /** Status of the endpoint lookup: 'success', 'error', or 'pending' */
                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

                /** URL of the endpoint */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Error message if endpoint lookup failed */
                fun error(error: String?) = error(JsonField.ofNullable(error))

                /** Alias for calling [Builder.error] with `error.orElse(null)`. */
                fun error(error: Optional<String>) = error(error.getOrNull())

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<String>) = apply { this.error = error }

                /** List of processes supported by this endpoint */
                fun processes(processes: List<Process>?) =
                    processes(JsonField.ofNullable(processes))

                /** Alias for calling [Builder.processes] with `processes.orElse(null)`. */
                fun processes(processes: Optional<List<Process>>) = processes(processes.getOrNull())

                /**
                 * Sets [Builder.processes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processes] with a well-typed `List<Process>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun processes(processes: JsonField<List<Process>>) = apply {
                    this.processes = processes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Process] to [processes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProcess(process: Process) = apply {
                    processes =
                        (processes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("processes", it).add(process)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Endpoint].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .documentTypes()
                 * .status()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Endpoint =
                    Endpoint(
                        checkRequired("documentTypes", documentTypes).map { it.toImmutable() },
                        checkRequired("status", status),
                        checkRequired("url", url),
                        error,
                        (processes ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Endpoint = apply {
                if (validated) {
                    return@apply
                }

                documentTypes().forEach { it.validate() }
                status()
                url()
                error()
                processes().ifPresent { it.forEach { it.validate() } }
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
                (documentTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (status.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (if (error.asKnown().isPresent) 1 else 0) +
                    (processes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** Document type supported by a Peppol participant. */
            class DocumentType
            private constructor(
                private val scheme: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("scheme")
                    @ExcludeMissing
                    scheme: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(scheme, value, mutableMapOf())

                /**
                 * Scheme of the document type identifier
                 *
                 * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun scheme(): String = scheme.getRequired("scheme")

                /**
                 * Value of the document type identifier
                 *
                 * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [scheme].
                 *
                 * Unlike [scheme], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scheme") @ExcludeMissing fun _scheme(): JsonField<String> = scheme

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [DocumentType].
                     *
                     * The following fields are required:
                     * ```java
                     * .scheme()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DocumentType]. */
                class Builder internal constructor() {

                    private var scheme: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(documentType: DocumentType) = apply {
                        scheme = documentType.scheme
                        value = documentType.value
                        additionalProperties = documentType.additionalProperties.toMutableMap()
                    }

                    /** Scheme of the document type identifier */
                    fun scheme(scheme: String) = scheme(JsonField.of(scheme))

                    /**
                     * Sets [Builder.scheme] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scheme] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun scheme(scheme: JsonField<String>) = apply { this.scheme = scheme }

                    /** Value of the document type identifier */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [DocumentType].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .scheme()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DocumentType =
                        DocumentType(
                            checkRequired("scheme", scheme),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DocumentType = apply {
                    if (validated) {
                        return@apply
                    }

                    scheme()
                    value()
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
                    (if (scheme.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DocumentType && scheme == other.scheme && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(scheme, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DocumentType{scheme=$scheme, value=$value, additionalProperties=$additionalProperties}"
            }

            /** Process information in the Peppol network. */
            class Process
            private constructor(
                private val endpoints: JsonField<List<InnerEndpoint>>,
                private val processId: JsonField<ProcessId>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("endpoints")
                    @ExcludeMissing
                    endpoints: JsonField<List<InnerEndpoint>> = JsonMissing.of(),
                    @JsonProperty("processId")
                    @ExcludeMissing
                    processId: JsonField<ProcessId> = JsonMissing.of(),
                ) : this(endpoints, processId, mutableMapOf())

                /**
                 * List of endpoints supporting this process
                 *
                 * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun endpoints(): List<InnerEndpoint> = endpoints.getRequired("endpoints")

                /**
                 * Identifier of the process
                 *
                 * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun processId(): ProcessId = processId.getRequired("processId")

                /**
                 * Returns the raw JSON value of [endpoints].
                 *
                 * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endpoints")
                @ExcludeMissing
                fun _endpoints(): JsonField<List<InnerEndpoint>> = endpoints

                /**
                 * Returns the raw JSON value of [processId].
                 *
                 * Unlike [processId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("processId")
                @ExcludeMissing
                fun _processId(): JsonField<ProcessId> = processId

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
                     * Returns a mutable builder for constructing an instance of [Process].
                     *
                     * The following fields are required:
                     * ```java
                     * .endpoints()
                     * .processId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Process]. */
                class Builder internal constructor() {

                    private var endpoints: JsonField<MutableList<InnerEndpoint>>? = null
                    private var processId: JsonField<ProcessId>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(process: Process) = apply {
                        endpoints = process.endpoints.map { it.toMutableList() }
                        processId = process.processId
                        additionalProperties = process.additionalProperties.toMutableMap()
                    }

                    /** List of endpoints supporting this process */
                    fun endpoints(endpoints: List<InnerEndpoint>) =
                        endpoints(JsonField.of(endpoints))

                    /**
                     * Sets [Builder.endpoints] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpoints] with a well-typed
                     * `List<InnerEndpoint>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endpoints(endpoints: JsonField<List<InnerEndpoint>>) = apply {
                        this.endpoints = endpoints.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [InnerEndpoint] to [endpoints].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addEndpoint(endpoint: InnerEndpoint) = apply {
                        endpoints =
                            (endpoints ?: JsonField.of(mutableListOf())).also {
                                checkKnown("endpoints", it).add(endpoint)
                            }
                    }

                    /** Identifier of the process */
                    fun processId(processId: ProcessId) = processId(JsonField.of(processId))

                    /**
                     * Sets [Builder.processId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.processId] with a well-typed [ProcessId]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun processId(processId: JsonField<ProcessId>) = apply {
                        this.processId = processId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Process].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .endpoints()
                     * .processId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Process =
                        Process(
                            checkRequired("endpoints", endpoints).map { it.toImmutable() },
                            checkRequired("processId", processId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Process = apply {
                    if (validated) {
                        return@apply
                    }

                    endpoints().forEach { it.validate() }
                    processId().validate()
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
                    (endpoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (processId.asKnown().getOrNull()?.validity() ?: 0)

                /** Endpoint information for a specific Peppol process. */
                class InnerEndpoint
                private constructor(
                    private val address: JsonField<String>,
                    private val transportProfile: JsonField<String>,
                    private val certificate: JsonField<Certificate>,
                    private val serviceActivationDate: JsonField<String>,
                    private val serviceDescription: JsonField<String>,
                    private val serviceExpirationDate: JsonField<String>,
                    private val technicalContactUrl: JsonField<String>,
                    private val technicalInformationUrl: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("address")
                        @ExcludeMissing
                        address: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("transportProfile")
                        @ExcludeMissing
                        transportProfile: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("certificate")
                        @ExcludeMissing
                        certificate: JsonField<Certificate> = JsonMissing.of(),
                        @JsonProperty("serviceActivationDate")
                        @ExcludeMissing
                        serviceActivationDate: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("serviceDescription")
                        @ExcludeMissing
                        serviceDescription: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("serviceExpirationDate")
                        @ExcludeMissing
                        serviceExpirationDate: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("technicalContactUrl")
                        @ExcludeMissing
                        technicalContactUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("technicalInformationUrl")
                        @ExcludeMissing
                        technicalInformationUrl: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        address,
                        transportProfile,
                        certificate,
                        serviceActivationDate,
                        serviceDescription,
                        serviceExpirationDate,
                        technicalContactUrl,
                        technicalInformationUrl,
                        mutableMapOf(),
                    )

                    /**
                     * URL or address of the endpoint
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun address(): String = address.getRequired("address")

                    /**
                     * Transport profile used by this endpoint
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun transportProfile(): String =
                        transportProfile.getRequired("transportProfile")

                    /**
                     * Certificate information for a Peppol endpoint.
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun certificate(): Optional<Certificate> =
                        certificate.getOptional("certificate")

                    /**
                     * ISO 8601 date when the service was activated
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun serviceActivationDate(): Optional<String> =
                        serviceActivationDate.getOptional("serviceActivationDate")

                    /**
                     * Human-readable description of the service
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun serviceDescription(): Optional<String> =
                        serviceDescription.getOptional("serviceDescription")

                    /**
                     * ISO 8601 date when the service will expire
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun serviceExpirationDate(): Optional<String> =
                        serviceExpirationDate.getOptional("serviceExpirationDate")

                    /**
                     * URL for technical contact information
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun technicalContactUrl(): Optional<String> =
                        technicalContactUrl.getOptional("technicalContactUrl")

                    /**
                     * URL for technical documentation
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun technicalInformationUrl(): Optional<String> =
                        technicalInformationUrl.getOptional("technicalInformationUrl")

                    /**
                     * Returns the raw JSON value of [address].
                     *
                     * Unlike [address], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun _address(): JsonField<String> = address

                    /**
                     * Returns the raw JSON value of [transportProfile].
                     *
                     * Unlike [transportProfile], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("transportProfile")
                    @ExcludeMissing
                    fun _transportProfile(): JsonField<String> = transportProfile

                    /**
                     * Returns the raw JSON value of [certificate].
                     *
                     * Unlike [certificate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("certificate")
                    @ExcludeMissing
                    fun _certificate(): JsonField<Certificate> = certificate

                    /**
                     * Returns the raw JSON value of [serviceActivationDate].
                     *
                     * Unlike [serviceActivationDate], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("serviceActivationDate")
                    @ExcludeMissing
                    fun _serviceActivationDate(): JsonField<String> = serviceActivationDate

                    /**
                     * Returns the raw JSON value of [serviceDescription].
                     *
                     * Unlike [serviceDescription], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("serviceDescription")
                    @ExcludeMissing
                    fun _serviceDescription(): JsonField<String> = serviceDescription

                    /**
                     * Returns the raw JSON value of [serviceExpirationDate].
                     *
                     * Unlike [serviceExpirationDate], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("serviceExpirationDate")
                    @ExcludeMissing
                    fun _serviceExpirationDate(): JsonField<String> = serviceExpirationDate

                    /**
                     * Returns the raw JSON value of [technicalContactUrl].
                     *
                     * Unlike [technicalContactUrl], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("technicalContactUrl")
                    @ExcludeMissing
                    fun _technicalContactUrl(): JsonField<String> = technicalContactUrl

                    /**
                     * Returns the raw JSON value of [technicalInformationUrl].
                     *
                     * Unlike [technicalInformationUrl], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("technicalInformationUrl")
                    @ExcludeMissing
                    fun _technicalInformationUrl(): JsonField<String> = technicalInformationUrl

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
                         * [InnerEndpoint].
                         *
                         * The following fields are required:
                         * ```java
                         * .address()
                         * .transportProfile()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerEndpoint]. */
                    class Builder internal constructor() {

                        private var address: JsonField<String>? = null
                        private var transportProfile: JsonField<String>? = null
                        private var certificate: JsonField<Certificate> = JsonMissing.of()
                        private var serviceActivationDate: JsonField<String> = JsonMissing.of()
                        private var serviceDescription: JsonField<String> = JsonMissing.of()
                        private var serviceExpirationDate: JsonField<String> = JsonMissing.of()
                        private var technicalContactUrl: JsonField<String> = JsonMissing.of()
                        private var technicalInformationUrl: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerEndpoint: InnerEndpoint) = apply {
                            address = innerEndpoint.address
                            transportProfile = innerEndpoint.transportProfile
                            certificate = innerEndpoint.certificate
                            serviceActivationDate = innerEndpoint.serviceActivationDate
                            serviceDescription = innerEndpoint.serviceDescription
                            serviceExpirationDate = innerEndpoint.serviceExpirationDate
                            technicalContactUrl = innerEndpoint.technicalContactUrl
                            technicalInformationUrl = innerEndpoint.technicalInformationUrl
                            additionalProperties = innerEndpoint.additionalProperties.toMutableMap()
                        }

                        /** URL or address of the endpoint */
                        fun address(address: String) = address(JsonField.of(address))

                        /**
                         * Sets [Builder.address] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address(address: JsonField<String>) = apply { this.address = address }

                        /** Transport profile used by this endpoint */
                        fun transportProfile(transportProfile: String) =
                            transportProfile(JsonField.of(transportProfile))

                        /**
                         * Sets [Builder.transportProfile] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.transportProfile] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun transportProfile(transportProfile: JsonField<String>) = apply {
                            this.transportProfile = transportProfile
                        }

                        /** Certificate information for a Peppol endpoint. */
                        fun certificate(certificate: Certificate?) =
                            certificate(JsonField.ofNullable(certificate))

                        /**
                         * Alias for calling [Builder.certificate] with `certificate.orElse(null)`.
                         */
                        fun certificate(certificate: Optional<Certificate>) =
                            certificate(certificate.getOrNull())

                        /**
                         * Sets [Builder.certificate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.certificate] with a well-typed
                         * [Certificate] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun certificate(certificate: JsonField<Certificate>) = apply {
                            this.certificate = certificate
                        }

                        /** ISO 8601 date when the service was activated */
                        fun serviceActivationDate(serviceActivationDate: String?) =
                            serviceActivationDate(JsonField.ofNullable(serviceActivationDate))

                        /**
                         * Alias for calling [Builder.serviceActivationDate] with
                         * `serviceActivationDate.orElse(null)`.
                         */
                        fun serviceActivationDate(serviceActivationDate: Optional<String>) =
                            serviceActivationDate(serviceActivationDate.getOrNull())

                        /**
                         * Sets [Builder.serviceActivationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.serviceActivationDate] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun serviceActivationDate(serviceActivationDate: JsonField<String>) =
                            apply {
                                this.serviceActivationDate = serviceActivationDate
                            }

                        /** Human-readable description of the service */
                        fun serviceDescription(serviceDescription: String?) =
                            serviceDescription(JsonField.ofNullable(serviceDescription))

                        /**
                         * Alias for calling [Builder.serviceDescription] with
                         * `serviceDescription.orElse(null)`.
                         */
                        fun serviceDescription(serviceDescription: Optional<String>) =
                            serviceDescription(serviceDescription.getOrNull())

                        /**
                         * Sets [Builder.serviceDescription] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.serviceDescription] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun serviceDescription(serviceDescription: JsonField<String>) = apply {
                            this.serviceDescription = serviceDescription
                        }

                        /** ISO 8601 date when the service will expire */
                        fun serviceExpirationDate(serviceExpirationDate: String?) =
                            serviceExpirationDate(JsonField.ofNullable(serviceExpirationDate))

                        /**
                         * Alias for calling [Builder.serviceExpirationDate] with
                         * `serviceExpirationDate.orElse(null)`.
                         */
                        fun serviceExpirationDate(serviceExpirationDate: Optional<String>) =
                            serviceExpirationDate(serviceExpirationDate.getOrNull())

                        /**
                         * Sets [Builder.serviceExpirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.serviceExpirationDate] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun serviceExpirationDate(serviceExpirationDate: JsonField<String>) =
                            apply {
                                this.serviceExpirationDate = serviceExpirationDate
                            }

                        /** URL for technical contact information */
                        fun technicalContactUrl(technicalContactUrl: String?) =
                            technicalContactUrl(JsonField.ofNullable(technicalContactUrl))

                        /**
                         * Alias for calling [Builder.technicalContactUrl] with
                         * `technicalContactUrl.orElse(null)`.
                         */
                        fun technicalContactUrl(technicalContactUrl: Optional<String>) =
                            technicalContactUrl(technicalContactUrl.getOrNull())

                        /**
                         * Sets [Builder.technicalContactUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.technicalContactUrl] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun technicalContactUrl(technicalContactUrl: JsonField<String>) = apply {
                            this.technicalContactUrl = technicalContactUrl
                        }

                        /** URL for technical documentation */
                        fun technicalInformationUrl(technicalInformationUrl: String?) =
                            technicalInformationUrl(JsonField.ofNullable(technicalInformationUrl))

                        /**
                         * Alias for calling [Builder.technicalInformationUrl] with
                         * `technicalInformationUrl.orElse(null)`.
                         */
                        fun technicalInformationUrl(technicalInformationUrl: Optional<String>) =
                            technicalInformationUrl(technicalInformationUrl.getOrNull())

                        /**
                         * Sets [Builder.technicalInformationUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.technicalInformationUrl] with a
                         * well-typed [String] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun technicalInformationUrl(technicalInformationUrl: JsonField<String>) =
                            apply {
                                this.technicalInformationUrl = technicalInformationUrl
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InnerEndpoint].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .address()
                         * .transportProfile()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): InnerEndpoint =
                            InnerEndpoint(
                                checkRequired("address", address),
                                checkRequired("transportProfile", transportProfile),
                                certificate,
                                serviceActivationDate,
                                serviceDescription,
                                serviceExpirationDate,
                                technicalContactUrl,
                                technicalInformationUrl,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): InnerEndpoint = apply {
                        if (validated) {
                            return@apply
                        }

                        address()
                        transportProfile()
                        certificate().ifPresent { it.validate() }
                        serviceActivationDate()
                        serviceDescription()
                        serviceExpirationDate()
                        technicalContactUrl()
                        technicalInformationUrl()
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
                        (if (address.asKnown().isPresent) 1 else 0) +
                            (if (transportProfile.asKnown().isPresent) 1 else 0) +
                            (certificate.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (serviceActivationDate.asKnown().isPresent) 1 else 0) +
                            (if (serviceDescription.asKnown().isPresent) 1 else 0) +
                            (if (serviceExpirationDate.asKnown().isPresent) 1 else 0) +
                            (if (technicalContactUrl.asKnown().isPresent) 1 else 0) +
                            (if (technicalInformationUrl.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InnerEndpoint && address == other.address && transportProfile == other.transportProfile && certificate == other.certificate && serviceActivationDate == other.serviceActivationDate && serviceDescription == other.serviceDescription && serviceExpirationDate == other.serviceExpirationDate && technicalContactUrl == other.technicalContactUrl && technicalInformationUrl == other.technicalInformationUrl && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(address, transportProfile, certificate, serviceActivationDate, serviceDescription, serviceExpirationDate, technicalContactUrl, technicalInformationUrl, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerEndpoint{address=$address, transportProfile=$transportProfile, certificate=$certificate, serviceActivationDate=$serviceActivationDate, serviceDescription=$serviceDescription, serviceExpirationDate=$serviceExpirationDate, technicalContactUrl=$technicalContactUrl, technicalInformationUrl=$technicalInformationUrl, additionalProperties=$additionalProperties}"
                }

                /** Identifier of the process */
                class ProcessId
                private constructor(
                    private val scheme: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("scheme")
                        @ExcludeMissing
                        scheme: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(scheme, value, mutableMapOf())

                    /**
                     * Scheme of the process identifier
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun scheme(): String = scheme.getRequired("scheme")

                    /**
                     * Value of the process identifier
                     *
                     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun value(): String = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [scheme].
                     *
                     * Unlike [scheme], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("scheme")
                    @ExcludeMissing
                    fun _scheme(): JsonField<String> = scheme

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [ProcessId].
                         *
                         * The following fields are required:
                         * ```java
                         * .scheme()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ProcessId]. */
                    class Builder internal constructor() {

                        private var scheme: JsonField<String>? = null
                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(processId: ProcessId) = apply {
                            scheme = processId.scheme
                            value = processId.value
                            additionalProperties = processId.additionalProperties.toMutableMap()
                        }

                        /** Scheme of the process identifier */
                        fun scheme(scheme: String) = scheme(JsonField.of(scheme))

                        /**
                         * Sets [Builder.scheme] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.scheme] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun scheme(scheme: JsonField<String>) = apply { this.scheme = scheme }

                        /** Value of the process identifier */
                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ProcessId].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .scheme()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ProcessId =
                            ProcessId(
                                checkRequired("scheme", scheme),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ProcessId = apply {
                        if (validated) {
                            return@apply
                        }

                        scheme()
                        value()
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
                        (if (scheme.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ProcessId && scheme == other.scheme && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(scheme, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ProcessId{scheme=$scheme, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Process && endpoints == other.endpoints && processId == other.processId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(endpoints, processId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Process{endpoints=$endpoints, processId=$processId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Endpoint && documentTypes == other.documentTypes && status == other.status && url == other.url && error == other.error && processes == other.processes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(documentTypes, status, url, error, processes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Endpoint{documentTypes=$documentTypes, status=$status, url=$url, error=$error, processes=$processes, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ServiceMetadata && endpoints == other.endpoints && queryTimeMs == other.queryTimeMs && status == other.status && error == other.error && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endpoints, queryTimeMs, status, error, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ServiceMetadata{endpoints=$endpoints, queryTimeMs=$queryTimeMs, status=$status, error=$error, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LookupRetrieveResponse && businessCard == other.businessCard && certificates == other.certificates && dnsInfo == other.dnsInfo && errors == other.errors && executionTimeMs == other.executionTimeMs && queryMetadata == other.queryMetadata && serviceMetadata == other.serviceMetadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessCard, certificates, dnsInfo, errors, executionTimeMs, queryMetadata, serviceMetadata, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LookupRetrieveResponse{businessCard=$businessCard, certificates=$certificates, dnsInfo=$dnsInfo, errors=$errors, executionTimeMs=$executionTimeMs, queryMetadata=$queryMetadata, serviceMetadata=$serviceMetadata, status=$status, additionalProperties=$additionalProperties}"
}
