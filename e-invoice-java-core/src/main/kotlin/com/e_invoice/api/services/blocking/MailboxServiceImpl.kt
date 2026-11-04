package com.e_invoice.api.services.blocking

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
import com.e_invoice.api.core.prepare
import com.e_invoice.api.models.mailbox.InboundEmailResponse
import com.e_invoice.api.models.mailbox.MailboxDownloadAttachmentParams
import com.e_invoice.api.models.mailbox.MailboxListPage
import com.e_invoice.api.models.mailbox.MailboxListParams
import com.e_invoice.api.models.mailbox.MailboxReprocessParams
import com.e_invoice.api.models.mailbox.MailboxRetrieveParams
import com.e_invoice.api.models.mailbox.PaginatedInboundEmailResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MailboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MailboxService {

    private val withRawResponse: MailboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MailboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MailboxService =
        MailboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: MailboxListParams, requestOptions: RequestOptions): MailboxListPage =
        // get /api/mailbox/
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieve(
        params: MailboxRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundEmailResponse =
        // get /api/mailbox/{inbound_email_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun downloadAttachment(
        params: MailboxDownloadAttachmentParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /api/mailbox/{inbound_email_id}/attachments/{filename}
        withRawResponse().downloadAttachment(params, requestOptions)

    override fun reprocess(
        params: MailboxReprocessParams,
        requestOptions: RequestOptions,
    ): InboundEmailResponse =
        // post /api/mailbox/{inbound_email_id}/reprocess
        withRawResponse().reprocess(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MailboxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MailboxService.WithRawResponse =
            MailboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PaginatedInboundEmailResponse> =
            jsonHandler<PaginatedInboundEmailResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MailboxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MailboxListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "mailbox", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MailboxListPage.builder()
                            .service(MailboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveHandler: Handler<InboundEmailResponse> =
            jsonHandler<InboundEmailResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MailboxRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundEmailResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundEmailId", params.inboundEmailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "mailbox", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun downloadAttachment(
            params: MailboxDownloadAttachmentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val reprocessHandler: Handler<InboundEmailResponse> =
            jsonHandler<InboundEmailResponse>(clientOptions.jsonMapper)

        override fun reprocess(
            params: MailboxReprocessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundEmailResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
