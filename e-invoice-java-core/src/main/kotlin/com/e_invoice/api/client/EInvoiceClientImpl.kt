// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.client

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.getPackageVersion
import com.e_invoice.api.services.blocking.DocumentService
import com.e_invoice.api.services.blocking.DocumentServiceImpl
import com.e_invoice.api.services.blocking.InboxService
import com.e_invoice.api.services.blocking.InboxServiceImpl
import com.e_invoice.api.services.blocking.LookupService
import com.e_invoice.api.services.blocking.LookupServiceImpl
import com.e_invoice.api.services.blocking.OutboxService
import com.e_invoice.api.services.blocking.OutboxServiceImpl
import com.e_invoice.api.services.blocking.ValidateService
import com.e_invoice.api.services.blocking.ValidateServiceImpl
import com.e_invoice.api.services.blocking.WebhookService
import com.e_invoice.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class EInvoiceClientImpl(private val clientOptions: ClientOptions) : EInvoiceClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: EInvoiceClientAsync by lazy { EInvoiceClientAsyncImpl(clientOptions) }

    private val withRawResponse: EInvoiceClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy {
        DocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val inbox: InboxService by lazy { InboxServiceImpl(clientOptionsWithUserAgent) }

    private val outbox: OutboxService by lazy { OutboxServiceImpl(clientOptionsWithUserAgent) }

    private val validate: ValidateService by lazy {
        ValidateServiceImpl(clientOptionsWithUserAgent)
    }

    private val lookup: LookupService by lazy { LookupServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): EInvoiceClientAsync = async

    override fun withRawResponse(): EInvoiceClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EInvoiceClient =
        EInvoiceClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentService = documents

    override fun inbox(): InboxService = inbox

    override fun outbox(): OutboxService = outbox

    override fun validate(): ValidateService = validate

    override fun lookup(): LookupService = lookup

    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EInvoiceClient.WithRawResponse {

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbox: InboxService.WithRawResponse by lazy {
            InboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val outbox: OutboxService.WithRawResponse by lazy {
            OutboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val validate: ValidateService.WithRawResponse by lazy {
            ValidateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookup: LookupService.WithRawResponse by lazy {
            LookupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EInvoiceClient.WithRawResponse =
            EInvoiceClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        override fun inbox(): InboxService.WithRawResponse = inbox

        override fun outbox(): OutboxService.WithRawResponse = outbox

        override fun validate(): ValidateService.WithRawResponse = validate

        override fun lookup(): LookupService.WithRawResponse = lookup

        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
