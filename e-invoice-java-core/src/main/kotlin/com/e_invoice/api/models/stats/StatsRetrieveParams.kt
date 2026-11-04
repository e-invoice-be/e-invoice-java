package com.e_invoice.api.models.stats

import com.e_invoice.api.core.Params
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve usage statistics for billing purposes. Returns statistics for document sent and document
 * received actions, grouped by aggregation period (day/week/month). If no date parameters are
 * provided, returns daily stats for all available data.
 */
class StatsRetrieveParams
private constructor(
    private val startDate: LocalDate?,
    private val endDate: LocalDate?,
    private val aggregation: StatsAggregationType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Start date in yyyy-mm-dd format. If not provided, queries from earliest available data. */
    fun startDate(): Optional<LocalDate> = Optional.ofNullable(startDate)

    /** End date in yyyy-mm-dd format. If not provided, queries to latest available data. */
    fun endDate(): Optional<LocalDate> = Optional.ofNullable(endDate)

    /** Aggregation type: DAY, WEEK, or MONTH. Defaults to DAY. */
    fun aggregation(): Optional<StatsAggregationType> = Optional.ofNullable(aggregation)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StatsRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StatsRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatsRetrieveParams]. */
    class Builder internal constructor() {

        private var startDate: LocalDate? = null
        private var endDate: LocalDate? = null
        private var aggregation: StatsAggregationType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(statsRetrieveParams: StatsRetrieveParams) = apply {
            startDate = statsRetrieveParams.startDate
            endDate = statsRetrieveParams.endDate
            aggregation = statsRetrieveParams.aggregation
            additionalHeaders = statsRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = statsRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Start date in yyyy-mm-dd format. If not provided, queries from earliest available data.
         */
        fun startDate(startDate: LocalDate?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<LocalDate>) = startDate(startDate.getOrNull())

        /** End date in yyyy-mm-dd format. If not provided, queries to latest available data. */
        fun endDate(endDate: LocalDate?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<LocalDate>) = endDate(endDate.getOrNull())

        /** Aggregation type: DAY, WEEK, or MONTH. Defaults to DAY. */
        fun aggregation(aggregation: StatsAggregationType?) = apply {
            this.aggregation = aggregation
        }

        /** Alias for calling [Builder.aggregation] with `aggregation.orElse(null)`. */
        fun aggregation(aggregation: Optional<StatsAggregationType>) =
            aggregation(aggregation.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [StatsRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatsRetrieveParams =
            StatsRetrieveParams(
                startDate,
                endDate,
                aggregation,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                startDate?.let { put("start_date", it.toString()) }
                endDate?.let { put("end_date", it.toString()) }
                aggregation?.let { put("aggregation", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatsRetrieveParams &&
            startDate == other.startDate &&
            endDate == other.endDate &&
            aggregation == other.aggregation &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(startDate, endDate, aggregation, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StatsRetrieveParams{startDate=$startDate, endDate=$endDate, aggregation=$aggregation, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
