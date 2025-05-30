// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.validate

import com.e_invoice_api.api.core.Params
import com.e_invoice_api.api.core.checkRequired
import com.e_invoice_api.api.core.http.Headers
import com.e_invoice_api.api.core.http.QueryParams
import java.util.Objects

/**
 * Validate if a Peppol ID exists in the Peppol network and retrieve supported document types. The
 * peppol_id must be in the form of `<scheme>:<id>`. The scheme is a 4-digit code representing the
 * identifier scheme, and the id is the actual identifier value. For example, for a Belgian company
 * it is `0208:0123456789` (where 0208 is the scheme for Belgian enterprises, followed by the 10
 * digits of the official BTW / KBO number).
 */
class ValidateValidatePeppolIdParams
private constructor(
    private val peppolId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Peppol ID in the format `<scheme>:<id>`. Example: `0208:1018265814` for a Belgian company.
     */
    fun peppolId(): String = peppolId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ValidateValidatePeppolIdParams].
         *
         * The following fields are required:
         * ```java
         * .peppolId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValidateValidatePeppolIdParams]. */
    class Builder internal constructor() {

        private var peppolId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(validateValidatePeppolIdParams: ValidateValidatePeppolIdParams) = apply {
            peppolId = validateValidatePeppolIdParams.peppolId
            additionalHeaders = validateValidatePeppolIdParams.additionalHeaders.toBuilder()
            additionalQueryParams = validateValidatePeppolIdParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [ValidateValidatePeppolIdParams].
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
        fun build(): ValidateValidatePeppolIdParams =
            ValidateValidatePeppolIdParams(
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

        return /* spotless:off */ other is ValidateValidatePeppolIdParams && peppolId == other.peppolId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(peppolId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ValidateValidatePeppolIdParams{peppolId=$peppolId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
