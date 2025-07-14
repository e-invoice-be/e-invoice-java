// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.lookup.LookupRetrieveParams
import com.e_invoice.api.models.lookup.LookupRetrieveParticipantsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lookupServiceAsync = client.lookup()

        val lookupFuture =
            lookupServiceAsync.retrieve(
                LookupRetrieveParams.builder().peppolId("peppol_id").build()
            )

        val lookup = lookupFuture.get()
        lookup.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveParticipants() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lookupServiceAsync = client.lookup()

        val responseFuture =
            lookupServiceAsync.retrieveParticipants(
                LookupRetrieveParticipantsParams.builder()
                    .query("query")
                    .countryCode("country_code")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
