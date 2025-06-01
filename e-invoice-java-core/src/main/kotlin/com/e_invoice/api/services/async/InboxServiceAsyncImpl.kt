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
import com.e_invoice.api.models.inbox.InboxListCreditNotesPageAsync
import com.e_invoice.api.models.inbox.InboxListCreditNotesParams
import com.e_invoice.api.models.inbox.InboxListInvoicesPageAsync
import com.e_invoice.api.models.inbox.InboxListInvoicesParams
import com.e_invoice.api.models.inbox.InboxListPageAsync
import com.e_invoice.api.models.inbox.InboxListParams
import com.e_invoice.api.models.inbox.PaginatedDocumentResponse
import java.util.concurrent.CompletableFuture

class InboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxServiceAsync {

    private val withRawResponse: InboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboxServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: InboxListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboxListPageAsync> =
        // get /api/inbox/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listCreditNotes(
        params: InboxListCreditNotesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboxListCreditNotesPageAsync> =
        // get /api/inbox/credit-notes
        withRawResponse().listCreditNotes(params, requestOptions).thenApply { it.parse() }

    override fun listInvoices(
        params: InboxListInvoicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboxListInvoicesPageAsync> =
        // get /api/inbox/invoices
        withRawResponse().listInvoices(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboxListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "inbox", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InboxListPageAsync.builder()
                                    .service(InboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listCreditNotesHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listCreditNotes(
            params: InboxListCreditNotesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboxListCreditNotesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "inbox", "credit-notes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listCreditNotesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InboxListCreditNotesPageAsync.builder()
                                    .service(InboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listInvoicesHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listInvoices(
            params: InboxListInvoicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboxListInvoicesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "inbox", "invoices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listInvoicesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InboxListInvoicesPageAsync.builder()
                                    .service(InboxServiceAsyncImpl(clientOptions))
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
