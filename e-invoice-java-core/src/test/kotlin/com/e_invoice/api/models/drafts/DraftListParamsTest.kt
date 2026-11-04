package com.e_invoice.api.models.drafts

import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.models.documents.DocumentType
import com.e_invoice.api.models.inbox.DocumentState
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftListParamsTest {

    @Test
    fun queryParams() {
        val params =
            DraftListParams.builder()
                .page(2L)
                .pageSize(20L)
                .state(DocumentState.DRAFT)
                .type(DocumentType.INVOICE)
                .dateFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateTo(OffsetDateTime.parse("2019-12-28T18:11:19.117Z"))
                .search("search")
                .sortBy(DraftListParams.SortBy.INVOICE_TOTAL)
                .sortOrder(DraftListParams.SortOrder.ASC)
                .build()

        assertThat(params._queryParams())
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "2")
                    .put("page_size", "20")
                    .put("state", "DRAFT")
                    .put("type", "INVOICE")
                    .put("date_from", "2019-12-27T18:11:19.117Z")
                    .put("date_to", "2019-12-28T18:11:19.117Z")
                    .put("search", "search")
                    .put("sort_by", "invoice_total")
                    .put("sort_order", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DraftListParams.builder().build()

        assertThat(params._queryParams()).isEqualTo(QueryParams.builder().build())
    }
}
