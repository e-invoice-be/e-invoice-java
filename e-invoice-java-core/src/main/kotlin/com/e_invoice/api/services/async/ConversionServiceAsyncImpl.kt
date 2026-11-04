package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.core.handlers.errorBodyHandler
import com.e_invoice.api.core.handlers.errorHandler
import com.e_invoice.api.core.handlers.jsonHandler
import com.e_invoice.api.core.http.HttpMethod
import com.e_invoice.api.core.http.HttpRequest
import com.e_invoice.api.core.http.HttpResponse
import com.e_invoice.api.core.http.HttpResponse.Handler
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.core.http.multipartFormData
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepareAsync
import com.e_invoice.api.models.conversion.ConversionCreateFromPdfParams
import com.e_invoice.api.models.conversion.ConversionRetrievePdfResultParams
import com.e_invoice.api.models.conversion.ConversionRetrievePdfStatusParams
import com.e_invoice.api.models.conversion.DocumentCreateFromPdfTask
import com.e_invoice.api.models.documents.DocumentCreateFromPdfResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConversionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversionServiceAsync {

    private val withRawResponse: ConversionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConversionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversionServiceAsync =
        ConversionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createFromPdf(
        params: ConversionCreateFromPdfParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentCreateFromPdfTask> =
        // post /api/conversion/pdf
        withRawResponse().createFromPdf(params, requestOptions).thenApply { it.parse() }

    override fun retrievePdfStatus(
        params: ConversionRetrievePdfStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentCreateFromPdfTask> =
        // get /api/conversion/pdf/{task_id}
        withRawResponse().retrievePdfStatus(params, requestOptions).thenApply { it.parse() }

    override fun retrievePdfResult(
        params: ConversionRetrievePdfResultParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentCreateFromPdfResponse> =
        // get /api/conversion/pdf/{task_id}/result
        withRawResponse().retrievePdfResult(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversionServiceAsync.WithRawResponse =
            ConversionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createFromPdfHandler: Handler<DocumentCreateFromPdfTask> =
            jsonHandler<DocumentCreateFromPdfTask>(clientOptions.jsonMapper)

        override fun createFromPdf(
            params: ConversionCreateFromPdfParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "conversion", "pdf")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFromPdfHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePdfStatusHandler: Handler<DocumentCreateFromPdfTask> =
            jsonHandler<DocumentCreateFromPdfTask>(clientOptions.jsonMapper)

        override fun retrievePdfStatus(
            params: ConversionRetrievePdfStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfTask>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "conversion", "pdf", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePdfStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePdfResultHandler: Handler<DocumentCreateFromPdfResponse> =
            jsonHandler<DocumentCreateFromPdfResponse>(clientOptions.jsonMapper)

        override fun retrievePdfResult(
            params: ConversionRetrievePdfResultParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentCreateFromPdfResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "conversion", "pdf", params._pathParam(0), "result")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePdfResultHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
