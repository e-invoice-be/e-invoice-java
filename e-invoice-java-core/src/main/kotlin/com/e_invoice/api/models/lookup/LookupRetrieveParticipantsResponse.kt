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

/** Represents the result of a Peppol directory search */
class LookupRetrieveParticipantsResponse
private constructor(
    private val queryTerms: JsonField<String>,
    private val searchDate: JsonField<String>,
    private val totalCount: JsonField<Long>,
    private val usedCount: JsonField<Long>,
    private val participants: JsonField<List<Participant>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("query_terms")
        @ExcludeMissing
        queryTerms: JsonField<String> = JsonMissing.of(),
        @JsonProperty("search_date")
        @ExcludeMissing
        searchDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("used_count") @ExcludeMissing usedCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<List<Participant>> = JsonMissing.of(),
    ) : this(queryTerms, searchDate, totalCount, usedCount, participants, mutableMapOf())

    /**
     * Query terms used for search
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queryTerms(): String = queryTerms.getRequired("query_terms")

    /**
     * Search date of the result
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchDate(): String = searchDate.getRequired("search_date")

    /**
     * Total number of results
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCount(): Long = totalCount.getRequired("total_count")

    /**
     * Number of results returned by the API
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usedCount(): Long = usedCount.getRequired("used_count")

    /**
     * List of participants
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<Participant>> = participants.getOptional("participants")

    /**
     * Returns the raw JSON value of [queryTerms].
     *
     * Unlike [queryTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query_terms") @ExcludeMissing fun _queryTerms(): JsonField<String> = queryTerms

    /**
     * Returns the raw JSON value of [searchDate].
     *
     * Unlike [searchDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("search_date") @ExcludeMissing fun _searchDate(): JsonField<String> = searchDate

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    /**
     * Returns the raw JSON value of [usedCount].
     *
     * Unlike [usedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("used_count") @ExcludeMissing fun _usedCount(): JsonField<Long> = usedCount

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<List<Participant>> = participants

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
         * [LookupRetrieveParticipantsResponse].
         *
         * The following fields are required:
         * ```java
         * .queryTerms()
         * .searchDate()
         * .totalCount()
         * .usedCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupRetrieveParticipantsResponse]. */
    class Builder internal constructor() {

        private var queryTerms: JsonField<String>? = null
        private var searchDate: JsonField<String>? = null
        private var totalCount: JsonField<Long>? = null
        private var usedCount: JsonField<Long>? = null
        private var participants: JsonField<MutableList<Participant>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lookupRetrieveParticipantsResponse: LookupRetrieveParticipantsResponse) =
            apply {
                queryTerms = lookupRetrieveParticipantsResponse.queryTerms
                searchDate = lookupRetrieveParticipantsResponse.searchDate
                totalCount = lookupRetrieveParticipantsResponse.totalCount
                usedCount = lookupRetrieveParticipantsResponse.usedCount
                participants =
                    lookupRetrieveParticipantsResponse.participants.map { it.toMutableList() }
                additionalProperties =
                    lookupRetrieveParticipantsResponse.additionalProperties.toMutableMap()
            }

        /** Query terms used for search */
        fun queryTerms(queryTerms: String) = queryTerms(JsonField.of(queryTerms))

        /**
         * Sets [Builder.queryTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryTerms] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun queryTerms(queryTerms: JsonField<String>) = apply { this.queryTerms = queryTerms }

        /** Search date of the result */
        fun searchDate(searchDate: String) = searchDate(JsonField.of(searchDate))

        /**
         * Sets [Builder.searchDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun searchDate(searchDate: JsonField<String>) = apply { this.searchDate = searchDate }

        /** Total number of results */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        /** Number of results returned by the API */
        fun usedCount(usedCount: Long) = usedCount(JsonField.of(usedCount))

        /**
         * Sets [Builder.usedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usedCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usedCount(usedCount: JsonField<Long>) = apply { this.usedCount = usedCount }

        /** List of participants */
        fun participants(participants: List<Participant>) = participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<Participant>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun participants(participants: JsonField<List<Participant>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [Participant] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: Participant) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
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
         * Returns an immutable instance of [LookupRetrieveParticipantsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .queryTerms()
         * .searchDate()
         * .totalCount()
         * .usedCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupRetrieveParticipantsResponse =
            LookupRetrieveParticipantsResponse(
                checkRequired("queryTerms", queryTerms),
                checkRequired("searchDate", searchDate),
                checkRequired("totalCount", totalCount),
                checkRequired("usedCount", usedCount),
                (participants ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LookupRetrieveParticipantsResponse = apply {
        if (validated) {
            return@apply
        }

        queryTerms()
        searchDate()
        totalCount()
        usedCount()
        participants().ifPresent { it.forEach { it.validate() } }
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
        (if (queryTerms.asKnown().isPresent) 1 else 0) +
            (if (searchDate.asKnown().isPresent) 1 else 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (if (usedCount.asKnown().isPresent) 1 else 0) +
            (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Represents a Peppol participant with their details */
    class Participant
    private constructor(
        private val peppolId: JsonField<String>,
        private val peppolScheme: JsonField<String>,
        private val documentTypes: JsonField<List<DocumentType>>,
        private val entities: JsonField<List<Entity>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("peppol_id")
            @ExcludeMissing
            peppolId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("peppol_scheme")
            @ExcludeMissing
            peppolScheme: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_types")
            @ExcludeMissing
            documentTypes: JsonField<List<DocumentType>> = JsonMissing.of(),
            @JsonProperty("entities")
            @ExcludeMissing
            entities: JsonField<List<Entity>> = JsonMissing.of(),
        ) : this(peppolId, peppolScheme, documentTypes, entities, mutableMapOf())

        /**
         * Peppol ID of the participant
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun peppolId(): String = peppolId.getRequired("peppol_id")

        /**
         * Peppol scheme of the participant
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun peppolScheme(): String = peppolScheme.getRequired("peppol_scheme")

        /**
         * List of supported document types
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun documentTypes(): Optional<List<DocumentType>> =
            documentTypes.getOptional("document_types")

        /**
         * List of business entities
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entities(): Optional<List<Entity>> = entities.getOptional("entities")

        /**
         * Returns the raw JSON value of [peppolId].
         *
         * Unlike [peppolId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("peppol_id") @ExcludeMissing fun _peppolId(): JsonField<String> = peppolId

        /**
         * Returns the raw JSON value of [peppolScheme].
         *
         * Unlike [peppolScheme], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("peppol_scheme")
        @ExcludeMissing
        fun _peppolScheme(): JsonField<String> = peppolScheme

        /**
         * Returns the raw JSON value of [documentTypes].
         *
         * Unlike [documentTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_types")
        @ExcludeMissing
        fun _documentTypes(): JsonField<List<DocumentType>> = documentTypes

        /**
         * Returns the raw JSON value of [entities].
         *
         * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entities")
        @ExcludeMissing
        fun _entities(): JsonField<List<Entity>> = entities

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
             * Returns a mutable builder for constructing an instance of [Participant].
             *
             * The following fields are required:
             * ```java
             * .peppolId()
             * .peppolScheme()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Participant]. */
        class Builder internal constructor() {

            private var peppolId: JsonField<String>? = null
            private var peppolScheme: JsonField<String>? = null
            private var documentTypes: JsonField<MutableList<DocumentType>>? = null
            private var entities: JsonField<MutableList<Entity>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(participant: Participant) = apply {
                peppolId = participant.peppolId
                peppolScheme = participant.peppolScheme
                documentTypes = participant.documentTypes.map { it.toMutableList() }
                entities = participant.entities.map { it.toMutableList() }
                additionalProperties = participant.additionalProperties.toMutableMap()
            }

            /** Peppol ID of the participant */
            fun peppolId(peppolId: String) = peppolId(JsonField.of(peppolId))

            /**
             * Sets [Builder.peppolId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.peppolId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun peppolId(peppolId: JsonField<String>) = apply { this.peppolId = peppolId }

            /** Peppol scheme of the participant */
            fun peppolScheme(peppolScheme: String) = peppolScheme(JsonField.of(peppolScheme))

            /**
             * Sets [Builder.peppolScheme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.peppolScheme] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun peppolScheme(peppolScheme: JsonField<String>) = apply {
                this.peppolScheme = peppolScheme
            }

            /** List of supported document types */
            fun documentTypes(documentTypes: List<DocumentType>) =
                documentTypes(JsonField.of(documentTypes))

            /**
             * Sets [Builder.documentTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentTypes] with a well-typed
             * `List<DocumentType>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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

            /** List of business entities */
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
             * Returns an immutable instance of [Participant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .peppolId()
             * .peppolScheme()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Participant =
                Participant(
                    checkRequired("peppolId", peppolId),
                    checkRequired("peppolScheme", peppolScheme),
                    (documentTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    (entities ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Participant = apply {
            if (validated) {
                return@apply
            }

            peppolId()
            peppolScheme()
            documentTypes().ifPresent { it.forEach { it.validate() } }
            entities().ifPresent { it.forEach { it.validate() } }
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
            (if (peppolId.asKnown().isPresent) 1 else 0) +
                (if (peppolScheme.asKnown().isPresent) 1 else 0) +
                (documentTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (entities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Represents a supported document type */
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
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(scheme, value, mutableMapOf())

            /**
             * Document type scheme
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheme(): String = scheme.getRequired("scheme")

            /**
             * Document type value
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [scheme].
             *
             * Unlike [scheme], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scheme") @ExcludeMissing fun _scheme(): JsonField<String> = scheme

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Document type scheme */
                fun scheme(scheme: String) = scheme(JsonField.of(scheme))

                /**
                 * Sets [Builder.scheme] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheme] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scheme(scheme: JsonField<String>) = apply { this.scheme = scheme }

                /** Document type value */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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

                return other is DocumentType &&
                    scheme == other.scheme &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(scheme, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DocumentType{scheme=$scheme, value=$value, additionalProperties=$additionalProperties}"
        }

        /** Represents a business entity */
        class Entity
        private constructor(
            private val additionalInfo: JsonField<String>,
            private val countryCode: JsonField<String>,
            private val geoInfo: JsonField<String>,
            private val identifiers: JsonField<List<Identifier>>,
            private val name: JsonField<String>,
            private val registrationDate: JsonField<String>,
            private val website: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("additional_info")
                @ExcludeMissing
                additionalInfo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country_code")
                @ExcludeMissing
                countryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("geo_info")
                @ExcludeMissing
                geoInfo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("identifiers")
                @ExcludeMissing
                identifiers: JsonField<List<Identifier>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("registration_date")
                @ExcludeMissing
                registrationDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("website")
                @ExcludeMissing
                website: JsonField<String> = JsonMissing.of(),
            ) : this(
                additionalInfo,
                countryCode,
                geoInfo,
                identifiers,
                name,
                registrationDate,
                website,
                mutableMapOf(),
            )

            /**
             * Additional information
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun additionalInfo(): Optional<String> = additionalInfo.getOptional("additional_info")

            /**
             * Country code
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

            /**
             * Geographic information
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun geoInfo(): Optional<String> = geoInfo.getOptional("geo_info")

            /**
             * List of business identifiers
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun identifiers(): Optional<List<Identifier>> = identifiers.getOptional("identifiers")

            /**
             * Business entity name
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Registration date
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun registrationDate(): Optional<String> =
                registrationDate.getOptional("registration_date")

            /**
             * Website URL
             *
             * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun website(): Optional<String> = website.getOptional("website")

            /**
             * Returns the raw JSON value of [additionalInfo].
             *
             * Unlike [additionalInfo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("additional_info")
            @ExcludeMissing
            fun _additionalInfo(): JsonField<String> = additionalInfo

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_code")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

            /**
             * Returns the raw JSON value of [geoInfo].
             *
             * Unlike [geoInfo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("geo_info") @ExcludeMissing fun _geoInfo(): JsonField<String> = geoInfo

            /**
             * Returns the raw JSON value of [identifiers].
             *
             * Unlike [identifiers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("identifiers")
            @ExcludeMissing
            fun _identifiers(): JsonField<List<Identifier>> = identifiers

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
            @JsonProperty("registration_date")
            @ExcludeMissing
            fun _registrationDate(): JsonField<String> = registrationDate

            /**
             * Returns the raw JSON value of [website].
             *
             * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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

                private var additionalInfo: JsonField<String> = JsonMissing.of()
                private var countryCode: JsonField<String> = JsonMissing.of()
                private var geoInfo: JsonField<String> = JsonMissing.of()
                private var identifiers: JsonField<MutableList<Identifier>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var registrationDate: JsonField<String> = JsonMissing.of()
                private var website: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entity: Entity) = apply {
                    additionalInfo = entity.additionalInfo
                    countryCode = entity.countryCode
                    geoInfo = entity.geoInfo
                    identifiers = entity.identifiers.map { it.toMutableList() }
                    name = entity.name
                    registrationDate = entity.registrationDate
                    website = entity.website
                    additionalProperties = entity.additionalProperties.toMutableMap()
                }

                /** Additional information */
                fun additionalInfo(additionalInfo: String?) =
                    additionalInfo(JsonField.ofNullable(additionalInfo))

                /**
                 * Alias for calling [Builder.additionalInfo] with `additionalInfo.orElse(null)`.
                 */
                fun additionalInfo(additionalInfo: Optional<String>) =
                    additionalInfo(additionalInfo.getOrNull())

                /**
                 * Sets [Builder.additionalInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.additionalInfo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun additionalInfo(additionalInfo: JsonField<String>) = apply {
                    this.additionalInfo = additionalInfo
                }

                /** Country code */
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

                /** Geographic information */
                fun geoInfo(geoInfo: String?) = geoInfo(JsonField.ofNullable(geoInfo))

                /** Alias for calling [Builder.geoInfo] with `geoInfo.orElse(null)`. */
                fun geoInfo(geoInfo: Optional<String>) = geoInfo(geoInfo.getOrNull())

                /**
                 * Sets [Builder.geoInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geoInfo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geoInfo(geoInfo: JsonField<String>) = apply { this.geoInfo = geoInfo }

                /** List of business identifiers */
                fun identifiers(identifiers: List<Identifier>) =
                    identifiers(JsonField.of(identifiers))

                /**
                 * Sets [Builder.identifiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identifiers] with a well-typed
                 * `List<Identifier>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun identifiers(identifiers: JsonField<List<Identifier>>) = apply {
                    this.identifiers = identifiers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Identifier] to [identifiers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIdentifier(identifier: Identifier) = apply {
                    identifiers =
                        (identifiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("identifiers", it).add(identifier)
                        }
                }

                /** Business entity name */
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

                /** Registration date */
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

                /** Website URL */
                fun website(website: String?) = website(JsonField.ofNullable(website))

                /** Alias for calling [Builder.website] with `website.orElse(null)`. */
                fun website(website: Optional<String>) = website(website.getOrNull())

                /**
                 * Sets [Builder.website] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.website] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun website(website: JsonField<String>) = apply { this.website = website }

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
                        additionalInfo,
                        countryCode,
                        geoInfo,
                        (identifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        registrationDate,
                        website,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entity = apply {
                if (validated) {
                    return@apply
                }

                additionalInfo()
                countryCode()
                geoInfo()
                identifiers().ifPresent { it.forEach { it.validate() } }
                name()
                registrationDate()
                website()
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
                (if (additionalInfo.asKnown().isPresent) 1 else 0) +
                    (if (countryCode.asKnown().isPresent) 1 else 0) +
                    (if (geoInfo.asKnown().isPresent) 1 else 0) +
                    (identifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (registrationDate.asKnown().isPresent) 1 else 0) +
                    (if (website.asKnown().isPresent) 1 else 0)

            /** Represents a business identifier */
            class Identifier
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
                 * Identifier scheme
                 *
                 * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun scheme(): String = scheme.getRequired("scheme")

                /**
                 * Identifier value
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
                     * Returns a mutable builder for constructing an instance of [Identifier].
                     *
                     * The following fields are required:
                     * ```java
                     * .scheme()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Identifier]. */
                class Builder internal constructor() {

                    private var scheme: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identifier: Identifier) = apply {
                        scheme = identifier.scheme
                        value = identifier.value
                        additionalProperties = identifier.additionalProperties.toMutableMap()
                    }

                    /** Identifier scheme */
                    fun scheme(scheme: String) = scheme(JsonField.of(scheme))

                    /**
                     * Sets [Builder.scheme] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scheme] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun scheme(scheme: JsonField<String>) = apply { this.scheme = scheme }

                    /** Identifier value */
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
                     * Returns an immutable instance of [Identifier].
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
                    fun build(): Identifier =
                        Identifier(
                            checkRequired("scheme", scheme),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Identifier = apply {
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

                    return other is Identifier &&
                        scheme == other.scheme &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(scheme, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identifier{scheme=$scheme, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entity &&
                    additionalInfo == other.additionalInfo &&
                    countryCode == other.countryCode &&
                    geoInfo == other.geoInfo &&
                    identifiers == other.identifiers &&
                    name == other.name &&
                    registrationDate == other.registrationDate &&
                    website == other.website &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    additionalInfo,
                    countryCode,
                    geoInfo,
                    identifiers,
                    name,
                    registrationDate,
                    website,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entity{additionalInfo=$additionalInfo, countryCode=$countryCode, geoInfo=$geoInfo, identifiers=$identifiers, name=$name, registrationDate=$registrationDate, website=$website, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Participant &&
                peppolId == other.peppolId &&
                peppolScheme == other.peppolScheme &&
                documentTypes == other.documentTypes &&
                entities == other.entities &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(peppolId, peppolScheme, documentTypes, entities, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Participant{peppolId=$peppolId, peppolScheme=$peppolScheme, documentTypes=$documentTypes, entities=$entities, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupRetrieveParticipantsResponse &&
            queryTerms == other.queryTerms &&
            searchDate == other.searchDate &&
            totalCount == other.totalCount &&
            usedCount == other.usedCount &&
            participants == other.participants &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            queryTerms,
            searchDate,
            totalCount,
            usedCount,
            participants,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LookupRetrieveParticipantsResponse{queryTerms=$queryTerms, searchDate=$searchDate, totalCount=$totalCount, usedCount=$usedCount, participants=$participants, additionalProperties=$additionalProperties}"
}
