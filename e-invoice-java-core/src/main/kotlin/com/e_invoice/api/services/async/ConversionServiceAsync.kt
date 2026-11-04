package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.conversion.ConversionCreateFromPdfParams
import com.e_invoice.api.models.conversion.ConversionRetrievePdfResultParams
import com.e_invoice.api.models.conversion.ConversionRetrievePdfStatusParams
import com.e_invoice.api.models.conversion.DocumentCreateFromPdfTask
import com.e_invoice.api.models.documents.DocumentCreateFromPdfResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConversionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversionServiceAsync

    /**
     * Start an asynchronous conversion of a PDF to a document. Poll the returned task with
     * [retrievePdfStatus] and fetch the converted document with [retrievePdfResult].
     */
    fun createFromPdf(
        params: ConversionCreateFromPdfParams
    ): CompletableFuture<DocumentCreateFromPdfTask> = createFromPdf(params, RequestOptions.none())

    /** @see createFromPdf */
    fun createFromPdf(
        params: ConversionCreateFromPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateFromPdfTask>

    /** Get the status of a PDF conversion task */
    fun retrievePdfStatus(taskId: String): CompletableFuture<DocumentCreateFromPdfTask> =
        retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none())

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        taskId: String,
        params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateFromPdfTask> =
        retrievePdfStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        taskId: String,
        params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
    ): CompletableFuture<DocumentCreateFromPdfTask> =
        retrievePdfStatus(taskId, params, RequestOptions.none())

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        params: ConversionRetrievePdfStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateFromPdfTask>

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        params: ConversionRetrievePdfStatusParams
    ): CompletableFuture<DocumentCreateFromPdfTask> =
        retrievePdfStatus(params, RequestOptions.none())

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentCreateFromPdfTask> =
        retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none(), requestOptions)

    /** Get the result of a PDF conversion task */
    fun retrievePdfResult(taskId: String): CompletableFuture<DocumentCreateFromPdfResponse> =
        retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none())

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        taskId: String,
        params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateFromPdfResponse> =
        retrievePdfResult(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        taskId: String,
        params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
    ): CompletableFuture<DocumentCreateFromPdfResponse> =
        retrievePdfResult(taskId, params, RequestOptions.none())

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        params: ConversionRetrievePdfResultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateFromPdfResponse>

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        params: ConversionRetrievePdfResultParams
    ): CompletableFuture<DocumentCreateFromPdfResponse> =
        retrievePdfResult(params, RequestOptions.none())

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentCreateFromPdfResponse> =
        retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none(), requestOptions)

    /**
     * A view of [ConversionServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConversionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/conversion/pdf`, but is otherwise the same as
         * [ConversionServiceAsync.createFromPdf].
         */
        fun createFromPdf(
            params: ConversionCreateFromPdfParams
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> =
            createFromPdf(params, RequestOptions.none())

        /** @see createFromPdf */
        fun createFromPdf(
            params: ConversionCreateFromPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>>

        /**
         * Returns a raw HTTP response for `get /api/conversion/pdf/{task_id}`, but is otherwise the
         * same as [ConversionServiceAsync.retrievePdfStatus].
         */
        fun retrievePdfStatus(
            taskId: String
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> =
            retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none())

        /** @see retrievePdfStatus */
        fun retrievePdfStatus(
            taskId: String,
            params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> =
            retrievePdfStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePdfStatus */
        fun retrievePdfStatus(
            taskId: String,
            params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> =
            retrievePdfStatus(taskId, params, RequestOptions.none())

        /** @see retrievePdfStatus */
        fun retrievePdfStatus(
            params: ConversionRetrievePdfStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>>

        /** @see retrievePdfStatus */
        fun retrievePdfStatus(
            params: ConversionRetrievePdfStatusParams
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> =
            retrievePdfStatus(params, RequestOptions.none())

        /** @see retrievePdfStatus */
        fun retrievePdfStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> =
            retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/conversion/pdf/{task_id}/result`, but is
         * otherwise the same as [ConversionServiceAsync.retrievePdfResult].
         */
        fun retrievePdfResult(
            taskId: String
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> =
            retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none())

        /** @see retrievePdfResult */
        fun retrievePdfResult(
            taskId: String,
            params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> =
            retrievePdfResult(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePdfResult */
        fun retrievePdfResult(
            taskId: String,
            params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> =
            retrievePdfResult(taskId, params, RequestOptions.none())

        /** @see retrievePdfResult */
        fun retrievePdfResult(
            params: ConversionRetrievePdfResultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>>

        /** @see retrievePdfResult */
        fun retrievePdfResult(
            params: ConversionRetrievePdfResultParams
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> =
            retrievePdfResult(params, RequestOptions.none())

        /** @see retrievePdfResult */
        fun retrievePdfResult(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> =
            retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none(), requestOptions)
    }
}
