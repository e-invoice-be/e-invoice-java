// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.outbox.OutboxListDraftDocumentsPage
import com.e_invoice.api.models.outbox.OutboxListDraftDocumentsParams
import com.e_invoice.api.models.outbox.OutboxListReceivedDocumentsPage
import com.e_invoice.api.models.outbox.OutboxListReceivedDocumentsParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface OutboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OutboxService

    /** Retrieve a paginated list of draft documents with filtering options. */
    fun listDraftDocuments(): OutboxListDraftDocumentsPage =
        listDraftDocuments(OutboxListDraftDocumentsParams.none())

    /** @see [listDraftDocuments] */
    fun listDraftDocuments(
        params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboxListDraftDocumentsPage

    /** @see [listDraftDocuments] */
    fun listDraftDocuments(
        params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none()
    ): OutboxListDraftDocumentsPage = listDraftDocuments(params, RequestOptions.none())

    /** @see [listDraftDocuments] */
    fun listDraftDocuments(requestOptions: RequestOptions): OutboxListDraftDocumentsPage =
        listDraftDocuments(OutboxListDraftDocumentsParams.none(), requestOptions)

    /** Retrieve a paginated list of received documents with filtering options. */
    fun listReceivedDocuments(): OutboxListReceivedDocumentsPage =
        listReceivedDocuments(OutboxListReceivedDocumentsParams.none())

    /** @see [listReceivedDocuments] */
    fun listReceivedDocuments(
        params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboxListReceivedDocumentsPage

    /** @see [listReceivedDocuments] */
    fun listReceivedDocuments(
        params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none()
    ): OutboxListReceivedDocumentsPage = listReceivedDocuments(params, RequestOptions.none())

    /** @see [listReceivedDocuments] */
    fun listReceivedDocuments(requestOptions: RequestOptions): OutboxListReceivedDocumentsPage =
        listReceivedDocuments(OutboxListReceivedDocumentsParams.none(), requestOptions)

    /** A view of [OutboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OutboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/outbox/drafts`, but is otherwise the same as
         * [OutboxService.listDraftDocuments].
         */
        @MustBeClosed
        fun listDraftDocuments(): HttpResponseFor<OutboxListDraftDocumentsPage> =
            listDraftDocuments(OutboxListDraftDocumentsParams.none())

        /** @see [listDraftDocuments] */
        @MustBeClosed
        fun listDraftDocuments(
            params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboxListDraftDocumentsPage>

        /** @see [listDraftDocuments] */
        @MustBeClosed
        fun listDraftDocuments(
            params: OutboxListDraftDocumentsParams = OutboxListDraftDocumentsParams.none()
        ): HttpResponseFor<OutboxListDraftDocumentsPage> =
            listDraftDocuments(params, RequestOptions.none())

        /** @see [listDraftDocuments] */
        @MustBeClosed
        fun listDraftDocuments(
            requestOptions: RequestOptions
        ): HttpResponseFor<OutboxListDraftDocumentsPage> =
            listDraftDocuments(OutboxListDraftDocumentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/outbox/`, but is otherwise the same as
         * [OutboxService.listReceivedDocuments].
         */
        @MustBeClosed
        fun listReceivedDocuments(): HttpResponseFor<OutboxListReceivedDocumentsPage> =
            listReceivedDocuments(OutboxListReceivedDocumentsParams.none())

        /** @see [listReceivedDocuments] */
        @MustBeClosed
        fun listReceivedDocuments(
            params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboxListReceivedDocumentsPage>

        /** @see [listReceivedDocuments] */
        @MustBeClosed
        fun listReceivedDocuments(
            params: OutboxListReceivedDocumentsParams = OutboxListReceivedDocumentsParams.none()
        ): HttpResponseFor<OutboxListReceivedDocumentsPage> =
            listReceivedDocuments(params, RequestOptions.none())

        /** @see [listReceivedDocuments] */
        @MustBeClosed
        fun listReceivedDocuments(
            requestOptions: RequestOptions
        ): HttpResponseFor<OutboxListReceivedDocumentsPage> =
            listReceivedDocuments(OutboxListReceivedDocumentsParams.none(), requestOptions)
    }
}
