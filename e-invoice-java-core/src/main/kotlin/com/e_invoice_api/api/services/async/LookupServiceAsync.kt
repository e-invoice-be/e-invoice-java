// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.async

import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.models.lookup.LookupRetrieveParams
import com.e_invoice_api.api.models.lookup.LookupRetrieveResponse
import java.util.concurrent.CompletableFuture

interface LookupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Lookup Peppol ID. The peppol_id must be in the form of `<scheme>:<id>`. The scheme is a
     * 4-digit code representing the identifier scheme, and the id is the actual identifier value.
     * For example, for a Belgian company it is `0208:0123456789` (where 0208 is the scheme for
     * Belgian enterprises, followed by the 10 digits of the official BTW / KBO number).
     */
    fun retrieve(params: LookupRetrieveParams): CompletableFuture<LookupRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupRetrieveResponse>

    /**
     * A view of [LookupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/lookup`, but is otherwise the same as
         * [LookupServiceAsync.retrieve].
         */
        fun retrieve(
            params: LookupRetrieveParams
        ): CompletableFuture<HttpResponseFor<LookupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupRetrieveResponse>>
    }
}
