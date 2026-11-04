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
import com.e_invoice.api.core.http.json
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepareAsync
import com.e_invoice.api.models.mailbox.InboundEmailResponse
import com.e_invoice.api.models.mailbox.MailboxDownloadAttachmentParams
import com.e_invoice.api.models.mailbox.MailboxListPageAsync
import com.e_invoice.api.models.mailbox.MailboxListParams
import com.e_invoice.api.models.mailbox.MailboxReprocessParams
import com.e_invoice.api.models.mailbox.MailboxRetrieveParams
import com.e_invoice.api.models.mailbox.PaginatedInboundEmailResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MailboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MailboxServiceAsync {

    private val withRawResponse: MailboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MailboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MailboxServiceAsync =
        MailboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MailboxListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MailboxListPageAsync> =
        // get /api/mailbox/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MailboxRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundEmailResponse> =
        // get /api/mailbox/{inbound_email_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun downloadAttachment(
        params: MailboxDownloadAttachmentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /api/mailbox/{inbound_email_id}/attachments/{filename}
        withRawResponse().downloadAttachment(params, requestOptions)

    override fun reprocess(
        params: MailboxReprocessParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundEmailResponse> =
        // post /api/mailbox/{inbound_email_id}/reprocess
        withRawResponse().reprocess(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MailboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MailboxServiceAsync.WithRawResponse =
            MailboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PaginatedInboundEmailResponse> =
            jsonHandler<PaginatedInboundEmailResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MailboxListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MailboxListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "mailbox", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MailboxListPageAsync.builder()
                                    .service(MailboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<InboundEmailResponse> =
            jsonHandler<InboundEmailResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MailboxRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundEmailId", params.inboundEmailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "mailbox", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun downloadAttachment(
            params: MailboxDownloadAttachmentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("filename", params.filename().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "mailbox",
                        params._pathParam(0),
                        "attachments",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val reprocessHandler: Handler<InboundEmailResponse> =
            jsonHandler<InboundEmailResponse>(clientOptions.jsonMapper)

        override fun reprocess(
            params: MailboxReprocessParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundEmailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundEmailId", params.inboundEmailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "mailbox", params._pathParam(0), "reprocess")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { reprocessHandler.handle(it) }
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
