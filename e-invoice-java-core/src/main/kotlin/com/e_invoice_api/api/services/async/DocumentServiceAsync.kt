// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.async

import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.models.documents.DocumentCreateParams
import com.e_invoice_api.api.models.documents.DocumentDeleteParams
import com.e_invoice_api.api.models.documents.DocumentDeleteResponse
import com.e_invoice_api.api.models.documents.DocumentResponse
import com.e_invoice_api.api.models.documents.DocumentRetrieveParams
import com.e_invoice_api.api.models.documents.DocumentSendParams
import com.e_invoice_api.api.services.async.documents.AttachmentServiceAsync
import com.e_invoice_api.api.services.async.documents.UblServiceAsync
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun attachments(): AttachmentServiceAsync

    fun ubl(): UblServiceAsync

    /** Create a new invoice or credit note */
    fun create(params: DocumentCreateParams): CompletableFuture<DocumentResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** Get an invoice or credit note by ID */
    fun retrieve(documentId: String): CompletableFuture<DocumentResponse> =
        retrieve(documentId, DocumentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse> =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): CompletableFuture<DocumentResponse> = retrieve(documentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** @see [retrieve] */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<DocumentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentResponse> =
        retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

    /** Delete an invoice or credit note */
    fun delete(documentId: String): CompletableFuture<DocumentDeleteResponse> =
        delete(documentId, DocumentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentDeleteResponse> =
        delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
    ): CompletableFuture<DocumentDeleteResponse> = delete(documentId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentDeleteResponse>

    /** @see [delete] */
    fun delete(params: DocumentDeleteParams): CompletableFuture<DocumentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentDeleteResponse> =
        delete(documentId, DocumentDeleteParams.none(), requestOptions)

    /** Send an invoice or credit note via Peppol */
    fun send(documentId: String): CompletableFuture<DocumentResponse> =
        send(documentId, DocumentSendParams.none())

    /** @see [send] */
    fun send(
        documentId: String,
        params: DocumentSendParams = DocumentSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse> =
        send(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [send] */
    fun send(
        documentId: String,
        params: DocumentSendParams = DocumentSendParams.none(),
    ): CompletableFuture<DocumentResponse> = send(documentId, params, RequestOptions.none())

    /** @see [send] */
    fun send(
        params: DocumentSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** @see [send] */
    fun send(params: DocumentSendParams): CompletableFuture<DocumentResponse> =
        send(params, RequestOptions.none())

    /** @see [send] */
    fun send(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentResponse> =
        send(documentId, DocumentSendParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun attachments(): AttachmentServiceAsync.WithRawResponse

        fun ubl(): UblServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/documents/`, but is otherwise the same as
         * [DocumentServiceAsync.create].
         */
        fun create(
            params: DocumentCreateParams
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}`, but is otherwise the
         * same as [DocumentServiceAsync.retrieve].
         */
        fun retrieve(documentId: String): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(documentId, DocumentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: DocumentRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/documents/{document_id}`, but is otherwise
         * the same as [DocumentServiceAsync.delete].
         */
        fun delete(documentId: String): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(documentId, DocumentDeleteParams.none())

        /** @see [delete] */
        fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(documentId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: DocumentDeleteParams
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(documentId, DocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/documents/{document_id}/send`, but is
         * otherwise the same as [DocumentServiceAsync.send].
         */
        fun send(documentId: String): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(documentId, DocumentSendParams.none())

        /** @see [send] */
        fun send(
            documentId: String,
            params: DocumentSendParams = DocumentSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [send] */
        fun send(
            documentId: String,
            params: DocumentSendParams = DocumentSendParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(documentId, params, RequestOptions.none())

        /** @see [send] */
        fun send(
            params: DocumentSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /** @see [send] */
        fun send(params: DocumentSendParams): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(params, RequestOptions.none())

        /** @see [send] */
        fun send(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(documentId, DocumentSendParams.none(), requestOptions)
    }
}
