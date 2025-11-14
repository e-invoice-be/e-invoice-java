// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A charge is an additional fee for example for late payment, late delivery, etc. */
class Charge
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<String>,
    private val baseAmount: JsonField<String>,
    private val multiplierFactor: JsonField<String>,
    private val reason: JsonField<String>,
    private val reasonCode: JsonField<ReasonCode>,
    private val taxCode: JsonField<TaxCode>,
    private val taxRate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("base_amount")
        @ExcludeMissing
        baseAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("multiplier_factor")
        @ExcludeMissing
        multiplierFactor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason_code")
        @ExcludeMissing
        reasonCode: JsonField<ReasonCode> = JsonMissing.of(),
        @JsonProperty("tax_code") @ExcludeMissing taxCode: JsonField<TaxCode> = JsonMissing.of(),
        @JsonProperty("tax_rate") @ExcludeMissing taxRate: JsonField<String> = JsonMissing.of(),
    ) : this(
        amount,
        baseAmount,
        multiplierFactor,
        reason,
        reasonCode,
        taxCode,
        taxRate,
        mutableMapOf(),
    )

    /**
     * The charge amount, without VAT. Must be rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<String> = amount.getOptional("amount")

    /**
     * The base amount that may be used, in conjunction with the charge percentage, to calculate the
     * charge amount. Must be rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseAmount(): Optional<String> = baseAmount.getOptional("base_amount")

    /**
     * The percentage that may be used, in conjunction with the charge base amount, to calculate the
     * charge amount. To state 20%, use value 20
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplierFactor(): Optional<String> = multiplierFactor.getOptional("multiplier_factor")

    /**
     * The reason for the charge
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Charge reason codes for invoice charges and fees
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasonCode(): Optional<ReasonCode> = reasonCode.getOptional("reason_code")

    /**
     * Duty or tax or fee category codes (Subset of UNCL5305)
     *
     * Agency: UN/CEFACT Version: D.16B Subset: OpenPEPPOL
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxCode(): Optional<TaxCode> = taxCode.getOptional("tax_code")

    /**
     * The VAT rate, represented as percentage that applies to the charge
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxRate(): Optional<String> = taxRate.getOptional("tax_rate")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [baseAmount].
     *
     * Unlike [baseAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<String> = baseAmount

    /**
     * Returns the raw JSON value of [multiplierFactor].
     *
     * Unlike [multiplierFactor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("multiplier_factor")
    @ExcludeMissing
    fun _multiplierFactor(): JsonField<String> = multiplierFactor

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [reasonCode].
     *
     * Unlike [reasonCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason_code")
    @ExcludeMissing
    fun _reasonCode(): JsonField<ReasonCode> = reasonCode

    /**
     * Returns the raw JSON value of [taxCode].
     *
     * Unlike [taxCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_code") @ExcludeMissing fun _taxCode(): JsonField<TaxCode> = taxCode

    /**
     * Returns the raw JSON value of [taxRate].
     *
     * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<String> = taxRate

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Charge]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Charge]. */
    class Builder internal constructor() {

        private var amount: JsonField<String> = JsonMissing.of()
        private var baseAmount: JsonField<String> = JsonMissing.of()
        private var multiplierFactor: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var reasonCode: JsonField<ReasonCode> = JsonMissing.of()
        private var taxCode: JsonField<TaxCode> = JsonMissing.of()
        private var taxRate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(charge: Charge) = apply {
            amount = charge.amount
            baseAmount = charge.baseAmount
            multiplierFactor = charge.multiplierFactor
            reason = charge.reason
            reasonCode = charge.reasonCode
            taxCode = charge.taxCode
            taxRate = charge.taxRate
            additionalProperties = charge.additionalProperties.toMutableMap()
        }

        /** The charge amount, without VAT. Must be rounded to maximum 2 decimals */
        fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<String>) = amount(amount.getOrNull())

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /**
         * The base amount that may be used, in conjunction with the charge percentage, to calculate
         * the charge amount. Must be rounded to maximum 2 decimals
         */
        fun baseAmount(baseAmount: String?) = baseAmount(JsonField.ofNullable(baseAmount))

        /** Alias for calling [Builder.baseAmount] with `baseAmount.orElse(null)`. */
        fun baseAmount(baseAmount: Optional<String>) = baseAmount(baseAmount.getOrNull())

        /**
         * Sets [Builder.baseAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun baseAmount(baseAmount: JsonField<String>) = apply { this.baseAmount = baseAmount }

        /**
         * The percentage that may be used, in conjunction with the charge base amount, to calculate
         * the charge amount. To state 20%, use value 20
         */
        fun multiplierFactor(multiplierFactor: String?) =
            multiplierFactor(JsonField.ofNullable(multiplierFactor))

        /** Alias for calling [Builder.multiplierFactor] with `multiplierFactor.orElse(null)`. */
        fun multiplierFactor(multiplierFactor: Optional<String>) =
            multiplierFactor(multiplierFactor.getOrNull())

        /**
         * Sets [Builder.multiplierFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplierFactor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun multiplierFactor(multiplierFactor: JsonField<String>) = apply {
            this.multiplierFactor = multiplierFactor
        }

        /** The reason for the charge */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Charge reason codes for invoice charges and fees */
        fun reasonCode(reasonCode: ReasonCode?) = reasonCode(JsonField.ofNullable(reasonCode))

        /** Alias for calling [Builder.reasonCode] with `reasonCode.orElse(null)`. */
        fun reasonCode(reasonCode: Optional<ReasonCode>) = reasonCode(reasonCode.getOrNull())

        /**
         * Sets [Builder.reasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonCode] with a well-typed [ReasonCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasonCode(reasonCode: JsonField<ReasonCode>) = apply { this.reasonCode = reasonCode }

        /**
         * Duty or tax or fee category codes (Subset of UNCL5305)
         *
         * Agency: UN/CEFACT Version: D.16B Subset: OpenPEPPOL
         */
        fun taxCode(taxCode: TaxCode?) = taxCode(JsonField.ofNullable(taxCode))

        /** Alias for calling [Builder.taxCode] with `taxCode.orElse(null)`. */
        fun taxCode(taxCode: Optional<TaxCode>) = taxCode(taxCode.getOrNull())

        /**
         * Sets [Builder.taxCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCode] with a well-typed [TaxCode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxCode(taxCode: JsonField<TaxCode>) = apply { this.taxCode = taxCode }

        /** The VAT rate, represented as percentage that applies to the charge */
        fun taxRate(taxRate: String?) = taxRate(JsonField.ofNullable(taxRate))

        /** Alias for calling [Builder.taxRate] with `taxRate.orElse(null)`. */
        fun taxRate(taxRate: Optional<String>) = taxRate(taxRate.getOrNull())

        /**
         * Sets [Builder.taxRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxRate(taxRate: JsonField<String>) = apply { this.taxRate = taxRate }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Charge].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Charge =
            Charge(
                amount,
                baseAmount,
                multiplierFactor,
                reason,
                reasonCode,
                taxCode,
                taxRate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Charge = apply {
        if (validated) {
            return@apply
        }

        amount()
        baseAmount()
        multiplierFactor()
        reason()
        reasonCode().ifPresent { it.validate() }
        taxCode().ifPresent { it.validate() }
        taxRate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: EInvoiceInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (baseAmount.asKnown().isPresent) 1 else 0) +
            (if (multiplierFactor.asKnown().isPresent) 1 else 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (reasonCode.asKnown().getOrNull()?.validity() ?: 0) +
            (taxCode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (taxRate.asKnown().isPresent) 1 else 0)

    /** Charge reason codes for invoice charges and fees */
    class ReasonCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AA = of("AA")

            @JvmField val AAA = of("AAA")

            @JvmField val AAC = of("AAC")

            @JvmField val AAD = of("AAD")

            @JvmField val AAE = of("AAE")

            @JvmField val AAF = of("AAF")

            @JvmField val AAH = of("AAH")

            @JvmField val AAI = of("AAI")

            @JvmField val AAS = of("AAS")

            @JvmField val AAT = of("AAT")

            @JvmField val AAV = of("AAV")

            @JvmField val AAY = of("AAY")

            @JvmField val AAZ = of("AAZ")

            @JvmField val ABA = of("ABA")

            @JvmField val ABB = of("ABB")

            @JvmField val ABC = of("ABC")

            @JvmField val ABD = of("ABD")

            @JvmField val ABF = of("ABF")

            @JvmField val ABK = of("ABK")

            @JvmField val ABL = of("ABL")

            @JvmField val ABN = of("ABN")

            @JvmField val ABR = of("ABR")

            @JvmField val ABS = of("ABS")

            @JvmField val ABT = of("ABT")

            @JvmField val ABU = of("ABU")

            @JvmField val ACF = of("ACF")

            @JvmField val ACG = of("ACG")

            @JvmField val ACH = of("ACH")

            @JvmField val ACI = of("ACI")

            @JvmField val ACJ = of("ACJ")

            @JvmField val ACK = of("ACK")

            @JvmField val ACL = of("ACL")

            @JvmField val ACM = of("ACM")

            @JvmField val ACS = of("ACS")

            @JvmField val ADC = of("ADC")

            @JvmField val ADE = of("ADE")

            @JvmField val ADJ = of("ADJ")

            @JvmField val ADK = of("ADK")

            @JvmField val ADL = of("ADL")

            @JvmField val ADM = of("ADM")

            @JvmField val ADN = of("ADN")

            @JvmField val ADO = of("ADO")

            @JvmField val ADP = of("ADP")

            @JvmField val ADQ = of("ADQ")

            @JvmField val ADR = of("ADR")

            @JvmField val ADT = of("ADT")

            @JvmField val ADW = of("ADW")

            @JvmField val ADY = of("ADY")

            @JvmField val ADZ = of("ADZ")

            @JvmField val AEA = of("AEA")

            @JvmField val AEB = of("AEB")

            @JvmField val AEC = of("AEC")

            @JvmField val AED = of("AED")

            @JvmField val AEF = of("AEF")

            @JvmField val AEH = of("AEH")

            @JvmField val AEI = of("AEI")

            @JvmField val AEJ = of("AEJ")

            @JvmField val AEK = of("AEK")

            @JvmField val AEL = of("AEL")

            @JvmField val AEM = of("AEM")

            @JvmField val AEN = of("AEN")

            @JvmField val AEO = of("AEO")

            @JvmField val AEP = of("AEP")

            @JvmField val AES = of("AES")

            @JvmField val AET = of("AET")

            @JvmField val AEU = of("AEU")

            @JvmField val AEV = of("AEV")

            @JvmField val AEW = of("AEW")

            @JvmField val AEX = of("AEX")

            @JvmField val AEY = of("AEY")

            @JvmField val AEZ = of("AEZ")

            @JvmField val AJ = of("AJ")

            @JvmField val AU = of("AU")

            @JvmField val CA = of("CA")

            @JvmField val CAB = of("CAB")

            @JvmField val CAD = of("CAD")

            @JvmField val CAE = of("CAE")

            @JvmField val CAF = of("CAF")

            @JvmField val CAI = of("CAI")

            @JvmField val CAJ = of("CAJ")

            @JvmField val CAK = of("CAK")

            @JvmField val CAL = of("CAL")

            @JvmField val CAM = of("CAM")

            @JvmField val CAN = of("CAN")

            @JvmField val CAO = of("CAO")

            @JvmField val CAP = of("CAP")

            @JvmField val CAQ = of("CAQ")

            @JvmField val CAR = of("CAR")

            @JvmField val CAS = of("CAS")

            @JvmField val CAT = of("CAT")

            @JvmField val CAU = of("CAU")

            @JvmField val CAV = of("CAV")

            @JvmField val CAW = of("CAW")

            @JvmField val CAX = of("CAX")

            @JvmField val CAY = of("CAY")

            @JvmField val CAZ = of("CAZ")

            @JvmField val CD = of("CD")

            @JvmField val CG = of("CG")

            @JvmField val CS = of("CS")

            @JvmField val CT = of("CT")

            @JvmField val DAB = of("DAB")

            @JvmField val DAC = of("DAC")

            @JvmField val DAD = of("DAD")

            @JvmField val DAF = of("DAF")

            @JvmField val DAG = of("DAG")

            @JvmField val DAH = of("DAH")

            @JvmField val DAI = of("DAI")

            @JvmField val DAJ = of("DAJ")

            @JvmField val DAK = of("DAK")

            @JvmField val DAL = of("DAL")

            @JvmField val DAM = of("DAM")

            @JvmField val DAN = of("DAN")

            @JvmField val DAO = of("DAO")

            @JvmField val DAP = of("DAP")

            @JvmField val DAQ = of("DAQ")

            @JvmField val DL = of("DL")

            @JvmField val EG = of("EG")

            @JvmField val EP = of("EP")

            @JvmField val ER = of("ER")

            @JvmField val FAA = of("FAA")

            @JvmField val FAB = of("FAB")

            @JvmField val FAC = of("FAC")

            @JvmField val FC = of("FC")

            @JvmField val FH = of("FH")

            @JvmField val FI = of("FI")

            @JvmField val GAA = of("GAA")

            @JvmField val HAA = of("HAA")

            @JvmField val HD = of("HD")

            @JvmField val HH = of("HH")

            @JvmField val IAA = of("IAA")

            @JvmField val IAB = of("IAB")

            @JvmField val ID = of("ID")

            @JvmField val IF = of("IF")

            @JvmField val IR = of("IR")

            @JvmField val IS = of("IS")

            @JvmField val KO = of("KO")

            @JvmField val L1 = of("L1")

            @JvmField val LA = of("LA")

            @JvmField val LAA = of("LAA")

            @JvmField val LAB = of("LAB")

            @JvmField val LF = of("LF")

            @JvmField val MAE = of("MAE")

            @JvmField val MI = of("MI")

            @JvmField val ML = of("ML")

            @JvmField val NAA = of("NAA")

            @JvmField val OA = of("OA")

            @JvmField val PA = of("PA")

            @JvmField val PAA = of("PAA")

            @JvmField val PC = of("PC")

            @JvmField val PL = of("PL")

            @JvmField val PRV = of("PRV")

            @JvmField val RAB = of("RAB")

            @JvmField val RAC = of("RAC")

            @JvmField val RAD = of("RAD")

            @JvmField val RAF = of("RAF")

            @JvmField val RE = of("RE")

            @JvmField val RF = of("RF")

            @JvmField val RH = of("RH")

            @JvmField val RV = of("RV")

            @JvmField val SA = of("SA")

            @JvmField val SAA = of("SAA")

            @JvmField val SAD = of("SAD")

            @JvmField val SAE = of("SAE")

            @JvmField val SAI = of("SAI")

            @JvmField val SG = of("SG")

            @JvmField val SH = of("SH")

            @JvmField val SM = of("SM")

            @JvmField val SU = of("SU")

            @JvmField val TAB = of("TAB")

            @JvmField val TAC = of("TAC")

            @JvmField val TT = of("TT")

            @JvmField val TV = of("TV")

            @JvmField val V1 = of("V1")

            @JvmField val V2 = of("V2")

            @JvmField val WH = of("WH")

            @JvmField val XAA = of("XAA")

            @JvmField val YY = of("YY")

            @JvmField val ZZZ = of("ZZZ")

            @JvmStatic fun of(value: String) = ReasonCode(JsonField.of(value))
        }

        /** An enum containing [ReasonCode]'s known values. */
        enum class Known {
            AA,
            AAA,
            AAC,
            AAD,
            AAE,
            AAF,
            AAH,
            AAI,
            AAS,
            AAT,
            AAV,
            AAY,
            AAZ,
            ABA,
            ABB,
            ABC,
            ABD,
            ABF,
            ABK,
            ABL,
            ABN,
            ABR,
            ABS,
            ABT,
            ABU,
            ACF,
            ACG,
            ACH,
            ACI,
            ACJ,
            ACK,
            ACL,
            ACM,
            ACS,
            ADC,
            ADE,
            ADJ,
            ADK,
            ADL,
            ADM,
            ADN,
            ADO,
            ADP,
            ADQ,
            ADR,
            ADT,
            ADW,
            ADY,
            ADZ,
            AEA,
            AEB,
            AEC,
            AED,
            AEF,
            AEH,
            AEI,
            AEJ,
            AEK,
            AEL,
            AEM,
            AEN,
            AEO,
            AEP,
            AES,
            AET,
            AEU,
            AEV,
            AEW,
            AEX,
            AEY,
            AEZ,
            AJ,
            AU,
            CA,
            CAB,
            CAD,
            CAE,
            CAF,
            CAI,
            CAJ,
            CAK,
            CAL,
            CAM,
            CAN,
            CAO,
            CAP,
            CAQ,
            CAR,
            CAS,
            CAT,
            CAU,
            CAV,
            CAW,
            CAX,
            CAY,
            CAZ,
            CD,
            CG,
            CS,
            CT,
            DAB,
            DAC,
            DAD,
            DAF,
            DAG,
            DAH,
            DAI,
            DAJ,
            DAK,
            DAL,
            DAM,
            DAN,
            DAO,
            DAP,
            DAQ,
            DL,
            EG,
            EP,
            ER,
            FAA,
            FAB,
            FAC,
            FC,
            FH,
            FI,
            GAA,
            HAA,
            HD,
            HH,
            IAA,
            IAB,
            ID,
            IF,
            IR,
            IS,
            KO,
            L1,
            LA,
            LAA,
            LAB,
            LF,
            MAE,
            MI,
            ML,
            NAA,
            OA,
            PA,
            PAA,
            PC,
            PL,
            PRV,
            RAB,
            RAC,
            RAD,
            RAF,
            RE,
            RF,
            RH,
            RV,
            SA,
            SAA,
            SAD,
            SAE,
            SAI,
            SG,
            SH,
            SM,
            SU,
            TAB,
            TAC,
            TT,
            TV,
            V1,
            V2,
            WH,
            XAA,
            YY,
            ZZZ,
        }

        /**
         * An enum containing [ReasonCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReasonCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AA,
            AAA,
            AAC,
            AAD,
            AAE,
            AAF,
            AAH,
            AAI,
            AAS,
            AAT,
            AAV,
            AAY,
            AAZ,
            ABA,
            ABB,
            ABC,
            ABD,
            ABF,
            ABK,
            ABL,
            ABN,
            ABR,
            ABS,
            ABT,
            ABU,
            ACF,
            ACG,
            ACH,
            ACI,
            ACJ,
            ACK,
            ACL,
            ACM,
            ACS,
            ADC,
            ADE,
            ADJ,
            ADK,
            ADL,
            ADM,
            ADN,
            ADO,
            ADP,
            ADQ,
            ADR,
            ADT,
            ADW,
            ADY,
            ADZ,
            AEA,
            AEB,
            AEC,
            AED,
            AEF,
            AEH,
            AEI,
            AEJ,
            AEK,
            AEL,
            AEM,
            AEN,
            AEO,
            AEP,
            AES,
            AET,
            AEU,
            AEV,
            AEW,
            AEX,
            AEY,
            AEZ,
            AJ,
            AU,
            CA,
            CAB,
            CAD,
            CAE,
            CAF,
            CAI,
            CAJ,
            CAK,
            CAL,
            CAM,
            CAN,
            CAO,
            CAP,
            CAQ,
            CAR,
            CAS,
            CAT,
            CAU,
            CAV,
            CAW,
            CAX,
            CAY,
            CAZ,
            CD,
            CG,
            CS,
            CT,
            DAB,
            DAC,
            DAD,
            DAF,
            DAG,
            DAH,
            DAI,
            DAJ,
            DAK,
            DAL,
            DAM,
            DAN,
            DAO,
            DAP,
            DAQ,
            DL,
            EG,
            EP,
            ER,
            FAA,
            FAB,
            FAC,
            FC,
            FH,
            FI,
            GAA,
            HAA,
            HD,
            HH,
            IAA,
            IAB,
            ID,
            IF,
            IR,
            IS,
            KO,
            L1,
            LA,
            LAA,
            LAB,
            LF,
            MAE,
            MI,
            ML,
            NAA,
            OA,
            PA,
            PAA,
            PC,
            PL,
            PRV,
            RAB,
            RAC,
            RAD,
            RAF,
            RE,
            RF,
            RH,
            RV,
            SA,
            SAA,
            SAD,
            SAE,
            SAI,
            SG,
            SH,
            SM,
            SU,
            TAB,
            TAC,
            TT,
            TV,
            V1,
            V2,
            WH,
            XAA,
            YY,
            ZZZ,
            /**
             * An enum member indicating that [ReasonCode] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AA -> Value.AA
                AAA -> Value.AAA
                AAC -> Value.AAC
                AAD -> Value.AAD
                AAE -> Value.AAE
                AAF -> Value.AAF
                AAH -> Value.AAH
                AAI -> Value.AAI
                AAS -> Value.AAS
                AAT -> Value.AAT
                AAV -> Value.AAV
                AAY -> Value.AAY
                AAZ -> Value.AAZ
                ABA -> Value.ABA
                ABB -> Value.ABB
                ABC -> Value.ABC
                ABD -> Value.ABD
                ABF -> Value.ABF
                ABK -> Value.ABK
                ABL -> Value.ABL
                ABN -> Value.ABN
                ABR -> Value.ABR
                ABS -> Value.ABS
                ABT -> Value.ABT
                ABU -> Value.ABU
                ACF -> Value.ACF
                ACG -> Value.ACG
                ACH -> Value.ACH
                ACI -> Value.ACI
                ACJ -> Value.ACJ
                ACK -> Value.ACK
                ACL -> Value.ACL
                ACM -> Value.ACM
                ACS -> Value.ACS
                ADC -> Value.ADC
                ADE -> Value.ADE
                ADJ -> Value.ADJ
                ADK -> Value.ADK
                ADL -> Value.ADL
                ADM -> Value.ADM
                ADN -> Value.ADN
                ADO -> Value.ADO
                ADP -> Value.ADP
                ADQ -> Value.ADQ
                ADR -> Value.ADR
                ADT -> Value.ADT
                ADW -> Value.ADW
                ADY -> Value.ADY
                ADZ -> Value.ADZ
                AEA -> Value.AEA
                AEB -> Value.AEB
                AEC -> Value.AEC
                AED -> Value.AED
                AEF -> Value.AEF
                AEH -> Value.AEH
                AEI -> Value.AEI
                AEJ -> Value.AEJ
                AEK -> Value.AEK
                AEL -> Value.AEL
                AEM -> Value.AEM
                AEN -> Value.AEN
                AEO -> Value.AEO
                AEP -> Value.AEP
                AES -> Value.AES
                AET -> Value.AET
                AEU -> Value.AEU
                AEV -> Value.AEV
                AEW -> Value.AEW
                AEX -> Value.AEX
                AEY -> Value.AEY
                AEZ -> Value.AEZ
                AJ -> Value.AJ
                AU -> Value.AU
                CA -> Value.CA
                CAB -> Value.CAB
                CAD -> Value.CAD
                CAE -> Value.CAE
                CAF -> Value.CAF
                CAI -> Value.CAI
                CAJ -> Value.CAJ
                CAK -> Value.CAK
                CAL -> Value.CAL
                CAM -> Value.CAM
                CAN -> Value.CAN
                CAO -> Value.CAO
                CAP -> Value.CAP
                CAQ -> Value.CAQ
                CAR -> Value.CAR
                CAS -> Value.CAS
                CAT -> Value.CAT
                CAU -> Value.CAU
                CAV -> Value.CAV
                CAW -> Value.CAW
                CAX -> Value.CAX
                CAY -> Value.CAY
                CAZ -> Value.CAZ
                CD -> Value.CD
                CG -> Value.CG
                CS -> Value.CS
                CT -> Value.CT
                DAB -> Value.DAB
                DAC -> Value.DAC
                DAD -> Value.DAD
                DAF -> Value.DAF
                DAG -> Value.DAG
                DAH -> Value.DAH
                DAI -> Value.DAI
                DAJ -> Value.DAJ
                DAK -> Value.DAK
                DAL -> Value.DAL
                DAM -> Value.DAM
                DAN -> Value.DAN
                DAO -> Value.DAO
                DAP -> Value.DAP
                DAQ -> Value.DAQ
                DL -> Value.DL
                EG -> Value.EG
                EP -> Value.EP
                ER -> Value.ER
                FAA -> Value.FAA
                FAB -> Value.FAB
                FAC -> Value.FAC
                FC -> Value.FC
                FH -> Value.FH
                FI -> Value.FI
                GAA -> Value.GAA
                HAA -> Value.HAA
                HD -> Value.HD
                HH -> Value.HH
                IAA -> Value.IAA
                IAB -> Value.IAB
                ID -> Value.ID
                IF -> Value.IF
                IR -> Value.IR
                IS -> Value.IS
                KO -> Value.KO
                L1 -> Value.L1
                LA -> Value.LA
                LAA -> Value.LAA
                LAB -> Value.LAB
                LF -> Value.LF
                MAE -> Value.MAE
                MI -> Value.MI
                ML -> Value.ML
                NAA -> Value.NAA
                OA -> Value.OA
                PA -> Value.PA
                PAA -> Value.PAA
                PC -> Value.PC
                PL -> Value.PL
                PRV -> Value.PRV
                RAB -> Value.RAB
                RAC -> Value.RAC
                RAD -> Value.RAD
                RAF -> Value.RAF
                RE -> Value.RE
                RF -> Value.RF
                RH -> Value.RH
                RV -> Value.RV
                SA -> Value.SA
                SAA -> Value.SAA
                SAD -> Value.SAD
                SAE -> Value.SAE
                SAI -> Value.SAI
                SG -> Value.SG
                SH -> Value.SH
                SM -> Value.SM
                SU -> Value.SU
                TAB -> Value.TAB
                TAC -> Value.TAC
                TT -> Value.TT
                TV -> Value.TV
                V1 -> Value.V1
                V2 -> Value.V2
                WH -> Value.WH
                XAA -> Value.XAA
                YY -> Value.YY
                ZZZ -> Value.ZZZ
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AA -> Known.AA
                AAA -> Known.AAA
                AAC -> Known.AAC
                AAD -> Known.AAD
                AAE -> Known.AAE
                AAF -> Known.AAF
                AAH -> Known.AAH
                AAI -> Known.AAI
                AAS -> Known.AAS
                AAT -> Known.AAT
                AAV -> Known.AAV
                AAY -> Known.AAY
                AAZ -> Known.AAZ
                ABA -> Known.ABA
                ABB -> Known.ABB
                ABC -> Known.ABC
                ABD -> Known.ABD
                ABF -> Known.ABF
                ABK -> Known.ABK
                ABL -> Known.ABL
                ABN -> Known.ABN
                ABR -> Known.ABR
                ABS -> Known.ABS
                ABT -> Known.ABT
                ABU -> Known.ABU
                ACF -> Known.ACF
                ACG -> Known.ACG
                ACH -> Known.ACH
                ACI -> Known.ACI
                ACJ -> Known.ACJ
                ACK -> Known.ACK
                ACL -> Known.ACL
                ACM -> Known.ACM
                ACS -> Known.ACS
                ADC -> Known.ADC
                ADE -> Known.ADE
                ADJ -> Known.ADJ
                ADK -> Known.ADK
                ADL -> Known.ADL
                ADM -> Known.ADM
                ADN -> Known.ADN
                ADO -> Known.ADO
                ADP -> Known.ADP
                ADQ -> Known.ADQ
                ADR -> Known.ADR
                ADT -> Known.ADT
                ADW -> Known.ADW
                ADY -> Known.ADY
                ADZ -> Known.ADZ
                AEA -> Known.AEA
                AEB -> Known.AEB
                AEC -> Known.AEC
                AED -> Known.AED
                AEF -> Known.AEF
                AEH -> Known.AEH
                AEI -> Known.AEI
                AEJ -> Known.AEJ
                AEK -> Known.AEK
                AEL -> Known.AEL
                AEM -> Known.AEM
                AEN -> Known.AEN
                AEO -> Known.AEO
                AEP -> Known.AEP
                AES -> Known.AES
                AET -> Known.AET
                AEU -> Known.AEU
                AEV -> Known.AEV
                AEW -> Known.AEW
                AEX -> Known.AEX
                AEY -> Known.AEY
                AEZ -> Known.AEZ
                AJ -> Known.AJ
                AU -> Known.AU
                CA -> Known.CA
                CAB -> Known.CAB
                CAD -> Known.CAD
                CAE -> Known.CAE
                CAF -> Known.CAF
                CAI -> Known.CAI
                CAJ -> Known.CAJ
                CAK -> Known.CAK
                CAL -> Known.CAL
                CAM -> Known.CAM
                CAN -> Known.CAN
                CAO -> Known.CAO
                CAP -> Known.CAP
                CAQ -> Known.CAQ
                CAR -> Known.CAR
                CAS -> Known.CAS
                CAT -> Known.CAT
                CAU -> Known.CAU
                CAV -> Known.CAV
                CAW -> Known.CAW
                CAX -> Known.CAX
                CAY -> Known.CAY
                CAZ -> Known.CAZ
                CD -> Known.CD
                CG -> Known.CG
                CS -> Known.CS
                CT -> Known.CT
                DAB -> Known.DAB
                DAC -> Known.DAC
                DAD -> Known.DAD
                DAF -> Known.DAF
                DAG -> Known.DAG
                DAH -> Known.DAH
                DAI -> Known.DAI
                DAJ -> Known.DAJ
                DAK -> Known.DAK
                DAL -> Known.DAL
                DAM -> Known.DAM
                DAN -> Known.DAN
                DAO -> Known.DAO
                DAP -> Known.DAP
                DAQ -> Known.DAQ
                DL -> Known.DL
                EG -> Known.EG
                EP -> Known.EP
                ER -> Known.ER
                FAA -> Known.FAA
                FAB -> Known.FAB
                FAC -> Known.FAC
                FC -> Known.FC
                FH -> Known.FH
                FI -> Known.FI
                GAA -> Known.GAA
                HAA -> Known.HAA
                HD -> Known.HD
                HH -> Known.HH
                IAA -> Known.IAA
                IAB -> Known.IAB
                ID -> Known.ID
                IF -> Known.IF
                IR -> Known.IR
                IS -> Known.IS
                KO -> Known.KO
                L1 -> Known.L1
                LA -> Known.LA
                LAA -> Known.LAA
                LAB -> Known.LAB
                LF -> Known.LF
                MAE -> Known.MAE
                MI -> Known.MI
                ML -> Known.ML
                NAA -> Known.NAA
                OA -> Known.OA
                PA -> Known.PA
                PAA -> Known.PAA
                PC -> Known.PC
                PL -> Known.PL
                PRV -> Known.PRV
                RAB -> Known.RAB
                RAC -> Known.RAC
                RAD -> Known.RAD
                RAF -> Known.RAF
                RE -> Known.RE
                RF -> Known.RF
                RH -> Known.RH
                RV -> Known.RV
                SA -> Known.SA
                SAA -> Known.SAA
                SAD -> Known.SAD
                SAE -> Known.SAE
                SAI -> Known.SAI
                SG -> Known.SG
                SH -> Known.SH
                SM -> Known.SM
                SU -> Known.SU
                TAB -> Known.TAB
                TAC -> Known.TAC
                TT -> Known.TT
                TV -> Known.TV
                V1 -> Known.V1
                V2 -> Known.V2
                WH -> Known.WH
                XAA -> Known.XAA
                YY -> Known.YY
                ZZZ -> Known.ZZZ
                else -> throw EInvoiceInvalidDataException("Unknown ReasonCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                EInvoiceInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): ReasonCode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EInvoiceInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReasonCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Duty or tax or fee category codes (Subset of UNCL5305)
     *
     * Agency: UN/CEFACT Version: D.16B Subset: OpenPEPPOL
     */
    class TaxCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AE = of("AE")

            @JvmField val E = of("E")

            @JvmField val S = of("S")

            @JvmField val Z = of("Z")

            @JvmField val G = of("G")

            @JvmField val O = of("O")

            @JvmField val K = of("K")

            @JvmField val L = of("L")

            @JvmField val M = of("M")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TaxCode(JsonField.of(value))
        }

        /** An enum containing [TaxCode]'s known values. */
        enum class Known {
            AE,
            E,
            S,
            Z,
            G,
            O,
            K,
            L,
            M,
            B,
        }

        /**
         * An enum containing [TaxCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AE,
            E,
            S,
            Z,
            G,
            O,
            K,
            L,
            M,
            B,
            /** An enum member indicating that [TaxCode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AE -> Value.AE
                E -> Value.E
                S -> Value.S
                Z -> Value.Z
                G -> Value.G
                O -> Value.O
                K -> Value.K
                L -> Value.L
                M -> Value.M
                B -> Value.B
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AE -> Known.AE
                E -> Known.E
                S -> Known.S
                Z -> Known.Z
                G -> Known.G
                O -> Known.O
                K -> Known.K
                L -> Known.L
                M -> Known.M
                B -> Known.B
                else -> throw EInvoiceInvalidDataException("Unknown TaxCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                EInvoiceInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): TaxCode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EInvoiceInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Charge &&
            amount == other.amount &&
            baseAmount == other.baseAmount &&
            multiplierFactor == other.multiplierFactor &&
            reason == other.reason &&
            reasonCode == other.reasonCode &&
            taxCode == other.taxCode &&
            taxRate == other.taxRate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            baseAmount,
            multiplierFactor,
            reason,
            reasonCode,
            taxCode,
            taxRate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Charge{amount=$amount, baseAmount=$baseAmount, multiplierFactor=$multiplierFactor, reason=$reason, reasonCode=$reasonCode, taxCode=$taxCode, taxRate=$taxRate, additionalProperties=$additionalProperties}"
}
