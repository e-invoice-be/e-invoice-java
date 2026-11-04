package com.e_invoice.api.models.stats

import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatsResponseTest {

    private val actionStats =
        StatsResponse.ActionStats.builder()
            .action(StatsResponse.ActionStats.Action.DOCUMENT_SENT)
            .count(3L)
            .statDate(LocalDate.parse("2025-01-01"))
            .build()

    private fun full() =
        StatsResponse.builder()
            .addAction(actionStats)
            .aggregation(StatsAggregationType.DAY)
            .averageDailyUsage(1.5)
            .periodEnd(LocalDate.parse("2025-01-31"))
            .periodStart(LocalDate.parse("2025-01-01"))
            .tenantId("tenant_id")
            .totalDays(31L)
            .budgetEstimationDays(10.0)
            .build()

    @Test
    fun create() {
        val statsResponse = full()

        assertThat(statsResponse.actions()).containsExactly(actionStats)
        assertThat(statsResponse.aggregation()).isEqualTo(StatsAggregationType.DAY)
        assertThat(statsResponse.averageDailyUsage()).isEqualTo(1.5)
        assertThat(statsResponse.periodEnd()).isEqualTo(LocalDate.parse("2025-01-31"))
        assertThat(statsResponse.periodStart()).isEqualTo(LocalDate.parse("2025-01-01"))
        assertThat(statsResponse.tenantId()).isEqualTo("tenant_id")
        assertThat(statsResponse.totalDays()).isEqualTo(31L)
        assertThat(statsResponse.budgetEstimationDays()).contains(10.0)
        assertThat(actionStats.action()).isEqualTo(StatsResponse.ActionStats.Action.DOCUMENT_SENT)
        assertThat(actionStats.count()).isEqualTo(3L)
        assertThat(actionStats.statDate()).isEqualTo(LocalDate.parse("2025-01-01"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statsResponse = full()

        val roundtripped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statsResponse),
                jacksonTypeRef<StatsResponse>(),
            )

        assertThat(roundtripped).isEqualTo(statsResponse)
    }
}

internal class StatsRetrieveParamsTest {

    @Test
    fun queryParams() {
        val params =
            StatsRetrieveParams.builder()
                .startDate(LocalDate.parse("2025-01-01"))
                .endDate(LocalDate.parse("2025-01-31"))
                .aggregation(StatsAggregationType.WEEK)
                .build()

        assertThat(params._queryParams())
            .isEqualTo(
                QueryParams.builder()
                    .put("start_date", "2025-01-01")
                    .put("end_date", "2025-01-31")
                    .put("aggregation", "WEEK")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StatsRetrieveParams.builder().build()

        assertThat(params._queryParams()).isEqualTo(QueryParams.builder().build())
    }
}
