// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.documents.attachments.AttachmentAddParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteResponse
import com.e_invoice.api.models.documents.attachments.AttachmentListParams
import com.e_invoice.api.models.documents.attachments.AttachmentRetrieveParams
import com.e_invoice.api.models.documents.attachments.DocumentAttachment
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttachmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentServiceAsync

    /**
     * Get attachment details with for an invoice or credit note with link to download file (signed
     * URL, valid for 1 hour)
     */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams,
    ): CompletableFuture<DocumentAttachment> = retrieve(attachmentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentAttachment> =
        retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: AttachmentRetrieveParams): CompletableFuture<DocumentAttachment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentAttachment>

    /** Get all attachments for an invoice or credit note */
    fun list(documentId: String): CompletableFuture<List<DocumentAttachment>> =
        list(documentId, AttachmentListParams.none())

    /** @see [list] */
    fun list(
        documentId: String,
        params: AttachmentListParams = AttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DocumentAttachment>> =
        list(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [list] */
    fun list(
        documentId: String,
        params: AttachmentListParams = AttachmentListParams.none(),
    ): CompletableFuture<List<DocumentAttachment>> = list(documentId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DocumentAttachment>>

    /** @see [list] */
    fun list(params: AttachmentListParams): CompletableFuture<List<DocumentAttachment>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DocumentAttachment>> =
        list(documentId, AttachmentListParams.none(), requestOptions)

    /** Delete an attachment from an invoice or credit note */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams,
    ): CompletableFuture<AttachmentDeleteResponse> =
        delete(attachmentId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttachmentDeleteResponse> =
        delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: AttachmentDeleteParams): CompletableFuture<AttachmentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttachmentDeleteResponse>

    /** Add a new attachment to an invoice or credit note */
    fun add(
        documentId: String,
        params: AttachmentAddParams,
    ): CompletableFuture<DocumentAttachment> = add(documentId, params, RequestOptions.none())

    /** @see [add] */
    fun add(
        documentId: String,
        params: AttachmentAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentAttachment> =
        add(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [add] */
    fun add(params: AttachmentAddParams): CompletableFuture<DocumentAttachment> =
        add(params, RequestOptions.none())

    /** @see [add] */
    fun add(
        params: AttachmentAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentAttachment>

    /**
     * A view of [AttachmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/documents/{document_id}/attachments/{attachment_id}`, but is otherwise the same as
         * [AttachmentServiceAsync.retrieve].
         */
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams,
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> =
            retrieve(attachmentId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> =
            retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: AttachmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>>

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}/attachments`, but is
         * otherwise the same as [AttachmentServiceAsync.list].
         */
        fun list(documentId: String): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>> =
            list(documentId, AttachmentListParams.none())

        /** @see [list] */
        fun list(
            documentId: String,
            params: AttachmentListParams = AttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>> =
            list(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [list] */
        fun list(
            documentId: String,
            params: AttachmentListParams = AttachmentListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>> =
            list(documentId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>>

        /** @see [list] */
        fun list(
            params: AttachmentListParams
        ): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>> =
            list(documentId, AttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/documents/{document_id}/attachments/{attachment_id}`, but is otherwise the same as
         * [AttachmentServiceAsync.delete].
         */
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams,
        ): CompletableFuture<HttpResponseFor<AttachmentDeleteResponse>> =
            delete(attachmentId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentDeleteResponse>> =
            delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            params: AttachmentDeleteParams
        ): CompletableFuture<HttpResponseFor<AttachmentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /api/documents/{document_id}/attachments`, but is
         * otherwise the same as [AttachmentServiceAsync.add].
         */
        fun add(
            documentId: String,
            params: AttachmentAddParams,
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> =
            add(documentId, params, RequestOptions.none())

        /** @see [add] */
        fun add(
            documentId: String,
            params: AttachmentAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> =
            add(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [add] */
        fun add(
            params: AttachmentAddParams
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> =
            add(params, RequestOptions.none())

        /** @see [add] */
        fun add(
            params: AttachmentAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>>
    }
}
