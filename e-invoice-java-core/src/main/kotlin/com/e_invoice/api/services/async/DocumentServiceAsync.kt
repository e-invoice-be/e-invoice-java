// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.documents.DocumentCreate
import com.e_invoice.api.models.documents.DocumentCreateFromPdfParams
import com.e_invoice.api.models.documents.DocumentCreateFromPdfResponse
import com.e_invoice.api.models.documents.DocumentCreateParams
import com.e_invoice.api.models.documents.DocumentDeleteParams
import com.e_invoice.api.models.documents.DocumentDeleteResponse
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.models.documents.DocumentRetrieveParams
import com.e_invoice.api.models.documents.DocumentSendParams
import com.e_invoice.api.models.documents.DocumentValidateParams
import com.e_invoice.api.models.validate.UblDocumentValidation
import com.e_invoice.api.services.async.documents.AttachmentServiceAsync
import com.e_invoice.api.services.async.documents.UblServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    fun attachments(): AttachmentServiceAsync

    fun ubl(): UblServiceAsync

    /** Create a new invoice or credit note */
    fun create(params: DocumentCreateParams): CompletableFuture<DocumentResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** @see create */
    fun create(
        documentCreate: DocumentCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse> =
        create(
            DocumentCreateParams.builder().documentCreate(documentCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(documentCreate: DocumentCreate): CompletableFuture<DocumentResponse> =
        create(documentCreate, RequestOptions.none())

    /** Get an invoice or credit note by ID */
    fun retrieve(documentId: String): CompletableFuture<DocumentResponse> =
        retrieve(documentId, DocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse> =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): CompletableFuture<DocumentResponse> = retrieve(documentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<DocumentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentResponse> =
        retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

    /** Delete an invoice or credit note */
    fun delete(documentId: String): CompletableFuture<DocumentDeleteResponse> =
        delete(documentId, DocumentDeleteParams.none())

    /** @see delete */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentDeleteResponse> =
        delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        documentId: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
    ): CompletableFuture<DocumentDeleteResponse> = delete(documentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentDeleteResponse>

    /** @see delete */
    fun delete(params: DocumentDeleteParams): CompletableFuture<DocumentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentDeleteResponse> =
        delete(documentId, DocumentDeleteParams.none(), requestOptions)

    /**
     * Create a new invoice or credit note from a PDF file. If the 'ubl_document' field is set in
     * the response, it indicates that sufficient details were extracted from the PDF to
     * automatically generate a valid UBL document ready for sending. If 'ubl_document' is not set,
     * human intervention may be required to ensure compliance.
     */
    fun createFromPdf(
        params: DocumentCreateFromPdfParams
    ): CompletableFuture<DocumentCreateFromPdfResponse> =
        createFromPdf(params, RequestOptions.none())

    /** @see createFromPdf */
    fun createFromPdf(
        params: DocumentCreateFromPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateFromPdfResponse>

    /**
     * Send an invoice or credit note via Peppol. By default, the sender and receiver Peppol IDs are
     * derived from the company (tax) IDs in the document, regardless of whether the document was
     * created from a UBL with a different endpoint ID. To explicitly set the sender or receiver
     * Peppol ID, provide them via the query parameters (sender_peppol_scheme, sender_peppol_id,
     * receiver_peppol_scheme, receiver_peppol_id).
     */
    fun send(documentId: String): CompletableFuture<DocumentResponse> =
        send(documentId, DocumentSendParams.none())

    /** @see send */
    fun send(
        documentId: String,
        params: DocumentSendParams = DocumentSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse> =
        send(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see send */
    fun send(
        documentId: String,
        params: DocumentSendParams = DocumentSendParams.none(),
    ): CompletableFuture<DocumentResponse> = send(documentId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: DocumentSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentResponse>

    /** @see send */
    fun send(params: DocumentSendParams): CompletableFuture<DocumentResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentResponse> =
        send(documentId, DocumentSendParams.none(), requestOptions)

    /** Validate a UBL document according to Peppol BIS Billing 3.0 */
    fun validate(documentId: String): CompletableFuture<UblDocumentValidation> =
        validate(documentId, DocumentValidateParams.none())

    /** @see validate */
    fun validate(
        documentId: String,
        params: DocumentValidateParams = DocumentValidateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UblDocumentValidation> =
        validate(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see validate */
    fun validate(
        documentId: String,
        params: DocumentValidateParams = DocumentValidateParams.none(),
    ): CompletableFuture<UblDocumentValidation> =
        validate(documentId, params, RequestOptions.none())

    /** @see validate */
    fun validate(
        params: DocumentValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UblDocumentValidation>

    /** @see validate */
    fun validate(params: DocumentValidateParams): CompletableFuture<UblDocumentValidation> =
        validate(params, RequestOptions.none())

    /** @see validate */
    fun validate(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UblDocumentValidation> =
        validate(documentId, DocumentValidateParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

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

        /** @see create */
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /** @see create */
        fun create(
            documentCreate: DocumentCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            create(
                DocumentCreateParams.builder().documentCreate(documentCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            documentCreate: DocumentCreate
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            create(documentCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/documents/{document_id}`, but is otherwise the
         * same as [DocumentServiceAsync.retrieve].
         */
        fun retrieve(documentId: String): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(documentId, DocumentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
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

        /** @see delete */
        fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            documentId: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(documentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DocumentDeleteParams
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(documentId, DocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/documents/pdf`, but is otherwise the same as
         * [DocumentServiceAsync.createFromPdf].
         */
        fun createFromPdf(
            params: DocumentCreateFromPdfParams
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> =
            createFromPdf(params, RequestOptions.none())

        /** @see createFromPdf */
        fun createFromPdf(
            params: DocumentCreateFromPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>>

        /**
         * Returns a raw HTTP response for `post /api/documents/{document_id}/send`, but is
         * otherwise the same as [DocumentServiceAsync.send].
         */
        fun send(documentId: String): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(documentId, DocumentSendParams.none())

        /** @see send */
        fun send(
            documentId: String,
            params: DocumentSendParams = DocumentSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see send */
        fun send(
            documentId: String,
            params: DocumentSendParams = DocumentSendParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(documentId, params, RequestOptions.none())

        /** @see send */
        fun send(
            params: DocumentSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentResponse>>

        /** @see send */
        fun send(params: DocumentSendParams): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentResponse>> =
            send(documentId, DocumentSendParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/documents/{document_id}/validate`, but is
         * otherwise the same as [DocumentServiceAsync.validate].
         */
        fun validate(
            documentId: String
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validate(documentId, DocumentValidateParams.none())

        /** @see validate */
        fun validate(
            documentId: String,
            params: DocumentValidateParams = DocumentValidateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validate(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see validate */
        fun validate(
            documentId: String,
            params: DocumentValidateParams = DocumentValidateParams.none(),
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validate(documentId, params, RequestOptions.none())

        /** @see validate */
        fun validate(
            params: DocumentValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>>

        /** @see validate */
        fun validate(
            params: DocumentValidateParams
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validate(params, RequestOptions.none())

        /** @see validate */
        fun validate(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validate(documentId, DocumentValidateParams.none(), requestOptions)
    }
}
