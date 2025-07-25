// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.lookup

import com.e_invoice.api.core.Params
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.http.QueryParams
import java.util.Objects

/**
 * Lookup Peppol ID. The peppol_id must be in the form of `<scheme>:<id>`. The scheme is a 4-digit
 * code representing the identifier scheme, and the id is the actual identifier value. For example,
 * for a Belgian company it is `0208:0123456789` (where 0208 is the scheme for Belgian enterprises,
 * followed by the 10 digits of the official BTW / KBO number).
 */
class LookupRetrieveParams
private constructor(
    private val peppolId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Peppol ID in the format `<scheme>:<id>`. Example: `0208:1018265814` for a Belgian company.
     */
    fun peppolId(): String = peppolId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LookupRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .peppolId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupRetrieveParams]. */
    class Builder internal constructor() {

        private var peppolId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(lookupRetrieveParams: LookupRetrieveParams) = apply {
            peppolId = lookupRetrieveParams.peppolId
            additionalHeaders = lookupRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = lookupRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Peppol ID in the format `<scheme>:<id>`. Example: `0208:1018265814` for a Belgian
         * company.
         */
        fun peppolId(peppolId: String) = apply { this.peppolId = peppolId }

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
         * Returns an immutable instance of [LookupRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .peppolId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupRetrieveParams =
            LookupRetrieveParams(
                checkRequired("peppolId", peppolId),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("peppol_id", peppolId)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LookupRetrieveParams && peppolId == other.peppolId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(peppolId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LookupRetrieveParams{peppolId=$peppolId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
