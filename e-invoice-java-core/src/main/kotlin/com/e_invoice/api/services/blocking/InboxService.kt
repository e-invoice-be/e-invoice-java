// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.inbox.InboxListCreditNotesPage
import com.e_invoice.api.models.inbox.InboxListCreditNotesParams
import com.e_invoice.api.models.inbox.InboxListInvoicesPage
import com.e_invoice.api.models.inbox.InboxListInvoicesParams
import com.e_invoice.api.models.inbox.InboxListPage
import com.e_invoice.api.models.inbox.InboxListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService

    /** Retrieve a paginated list of received documents with filtering options. */
    fun list(): InboxListPage = list(InboxListParams.none())

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboxListPage

    /** @see list */
    fun list(params: InboxListParams = InboxListParams.none()): InboxListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InboxListPage =
        list(InboxListParams.none(), requestOptions)

    /** Retrieve a paginated list of received credit notes with filtering options. */
    fun listCreditNotes(): InboxListCreditNotesPage =
        listCreditNotes(InboxListCreditNotesParams.none())

    /** @see listCreditNotes */
    fun listCreditNotes(
        params: InboxListCreditNotesParams = InboxListCreditNotesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboxListCreditNotesPage

    /** @see listCreditNotes */
    fun listCreditNotes(
        params: InboxListCreditNotesParams = InboxListCreditNotesParams.none()
    ): InboxListCreditNotesPage = listCreditNotes(params, RequestOptions.none())

    /** @see listCreditNotes */
    fun listCreditNotes(requestOptions: RequestOptions): InboxListCreditNotesPage =
        listCreditNotes(InboxListCreditNotesParams.none(), requestOptions)

    /** Retrieve a paginated list of received invoices with filtering options. */
    fun listInvoices(): InboxListInvoicesPage = listInvoices(InboxListInvoicesParams.none())

    /** @see listInvoices */
    fun listInvoices(
        params: InboxListInvoicesParams = InboxListInvoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboxListInvoicesPage

    /** @see listInvoices */
    fun listInvoices(
        params: InboxListInvoicesParams = InboxListInvoicesParams.none()
    ): InboxListInvoicesPage = listInvoices(params, RequestOptions.none())

    /** @see listInvoices */
    fun listInvoices(requestOptions: RequestOptions): InboxListInvoicesPage =
        listInvoices(InboxListInvoicesParams.none(), requestOptions)

    /** A view of [InboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/inbox/`, but is otherwise the same as
         * [InboxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<InboxListPage> = list(InboxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboxListParams = InboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboxListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: InboxListParams = InboxListParams.none()): HttpResponseFor<InboxListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboxListPage> =
            list(InboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/inbox/credit-notes`, but is otherwise the same
         * as [InboxService.listCreditNotes].
         */
        @MustBeClosed
        fun listCreditNotes(): HttpResponseFor<InboxListCreditNotesPage> =
            listCreditNotes(InboxListCreditNotesParams.none())

        /** @see listCreditNotes */
        @MustBeClosed
        fun listCreditNotes(
            params: InboxListCreditNotesParams = InboxListCreditNotesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboxListCreditNotesPage>

        /** @see listCreditNotes */
        @MustBeClosed
        fun listCreditNotes(
            params: InboxListCreditNotesParams = InboxListCreditNotesParams.none()
        ): HttpResponseFor<InboxListCreditNotesPage> =
            listCreditNotes(params, RequestOptions.none())

        /** @see listCreditNotes */
        @MustBeClosed
        fun listCreditNotes(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboxListCreditNotesPage> =
            listCreditNotes(InboxListCreditNotesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/inbox/invoices`, but is otherwise the same as
         * [InboxService.listInvoices].
         */
        @MustBeClosed
        fun listInvoices(): HttpResponseFor<InboxListInvoicesPage> =
            listInvoices(InboxListInvoicesParams.none())

        /** @see listInvoices */
        @MustBeClosed
        fun listInvoices(
            params: InboxListInvoicesParams = InboxListInvoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboxListInvoicesPage>

        /** @see listInvoices */
        @MustBeClosed
        fun listInvoices(
            params: InboxListInvoicesParams = InboxListInvoicesParams.none()
        ): HttpResponseFor<InboxListInvoicesPage> = listInvoices(params, RequestOptions.none())

        /** @see listInvoices */
        @MustBeClosed
        fun listInvoices(requestOptions: RequestOptions): HttpResponseFor<InboxListInvoicesPage> =
            listInvoices(InboxListInvoicesParams.none(), requestOptions)
    }
}
