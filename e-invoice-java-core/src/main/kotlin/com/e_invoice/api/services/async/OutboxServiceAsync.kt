// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.outbox.OutboxListDraftDocumentsPageAsync
import com.e_invoice.api.models.outbox.OutboxListDraftDocumentsParams
import com.e_invoice.api.models.outbox.OutboxListReceivedDocumentsPageAsync
import com.e_invoice.api.models.outbox.OutboxListReceivedDocumentsParams
import java.util.concurrent.CompletableFuture

interface OutboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a paginated list of draft documents with filtering options. */
    fun listDraftDocuments(): CompletableFuture<OutboxListDraftDocumentsPageAsync> =
        listDraftDocuments(OutboxListDraftDocumentsParams.none())

    /** @see [listDraftDocuments] */
    fun listDraftDocuments(
        params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboxListDraftDocumentsPageAsync>

    /** @see [listDraftDocuments] */
    fun listDraftDocuments(
        params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none()
    ): CompletableFuture<OutboxListDraftDocumentsPageAsync> =
        listDraftDocuments(params, RequestOptions.none())

    /** @see [listDraftDocuments] */
    fun listDraftDocuments(
        requestOptions: RequestOptions
    ): CompletableFuture<OutboxListDraftDocumentsPageAsync> =
        listDraftDocuments(OutboxListDraftDocumentsParams.none(), requestOptions)

    /** Retrieve a paginated list of received documents with filtering options. */
    fun listReceivedDocuments(): CompletableFuture<OutboxListReceivedDocumentsPageAsync> =
        listReceivedDocuments(OutboxListReceivedDocumentsParams.none())

    /** @see [listReceivedDocuments] */
    fun listReceivedDocuments(
        params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboxListReceivedDocumentsPageAsync>

    /** @see [listReceivedDocuments] */
    fun listReceivedDocuments(
        params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none()
    ): CompletableFuture<OutboxListReceivedDocumentsPageAsync> =
        listReceivedDocuments(params, RequestOptions.none())

    /** @see [listReceivedDocuments] */
    fun listReceivedDocuments(
        requestOptions: RequestOptions
    ): CompletableFuture<OutboxListReceivedDocumentsPageAsync> =
        listReceivedDocuments(OutboxListReceivedDocumentsParams.none(), requestOptions)

    /**
     * A view of [OutboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/outbox/drafts`, but is otherwise the same as
         * [OutboxServiceAsync.listDraftDocuments].
         */
        fun listDraftDocuments():
            CompletableFuture<HttpResponseFor<OutboxListDraftDocumentsPageAsync>> =
            listDraftDocuments(OutboxListDraftDocumentsParams.none())

        /** @see [listDraftDocuments] */
        fun listDraftDocuments(
            params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboxListDraftDocumentsPageAsync>>

        /** @see [listDraftDocuments] */
        fun listDraftDocuments(
            params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none()
        ): CompletableFuture<HttpResponseFor<OutboxListDraftDocumentsPageAsync>> =
            listDraftDocuments(params, RequestOptions.none())

        /** @see [listDraftDocuments] */
        fun listDraftDocuments(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OutboxListDraftDocumentsPageAsync>> =
            listDraftDocuments(OutboxListDraftDocumentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/outbox/`, but is otherwise the same as
         * [OutboxServiceAsync.listReceivedDocuments].
         */
        fun listReceivedDocuments():
            CompletableFuture<HttpResponseFor<OutboxListReceivedDocumentsPageAsync>> =
            listReceivedDocuments(OutboxListReceivedDocumentsParams.none())

        /** @see [listReceivedDocuments] */
        fun listReceivedDocuments(
            params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboxListReceivedDocumentsPageAsync>>

        /** @see [listReceivedDocuments] */
        fun listReceivedDocuments(
            params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none()
        ): CompletableFuture<HttpResponseFor<OutboxListReceivedDocumentsPageAsync>> =
            listReceivedDocuments(params, RequestOptions.none())

        /** @see [listReceivedDocuments] */
        fun listReceivedDocuments(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OutboxListReceivedDocumentsPageAsync>> =
            listReceivedDocuments(OutboxListReceivedDocumentsParams.none(), requestOptions)
    }
}
