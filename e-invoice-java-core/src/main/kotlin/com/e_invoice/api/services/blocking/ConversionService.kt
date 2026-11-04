package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.conversion.ConversionCreateFromPdfParams
import com.e_invoice.api.models.conversion.ConversionRetrievePdfResultParams
import com.e_invoice.api.models.conversion.ConversionRetrievePdfStatusParams
import com.e_invoice.api.models.conversion.DocumentCreateFromPdfTask
import com.e_invoice.api.models.documents.DocumentCreateFromPdfResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ConversionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversionService

    /**
     * Start an asynchronous conversion of a PDF to a document. Poll the returned task with
     * [retrievePdfStatus] and fetch the converted document with [retrievePdfResult].
     */
    fun createFromPdf(params: ConversionCreateFromPdfParams): DocumentCreateFromPdfTask =
        createFromPdf(params, RequestOptions.none())

    /** @see createFromPdf */
    fun createFromPdf(
        params: ConversionCreateFromPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateFromPdfTask

    /** Get the status of a PDF conversion task */
    fun retrievePdfStatus(taskId: String): DocumentCreateFromPdfTask =
        retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none())

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        taskId: String,
        params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateFromPdfTask =
        retrievePdfStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        taskId: String,
        params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
    ): DocumentCreateFromPdfTask = retrievePdfStatus(taskId, params, RequestOptions.none())

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        params: ConversionRetrievePdfStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateFromPdfTask

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(params: ConversionRetrievePdfStatusParams): DocumentCreateFromPdfTask =
        retrievePdfStatus(params, RequestOptions.none())

    /** @see retrievePdfStatus */
    fun retrievePdfStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): DocumentCreateFromPdfTask =
        retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none(), requestOptions)

    /** Get the result of a PDF conversion task */
    fun retrievePdfResult(taskId: String): DocumentCreateFromPdfResponse =
        retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none())

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        taskId: String,
        params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateFromPdfResponse =
        retrievePdfResult(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        taskId: String,
        params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
    ): DocumentCreateFromPdfResponse = retrievePdfResult(taskId, params, RequestOptions.none())

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        params: ConversionRetrievePdfResultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateFromPdfResponse

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        params: ConversionRetrievePdfResultParams
    ): DocumentCreateFromPdfResponse = retrievePdfResult(params, RequestOptions.none())

    /** @see retrievePdfResult */
    fun retrievePdfResult(
        taskId: String,
        requestOptions: RequestOptions,
    ): DocumentCreateFromPdfResponse =
        retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none(), requestOptions)

    /** A view of [ConversionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/conversion/pdf`, but is otherwise the same as
         * [ConversionService.createFromPdf].
         */
        @MustBeClosed
        fun createFromPdf(
            params: ConversionCreateFromPdfParams
        ): HttpResponseFor<DocumentCreateFromPdfTask> = createFromPdf(params, RequestOptions.none())

        /** @see createFromPdf */
        @MustBeClosed
        fun createFromPdf(
            params: ConversionCreateFromPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateFromPdfTask>

        /**
         * Returns a raw HTTP response for `get /api/conversion/pdf/{task_id}`, but is otherwise the
         * same as [ConversionService.retrievePdfStatus].
         */
        @MustBeClosed
        fun retrievePdfStatus(taskId: String): HttpResponseFor<DocumentCreateFromPdfTask> =
            retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none())

        /** @see retrievePdfStatus */
        @MustBeClosed
        fun retrievePdfStatus(
            taskId: String,
            params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateFromPdfTask> =
            retrievePdfStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePdfStatus */
        @MustBeClosed
        fun retrievePdfStatus(
            taskId: String,
            params: ConversionRetrievePdfStatusParams = ConversionRetrievePdfStatusParams.none(),
        ): HttpResponseFor<DocumentCreateFromPdfTask> =
            retrievePdfStatus(taskId, params, RequestOptions.none())

        /** @see retrievePdfStatus */
        @MustBeClosed
        fun retrievePdfStatus(
            params: ConversionRetrievePdfStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateFromPdfTask>

        /** @see retrievePdfStatus */
        @MustBeClosed
        fun retrievePdfStatus(
            params: ConversionRetrievePdfStatusParams
        ): HttpResponseFor<DocumentCreateFromPdfTask> =
            retrievePdfStatus(params, RequestOptions.none())

        /** @see retrievePdfStatus */
        @MustBeClosed
        fun retrievePdfStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentCreateFromPdfTask> =
            retrievePdfStatus(taskId, ConversionRetrievePdfStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/conversion/pdf/{task_id}/result`, but is
         * otherwise the same as [ConversionService.retrievePdfResult].
         */
        @MustBeClosed
        fun retrievePdfResult(taskId: String): HttpResponseFor<DocumentCreateFromPdfResponse> =
            retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none())

        /** @see retrievePdfResult */
        @MustBeClosed
        fun retrievePdfResult(
            taskId: String,
            params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateFromPdfResponse> =
            retrievePdfResult(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePdfResult */
        @MustBeClosed
        fun retrievePdfResult(
            taskId: String,
            params: ConversionRetrievePdfResultParams = ConversionRetrievePdfResultParams.none(),
        ): HttpResponseFor<DocumentCreateFromPdfResponse> =
            retrievePdfResult(taskId, params, RequestOptions.none())

        /** @see retrievePdfResult */
        @MustBeClosed
        fun retrievePdfResult(
            params: ConversionRetrievePdfResultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateFromPdfResponse>

        /** @see retrievePdfResult */
        @MustBeClosed
        fun retrievePdfResult(
            params: ConversionRetrievePdfResultParams
        ): HttpResponseFor<DocumentCreateFromPdfResponse> =
            retrievePdfResult(params, RequestOptions.none())

        /** @see retrievePdfResult */
        @MustBeClosed
        fun retrievePdfResult(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentCreateFromPdfResponse> =
            retrievePdfResult(taskId, ConversionRetrievePdfResultParams.none(), requestOptions)
    }
}
