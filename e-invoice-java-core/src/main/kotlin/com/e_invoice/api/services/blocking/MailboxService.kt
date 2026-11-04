package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponse
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.mailbox.InboundEmailResponse
import com.e_invoice.api.models.mailbox.MailboxDownloadAttachmentParams
import com.e_invoice.api.models.mailbox.MailboxListPage
import com.e_invoice.api.models.mailbox.MailboxListParams
import com.e_invoice.api.models.mailbox.MailboxReprocessParams
import com.e_invoice.api.models.mailbox.MailboxRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MailboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MailboxService

    /**
     * Retrieve a paginated list of received inbound emails with filtering, search, and sorting
     * options.
     */
    fun list(): MailboxListPage = list(MailboxListParams.none())

    /** @see list */
    fun list(
        params: MailboxListParams = MailboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MailboxListPage

    /** @see list */
    fun list(params: MailboxListParams = MailboxListParams.none()): MailboxListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MailboxListPage =
        list(MailboxListParams.none(), requestOptions)

    /** Retrieve a single inbound email by ID, scoped to the caller's tenant. */
    fun retrieve(inboundEmailId: String): InboundEmailResponse =
        retrieve(inboundEmailId, MailboxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundEmailId: String,
        params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundEmailResponse =
        retrieve(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        inboundEmailId: String,
        params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
    ): InboundEmailResponse = retrieve(inboundEmailId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MailboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundEmailResponse

    /** @see retrieve */
    fun retrieve(params: MailboxRetrieveParams): InboundEmailResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(inboundEmailId: String, requestOptions: RequestOptions): InboundEmailResponse =
        retrieve(inboundEmailId, MailboxRetrieveParams.none(), requestOptions)

    /**
     * Download a specific attachment from an inbound email by filename. Returns the binary content
     * with the correct Content-Type.
     */
    @MustBeClosed
    fun downloadAttachment(
        filename: String,
        params: MailboxDownloadAttachmentParams,
    ): HttpResponse = downloadAttachment(filename, params, RequestOptions.none())

    /** @see downloadAttachment */
    @MustBeClosed
    fun downloadAttachment(
        filename: String,
        params: MailboxDownloadAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        downloadAttachment(params.toBuilder().filename(filename).build(), requestOptions)

    /** @see downloadAttachment */
    @MustBeClosed
    fun downloadAttachment(params: MailboxDownloadAttachmentParams): HttpResponse =
        downloadAttachment(params, RequestOptions.none())

    /** @see downloadAttachment */
    @MustBeClosed
    fun downloadAttachment(
        params: MailboxDownloadAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Retry processing of a previously failed inbound email by replaying the original email
     * payload.
     */
    fun reprocess(inboundEmailId: String): InboundEmailResponse =
        reprocess(inboundEmailId, MailboxReprocessParams.none())

    /** @see reprocess */
    fun reprocess(
        inboundEmailId: String,
        params: MailboxReprocessParams = MailboxReprocessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundEmailResponse =
        reprocess(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

    /** @see reprocess */
    fun reprocess(
        inboundEmailId: String,
        params: MailboxReprocessParams = MailboxReprocessParams.none(),
    ): InboundEmailResponse = reprocess(inboundEmailId, params, RequestOptions.none())

    /** @see reprocess */
    fun reprocess(
        params: MailboxReprocessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundEmailResponse

    /** @see reprocess */
    fun reprocess(params: MailboxReprocessParams): InboundEmailResponse =
        reprocess(params, RequestOptions.none())

    /** @see reprocess */
    fun reprocess(inboundEmailId: String, requestOptions: RequestOptions): InboundEmailResponse =
        reprocess(inboundEmailId, MailboxReprocessParams.none(), requestOptions)

    /** A view of [MailboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MailboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/mailbox/`, but is otherwise the same as
         * [MailboxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MailboxListPage> = list(MailboxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MailboxListParams = MailboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MailboxListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MailboxListParams = MailboxListParams.none()
        ): HttpResponseFor<MailboxListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MailboxListPage> =
            list(MailboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/mailbox/{inbound_email_id}`, but is otherwise
         * the same as [MailboxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(inboundEmailId: String): HttpResponseFor<InboundEmailResponse> =
            retrieve(inboundEmailId, MailboxRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundEmailId: String,
            params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundEmailResponse> =
            retrieve(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundEmailId: String,
            params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
        ): HttpResponseFor<InboundEmailResponse> =
            retrieve(inboundEmailId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MailboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundEmailResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MailboxRetrieveParams): HttpResponseFor<InboundEmailResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundEmailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundEmailResponse> =
            retrieve(inboundEmailId, MailboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/mailbox/{inbound_email_id}/attachments/{filename}`, but is otherwise the same as
         * [MailboxService.downloadAttachment].
         */
        @MustBeClosed
        fun downloadAttachment(
            filename: String,
            params: MailboxDownloadAttachmentParams,
        ): HttpResponse = downloadAttachment(filename, params, RequestOptions.none())

        /** @see downloadAttachment */
        @MustBeClosed
        fun downloadAttachment(
            filename: String,
            params: MailboxDownloadAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            downloadAttachment(params.toBuilder().filename(filename).build(), requestOptions)

        /** @see downloadAttachment */
        @MustBeClosed
        fun downloadAttachment(params: MailboxDownloadAttachmentParams): HttpResponse =
            downloadAttachment(params, RequestOptions.none())

        /** @see downloadAttachment */
        @MustBeClosed
        fun downloadAttachment(
            params: MailboxDownloadAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /api/mailbox/{inbound_email_id}/reprocess`, but is
         * otherwise the same as [MailboxService.reprocess].
         */
        @MustBeClosed
        fun reprocess(inboundEmailId: String): HttpResponseFor<InboundEmailResponse> =
            reprocess(inboundEmailId, MailboxReprocessParams.none())

        /** @see reprocess */
        @MustBeClosed
        fun reprocess(
            inboundEmailId: String,
            params: MailboxReprocessParams = MailboxReprocessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundEmailResponse> =
            reprocess(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

        /** @see reprocess */
        @MustBeClosed
        fun reprocess(
            inboundEmailId: String,
            params: MailboxReprocessParams = MailboxReprocessParams.none(),
        ): HttpResponseFor<InboundEmailResponse> =
            reprocess(inboundEmailId, params, RequestOptions.none())

        /** @see reprocess */
        @MustBeClosed
        fun reprocess(
            params: MailboxReprocessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundEmailResponse>

        /** @see reprocess */
        @MustBeClosed
        fun reprocess(params: MailboxReprocessParams): HttpResponseFor<InboundEmailResponse> =
            reprocess(params, RequestOptions.none())

        /** @see reprocess */
        @MustBeClosed
        fun reprocess(
            inboundEmailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundEmailResponse> =
            reprocess(inboundEmailId, MailboxReprocessParams.none(), requestOptions)
    }
}
