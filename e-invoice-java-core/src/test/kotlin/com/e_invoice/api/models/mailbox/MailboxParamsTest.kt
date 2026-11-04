package com.e_invoice.api.models.mailbox

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MailboxListParamsTest {

    @Test
    fun queryParams() {
        val params =
            MailboxListParams.builder()
                .page(1L)
                .pageSize(20L)
                .status(MailboxListParams.Status.FAILED)
                .processed(false)
                .receivedFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .receivedTo(OffsetDateTime.parse("2019-12-28T18:11:19.117Z"))
                .search("search")
                .sortBy(MailboxListParams.SortBy.RECEIVED_AT)
                .sortOrder(MailboxListParams.SortOrder.DESC)
                .build()

        assertThat(params._queryParams())
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1")
                    .put("page_size", "20")
                    .put("status", "failed")
                    .put("processed", "false")
                    .put("received_from", "2019-12-27T18:11:19.117Z")
                    .put("received_to", "2019-12-28T18:11:19.117Z")
                    .put("search", "search")
                    .put("sort_by", "received_at")
                    .put("sort_order", "desc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MailboxListParams.builder().build()

        assertThat(params._queryParams()).isEqualTo(QueryParams.builder().build())
    }
}

internal class MailboxRetrieveParamsTest {

    @Test
    fun pathParams() {
        val params = MailboxRetrieveParams.builder().inboundEmailId("inbound_email_id").build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_email_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

internal class MailboxDownloadAttachmentParamsTest {

    @Test
    fun pathParams() {
        val params =
            MailboxDownloadAttachmentParams.builder()
                .inboundEmailId("inbound_email_id")
                .filename("invoice.pdf")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_email_id")
        assertThat(params._pathParam(1)).isEqualTo("invoice.pdf")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}

internal class MailboxReprocessParamsTest {

    @Test
    fun pathParams() {
        val params = MailboxReprocessParams.builder().inboundEmailId("inbound_email_id").build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_email_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun bodyIsEmptyByDefault() {
        val params = MailboxReprocessParams.builder().inboundEmailId("inbound_email_id").build()

        assertThat(params._body()).isEmpty
    }

    @Test
    fun bodyWithAdditionalProperties() {
        val params =
            MailboxReprocessParams.builder()
                .inboundEmailId("inbound_email_id")
                .putAdditionalBodyProperty("foo", JsonValue.from("bar"))
                .build()

        assertThat(params._body()).contains(mapOf("foo" to JsonValue.from("bar")))
    }
}
