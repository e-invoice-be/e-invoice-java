// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.models.lookup.LookupRetrieveParams
import com.e_invoice.api.models.lookup.LookupRetrieveParticipantsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val lookupService = client.lookup()

        val lookup =
            lookupService.retrieve(LookupRetrieveParams.builder().peppolId("peppol_id").build())

        lookup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveParticipants() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val lookupService = client.lookup()

        val response =
            lookupService.retrieveParticipants(
                LookupRetrieveParticipantsParams.builder()
                    .query("query")
                    .countryCode("country_code")
                    .build()
            )

        response.validate()
    }
}
