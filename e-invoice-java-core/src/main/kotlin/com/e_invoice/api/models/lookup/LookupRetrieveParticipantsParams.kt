// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.lookup

import com.e_invoice.api.core.Params
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lookup Peppol participants by name or other identifiers. You can limit the search to a specific
 * country by providing the country code.
 */
class LookupRetrieveParticipantsParams
private constructor(
    private val query: String,
    private val countryCode: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Query to lookup */
    fun query(): String = query

    /** Country code of the company to lookup. If not provided, the search will be global. */
    fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupRetrieveParticipantsParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupRetrieveParticipantsParams]. */
    class Builder internal constructor() {

        private var query: String? = null
        private var countryCode: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(lookupRetrieveParticipantsParams: LookupRetrieveParticipantsParams) =
            apply {
                query = lookupRetrieveParticipantsParams.query
                countryCode = lookupRetrieveParticipantsParams.countryCode
                additionalHeaders = lookupRetrieveParticipantsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    lookupRetrieveParticipantsParams.additionalQueryParams.toBuilder()
            }

        /** Query to lookup */
        fun query(query: String) = apply { this.query = query }

        /** Country code of the company to lookup. If not provided, the search will be global. */
        fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

        /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
        fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

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
         * Returns an immutable instance of [LookupRetrieveParticipantsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupRetrieveParticipantsParams =
            LookupRetrieveParticipantsParams(
                checkRequired("query", query),
                countryCode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("query", query)
                countryCode?.let { put("country_code", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LookupRetrieveParticipantsParams && query == other.query && countryCode == other.countryCode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(query, countryCode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LookupRetrieveParticipantsParams{query=$query, countryCode=$countryCode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
