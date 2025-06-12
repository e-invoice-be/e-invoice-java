// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.handlers.errorHandler
import com.e_invoice.api.core.handlers.jsonHandler
import com.e_invoice.api.core.handlers.withErrorHandler
import com.e_invoice.api.core.http.HttpMethod
import com.e_invoice.api.core.http.HttpRequest
import com.e_invoice.api.core.http.HttpResponse.Handler
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepareAsync
import com.e_invoice.api.models.inbox.PaginatedDocumentResponse
import com.e_invoice.api.models.outbox.OutboxListDraftDocumentsPageAsync
import com.e_invoice.api.models.outbox.OutboxListDraftDocumentsParams
import com.e_invoice.api.models.outbox.OutboxListReceivedDocumentsPageAsync
import com.e_invoice.api.models.outbox.OutboxListReceivedDocumentsParams
import java.util.concurrent.CompletableFuture

class OutboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OutboxServiceAsync {

    private val withRawResponse: OutboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OutboxServiceAsync.WithRawResponse = withRawResponse

    override fun listDraftDocuments(
        params: OutboxListDraftDocumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboxListDraftDocumentsPageAsync> =
        // get /api/outbox/drafts
        withRawResponse().listDraftDocuments(params, requestOptions).thenApply { it.parse() }

    override fun listReceivedDocuments(
        params: OutboxListReceivedDocumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboxListReceivedDocumentsPageAsync> =
        // get /api/outbox/
        withRawResponse().listReceivedDocuments(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OutboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listDraftDocumentsHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listDraftDocuments(
            params: OutboxListDraftDocumentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboxListDraftDocumentsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "outbox", "drafts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listDraftDocumentsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                OutboxListDraftDocumentsPageAsync.builder()
                                    .service(OutboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listReceivedDocumentsHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listReceivedDocuments(
            params: OutboxListReceivedDocumentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboxListReceivedDocumentsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "outbox", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listReceivedDocumentsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                OutboxListReceivedDocumentsPageAsync.builder()
                                    .service(OutboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
