// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.blocking

import com.e_invoice_api.api.core.ClientOptions
import com.e_invoice_api.api.core.JsonValue
import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.handlers.errorHandler
import com.e_invoice_api.api.core.handlers.jsonHandler
import com.e_invoice_api.api.core.handlers.withErrorHandler
import com.e_invoice_api.api.core.http.HttpMethod
import com.e_invoice_api.api.core.http.HttpRequest
import com.e_invoice_api.api.core.http.HttpResponse.Handler
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.core.http.parseable
import com.e_invoice_api.api.core.prepare
import com.e_invoice_api.api.models.inbox.PaginatedDocumentResponse
import com.e_invoice_api.api.models.outbox.OutboxListDraftDocumentsPage
import com.e_invoice_api.api.models.outbox.OutboxListDraftDocumentsParams
import com.e_invoice_api.api.models.outbox.OutboxListReceivedDocumentsPage
import com.e_invoice_api.api.models.outbox.OutboxListReceivedDocumentsParams

class OutboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OutboxService {

    private val withRawResponse: OutboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OutboxService.WithRawResponse = withRawResponse

    override fun listDraftDocuments(
        params: OutboxListDraftDocumentsParams,
        requestOptions: RequestOptions,
    ): OutboxListDraftDocumentsPage =
        // get /api/outbox/drafts
        withRawResponse().listDraftDocuments(params, requestOptions).parse()

    override fun listReceivedDocuments(
        params: OutboxListReceivedDocumentsParams,
        requestOptions: RequestOptions,
    ): OutboxListReceivedDocumentsPage =
        // get /api/outbox/
        withRawResponse().listReceivedDocuments(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OutboxService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listDraftDocumentsHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listDraftDocuments(
            params: OutboxListDraftDocumentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OutboxListDraftDocumentsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "outbox", "drafts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listDraftDocumentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        OutboxListDraftDocumentsPage.builder()
                            .service(OutboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listReceivedDocumentsHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listReceivedDocuments(
            params: OutboxListReceivedDocumentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OutboxListReceivedDocumentsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "outbox", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listReceivedDocumentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        OutboxListReceivedDocumentsPage.builder()
                            .service(OutboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
