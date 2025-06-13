// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking.documents

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.documents.attachments.AttachmentAddParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteResponse
import com.e_invoice.api.models.documents.attachments.AttachmentListParams
import com.e_invoice.api.models.documents.attachments.AttachmentRetrieveParams
import com.e_invoice.api.models.documents.attachments.DocumentAttachment
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AttachmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentService

    /**
     * Get attachment details with for an invoice or credit note with link to download file (signed
     * URL, valid for 1 hour)
     */
    fun retrieve(attachmentId: String, params: AttachmentRetrieveParams): DocumentAttachment =
        retrieve(attachmentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentAttachment =
        retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: AttachmentRetrieveParams): DocumentAttachment =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentAttachment

    /** Get all attachments for an invoice or credit note */
    fun list(documentId: String): List<DocumentAttachment> =
        list(documentId, AttachmentListParams.none())

    /** @see [list] */
    fun list(
        documentId: String,
        params: AttachmentListParams = AttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DocumentAttachment> =
        list(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [list] */
    fun list(
        documentId: String,
        params: AttachmentListParams = AttachmentListParams.none(),
    ): List<DocumentAttachment> = list(documentId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DocumentAttachment>

    /** @see [list] */
    fun list(params: AttachmentListParams): List<DocumentAttachment> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(documentId: String, requestOptions: RequestOptions): List<DocumentAttachment> =
        list(documentId, AttachmentListParams.none(), requestOptions)

    /** Delete an attachment from an invoice or credit note */
    fun delete(attachmentId: String, params: AttachmentDeleteParams): AttachmentDeleteResponse =
        delete(attachmentId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentDeleteResponse =
        delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: AttachmentDeleteParams): AttachmentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentDeleteResponse

    /** Add a new attachment to an invoice or credit note */
    fun add(documentId: String, params: AttachmentAddParams): DocumentAttachment =
        add(documentId, params, RequestOptions.none())

    /** @see [add] */
    fun add(
        documentId: String,
        params: AttachmentAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentAttachment = add(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [add] */
    fun add(params: AttachmentAddParams): DocumentAttachment = add(params, RequestOptions.none())

    /** @see [add] */
    fun add(
        params: AttachmentAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentAttachment

    /** A view of [AttachmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/documents/{document_id}/attachments/{attachment_id}`, but is otherwise the same as
         * [AttachmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams,
        ): HttpResponseFor<DocumentAttachment> =
            retrieve(attachmentId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentAttachment> =
            retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AttachmentRetrieveParams): HttpResponseFor<DocumentAttachment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentAttachment>

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}/attachments`, but is
         * otherwise the same as [AttachmentService.list].
         */
        @MustBeClosed
        fun list(documentId: String): HttpResponseFor<List<DocumentAttachment>> =
            list(documentId, AttachmentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            documentId: String,
            params: AttachmentListParams = AttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DocumentAttachment>> =
            list(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            documentId: String,
            params: AttachmentListParams = AttachmentListParams.none(),
        ): HttpResponseFor<List<DocumentAttachment>> =
            list(documentId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DocumentAttachment>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: AttachmentListParams): HttpResponseFor<List<DocumentAttachment>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DocumentAttachment>> =
            list(documentId, AttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/documents/{document_id}/attachments/{attachment_id}`, but is otherwise the same as
         * [AttachmentService.delete].
         */
        @MustBeClosed
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams,
        ): HttpResponseFor<AttachmentDeleteResponse> =
            delete(attachmentId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentDeleteResponse> =
            delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: AttachmentDeleteParams): HttpResponseFor<AttachmentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /api/documents/{document_id}/attachments`, but is
         * otherwise the same as [AttachmentService.add].
         */
        @MustBeClosed
        fun add(
            documentId: String,
            params: AttachmentAddParams,
        ): HttpResponseFor<DocumentAttachment> = add(documentId, params, RequestOptions.none())

        /** @see [add] */
        @MustBeClosed
        fun add(
            documentId: String,
            params: AttachmentAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentAttachment> =
            add(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [add] */
        @MustBeClosed
        fun add(params: AttachmentAddParams): HttpResponseFor<DocumentAttachment> =
            add(params, RequestOptions.none())

        /** @see [add] */
        @MustBeClosed
        fun add(
            params: AttachmentAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentAttachment>
    }
}
