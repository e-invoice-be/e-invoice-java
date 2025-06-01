// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

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
import com.e_invoice.api.core.prepare
import com.e_invoice.api.models.inbox.InboxListCreditNotesPage
import com.e_invoice.api.models.inbox.InboxListCreditNotesParams
import com.e_invoice.api.models.inbox.InboxListInvoicesPage
import com.e_invoice.api.models.inbox.InboxListInvoicesParams
import com.e_invoice.api.models.inbox.InboxListPage
import com.e_invoice.api.models.inbox.InboxListParams
import com.e_invoice.api.models.inbox.PaginatedDocumentResponse

class InboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxService {

    private val withRawResponse: InboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboxService.WithRawResponse = withRawResponse

    override fun list(params: InboxListParams, requestOptions: RequestOptions): InboxListPage =
        // get /api/inbox/
        withRawResponse().list(params, requestOptions).parse()

    override fun listCreditNotes(
        params: InboxListCreditNotesParams,
        requestOptions: RequestOptions,
    ): InboxListCreditNotesPage =
        // get /api/inbox/credit-notes
        withRawResponse().listCreditNotes(params, requestOptions).parse()

    override fun listInvoices(
        params: InboxListInvoicesParams,
        requestOptions: RequestOptions,
    ): InboxListInvoicesPage =
        // get /api/inbox/invoices
        withRawResponse().listInvoices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboxListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "inbox", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboxListPage.builder()
                            .service(InboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listCreditNotesHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listCreditNotes(
            params: InboxListCreditNotesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboxListCreditNotesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "inbox", "credit-notes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listCreditNotesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboxListCreditNotesPage.builder()
                            .service(InboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listInvoicesHandler: Handler<PaginatedDocumentResponse> =
            jsonHandler<PaginatedDocumentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listInvoices(
            params: InboxListInvoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboxListInvoicesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "inbox", "invoices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listInvoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboxListInvoicesPage.builder()
                            .service(InboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
