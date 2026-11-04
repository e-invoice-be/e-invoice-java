package com.e_invoice.api.models.documents

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

class DocumentLifecycle
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val documentId: JsonField<String>,
    private val events: JsonField<List<LifecycleEvent>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("document_id")
        @ExcludeMissing
        documentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<LifecycleEvent>> = JsonMissing.of(),
    ) : this(documentId, events, mutableMapOf())

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentId(): String = documentId.getRequired("document_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<LifecycleEvent> = events.getRequired("events")

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_id") @ExcludeMissing fun _documentId(): JsonField<String> = documentId

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<LifecycleEvent>> = events

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
         * Returns a mutable builder for constructing an instance of [DocumentLifecycle].
         *
         * The following fields are required:
         * ```java
         * .documentId()
         * .events()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentLifecycle]. */
    class Builder internal constructor() {

        private var documentId: JsonField<String>? = null
        private var events: JsonField<MutableList<LifecycleEvent>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentLifecycle: DocumentLifecycle) = apply {
            documentId = documentLifecycle.documentId
            events = documentLifecycle.events.map { it.toMutableList() }
            additionalProperties = documentLifecycle.additionalProperties.toMutableMap()
        }

        fun documentId(documentId: String) = documentId(JsonField.of(documentId))

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

        fun events(events: List<LifecycleEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<LifecycleEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<LifecycleEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [LifecycleEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(lifecycleEvent: LifecycleEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(lifecycleEvent)
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
         * Returns an immutable instance of [DocumentLifecycle].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .documentId()
         * .events()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentLifecycle =
            DocumentLifecycle(
                checkRequired("documentId", documentId),
                checkRequired("events", events).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws EInvoiceInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DocumentLifecycle = apply {
        if (validated) {
            return@apply
        }

        documentId()
        events().forEach { it.validate() }
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
        (if (documentId.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class LifecycleEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val level: JsonField<Level>,
        private val canonicalStatus: JsonField<CanonicalStatus>,
        private val nativeCode: JsonField<String>,
        private val source: JsonField<Source>,
        private val direction: JsonField<Direction>,
        private val reasonCode: JsonField<String>,
        private val reason: JsonField<String>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("level") @ExcludeMissing level: JsonField<Level> = JsonMissing.of(),
            @JsonProperty("canonical_status")
            @ExcludeMissing
            canonicalStatus: JsonField<CanonicalStatus> = JsonMissing.of(),
            @JsonProperty("native_code")
            @ExcludeMissing
            nativeCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("reason_code")
            @ExcludeMissing
            reasonCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occurred_at")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            level,
            canonicalStatus,
            nativeCode,
            source,
            direction,
            reasonCode,
            reason,
            occurredAt,
            mutableMapOf(),
        )

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun level(): Level = level.getRequired("level")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun canonicalStatus(): Optional<CanonicalStatus> =
            canonicalStatus.getOptional("canonical_status")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nativeCode(): Optional<String> = nativeCode.getOptional("native_code")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): Source = source.getRequired("source")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): Direction = direction.getRequired("direction")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reasonCode(): Optional<String> = reasonCode.getOptional("reason_code")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

        /**
         * Returns the raw JSON value of [level].
         *
         * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

        /**
         * Returns the raw JSON value of [canonicalStatus].
         *
         * Unlike [canonicalStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("canonical_status")
        @ExcludeMissing
        fun _canonicalStatus(): JsonField<CanonicalStatus> = canonicalStatus

        /**
         * Returns the raw JSON value of [nativeCode].
         *
         * Unlike [nativeCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("native_code")
        @ExcludeMissing
        fun _nativeCode(): JsonField<String> = nativeCode

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [reasonCode].
         *
         * Unlike [reasonCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason_code")
        @ExcludeMissing
        fun _reasonCode(): JsonField<String> = reasonCode

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurred_at")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

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
             * Returns a mutable builder for constructing an instance of [LifecycleEvent].
             *
             * The following fields are required:
             * ```java
             * .level()
             * .canonicalStatus()
             * .nativeCode()
             * .source()
             * .direction()
             * .reasonCode()
             * .reason()
             * .occurredAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LifecycleEvent]. */
        class Builder internal constructor() {

            private var level: JsonField<Level>? = null
            private var canonicalStatus: JsonField<CanonicalStatus>? = null
            private var nativeCode: JsonField<String>? = null
            private var source: JsonField<Source>? = null
            private var direction: JsonField<Direction>? = null
            private var reasonCode: JsonField<String>? = null
            private var reason: JsonField<String>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lifecycleEvent: LifecycleEvent) = apply {
                level = lifecycleEvent.level
                canonicalStatus = lifecycleEvent.canonicalStatus
                nativeCode = lifecycleEvent.nativeCode
                source = lifecycleEvent.source
                direction = lifecycleEvent.direction
                reasonCode = lifecycleEvent.reasonCode
                reason = lifecycleEvent.reason
                occurredAt = lifecycleEvent.occurredAt
                additionalProperties = lifecycleEvent.additionalProperties.toMutableMap()
            }

            fun level(level: Level) = level(JsonField.of(level))

            /**
             * Sets [Builder.level] to an arbitrary JSON value.
             *
             * You should usually call [Builder.level] with a well-typed [Level] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun level(level: JsonField<Level>) = apply { this.level = level }

            fun canonicalStatus(canonicalStatus: CanonicalStatus?) =
                canonicalStatus(JsonField.ofNullable(canonicalStatus))

            /** Alias for calling [Builder.canonicalStatus] with `canonicalStatus.orElse(null)`. */
            fun canonicalStatus(canonicalStatus: Optional<CanonicalStatus>) =
                canonicalStatus(canonicalStatus.getOrNull())

            /**
             * Sets [Builder.canonicalStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canonicalStatus] with a well-typed [CanonicalStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun canonicalStatus(canonicalStatus: JsonField<CanonicalStatus>) = apply {
                this.canonicalStatus = canonicalStatus
            }

            fun nativeCode(nativeCode: String?) = nativeCode(JsonField.ofNullable(nativeCode))

            /** Alias for calling [Builder.nativeCode] with `nativeCode.orElse(null)`. */
            fun nativeCode(nativeCode: Optional<String>) = nativeCode(nativeCode.getOrNull())

            /**
             * Sets [Builder.nativeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nativeCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nativeCode(nativeCode: JsonField<String>) = apply { this.nativeCode = nativeCode }

            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            fun reasonCode(reasonCode: String?) = reasonCode(JsonField.ofNullable(reasonCode))

            /** Alias for calling [Builder.reasonCode] with `reasonCode.orElse(null)`. */
            fun reasonCode(reasonCode: Optional<String>) = reasonCode(reasonCode.getOrNull())

            /**
             * Sets [Builder.reasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasonCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasonCode(reasonCode: JsonField<String>) = apply { this.reasonCode = reasonCode }

            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
            fun reason(reason: Optional<String>) = reason(reason.getOrNull())

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

            /**
             * Sets [Builder.occurredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                this.occurredAt = occurredAt
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
             * Returns an immutable instance of [LifecycleEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .level()
             * .canonicalStatus()
             * .nativeCode()
             * .source()
             * .direction()
             * .reasonCode()
             * .reason()
             * .occurredAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LifecycleEvent =
                LifecycleEvent(
                    checkRequired("level", level),
                    checkRequired("canonicalStatus", canonicalStatus),
                    checkRequired("nativeCode", nativeCode),
                    checkRequired("source", source),
                    checkRequired("direction", direction),
                    checkRequired("reasonCode", reasonCode),
                    checkRequired("reason", reason),
                    checkRequired("occurredAt", occurredAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws EInvoiceInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LifecycleEvent = apply {
            if (validated) {
                return@apply
            }

            level().validate()
            canonicalStatus().ifPresent { it.validate() }
            nativeCode()
            source().validate()
            direction().validate()
            reasonCode()
            reason()
            occurredAt()
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
            (level.asKnown().getOrNull()?.validity() ?: 0) +
                (canonicalStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nativeCode.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reasonCode.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (if (occurredAt.asKnown().isPresent) 1 else 0)

        class CanonicalStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {
            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEPOSITED = of("deposited")

                @JvmField val EMITTED = of("emitted")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val REJECTED = of("rejected")

                @JvmField val ACKNOWLEDGED = of("acknowledged")

                @JvmField val APPROVED = of("approved")

                @JvmField val PARTIALLY_APPROVED = of("partially_approved")

                @JvmField val DISPUTED = of("disputed")

                @JvmField val ON_HOLD = of("on_hold")

                @JvmField val REFUSED = of("refused")

                @JvmField val PAYMENT_SENT = of("payment_sent")

                @JvmField val PAID = of("paid")

                @JvmStatic fun of(value: String) = CanonicalStatus(JsonField.of(value))
            }

            /** An enum containing [CanonicalStatus]'s known values. */
            enum class Known {
                DEPOSITED,
                EMITTED,
                DELIVERED,
                REJECTED,
                ACKNOWLEDGED,
                APPROVED,
                PARTIALLY_APPROVED,
                DISPUTED,
                ON_HOLD,
                REFUSED,
                PAYMENT_SENT,
                PAID,
            }

            /**
             * An enum containing [CanonicalStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CanonicalStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEPOSITED,
                EMITTED,
                DELIVERED,
                REJECTED,
                ACKNOWLEDGED,
                APPROVED,
                PARTIALLY_APPROVED,
                DISPUTED,
                ON_HOLD,
                REFUSED,
                PAYMENT_SENT,
                PAID,
                /**
                 * An enum member indicating that [CanonicalStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEPOSITED -> Value.DEPOSITED
                    EMITTED -> Value.EMITTED
                    DELIVERED -> Value.DELIVERED
                    REJECTED -> Value.REJECTED
                    ACKNOWLEDGED -> Value.ACKNOWLEDGED
                    APPROVED -> Value.APPROVED
                    PARTIALLY_APPROVED -> Value.PARTIALLY_APPROVED
                    DISPUTED -> Value.DISPUTED
                    ON_HOLD -> Value.ON_HOLD
                    REFUSED -> Value.REFUSED
                    PAYMENT_SENT -> Value.PAYMENT_SENT
                    PAID -> Value.PAID
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEPOSITED -> Known.DEPOSITED
                    EMITTED -> Known.EMITTED
                    DELIVERED -> Known.DELIVERED
                    REJECTED -> Known.REJECTED
                    ACKNOWLEDGED -> Known.ACKNOWLEDGED
                    APPROVED -> Known.APPROVED
                    PARTIALLY_APPROVED -> Known.PARTIALLY_APPROVED
                    DISPUTED -> Known.DISPUTED
                    ON_HOLD -> Known.ON_HOLD
                    REFUSED -> Known.REFUSED
                    PAYMENT_SENT -> Known.PAYMENT_SENT
                    PAID -> Known.PAID
                    else -> throw EInvoiceInvalidDataException("Unknown CanonicalStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    EInvoiceInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws EInvoiceInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CanonicalStatus = apply {
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

                return other is CanonicalStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {
            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IN = of("in")

                @JvmField val OUT = of("out")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                IN,
                OUT,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN,
                OUT,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IN -> Value.IN
                    OUT -> Value.OUT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IN -> Known.IN
                    OUT -> Known.OUT
                    else -> throw EInvoiceInvalidDataException("Unknown Direction: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    EInvoiceInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws EInvoiceInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Direction = apply {
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

                return other is Direction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Level @JsonCreator private constructor(private val value: JsonField<String>) : Enum {
            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TRANSPORT = of("transport")

                @JvmField val BUSINESS = of("business")

                @JvmStatic fun of(value: String) = Level(JsonField.of(value))
            }

            /** An enum containing [Level]'s known values. */
            enum class Known {
                TRANSPORT,
                BUSINESS,
            }

            /**
             * An enum containing [Level]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Level] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRANSPORT,
                BUSINESS,
                /**
                 * An enum member indicating that [Level] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TRANSPORT -> Value.TRANSPORT
                    BUSINESS -> Value.BUSINESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TRANSPORT -> Known.TRANSPORT
                    BUSINESS -> Known.BUSINESS
                    else -> throw EInvoiceInvalidDataException("Unknown Level: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    EInvoiceInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws EInvoiceInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Level = apply {
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

                return other is Level && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {
            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PEPPOL_MLR = of("peppol:mlr")

                @JvmField val PEPPOL_MLS = of("peppol:mls")

                @JvmField val PEPPOL_IMR = of("peppol:imr")

                @JvmField val FR_SUPERPDP = of("fr:superpdp")

                @JvmField val LOCAL = of("local")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                PEPPOL_MLR,
                PEPPOL_MLS,
                PEPPOL_IMR,
                FR_SUPERPDP,
                LOCAL,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PEPPOL_MLR,
                PEPPOL_MLS,
                PEPPOL_IMR,
                FR_SUPERPDP,
                LOCAL,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PEPPOL_MLR -> Value.PEPPOL_MLR
                    PEPPOL_MLS -> Value.PEPPOL_MLS
                    PEPPOL_IMR -> Value.PEPPOL_IMR
                    FR_SUPERPDP -> Value.FR_SUPERPDP
                    LOCAL -> Value.LOCAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PEPPOL_MLR -> Known.PEPPOL_MLR
                    PEPPOL_MLS -> Known.PEPPOL_MLS
                    PEPPOL_IMR -> Known.PEPPOL_IMR
                    FR_SUPERPDP -> Known.FR_SUPERPDP
                    LOCAL -> Known.LOCAL
                    else -> throw EInvoiceInvalidDataException("Unknown Source: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    EInvoiceInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws EInvoiceInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Source = apply {
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LifecycleEvent &&
                level == other.level &&
                canonicalStatus == other.canonicalStatus &&
                nativeCode == other.nativeCode &&
                source == other.source &&
                direction == other.direction &&
                reasonCode == other.reasonCode &&
                reason == other.reason &&
                occurredAt == other.occurredAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                level,
                canonicalStatus,
                nativeCode,
                source,
                direction,
                reasonCode,
                reason,
                occurredAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LifecycleEvent{level=$level, canonicalStatus=$canonicalStatus, nativeCode=$nativeCode, source=$source, direction=$direction, reasonCode=$reasonCode, reason=$reason, occurredAt=$occurredAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentLifecycle &&
            documentId == other.documentId &&
            events == other.events &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(documentId, events, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentLifecycle{documentId=$documentId, events=$events, additionalProperties=$additionalProperties}"
}
