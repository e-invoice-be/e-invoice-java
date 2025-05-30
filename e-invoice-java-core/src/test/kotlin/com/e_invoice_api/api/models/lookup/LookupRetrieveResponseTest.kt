// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.lookup

import com.e_invoice_api.api.core.JsonValue
import com.e_invoice_api.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val lookupRetrieveResponse =
            LookupRetrieveResponse.builder()
                .businessCard(
                    LookupRetrieveResponse.BusinessCard.builder()
                        .addEntity(
                            LookupRetrieveResponse.BusinessCard.Entity.builder()
                                .addAdditionalInformation("VAT: BE1018265814")
                                .addAdditionalInformation("Organization number: 1018.265.814")
                                .countryCode("NO")
                                .name("Example Corporation Ltd")
                                .registrationDate("2021-06-15T00:00:00Z")
                                .build()
                        )
                        .queryTimeMs(123.45)
                        .status("success")
                        .error("Business card not found")
                        .build()
                )
                .addCertificate(
                    Certificate.builder()
                        .status("success")
                        .details(
                            Certificate.Details.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .error("Certificate expired")
                        .build()
                )
                .dnsInfo(
                    LookupRetrieveResponse.DnsInfo.builder()
                        .addDnsRecord(
                            LookupRetrieveResponse.DnsInfo.DnsRecord.builder()
                                .ip("193.140.151.175")
                                .build()
                        )
                        .smlHostname("edelivery.tech.ec.europa.eu")
                        .status("success")
                        .error("DNS lookup failed: no such domain")
                        .build()
                )
                .addError("DNS lookup failed")
                .addError("Business card not available")
                .executionTimeMs(895.32)
                .queryMetadata(
                    LookupRetrieveResponse.QueryMetadata.builder()
                        .identifierScheme("iso6523-actorid-upis")
                        .identifierValue("0192:991825827")
                        .smlDomain("edelivery.tech.ec.europa.eu")
                        .timestamp("2023-04-12T14:32:10.123456")
                        .version("1.0.0")
                        .build()
                )
                .serviceMetadata(
                    LookupRetrieveResponse.ServiceMetadata.builder()
                        .addEndpoint(
                            LookupRetrieveResponse.ServiceMetadata.Endpoint.builder()
                                .addDocumentType(
                                    LookupRetrieveResponse.ServiceMetadata.Endpoint.DocumentType
                                        .builder()
                                        .scheme("busdox-docid-qns")
                                        .value(
                                            "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2::Invoice##urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0::2.1"
                                        )
                                        .build()
                                )
                                .status("success")
                                .url("https://ap.e-invoice.be/as4")
                                .error("Connection timeout")
                                .addProcess(
                                    LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                        .builder()
                                        .addEndpoint(
                                            LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                                .InnerEndpoint
                                                .builder()
                                                .address("https://ap.e-invoice.be/as4")
                                                .transportProfile("peppol-transport-as4-v2_0")
                                                .certificate(
                                                    Certificate.builder()
                                                        .status("success")
                                                        .details(
                                                            Certificate.Details.builder()
                                                                .putAdditionalProperty(
                                                                    "foo",
                                                                    JsonValue.from("bar"),
                                                                )
                                                                .build()
                                                        )
                                                        .error("Certificate expired")
                                                        .build()
                                                )
                                                .serviceActivationDate("2022-01-01T00:00:00Z")
                                                .serviceDescription("Company XYZ's AP service")
                                                .serviceExpirationDate("2025-01-01T00:00:00Z")
                                                .technicalContactUrl("https://support.e-invoice.be")
                                                .technicalInformationUrl("https://api.e-invoice.be")
                                                .build()
                                        )
                                        .processId(
                                            LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                                .ProcessId
                                                .builder()
                                                .scheme("cenbii-procid-ubl")
                                                .value(
                                                    "urn:fdc:peppol.eu:2017:poacc:billing:01:1.0"
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .queryTimeMs(245.67)
                        .status("success")
                        .error("Service unavailable")
                        .build()
                )
                .status("success")
                .build()

        assertThat(lookupRetrieveResponse.businessCard())
            .isEqualTo(
                LookupRetrieveResponse.BusinessCard.builder()
                    .addEntity(
                        LookupRetrieveResponse.BusinessCard.Entity.builder()
                            .addAdditionalInformation("VAT: BE1018265814")
                            .addAdditionalInformation("Organization number: 1018.265.814")
                            .countryCode("NO")
                            .name("Example Corporation Ltd")
                            .registrationDate("2021-06-15T00:00:00Z")
                            .build()
                    )
                    .queryTimeMs(123.45)
                    .status("success")
                    .error("Business card not found")
                    .build()
            )
        assertThat(lookupRetrieveResponse.certificates())
            .containsExactly(
                Certificate.builder()
                    .status("success")
                    .details(
                        Certificate.Details.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .error("Certificate expired")
                    .build()
            )
        assertThat(lookupRetrieveResponse.dnsInfo())
            .isEqualTo(
                LookupRetrieveResponse.DnsInfo.builder()
                    .addDnsRecord(
                        LookupRetrieveResponse.DnsInfo.DnsRecord.builder()
                            .ip("193.140.151.175")
                            .build()
                    )
                    .smlHostname("edelivery.tech.ec.europa.eu")
                    .status("success")
                    .error("DNS lookup failed: no such domain")
                    .build()
            )
        assertThat(lookupRetrieveResponse.errors())
            .containsExactly("DNS lookup failed", "Business card not available")
        assertThat(lookupRetrieveResponse.executionTimeMs()).isEqualTo(895.32)
        assertThat(lookupRetrieveResponse.queryMetadata())
            .isEqualTo(
                LookupRetrieveResponse.QueryMetadata.builder()
                    .identifierScheme("iso6523-actorid-upis")
                    .identifierValue("0192:991825827")
                    .smlDomain("edelivery.tech.ec.europa.eu")
                    .timestamp("2023-04-12T14:32:10.123456")
                    .version("1.0.0")
                    .build()
            )
        assertThat(lookupRetrieveResponse.serviceMetadata())
            .isEqualTo(
                LookupRetrieveResponse.ServiceMetadata.builder()
                    .addEndpoint(
                        LookupRetrieveResponse.ServiceMetadata.Endpoint.builder()
                            .addDocumentType(
                                LookupRetrieveResponse.ServiceMetadata.Endpoint.DocumentType
                                    .builder()
                                    .scheme("busdox-docid-qns")
                                    .value(
                                        "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2::Invoice##urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0::2.1"
                                    )
                                    .build()
                            )
                            .status("success")
                            .url("https://ap.e-invoice.be/as4")
                            .error("Connection timeout")
                            .addProcess(
                                LookupRetrieveResponse.ServiceMetadata.Endpoint.Process.builder()
                                    .addEndpoint(
                                        LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                            .InnerEndpoint
                                            .builder()
                                            .address("https://ap.e-invoice.be/as4")
                                            .transportProfile("peppol-transport-as4-v2_0")
                                            .certificate(
                                                Certificate.builder()
                                                    .status("success")
                                                    .details(
                                                        Certificate.Details.builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from("bar"),
                                                            )
                                                            .build()
                                                    )
                                                    .error("Certificate expired")
                                                    .build()
                                            )
                                            .serviceActivationDate("2022-01-01T00:00:00Z")
                                            .serviceDescription("Company XYZ's AP service")
                                            .serviceExpirationDate("2025-01-01T00:00:00Z")
                                            .technicalContactUrl("https://support.e-invoice.be")
                                            .technicalInformationUrl("https://api.e-invoice.be")
                                            .build()
                                    )
                                    .processId(
                                        LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                            .ProcessId
                                            .builder()
                                            .scheme("cenbii-procid-ubl")
                                            .value("urn:fdc:peppol.eu:2017:poacc:billing:01:1.0")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .queryTimeMs(245.67)
                    .status("success")
                    .error("Service unavailable")
                    .build()
            )
        assertThat(lookupRetrieveResponse.status()).isEqualTo("success")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupRetrieveResponse =
            LookupRetrieveResponse.builder()
                .businessCard(
                    LookupRetrieveResponse.BusinessCard.builder()
                        .addEntity(
                            LookupRetrieveResponse.BusinessCard.Entity.builder()
                                .addAdditionalInformation("VAT: BE1018265814")
                                .addAdditionalInformation("Organization number: 1018.265.814")
                                .countryCode("NO")
                                .name("Example Corporation Ltd")
                                .registrationDate("2021-06-15T00:00:00Z")
                                .build()
                        )
                        .queryTimeMs(123.45)
                        .status("success")
                        .error("Business card not found")
                        .build()
                )
                .addCertificate(
                    Certificate.builder()
                        .status("success")
                        .details(
                            Certificate.Details.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .error("Certificate expired")
                        .build()
                )
                .dnsInfo(
                    LookupRetrieveResponse.DnsInfo.builder()
                        .addDnsRecord(
                            LookupRetrieveResponse.DnsInfo.DnsRecord.builder()
                                .ip("193.140.151.175")
                                .build()
                        )
                        .smlHostname("edelivery.tech.ec.europa.eu")
                        .status("success")
                        .error("DNS lookup failed: no such domain")
                        .build()
                )
                .addError("DNS lookup failed")
                .addError("Business card not available")
                .executionTimeMs(895.32)
                .queryMetadata(
                    LookupRetrieveResponse.QueryMetadata.builder()
                        .identifierScheme("iso6523-actorid-upis")
                        .identifierValue("0192:991825827")
                        .smlDomain("edelivery.tech.ec.europa.eu")
                        .timestamp("2023-04-12T14:32:10.123456")
                        .version("1.0.0")
                        .build()
                )
                .serviceMetadata(
                    LookupRetrieveResponse.ServiceMetadata.builder()
                        .addEndpoint(
                            LookupRetrieveResponse.ServiceMetadata.Endpoint.builder()
                                .addDocumentType(
                                    LookupRetrieveResponse.ServiceMetadata.Endpoint.DocumentType
                                        .builder()
                                        .scheme("busdox-docid-qns")
                                        .value(
                                            "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2::Invoice##urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0::2.1"
                                        )
                                        .build()
                                )
                                .status("success")
                                .url("https://ap.e-invoice.be/as4")
                                .error("Connection timeout")
                                .addProcess(
                                    LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                        .builder()
                                        .addEndpoint(
                                            LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                                .InnerEndpoint
                                                .builder()
                                                .address("https://ap.e-invoice.be/as4")
                                                .transportProfile("peppol-transport-as4-v2_0")
                                                .certificate(
                                                    Certificate.builder()
                                                        .status("success")
                                                        .details(
                                                            Certificate.Details.builder()
                                                                .putAdditionalProperty(
                                                                    "foo",
                                                                    JsonValue.from("bar"),
                                                                )
                                                                .build()
                                                        )
                                                        .error("Certificate expired")
                                                        .build()
                                                )
                                                .serviceActivationDate("2022-01-01T00:00:00Z")
                                                .serviceDescription("Company XYZ's AP service")
                                                .serviceExpirationDate("2025-01-01T00:00:00Z")
                                                .technicalContactUrl("https://support.e-invoice.be")
                                                .technicalInformationUrl("https://api.e-invoice.be")
                                                .build()
                                        )
                                        .processId(
                                            LookupRetrieveResponse.ServiceMetadata.Endpoint.Process
                                                .ProcessId
                                                .builder()
                                                .scheme("cenbii-procid-ubl")
                                                .value(
                                                    "urn:fdc:peppol.eu:2017:poacc:billing:01:1.0"
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .queryTimeMs(245.67)
                        .status("success")
                        .error("Service unavailable")
                        .build()
                )
                .status("success")
                .build()

        val roundtrippedLookupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupRetrieveResponse),
                jacksonTypeRef<LookupRetrieveResponse>(),
            )

        assertThat(roundtrippedLookupRetrieveResponse).isEqualTo(lookupRetrieveResponse)
    }
}
