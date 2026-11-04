package com.e_invoice.api.models.stats

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Statistics response for a tenant. */
class StatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<List<ActionStats>>,
    private val aggregation: JsonField<StatsAggregationType>,
    private val averageDailyUsage: JsonField<Double>,
    private val periodEnd: JsonField<LocalDate>,
    private val periodStart: JsonField<LocalDate>,
    private val tenantId: JsonField<String>,
    private val totalDays: JsonField<Long>,
    private val budgetEstimationDays: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<ActionStats>> = JsonMissing.of(),
        @JsonProperty("aggregation")
        @ExcludeMissing
        aggregation: JsonField<StatsAggregationType> = JsonMissing.of(),
        @JsonProperty("average_daily_usage")
        @ExcludeMissing
        averageDailyUsage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("period_end")
        @ExcludeMissing
        periodEnd: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        periodStart: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_days") @ExcludeMissing totalDays: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("budget_estimation_days")
        @ExcludeMissing
        budgetEstimationDays: JsonField<Double> = JsonMissing.of(),
    ) : this(
        actions,
        aggregation,
        averageDailyUsage,
        periodEnd,
        periodStart,
        tenantId,
        totalDays,
        budgetEstimationDays,
        mutableMapOf(),
    )

    /**
     * List of action statistics, one entry per aggregation period per action
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<ActionStats> = actions.getRequired("actions")

    /**
     * Aggregation type used
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregation(): StatsAggregationType = aggregation.getRequired("aggregation")

    /**
     * Average daily usage (total actions / total days)
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun averageDailyUsage(): Double = averageDailyUsage.getRequired("average_daily_usage")

    /**
     * End date of the period
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodEnd(): LocalDate = periodEnd.getRequired("period_end")

    /**
     * Start date of the period
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodStart(): LocalDate = periodStart.getRequired("period_start")

    /**
     * Tenant ID
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * Number of days in the period
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalDays(): Long = totalDays.getRequired("total_days")

    /**
     * Estimated days until credits run out (credit_balance / average_daily_usage). 0.0 if
     * average_daily_usage is 0 or credit_balance is None
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetEstimationDays(): Optional<Double> =
        budgetEstimationDays.getOptional("budget_estimation_days")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<ActionStats>> = actions

    /**
     * Returns the raw JSON value of [aggregation].
     *
     * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<StatsAggregationType> = aggregation

    /**
     * Returns the raw JSON value of [averageDailyUsage].
     *
     * Unlike [averageDailyUsage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("average_daily_usage")
    @ExcludeMissing
    fun _averageDailyUsage(): JsonField<Double> = averageDailyUsage

    /**
     * Returns the raw JSON value of [periodEnd].
     *
     * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_end") @ExcludeMissing fun _periodEnd(): JsonField<LocalDate> = periodEnd

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_start")
    @ExcludeMissing
    fun _periodStart(): JsonField<LocalDate> = periodStart

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [totalDays].
     *
     * Unlike [totalDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_days") @ExcludeMissing fun _totalDays(): JsonField<Long> = totalDays

    /**
     * Returns the raw JSON value of [budgetEstimationDays].
     *
     * Unlike [budgetEstimationDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("budget_estimation_days")
    @ExcludeMissing
    fun _budgetEstimationDays(): JsonField<Double> = budgetEstimationDays

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
         * Returns a mutable builder for constructing an instance of [StatsResponse].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .aggregation()
         * .averageDailyUsage()
         * .periodEnd()
         * .periodStart()
         * .tenantId()
         * .totalDays()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatsResponse]. */
    class Builder internal constructor() {

        private var actions: JsonField<MutableList<ActionStats>>? = null
        private var aggregation: JsonField<StatsAggregationType>? = null
        private var averageDailyUsage: JsonField<Double>? = null
        private var periodEnd: JsonField<LocalDate>? = null
        private var periodStart: JsonField<LocalDate>? = null
        private var tenantId: JsonField<String>? = null
        private var totalDays: JsonField<Long>? = null
        private var budgetEstimationDays: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statsResponse: StatsResponse) = apply {
            actions = statsResponse.actions.map { it.toMutableList() }
            aggregation = statsResponse.aggregation
            averageDailyUsage = statsResponse.averageDailyUsage
            periodEnd = statsResponse.periodEnd
            periodStart = statsResponse.periodStart
            tenantId = statsResponse.tenantId
            totalDays = statsResponse.totalDays
            budgetEstimationDays = statsResponse.budgetEstimationDays
            additionalProperties = statsResponse.additionalProperties.toMutableMap()
        }

        /** List of action statistics, one entry per aggregation period per action */
        fun actions(actions: List<ActionStats>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<ActionStats>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actions(actions: JsonField<List<ActionStats>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ActionStats] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: ActionStats) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        /** Aggregation type used */
        fun aggregation(aggregation: StatsAggregationType) = aggregation(JsonField.of(aggregation))

        /**
         * Sets [Builder.aggregation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregation] with a well-typed [StatsAggregationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregation(aggregation: JsonField<StatsAggregationType>) = apply {
            this.aggregation = aggregation
        }

        /** Average daily usage (total actions / total days) */
        fun averageDailyUsage(averageDailyUsage: Double) =
            averageDailyUsage(JsonField.of(averageDailyUsage))

        /**
         * Sets [Builder.averageDailyUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageDailyUsage] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun averageDailyUsage(averageDailyUsage: JsonField<Double>) = apply {
            this.averageDailyUsage = averageDailyUsage
        }

        /** End date of the period */
        fun periodEnd(periodEnd: LocalDate) = periodEnd(JsonField.of(periodEnd))

        /**
         * Sets [Builder.periodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodEnd] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun periodEnd(periodEnd: JsonField<LocalDate>) = apply { this.periodEnd = periodEnd }

        /** Start date of the period */
        fun periodStart(periodStart: LocalDate) = periodStart(JsonField.of(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<LocalDate>) = apply {
            this.periodStart = periodStart
        }

        /** Tenant ID */
        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        /** Number of days in the period */
        fun totalDays(totalDays: Long) = totalDays(JsonField.of(totalDays))

        /**
         * Sets [Builder.totalDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalDays] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalDays(totalDays: JsonField<Long>) = apply { this.totalDays = totalDays }

        /**
         * Estimated days until credits run out (credit_balance / average_daily_usage). 0.0 if
         * average_daily_usage is 0 or credit_balance is None
         */
        fun budgetEstimationDays(budgetEstimationDays: Double) =
            budgetEstimationDays(JsonField.of(budgetEstimationDays))

        /**
         * Sets [Builder.budgetEstimationDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetEstimationDays] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetEstimationDays(budgetEstimationDays: JsonField<Double>) = apply {
            this.budgetEstimationDays = budgetEstimationDays
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
         * Returns an immutable instance of [StatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .aggregation()
         * .averageDailyUsage()
         * .periodEnd()
         * .periodStart()
         * .tenantId()
         * .totalDays()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatsResponse =
            StatsResponse(
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("aggregation", aggregation),
                checkRequired("averageDailyUsage", averageDailyUsage),
                checkRequired("periodEnd", periodEnd),
                checkRequired("periodStart", periodStart),
                checkRequired("tenantId", tenantId),
                checkRequired("totalDays", totalDays),
                budgetEstimationDays,
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
    fun validate(): StatsResponse = apply {
        if (validated) {
            return@apply
        }

        actions().forEach { it.validate() }
        aggregation().validate()
        averageDailyUsage()
        periodEnd()
        periodStart()
        tenantId()
        totalDays()
        budgetEstimationDays()
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
        (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (aggregation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (averageDailyUsage.asKnown().isPresent) 1 else 0) +
            (if (periodEnd.asKnown().isPresent) 1 else 0) +
            (if (periodStart.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (totalDays.asKnown().isPresent) 1 else 0) +
            (if (budgetEstimationDays.asKnown().isPresent) 1 else 0)

    /** Statistics for a specific action in a specific time period. */
    class ActionStats
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<Action>,
        private val count: JsonField<Long>,
        private val statDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stat_date")
            @ExcludeMissing
            statDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(action, count, statDate, mutableMapOf())

        /**
         * Type of action
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * Number of occurrences of this action in this period
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun count(): Long = count.getRequired("count")

        /**
         * The date/period this stat represents. For DAY aggregation this is the specific day, for
         * WEEK it's the start of the week, for MONTH it's the first day of the month
         *
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun statDate(): LocalDate = statDate.getRequired("stat_date")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

        /**
         * Returns the raw JSON value of [statDate].
         *
         * Unlike [statDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stat_date") @ExcludeMissing fun _statDate(): JsonField<LocalDate> = statDate

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
             * Returns a mutable builder for constructing an instance of [ActionStats].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .count()
             * .statDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ActionStats]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var count: JsonField<Long>? = null
            private var statDate: JsonField<LocalDate>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(actionStats: ActionStats) = apply {
                action = actionStats.action
                count = actionStats.count
                statDate = actionStats.statDate
                additionalProperties = actionStats.additionalProperties.toMutableMap()
            }

            /** Type of action */
            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** Number of occurrences of this action in this period */
            fun count(count: Long) = count(JsonField.of(count))

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun count(count: JsonField<Long>) = apply { this.count = count }

            /**
             * The date/period this stat represents. For DAY aggregation this is the specific day,
             * for WEEK it's the start of the week, for MONTH it's the first day of the month
             */
            fun statDate(statDate: LocalDate) = statDate(JsonField.of(statDate))

            /**
             * Sets [Builder.statDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statDate(statDate: JsonField<LocalDate>) = apply { this.statDate = statDate }

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
             * Returns an immutable instance of [ActionStats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .count()
             * .statDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ActionStats =
                ActionStats(
                    checkRequired("action", action),
                    checkRequired("count", count),
                    checkRequired("statDate", statDate),
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
        fun validate(): ActionStats = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            count()
            statDate()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (if (count.asKnown().isPresent) 1 else 0) +
                (if (statDate.asKnown().isPresent) 1 else 0)

        /** Type of action */
        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DOCUMENT_SENT = of("DOCUMENT_SENT")

                @JvmField val DOCUMENT_RECEIVED = of("DOCUMENT_RECEIVED")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                DOCUMENT_SENT,
                DOCUMENT_RECEIVED,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DOCUMENT_SENT,
                DOCUMENT_RECEIVED,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
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
                    DOCUMENT_SENT -> Value.DOCUMENT_SENT
                    DOCUMENT_RECEIVED -> Value.DOCUMENT_RECEIVED
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
                    DOCUMENT_SENT -> Known.DOCUMENT_SENT
                    DOCUMENT_RECEIVED -> Known.DOCUMENT_RECEIVED
                    else -> throw EInvoiceInvalidDataException("Unknown Action: $value")
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
            fun validate(): Action = apply {
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

                return other is Action && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActionStats &&
                action == other.action &&
                count == other.count &&
                statDate == other.statDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, count, statDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ActionStats{action=$action, count=$count, statDate=$statDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatsResponse &&
            actions == other.actions &&
            aggregation == other.aggregation &&
            averageDailyUsage == other.averageDailyUsage &&
            periodEnd == other.periodEnd &&
            periodStart == other.periodStart &&
            tenantId == other.tenantId &&
            totalDays == other.totalDays &&
            budgetEstimationDays == other.budgetEstimationDays &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actions,
            aggregation,
            averageDailyUsage,
            periodEnd,
            periodStart,
            tenantId,
            totalDays,
            budgetEstimationDays,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatsResponse{actions=$actions, aggregation=$aggregation, averageDailyUsage=$averageDailyUsage, periodEnd=$periodEnd, periodStart=$periodStart, tenantId=$tenantId, totalDays=$totalDays, budgetEstimationDays=$budgetEstimationDays, additionalProperties=$additionalProperties}"
}
