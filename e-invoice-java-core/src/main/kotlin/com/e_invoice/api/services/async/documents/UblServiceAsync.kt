// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.documents.ubl.UblGetParams
import com.e_invoice.api.models.documents.ubl.UblGetResponse
import java.util.concurrent.CompletableFuture

interface UblServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the UBL for an invoice or credit note */
    fun get(documentId: String): CompletableFuture<UblGetResponse> =
        get(documentId, UblGetParams.none())

    /** @see [get] */
    fun get(
        documentId: String,
        params: UblGetParams = UblGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UblGetResponse> =
        get(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [get] */
    fun get(
        documentId: String,
        params: UblGetParams = UblGetParams.none(),
    ): CompletableFuture<UblGetResponse> = get(documentId, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: UblGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UblGetResponse>

    /** @see [get] */
    fun get(params: UblGetParams): CompletableFuture<UblGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(documentId: String, requestOptions: RequestOptions): CompletableFuture<UblGetResponse> =
        get(documentId, UblGetParams.none(), requestOptions)

    /** A view of [UblServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}/ubl`, but is otherwise
         * the same as [UblServiceAsync.get].
         */
        fun get(documentId: String): CompletableFuture<HttpResponseFor<UblGetResponse>> =
            get(documentId, UblGetParams.none())

        /** @see [get] */
        fun get(
            documentId: String,
            params: UblGetParams = UblGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UblGetResponse>> =
            get(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [get] */
        fun get(
            documentId: String,
            params: UblGetParams = UblGetParams.none(),
        ): CompletableFuture<HttpResponseFor<UblGetResponse>> =
            get(documentId, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: UblGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UblGetResponse>>

        /** @see [get] */
        fun get(params: UblGetParams): CompletableFuture<HttpResponseFor<UblGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UblGetResponse>> =
            get(documentId, UblGetParams.none(), requestOptions)
    }
}
