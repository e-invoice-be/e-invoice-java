// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.async

import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.models.inbox.InboxListCreditNotesPageAsync
import com.e_invoice_api.api.models.inbox.InboxListCreditNotesParams
import com.e_invoice_api.api.models.inbox.InboxListInvoicesPageAsync
import com.e_invoice_api.api.models.inbox.InboxListInvoicesParams
import com.e_invoice_api.api.models.inbox.InboxListPageAsync
import com.e_invoice_api.api.models.inbox.InboxListParams
import java.util.concurrent.CompletableFuture

interface InboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a paginated list of received documents with filtering options. */
    fun list(): CompletableFuture<InboxListPageAsync> = list(InboxListParams.none())

    /** @see [list] */
    fun list(
        params: InboxListParams = InboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboxListPageAsync>

    /** @see [list] */
    fun list(
        params: InboxListParams = InboxListParams.none()
    ): CompletableFuture<InboxListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboxListPageAsync> =
        list(InboxListParams.none(), requestOptions)

    /** Retrieve a paginated list of received credit notes with filtering options. */
    fun listCreditNotes(): CompletableFuture<InboxListCreditNotesPageAsync> =
        listCreditNotes(InboxListCreditNotesParams.none())

    /** @see [listCreditNotes] */
    fun listCreditNotes(
        params: InboxListCreditNotesParams = InboxListCreditNotesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboxListCreditNotesPageAsync>

    /** @see [listCreditNotes] */
    fun listCreditNotes(
        params: InboxListCreditNotesParams = InboxListCreditNotesParams.none()
    ): CompletableFuture<InboxListCreditNotesPageAsync> =
        listCreditNotes(params, RequestOptions.none())

    /** @see [listCreditNotes] */
    fun listCreditNotes(
        requestOptions: RequestOptions
    ): CompletableFuture<InboxListCreditNotesPageAsync> =
        listCreditNotes(InboxListCreditNotesParams.none(), requestOptions)

    /** Retrieve a paginated list of received invoices with filtering options. */
    fun listInvoices(): CompletableFuture<InboxListInvoicesPageAsync> =
        listInvoices(InboxListInvoicesParams.none())

    /** @see [listInvoices] */
    fun listInvoices(
        params: InboxListInvoicesParams = InboxListInvoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboxListInvoicesPageAsync>

    /** @see [listInvoices] */
    fun listInvoices(
        params: InboxListInvoicesParams = InboxListInvoicesParams.none()
    ): CompletableFuture<InboxListInvoicesPageAsync> = listInvoices(params, RequestOptions.none())

    /** @see [listInvoices] */
    fun listInvoices(
        requestOptions: RequestOptions
    ): CompletableFuture<InboxListInvoicesPageAsync> =
        listInvoices(InboxListInvoicesParams.none(), requestOptions)

    /** A view of [InboxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/inbox/`, but is otherwise the same as
         * [InboxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboxListPageAsync>> =
            list(InboxListParams.none())

        /** @see [list] */
        fun list(
            params: InboxListParams = InboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>>

        /** @see [list] */
        fun list(
            params: InboxListParams = InboxListParams.none()
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>> =
            list(InboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/inbox/credit-notes`, but is otherwise the same
         * as [InboxServiceAsync.listCreditNotes].
         */
        fun listCreditNotes(): CompletableFuture<HttpResponseFor<InboxListCreditNotesPageAsync>> =
            listCreditNotes(InboxListCreditNotesParams.none())

        /** @see [listCreditNotes] */
        fun listCreditNotes(
            params: InboxListCreditNotesParams = InboxListCreditNotesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboxListCreditNotesPageAsync>>

        /** @see [listCreditNotes] */
        fun listCreditNotes(
            params: InboxListCreditNotesParams = InboxListCreditNotesParams.none()
        ): CompletableFuture<HttpResponseFor<InboxListCreditNotesPageAsync>> =
            listCreditNotes(params, RequestOptions.none())

        /** @see [listCreditNotes] */
        fun listCreditNotes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboxListCreditNotesPageAsync>> =
            listCreditNotes(InboxListCreditNotesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/inbox/invoices`, but is otherwise the same as
         * [InboxServiceAsync.listInvoices].
         */
        fun listInvoices(): CompletableFuture<HttpResponseFor<InboxListInvoicesPageAsync>> =
            listInvoices(InboxListInvoicesParams.none())

        /** @see [listInvoices] */
        fun listInvoices(
            params: InboxListInvoicesParams = InboxListInvoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboxListInvoicesPageAsync>>

        /** @see [listInvoices] */
        fun listInvoices(
            params: InboxListInvoicesParams = InboxListInvoicesParams.none()
        ): CompletableFuture<HttpResponseFor<InboxListInvoicesPageAsync>> =
            listInvoices(params, RequestOptions.none())

        /** @see [listInvoices] */
        fun listInvoices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboxListInvoicesPageAsync>> =
            listInvoices(InboxListInvoicesParams.none(), requestOptions)
    }
}
