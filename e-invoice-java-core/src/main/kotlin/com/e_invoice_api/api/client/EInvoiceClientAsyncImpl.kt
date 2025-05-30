// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.client

import com.e_invoice_api.api.core.ClientOptions
import com.e_invoice_api.api.core.getPackageVersion
import com.e_invoice_api.api.services.async.DocumentServiceAsync
import com.e_invoice_api.api.services.async.DocumentServiceAsyncImpl
import com.e_invoice_api.api.services.async.InboxServiceAsync
import com.e_invoice_api.api.services.async.InboxServiceAsyncImpl
import com.e_invoice_api.api.services.async.LookupServiceAsync
import com.e_invoice_api.api.services.async.LookupServiceAsyncImpl
import com.e_invoice_api.api.services.async.OutboxServiceAsync
import com.e_invoice_api.api.services.async.OutboxServiceAsyncImpl
import com.e_invoice_api.api.services.async.ValidateServiceAsync
import com.e_invoice_api.api.services.async.ValidateServiceAsyncImpl
import com.e_invoice_api.api.services.async.WebhookServiceAsync
import com.e_invoice_api.api.services.async.WebhookServiceAsyncImpl

class EInvoiceClientAsyncImpl(private val clientOptions: ClientOptions) : EInvoiceClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: EInvoiceClient by lazy { EInvoiceClientImpl(clientOptions) }

    private val withRawResponse: EInvoiceClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy {
        DocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inbox: InboxServiceAsync by lazy {
        InboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val outbox: OutboxServiceAsync by lazy {
        OutboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val validate: ValidateServiceAsync by lazy {
        ValidateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val lookup: LookupServiceAsync by lazy {
        LookupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): EInvoiceClient = sync

    override fun withRawResponse(): EInvoiceClientAsync.WithRawResponse = withRawResponse

    override fun documents(): DocumentServiceAsync = documents

    override fun inbox(): InboxServiceAsync = inbox

    override fun outbox(): OutboxServiceAsync = outbox

    override fun validate(): ValidateServiceAsync = validate

    override fun lookup(): LookupServiceAsync = lookup

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EInvoiceClientAsync.WithRawResponse {

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbox: InboxServiceAsync.WithRawResponse by lazy {
            InboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val outbox: OutboxServiceAsync.WithRawResponse by lazy {
            OutboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val validate: ValidateServiceAsync.WithRawResponse by lazy {
            ValidateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookup: LookupServiceAsync.WithRawResponse by lazy {
            LookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        override fun inbox(): InboxServiceAsync.WithRawResponse = inbox

        override fun outbox(): OutboxServiceAsync.WithRawResponse = outbox

        override fun validate(): ValidateServiceAsync.WithRawResponse = validate

        override fun lookup(): LookupServiceAsync.WithRawResponse = lookup

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
