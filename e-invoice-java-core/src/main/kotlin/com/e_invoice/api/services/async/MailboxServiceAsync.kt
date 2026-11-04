package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponse
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.mailbox.InboundEmailResponse
import com.e_invoice.api.models.mailbox.MailboxDownloadAttachmentParams
import com.e_invoice.api.models.mailbox.MailboxListPageAsync
import com.e_invoice.api.models.mailbox.MailboxListParams
import com.e_invoice.api.models.mailbox.MailboxReprocessParams
import com.e_invoice.api.models.mailbox.MailboxRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MailboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MailboxServiceAsync

    /**
     * Retrieve a paginated list of received inbound emails with filtering, search, and sorting
     * options.
     */
    fun list(): CompletableFuture<MailboxListPageAsync> = list(MailboxListParams.none())

    /** @see list */
    fun list(
        params: MailboxListParams = MailboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MailboxListPageAsync>

    /** @see list */
    fun list(
        params: MailboxListParams = MailboxListParams.none()
    ): CompletableFuture<MailboxListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MailboxListPageAsync> =
        list(MailboxListParams.none(), requestOptions)

    /** Retrieve a single inbound email by ID, scoped to the caller's tenant. */
    fun retrieve(inboundEmailId: String): CompletableFuture<InboundEmailResponse> =
        retrieve(inboundEmailId, MailboxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundEmailId: String,
        params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundEmailResponse> =
        retrieve(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        inboundEmailId: String,
        params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
    ): CompletableFuture<InboundEmailResponse> =
        retrieve(inboundEmailId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MailboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundEmailResponse>

    /** @see retrieve */
    fun retrieve(params: MailboxRetrieveParams): CompletableFuture<InboundEmailResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundEmailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundEmailResponse> =
        retrieve(inboundEmailId, MailboxRetrieveParams.none(), requestOptions)

    /**
     * Download a specific attachment from an inbound email by filename. Returns the binary content
     * with the correct Content-Type.
     */
    fun downloadAttachment(
        filename: String,
        params: MailboxDownloadAttachmentParams,
    ): CompletableFuture<HttpResponse> = downloadAttachment(filename, params, RequestOptions.none())

    /** @see downloadAttachment */
    fun downloadAttachment(
        filename: String,
        params: MailboxDownloadAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        downloadAttachment(params.toBuilder().filename(filename).build(), requestOptions)

    /** @see downloadAttachment */
    fun downloadAttachment(
        params: MailboxDownloadAttachmentParams
    ): CompletableFuture<HttpResponse> = downloadAttachment(params, RequestOptions.none())

    /** @see downloadAttachment */
    fun downloadAttachment(
        params: MailboxDownloadAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Retry processing of a previously failed inbound email by replaying the original email
     * payload.
     */
    fun reprocess(inboundEmailId: String): CompletableFuture<InboundEmailResponse> =
        reprocess(inboundEmailId, MailboxReprocessParams.none())

    /** @see reprocess */
    fun reprocess(
        inboundEmailId: String,
        params: MailboxReprocessParams = MailboxReprocessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundEmailResponse> =
        reprocess(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

    /** @see reprocess */
    fun reprocess(
        inboundEmailId: String,
        params: MailboxReprocessParams = MailboxReprocessParams.none(),
    ): CompletableFuture<InboundEmailResponse> =
        reprocess(inboundEmailId, params, RequestOptions.none())

    /** @see reprocess */
    fun reprocess(
        params: MailboxReprocessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundEmailResponse>

    /** @see reprocess */
    fun reprocess(params: MailboxReprocessParams): CompletableFuture<InboundEmailResponse> =
        reprocess(params, RequestOptions.none())

    /** @see reprocess */
    fun reprocess(
        inboundEmailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundEmailResponse> =
        reprocess(inboundEmailId, MailboxReprocessParams.none(), requestOptions)

    /**
     * A view of [MailboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MailboxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/mailbox/`, but is otherwise the same as
         * [MailboxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MailboxListPageAsync>> =
            list(MailboxListParams.none())

        /** @see list */
        fun list(
            params: MailboxListParams = MailboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MailboxListPageAsync>>

        /** @see list */
        fun list(
            params: MailboxListParams = MailboxListParams.none()
        ): CompletableFuture<HttpResponseFor<MailboxListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MailboxListPageAsync>> =
            list(MailboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/mailbox/{inbound_email_id}`, but is otherwise
         * the same as [MailboxServiceAsync.retrieve].
         */
        fun retrieve(
            inboundEmailId: String
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            retrieve(inboundEmailId, MailboxRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboundEmailId: String,
            params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            retrieve(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            inboundEmailId: String,
            params: MailboxRetrieveParams = MailboxRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            retrieve(inboundEmailId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MailboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MailboxRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundEmailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            retrieve(inboundEmailId, MailboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/mailbox/{inbound_email_id}/attachments/{filename}`, but is otherwise the same as
         * [MailboxServiceAsync.downloadAttachment].
         */
        fun downloadAttachment(
            filename: String,
            params: MailboxDownloadAttachmentParams,
        ): CompletableFuture<HttpResponse> =
            downloadAttachment(filename, params, RequestOptions.none())

        /** @see downloadAttachment */
        fun downloadAttachment(
            filename: String,
            params: MailboxDownloadAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            downloadAttachment(params.toBuilder().filename(filename).build(), requestOptions)

        /** @see downloadAttachment */
        fun downloadAttachment(
            params: MailboxDownloadAttachmentParams
        ): CompletableFuture<HttpResponse> = downloadAttachment(params, RequestOptions.none())

        /** @see downloadAttachment */
        fun downloadAttachment(
            params: MailboxDownloadAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /api/mailbox/{inbound_email_id}/reprocess`, but is
         * otherwise the same as [MailboxServiceAsync.reprocess].
         */
        fun reprocess(
            inboundEmailId: String
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            reprocess(inboundEmailId, MailboxReprocessParams.none())

        /** @see reprocess */
        fun reprocess(
            inboundEmailId: String,
            params: MailboxReprocessParams = MailboxReprocessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            reprocess(params.toBuilder().inboundEmailId(inboundEmailId).build(), requestOptions)

        /** @see reprocess */
        fun reprocess(
            inboundEmailId: String,
            params: MailboxReprocessParams = MailboxReprocessParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            reprocess(inboundEmailId, params, RequestOptions.none())

        /** @see reprocess */
        fun reprocess(
            params: MailboxReprocessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>>

        /** @see reprocess */
        fun reprocess(
            params: MailboxReprocessParams
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            reprocess(params, RequestOptions.none())

        /** @see reprocess */
        fun reprocess(
            inboundEmailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> =
            reprocess(inboundEmailId, MailboxReprocessParams.none(), requestOptions)
    }
}
