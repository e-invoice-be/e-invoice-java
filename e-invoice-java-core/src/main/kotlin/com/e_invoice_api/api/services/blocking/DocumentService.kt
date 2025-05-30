// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.blocking

import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.models.documents.DocumentCreateParams
import com.e_invoice_api.api.models.documents.DocumentDeleteParams
import com.e_invoice_api.api.models.documents.DocumentDeleteResponse
import com.e_invoice_api.api.models.documents.DocumentResponse
import com.e_invoice_api.api.models.documents.DocumentRetrieveParams
import com.e_invoice_api.api.models.documents.DocumentSendParams
import com.e_invoice_api.api.services.blocking.documents.AttachmentService
import com.e_invoice_api.api.services.blocking.documents.UblService
import com.google.errorprone.annotations.MustBeClosed

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun attachments(): AttachmentService

    fun ubl(): UblService

    /** Create a new invoice or credit note */
    fun create(params: DocumentCreateParams): DocumentResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse

    /** Get an invoice or credit note by ID */
    fun retrieve(documentId: String): DocumentResponse =
        retrieve(documentId, DocumentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): DocumentResponse = retrieve(documentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse

    /** @see [retrieve] */
    fun retrieve(params: DocumentRetrieveParams): DocumentResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(documentId: String, requestOptions: RequestOptions): DocumentResponse =
        retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

    /** Delete an invoice or credit note */
    fun delete(documentId: String): DocumentDeleteResponse =
        delete(documentId, DocumentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentDeleteResponse =
        delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
    ): DocumentDeleteResponse = delete(documentId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentDeleteResponse

    /** @see [delete] */
    fun delete(params: DocumentDeleteParams): DocumentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(documentId: String, requestOptions: RequestOptions): DocumentDeleteResponse =
        delete(documentId, DocumentDeleteParams.none(), requestOptions)

    /** Send an invoice or credit note via Peppol */
    fun send(documentId: String): DocumentResponse = send(documentId, DocumentSendParams.none())

    /** @see [send] */
    fun send(
        documentId: String,
        params: DocumentSendParams = DocumentSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse = send(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [send] */
    fun send(
        documentId: String,
        params: DocumentSendParams = DocumentSendParams.none(),
    ): DocumentResponse = send(documentId, params, RequestOptions.none())

    /** @see [send] */
    fun send(
        params: DocumentSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentResponse

    /** @see [send] */
    fun send(params: DocumentSendParams): DocumentResponse = send(params, RequestOptions.none())

    /** @see [send] */
    fun send(documentId: String, requestOptions: RequestOptions): DocumentResponse =
        send(documentId, DocumentSendParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun attachments(): AttachmentService.WithRawResponse

        fun ubl(): UblService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/documents/`, but is otherwise the same as
         * [DocumentService.create].
         */
        @MustBeClosed
        fun create(params: DocumentCreateParams): HttpResponseFor<DocumentResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse>

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}`, but is otherwise the
         * same as [DocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(documentId: String): HttpResponseFor<DocumentResponse> =
            retrieve(documentId, DocumentRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): HttpResponseFor<DocumentResponse> = retrieve(documentId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: DocumentRetrieveParams): HttpResponseFor<DocumentResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> =
            retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/documents/{document_id}`, but is otherwise
         * the same as [DocumentService.delete].
         */
        @MustBeClosed
        fun delete(documentId: String): HttpResponseFor<DocumentDeleteResponse> =
            delete(documentId, DocumentDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentDeleteResponse> =
            delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
        ): HttpResponseFor<DocumentDeleteResponse> =
            delete(documentId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: DocumentDeleteParams): HttpResponseFor<DocumentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentDeleteResponse> =
            delete(documentId, DocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/documents/{document_id}/send`, but is
         * otherwise the same as [DocumentService.send].
         */
        @MustBeClosed
        fun send(documentId: String): HttpResponseFor<DocumentResponse> =
            send(documentId, DocumentSendParams.none())

        /** @see [send] */
        @MustBeClosed
        fun send(
            documentId: String,
            params: DocumentSendParams = DocumentSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse> =
            send(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [send] */
        @MustBeClosed
        fun send(
            documentId: String,
            params: DocumentSendParams = DocumentSendParams.none(),
        ): HttpResponseFor<DocumentResponse> = send(documentId, params, RequestOptions.none())

        /** @see [send] */
        @MustBeClosed
        fun send(
            params: DocumentSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentResponse>

        /** @see [send] */
        @MustBeClosed
        fun send(params: DocumentSendParams): HttpResponseFor<DocumentResponse> =
            send(params, RequestOptions.none())

        /** @see [send] */
        @MustBeClosed
        fun send(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> =
            send(documentId, DocumentSendParams.none(), requestOptions)
    }
}
