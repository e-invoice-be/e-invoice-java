package com.e_invoice.api.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentRetrieveTimelineParamsTest {

    @Test
    fun create() {
        DocumentRetrieveTimelineParams.builder().documentId("document_id").build()
    }

    @Test
    fun pathParams() {
        val params = DocumentRetrieveTimelineParams.builder().documentId("document_id").build()

        assertThat(params._pathParam(0)).isEqualTo("document_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
