// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking.documents

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.documents.ubl.UblGetParams
import com.e_invoice.api.models.documents.ubl.UblGetResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UblService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UblService

    /** Get the UBL for an invoice or credit note */
    fun get(documentId: String): UblGetResponse = get(documentId, UblGetParams.none())

    /** @see get */
    fun get(
        documentId: String,
        params: UblGetParams = UblGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UblGetResponse = get(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see get */
    fun get(documentId: String, params: UblGetParams = UblGetParams.none()): UblGetResponse =
        get(documentId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: UblGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UblGetResponse

    /** @see get */
    fun get(params: UblGetParams): UblGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(documentId: String, requestOptions: RequestOptions): UblGetResponse =
        get(documentId, UblGetParams.none(), requestOptions)

    /** A view of [UblService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UblService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}/ubl`, but is otherwise
         * the same as [UblService.get].
         */
        @MustBeClosed
        fun get(documentId: String): HttpResponseFor<UblGetResponse> =
            get(documentId, UblGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            documentId: String,
            params: UblGetParams = UblGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UblGetResponse> =
            get(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            documentId: String,
            params: UblGetParams = UblGetParams.none(),
        ): HttpResponseFor<UblGetResponse> = get(documentId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: UblGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UblGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: UblGetParams): HttpResponseFor<UblGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UblGetResponse> = get(documentId, UblGetParams.none(), requestOptions)
    }
}
