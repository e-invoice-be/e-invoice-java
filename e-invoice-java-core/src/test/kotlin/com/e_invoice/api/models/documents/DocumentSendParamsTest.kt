// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentSendParamsTest {

    @Test
    fun create() {
        DocumentSendParams.builder()
            .documentId("document_id")
            .email("email")
            .receiverPeppolId("receiver_peppol_id")
            .receiverPeppolScheme("receiver_peppol_scheme")
            .senderPeppolId("sender_peppol_id")
            .senderPeppolScheme("sender_peppol_scheme")
            .build()
    }

    @Test
    fun pathParams() {
        val params = DocumentSendParams.builder().documentId("document_id").build()

        assertThat(params._pathParam(0)).isEqualTo("document_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DocumentSendParams.builder()
                .documentId("document_id")
                .email("email")
                .receiverPeppolId("receiver_peppol_id")
                .receiverPeppolScheme("receiver_peppol_scheme")
                .senderPeppolId("sender_peppol_id")
                .senderPeppolScheme("sender_peppol_scheme")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("email", "email")
                    .put("receiver_peppol_id", "receiver_peppol_id")
                    .put("receiver_peppol_scheme", "receiver_peppol_scheme")
                    .put("sender_peppol_id", "sender_peppol_id")
                    .put("sender_peppol_scheme", "sender_peppol_scheme")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentSendParams.builder().documentId("document_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
