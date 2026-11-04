// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Unit of Measure Codes from UNECERec20 used in Peppol BIS Billing 3.0. */
class UnitOfMeasureCode @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val _10 = of("10")

        @JvmField val _11 = of("11")

        @JvmField val _13 = of("13")

        @JvmField val _14 = of("14")

        @JvmField val _15 = of("15")

        @JvmField val _20 = of("20")

        @JvmField val _21 = of("21")

        @JvmField val _22 = of("22")

        @JvmField val _23 = of("23")

        @JvmField val _24 = of("24")

        @JvmField val _25 = of("25")

        @JvmField val _27 = of("27")

        @JvmField val _28 = of("28")

        @JvmField val _33 = of("33")

        @JvmField val _34 = of("34")

        @JvmField val _35 = of("35")

        @JvmField val _37 = of("37")

        @JvmField val _38 = of("38")

        @JvmField val _40 = of("40")

        @JvmField val _41 = of("41")

        @JvmField val _56 = of("56")

        @JvmField val _57 = of("57")

        @JvmField val _58 = of("58")

        @JvmField val _59 = of("59")

        @JvmField val _60 = of("60")

        @JvmField val _61 = of("61")

        @JvmField val _74 = of("74")

        @JvmField val _77 = of("77")

        @JvmField val _80 = of("80")

        @JvmField val _81 = of("81")

        @JvmField val _85 = of("85")

        @JvmField val _87 = of("87")

        @JvmField val _89 = of("89")

        @JvmField val _91 = of("91")

        @JvmField val _1_I = of("1I")

        @JvmField val EA = of("EA")

        @JvmField val E01 = of("E01")

        @JvmField val E07 = of("E07")

        @JvmField val E09 = of("E09")

        @JvmField val E10 = of("E10")

        @JvmField val E12 = of("E12")

        @JvmField val E14 = of("E14")

        @JvmField val E17 = of("E17")

        @JvmField val E20 = of("E20")

        @JvmField val E23 = of("E23")

        @JvmField val E25 = of("E25")

        @JvmField val E27 = of("E27")

        @JvmField val E31 = of("E31")

        @JvmField val E34 = of("E34")

        @JvmField val E35 = of("E35")

        @JvmField val E36 = of("E36")

        @JvmField val E37 = of("E37")

        @JvmField val E38 = of("E38")

        @JvmField val E39 = of("E39")

        @JvmField val E40 = of("E40")

        @JvmField val E41 = of("E41")

        @JvmField val E42 = of("E42")

        @JvmField val E43 = of("E43")

        @JvmField val E44 = of("E44")

        @JvmField val E45 = of("E45")

        @JvmField val E46 = of("E46")

        @JvmField val E47 = of("E47")

        @JvmField val E48 = of("E48")

        @JvmField val E49 = of("E49")

        @JvmField val E50 = of("E50")

        @JvmField val E51 = of("E51")

        @JvmField val E52 = of("E52")

        @JvmField val E53 = of("E53")

        @JvmField val E54 = of("E54")

        @JvmField val E55 = of("E55")

        @JvmField val E56 = of("E56")

        @JvmField val E57 = of("E57")

        @JvmField val E58 = of("E58")

        @JvmField val E60 = of("E60")

        @JvmField val E62 = of("E62")

        @JvmField val E65 = of("E65")

        @JvmField val E66 = of("E66")

        @JvmField val E67 = of("E67")

        @JvmField val E69 = of("E69")

        @JvmField val E70 = of("E70")

        @JvmField val E71 = of("E71")

        @JvmField val E73 = of("E73")

        @JvmField val E75 = of("E75")

        @JvmField val E76 = of("E76")

        @JvmField val _2_A = of("2A")

        @JvmField val _2_B = of("2B")

        @JvmField val _2_C = of("2C")

        @JvmField val _2_G = of("2G")

        @JvmField val _2_H = of("2H")

        @JvmField val _2_I = of("2I")

        @JvmField val _2_J = of("2J")

        @JvmField val _2_K = of("2K")

        @JvmField val _2_L = of("2L")

        @JvmField val _2_M = of("2M")

        @JvmField val _2_N = of("2N")

        @JvmField val _2_P = of("2P")

        @JvmField val _2_Q = of("2Q")

        @JvmField val _2_R = of("2R")

        @JvmField val _2_U = of("2U")

        @JvmField val _2_X = of("2X")

        @JvmField val _2_Y = of("2Y")

        @JvmField val _2_Z = of("2Z")

        @JvmField val _3_B = of("3B")

        @JvmField val _3_C = of("3C")

        @JvmField val _4_C = of("4C")

        @JvmField val _4_G = of("4G")

        @JvmField val _4_H = of("4H")

        @JvmField val _4_K = of("4K")

        @JvmField val _4_L = of("4L")

        @JvmField val _4_M = of("4M")

        @JvmField val _4_N = of("4N")

        @JvmField val _4_O = of("4O")

        @JvmField val _4_P = of("4P")

        @JvmField val _4_Q = of("4Q")

        @JvmField val _4_R = of("4R")

        @JvmField val _4_T = of("4T")

        @JvmField val _4_U = of("4U")

        @JvmField val _4_W = of("4W")

        @JvmField val _4_X = of("4X")

        @JvmField val _5_A = of("5A")

        @JvmField val _5_B = of("5B")

        @JvmField val _5_E = of("5E")

        @JvmField val _5_J = of("5J")

        @JvmField val A10 = of("A10")

        @JvmField val A11 = of("A11")

        @JvmField val A12 = of("A12")

        @JvmField val A13 = of("A13")

        @JvmField val A14 = of("A14")

        @JvmField val A15 = of("A15")

        @JvmField val A16 = of("A16")

        @JvmField val A17 = of("A17")

        @JvmField val A18 = of("A18")

        @JvmField val A19 = of("A19")

        @JvmField val A2 = of("A2")

        @JvmField val A20 = of("A20")

        @JvmField val A21 = of("A21")

        @JvmField val A22 = of("A22")

        @JvmField val A23 = of("A23")

        @JvmField val A24 = of("A24")

        @JvmField val A26 = of("A26")

        @JvmField val A27 = of("A27")

        @JvmField val A28 = of("A28")

        @JvmField val A29 = of("A29")

        @JvmField val A3 = of("A3")

        @JvmField val A30 = of("A30")

        @JvmField val A31 = of("A31")

        @JvmField val A32 = of("A32")

        @JvmField val A33 = of("A33")

        @JvmField val A34 = of("A34")

        @JvmField val A35 = of("A35")

        @JvmField val A36 = of("A36")

        @JvmField val A37 = of("A37")

        @JvmField val A38 = of("A38")

        @JvmField val A39 = of("A39")

        @JvmField val A4 = of("A4")

        @JvmField val A40 = of("A40")

        @JvmField val A41 = of("A41")

        @JvmField val A42 = of("A42")

        @JvmField val A43 = of("A43")

        @JvmField val A44 = of("A44")

        @JvmField val A45 = of("A45")

        @JvmField val A46 = of("A46")

        @JvmField val A47 = of("A47")

        @JvmField val A48 = of("A48")

        @JvmField val A49 = of("A49")

        @JvmField val A5 = of("A5")

        @JvmField val A50 = of("A50")

        @JvmField val A51 = of("A51")

        @JvmField val A52 = of("A52")

        @JvmField val A53 = of("A53")

        @JvmField val A54 = of("A54")

        @JvmField val A55 = of("A55")

        @JvmField val A56 = of("A56")

        @JvmField val A57 = of("A57")

        @JvmField val A58 = of("A58")

        @JvmField val A59 = of("A59")

        @JvmField val A6 = of("A6")

        @JvmField val A60 = of("A60")

        @JvmField val A61 = of("A61")

        @JvmField val A62 = of("A62")

        @JvmField val A63 = of("A63")

        @JvmField val A64 = of("A64")

        @JvmField val A65 = of("A65")

        @JvmField val A66 = of("A66")

        @JvmField val A67 = of("A67")

        @JvmField val A68 = of("A68")

        @JvmField val A69 = of("A69")

        @JvmField val A7 = of("A7")

        @JvmField val A70 = of("A70")

        @JvmField val A71 = of("A71")

        @JvmField val A72 = of("A72")

        @JvmField val A73 = of("A73")

        @JvmField val A74 = of("A74")

        @JvmField val A75 = of("A75")

        @JvmField val A76 = of("A76")

        @JvmField val A77 = of("A77")

        @JvmField val A78 = of("A78")

        @JvmField val A79 = of("A79")

        @JvmField val A8 = of("A8")

        @JvmField val A80 = of("A80")

        @JvmField val A81 = of("A81")

        @JvmField val A82 = of("A82")

        @JvmField val A83 = of("A83")

        @JvmField val A84 = of("A84")

        @JvmField val A85 = of("A85")

        @JvmField val A86 = of("A86")

        @JvmField val A87 = of("A87")

        @JvmField val A88 = of("A88")

        @JvmField val A89 = of("A89")

        @JvmField val A9 = of("A9")

        @JvmField val A90 = of("A90")

        @JvmField val A91 = of("A91")

        @JvmField val A92 = of("A92")

        @JvmField val A93 = of("A93")

        @JvmField val A94 = of("A94")

        @JvmField val A95 = of("A95")

        @JvmField val A96 = of("A96")

        @JvmField val A97 = of("A97")

        @JvmField val A98 = of("A98")

        @JvmField val A99 = of("A99")

        @JvmField val ACR = of("ACR")

        @JvmField val AH = of("AH")

        @JvmField val AI = of("AI")

        @JvmField val AK = of("AK")

        @JvmField val AMH = of("AMH")

        @JvmField val AMT = of("AMT")

        @JvmField val ANN = of("ANN")

        @JvmField val B1 = of("B1")

        @JvmField val B11 = of("B11")

        @JvmField val B12 = of("B12")

        @JvmField val B13 = of("B13")

        @JvmField val B14 = of("B14")

        @JvmField val B15 = of("B15")

        @JvmField val B16 = of("B16")

        @JvmField val B17 = of("B17")

        @JvmField val B18 = of("B18")

        @JvmField val B19 = of("B19")

        @JvmField val B20 = of("B20")

        @JvmField val B21 = of("B21")

        @JvmField val B22 = of("B22")

        @JvmField val B23 = of("B23")

        @JvmField val B24 = of("B24")

        @JvmField val B25 = of("B25")

        @JvmField val B26 = of("B26")

        @JvmField val B27 = of("B27")

        @JvmField val B28 = of("B28")

        @JvmField val B29 = of("B29")

        @JvmField val B3 = of("B3")

        @JvmField val B30 = of("B30")

        @JvmField val B31 = of("B31")

        @JvmField val B32 = of("B32")

        @JvmField val B33 = of("B33")

        @JvmField val B34 = of("B34")

        @JvmField val B35 = of("B35")

        @JvmField val B36 = of("B36")

        @JvmField val B37 = of("B37")

        @JvmField val B38 = of("B38")

        @JvmField val B39 = of("B39")

        @JvmField val B4 = of("B4")

        @JvmField val B40 = of("B40")

        @JvmField val B41 = of("B41")

        @JvmField val B42 = of("B42")

        @JvmField val B43 = of("B43")

        @JvmField val B44 = of("B44")

        @JvmField val B45 = of("B45")

        @JvmField val B46 = of("B46")

        @JvmField val B47 = of("B47")

        @JvmField val B48 = of("B48")

        @JvmField val B49 = of("B49")

        @JvmField val B5 = of("B5")

        @JvmField val B50 = of("B50")

        @JvmField val B52 = of("B52")

        @JvmField val B53 = of("B53")

        @JvmField val B54 = of("B54")

        @JvmField val B55 = of("B55")

        @JvmField val B56 = of("B56")

        @JvmField val B57 = of("B57")

        @JvmField val B58 = of("B58")

        @JvmField val B59 = of("B59")

        @JvmField val B6 = of("B6")

        @JvmField val B60 = of("B60")

        @JvmField val B61 = of("B61")

        @JvmField val B62 = of("B62")

        @JvmField val B63 = of("B63")

        @JvmField val B64 = of("B64")

        @JvmField val B65 = of("B65")

        @JvmField val B66 = of("B66")

        @JvmField val B67 = of("B67")

        @JvmField val B68 = of("B68")

        @JvmField val B69 = of("B69")

        @JvmField val B7 = of("B7")

        @JvmField val B70 = of("B70")

        @JvmField val B71 = of("B71")

        @JvmField val B72 = of("B72")

        @JvmField val B73 = of("B73")

        @JvmField val B74 = of("B74")

        @JvmField val B75 = of("B75")

        @JvmField val B76 = of("B76")

        @JvmField val B77 = of("B77")

        @JvmField val B78 = of("B78")

        @JvmField val B79 = of("B79")

        @JvmField val B8 = of("B8")

        @JvmField val B80 = of("B80")

        @JvmField val B81 = of("B81")

        @JvmField val B82 = of("B82")

        @JvmField val B83 = of("B83")

        @JvmField val B84 = of("B84")

        @JvmField val B85 = of("B85")

        @JvmField val B86 = of("B86")

        @JvmField val B87 = of("B87")

        @JvmField val B88 = of("B88")

        @JvmField val B89 = of("B89")

        @JvmField val B9 = of("B9")

        @JvmField val B90 = of("B90")

        @JvmField val B91 = of("B91")

        @JvmField val B92 = of("B92")

        @JvmField val B93 = of("B93")

        @JvmField val B94 = of("B94")

        @JvmField val B95 = of("B95")

        @JvmField val B96 = of("B96")

        @JvmField val B97 = of("B97")

        @JvmField val B98 = of("B98")

        @JvmField val B99 = of("B99")

        @JvmField val BAR = of("BAR")

        @JvmField val BB = of("BB")

        @JvmField val BFT = of("BFT")

        @JvmField val BHP = of("BHP")

        @JvmField val BIL = of("BIL")

        @JvmField val BLD = of("BLD")

        @JvmField val BLL = of("BLL")

        @JvmField val BUA = of("BUA")

        @JvmField val BUI = of("BUI")

        @JvmField val C0 = of("C0")

        @JvmField val C10 = of("C10")

        @JvmField val C11 = of("C11")

        @JvmField val C12 = of("C12")

        @JvmField val C13 = of("C13")

        @JvmField val C14 = of("C14")

        @JvmField val C15 = of("C15")

        @JvmField val C16 = of("C16")

        @JvmField val C17 = of("C17")

        @JvmField val C18 = of("C18")

        @JvmField val C19 = of("C19")

        @JvmField val C20 = of("C20")

        @JvmField val C21 = of("C21")

        @JvmField val C22 = of("C22")

        @JvmField val C23 = of("C23")

        @JvmField val C24 = of("C24")

        @JvmField val C25 = of("C25")

        @JvmField val C26 = of("C26")

        @JvmField val C27 = of("C27")

        @JvmField val C28 = of("C28")

        @JvmField val C29 = of("C29")

        @JvmField val C30 = of("C30")

        @JvmField val C31 = of("C31")

        @JvmField val C32 = of("C32")

        @JvmField val C33 = of("C33")

        @JvmField val C34 = of("C34")

        @JvmField val C35 = of("C35")

        @JvmField val C36 = of("C36")

        @JvmField val C37 = of("C37")

        @JvmField val C38 = of("C38")

        @JvmField val C39 = of("C39")

        @JvmField val C40 = of("C40")

        @JvmField val C41 = of("C41")

        @JvmField val C42 = of("C42")

        @JvmField val C43 = of("C43")

        @JvmField val C44 = of("C44")

        @JvmField val C45 = of("C45")

        @JvmField val C46 = of("C46")

        @JvmField val C47 = of("C47")

        @JvmField val C48 = of("C48")

        @JvmField val C49 = of("C49")

        @JvmField val C50 = of("C50")

        @JvmField val C51 = of("C51")

        @JvmField val C52 = of("C52")

        @JvmField val C53 = of("C53")

        @JvmField val C54 = of("C54")

        @JvmField val C55 = of("C55")

        @JvmField val C56 = of("C56")

        @JvmField val C57 = of("C57")

        @JvmField val C58 = of("C58")

        @JvmField val C59 = of("C59")

        @JvmField val C60 = of("C60")

        @JvmField val C61 = of("C61")

        @JvmField val C63 = of("C63")

        @JvmField val C64 = of("C64")

        @JvmField val C65 = of("C65")

        @JvmField val C66 = of("C66")

        @JvmField val C67 = of("C67")

        @JvmField val C68 = of("C68")

        @JvmField val C69 = of("C69")

        @JvmField val C70 = of("C70")

        @JvmField val C71 = of("C71")

        @JvmField val C72 = of("C72")

        @JvmField val C73 = of("C73")

        @JvmField val C74 = of("C74")

        @JvmField val C75 = of("C75")

        @JvmField val C76 = of("C76")

        @JvmField val C77 = of("C77")

        @JvmField val C78 = of("C78")

        @JvmField val C79 = of("C79")

        @JvmField val C80 = of("C80")

        @JvmField val C81 = of("C81")

        @JvmField val C82 = of("C82")

        @JvmField val C83 = of("C83")

        @JvmField val C84 = of("C84")

        @JvmField val C85 = of("C85")

        @JvmField val C86 = of("C86")

        @JvmField val C87 = of("C87")

        @JvmField val C88 = of("C88")

        @JvmField val C89 = of("C89")

        @JvmField val C90 = of("C90")

        @JvmField val C91 = of("C91")

        @JvmField val C92 = of("C92")

        @JvmField val C93 = of("C93")

        @JvmField val C94 = of("C94")

        @JvmField val C95 = of("C95")

        @JvmField val C96 = of("C96")

        @JvmField val C97 = of("C97")

        @JvmField val C98 = of("C98")

        @JvmField val C99 = of("C99")

        @JvmField val CDL = of("CDL")

        @JvmField val CEL = of("CEL")

        @JvmField val CHU = of("CHU")

        @JvmField val CIU = of("CIU")

        @JvmField val CLT = of("CLT")

        @JvmField val CMK = of("CMK")

        @JvmField val CMQ = of("CMQ")

        @JvmField val CMT = of("CMT")

        @JvmField val CNP = of("CNP")

        @JvmField val CNT = of("CNT")

        @JvmField val COU = of("COU")

        @JvmField val CTG = of("CTG")

        @JvmField val CTN = of("CTN")

        @JvmField val CUR = of("CUR")

        @JvmField val CWA = of("CWA")

        @JvmField val CWI = of("CWI")

        @JvmField val DAN = of("DAN")

        @JvmField val DAY = of("DAY")

        @JvmField val DB = of("DB")

        @JvmField val DD = of("DD")

        @JvmField val DG = of("DG")

        @JvmField val DI = of("DI")

        @JvmField val DLT = of("DLT")

        @JvmField val DMK = of("DMK")

        @JvmField val DMQ = of("DMQ")

        @JvmField val DMT = of("DMT")

        @JvmField val DPC = of("DPC")

        @JvmField val DPT = of("DPT")

        @JvmField val DRA = of("DRA")

        @JvmField val DZN = of("DZN")

        @JvmField val DZP = of("DZP")

        @JvmField val FOT = of("FOT")

        @JvmField val GLL = of("GLL")

        @JvmField val GLI = of("GLI")

        @JvmField val GRM = of("GRM")

        @JvmField val GRO = of("GRO")

        @JvmField val HUR = of("HUR")

        @JvmField val HTZ = of("HTZ")

        @JvmField val INH = of("INH")

        @JvmField val KGM = of("KGM")

        @JvmField val KMT = of("KMT")

        @JvmField val MTR = of("MTR")

        @JvmField val SMI = of("SMI")

        @JvmField val MIN = of("MIN")

        @JvmField val MON = of("MON")

        @JvmField val ONZ = of("ONZ")

        @JvmField val LBR = of("LBR")

        @JvmField val QT = of("QT")

        @JvmField val SEC = of("SEC")

        @JvmField val FTK = of("FTK")

        @JvmField val INK = of("INK")

        @JvmField val MTK = of("MTK")

        @JvmField val YDK = of("YDK")

        @JvmField val TNE = of("TNE")

        @JvmField val VLT = of("VLT")

        @JvmField val WTT = of("WTT")

        @JvmField val YRD = of("YRD")

        @JvmField val FTQ = of("FTQ")

        @JvmField val INQ = of("INQ")

        @JvmField val MTQ = of("MTQ")

        @JvmField val YDQ = of("YDQ")

        @JvmField val HAR = of("HAR")

        @JvmField val KLT = of("KLT")

        @JvmField val MLT = of("MLT")

        @JvmField val MMT = of("MMT")

        @JvmField val KMK = of("KMK")

        @JvmField val MMK = of("MMK")

        @JvmField val XAA = of("XAA")

        @JvmField val XAB = of("XAB")

        @JvmField val XAC = of("XAC")

        @JvmField val XAD = of("XAD")

        @JvmField val XAE = of("XAE")

        @JvmField val XAF = of("XAF")

        @JvmField val XAG = of("XAG")

        @JvmField val XAH = of("XAH")

        @JvmField val XAI = of("XAI")

        @JvmField val XAJ = of("XAJ")

        @JvmField val XAL = of("XAL")

        @JvmField val XAM = of("XAM")

        @JvmField val XAP = of("XAP")

        @JvmField val XAT = of("XAT")

        @JvmField val XAV = of("XAV")

        @JvmField val XB4 = of("XB4")

        @JvmField val XBA = of("XBA")

        @JvmField val XBB = of("XBB")

        @JvmField val XBC = of("XBC")

        @JvmField val XBD = of("XBD")

        @JvmField val XBE = of("XBE")

        @JvmField val XBF = of("XBF")

        @JvmField val XBG = of("XBG")

        @JvmField val XBH = of("XBH")

        @JvmField val XBI = of("XBI")

        @JvmField val XBJ = of("XBJ")

        @JvmField val XBK = of("XBK")

        @JvmField val XBL = of("XBL")

        @JvmField val XBM = of("XBM")

        @JvmField val XBN = of("XBN")

        @JvmField val XBO = of("XBO")

        @JvmField val XBP = of("XBP")

        @JvmField val XBQ = of("XBQ")

        @JvmField val XBR = of("XBR")

        @JvmField val XBS = of("XBS")

        @JvmField val XBT = of("XBT")

        @JvmField val XBU = of("XBU")

        @JvmField val XBV = of("XBV")

        @JvmField val XBW = of("XBW")

        @JvmField val XBX = of("XBX")

        @JvmField val XBY = of("XBY")

        @JvmField val XBZ = of("XBZ")

        @JvmField val XCA = of("XCA")

        @JvmField val XCB = of("XCB")

        @JvmField val XCC = of("XCC")

        @JvmField val XCD = of("XCD")

        @JvmField val XCE = of("XCE")

        @JvmField val XCF = of("XCF")

        @JvmField val XCG = of("XCG")

        @JvmField val XCH = of("XCH")

        @JvmField val XCI = of("XCI")

        @JvmField val XCJ = of("XCJ")

        @JvmField val XCK = of("XCK")

        @JvmField val XCL = of("XCL")

        @JvmField val XCM = of("XCM")

        @JvmField val XCN = of("XCN")

        @JvmField val XCO = of("XCO")

        @JvmField val XCP = of("XCP")

        @JvmField val XCQ = of("XCQ")

        @JvmField val XCR = of("XCR")

        @JvmField val XCS = of("XCS")

        @JvmField val XCT = of("XCT")

        @JvmField val XCU = of("XCU")

        @JvmField val XCV = of("XCV")

        @JvmField val XCW = of("XCW")

        @JvmField val XCX = of("XCX")

        @JvmField val XCY = of("XCY")

        @JvmField val XCZ = of("XCZ")

        @JvmField val XDA = of("XDA")

        @JvmField val XDB = of("XDB")

        @JvmField val XDC = of("XDC")

        @JvmField val XDD = of("XDD")

        @JvmField val XDE = of("XDE")

        @JvmField val XDF = of("XDF")

        @JvmField val XDG = of("XDG")

        @JvmField val XDH = of("XDH")

        @JvmField val XDI = of("XDI")

        @JvmField val XDJ = of("XDJ")

        @JvmField val XDK = of("XDK")

        @JvmField val XDL = of("XDL")

        @JvmField val XDM = of("XDM")

        @JvmField val XDN = of("XDN")

        @JvmField val XDP = of("XDP")

        @JvmField val XDQ = of("XDQ")

        @JvmField val XDR = of("XDR")

        @JvmField val XDS = of("XDS")

        @JvmField val XDT = of("XDT")

        @JvmField val XDU = of("XDU")

        @JvmField val XDV = of("XDV")

        @JvmField val XDW = of("XDW")

        @JvmField val XDX = of("XDX")

        @JvmField val XDY = of("XDY")

        @JvmField val XDZ = of("XDZ")

        @JvmField val XEA = of("XEA")

        @JvmField val XEB = of("XEB")

        @JvmField val XEC = of("XEC")

        @JvmField val XED = of("XED")

        @JvmField val XEE = of("XEE")

        @JvmField val XEF = of("XEF")

        @JvmField val XEG = of("XEG")

        @JvmField val XEH = of("XEH")

        @JvmField val XEI = of("XEI")

        @JvmField val XEJ = of("XEJ")

        @JvmField val XEK = of("XEK")

        @JvmField val XEL = of("XEL")

        @JvmField val XEM = of("XEM")

        @JvmField val XEN = of("XEN")

        @JvmField val XEP = of("XEP")

        @JvmField val XEQ = of("XEQ")

        @JvmField val XER = of("XER")

        @JvmField val XES = of("XES")

        @JvmField val XET = of("XET")

        @JvmField val XEU = of("XEU")

        @JvmField val XEV = of("XEV")

        @JvmField val XEW = of("XEW")

        @JvmField val XEX = of("XEX")

        @JvmField val XEY = of("XEY")

        @JvmField val XFB = of("XFB")

        @JvmField val XFC = of("XFC")

        @JvmField val XFD = of("XFD")

        @JvmField val XFE = of("XFE")

        @JvmField val XFF = of("XFF")

        @JvmField val XFG = of("XFG")

        @JvmField val XFH = of("XFH")

        @JvmField val XFI = of("XFI")

        @JvmField val XFJ = of("XFJ")

        @JvmField val XFK = of("XFK")

        @JvmField val XFL = of("XFL")

        @JvmField val XFM = of("XFM")

        @JvmField val XFN = of("XFN")

        @JvmField val XFO = of("XFO")

        @JvmField val XFP = of("XFP")

        @JvmField val XFQ = of("XFQ")

        @JvmField val XFR = of("XFR")

        @JvmField val XFS = of("XFS")

        @JvmField val XFT = of("XFT")

        @JvmField val XFU = of("XFU")

        @JvmField val XFV = of("XFV")

        @JvmField val XFW = of("XFW")

        @JvmField val XFX = of("XFX")

        @JvmField val XFY = of("XFY")

        @JvmField val XFZ = of("XFZ")

        @JvmField val XGA = of("XGA")

        @JvmField val XGB = of("XGB")

        @JvmField val XGC = of("XGC")

        @JvmField val XGD = of("XGD")

        @JvmField val XGE = of("XGE")

        @JvmField val XGF = of("XGF")

        @JvmField val XGG = of("XGG")

        @JvmField val XGH = of("XGH")

        @JvmField val XGI = of("XGI")

        @JvmField val XGJ = of("XGJ")

        @JvmField val XGK = of("XGK")

        @JvmField val XGL = of("XGL")

        @JvmField val XGM = of("XGM")

        @JvmField val XGN = of("XGN")

        @JvmField val XGO = of("XGO")

        @JvmField val XGP = of("XGP")

        @JvmField val XGQ = of("XGQ")

        @JvmField val XGR = of("XGR")

        @JvmField val XGS = of("XGS")

        @JvmField val XGT = of("XGT")

        @JvmField val XGU = of("XGU")

        @JvmField val XGV = of("XGV")

        @JvmField val XGW = of("XGW")

        @JvmField val XGX = of("XGX")

        @JvmField val XGY = of("XGY")

        @JvmField val XGZ = of("XGZ")

        @JvmField val XHA = of("XHA")

        @JvmField val XHB = of("XHB")

        @JvmField val XHC = of("XHC")

        @JvmField val XHD = of("XHD")

        @JvmField val XHE = of("XHE")

        @JvmField val XHF = of("XHF")

        @JvmField val XHG = of("XHG")

        @JvmField val XHH = of("XHH")

        @JvmField val XHI = of("XHI")

        @JvmField val XHJ = of("XHJ")

        @JvmField val XHK = of("XHK")

        @JvmField val XHL = of("XHL")

        @JvmField val XHM = of("XHM")

        @JvmField val XHN = of("XHN")

        @JvmField val XHP = of("XHP")

        @JvmField val XHQ = of("XHQ")

        @JvmField val XHR = of("XHR")

        @JvmField val XHS = of("XHS")

        @JvmField val XHT = of("XHT")

        @JvmField val XHU = of("XHU")

        @JvmField val XHV = of("XHV")

        @JvmField val XHW = of("XHW")

        @JvmField val XHX = of("XHX")

        @JvmField val XHY = of("XHY")

        @JvmField val XHZ = of("XHZ")

        @JvmField val XIA = of("XIA")

        @JvmField val XIB = of("XIB")

        @JvmField val XIC = of("XIC")

        @JvmField val XID = of("XID")

        @JvmField val XIE = of("XIE")

        @JvmField val XIF = of("XIF")

        @JvmField val XIG = of("XIG")

        @JvmField val XIH = of("XIH")

        @JvmField val XII = of("XII")

        @JvmField val XIJ = of("XIJ")

        @JvmField val XIK = of("XIK")

        @JvmField val XIL = of("XIL")

        @JvmField val XIM = of("XIM")

        @JvmField val XIN = of("XIN")

        @JvmField val XIO = of("XIO")

        @JvmField val XJA = of("XJA")

        @JvmField val XJB = of("XJB")

        @JvmField val XJC = of("XJC")

        @JvmField val XJD = of("XJD")

        @JvmField val XJE = of("XJE")

        @JvmField val XJF = of("XJF")

        @JvmField val XJG = of("XJG")

        @JvmField val XJH = of("XJH")

        @JvmField val XJI = of("XJI")

        @JvmField val XJJ = of("XJJ")

        @JvmField val XJK = of("XJK")

        @JvmField val XJL = of("XJL")

        @JvmField val XJM = of("XJM")

        @JvmField val XJN = of("XJN")

        @JvmField val XJO = of("XJO")

        @JvmField val XJP = of("XJP")

        @JvmField val XJQ = of("XJQ")

        @JvmField val XJR = of("XJR")

        @JvmField val XJS = of("XJS")

        @JvmField val XJT = of("XJT")

        @JvmField val XJU = of("XJU")

        @JvmField val XJV = of("XJV")

        @JvmField val XJW = of("XJW")

        @JvmField val XJX = of("XJX")

        @JvmField val XJY = of("XJY")

        @JvmField val XJZ = of("XJZ")

        @JvmField val XLA = of("XLA")

        @JvmField val XLB = of("XLB")

        @JvmField val XLC = of("XLC")

        @JvmField val XLD = of("XLD")

        @JvmField val XLE = of("XLE")

        @JvmField val XLF = of("XLF")

        @JvmField val XLG = of("XLG")

        @JvmField val XLH = of("XLH")

        @JvmField val XLI = of("XLI")

        @JvmField val XLJ = of("XLJ")

        @JvmField val XLK = of("XLK")

        @JvmField val XLL = of("XLL")

        @JvmField val XLM = of("XLM")

        @JvmField val XLN = of("XLN")

        @JvmField val XLO = of("XLO")

        @JvmField val XLP = of("XLP")

        @JvmField val XLQ = of("XLQ")

        @JvmField val XLR = of("XLR")

        @JvmField val XLS = of("XLS")

        @JvmField val XLT = of("XLT")

        @JvmField val XLU = of("XLU")

        @JvmField val XLV = of("XLV")

        @JvmField val XLW = of("XLW")

        @JvmField val XLX = of("XLX")

        @JvmField val XLY = of("XLY")

        @JvmField val XLZ = of("XLZ")

        @JvmField val XMA = of("XMA")

        @JvmField val XMB = of("XMB")

        @JvmField val XMC = of("XMC")

        @JvmField val XMD = of("XMD")

        @JvmField val XME = of("XME")

        @JvmField val XMF = of("XMF")

        @JvmField val XMG = of("XMG")

        @JvmField val XMH = of("XMH")

        @JvmField val XMI = of("XMI")

        @JvmField val XMJ = of("XMJ")

        @JvmField val XMK = of("XMK")

        @JvmField val XML = of("XML")

        @JvmField val XMM = of("XMM")

        @JvmField val XMN = of("XMN")

        @JvmField val XMO = of("XMO")

        @JvmField val XMP = of("XMP")

        @JvmField val XMQ = of("XMQ")

        @JvmField val XMR = of("XMR")

        @JvmField val XMS = of("XMS")

        @JvmField val XMT = of("XMT")

        @JvmField val XMU = of("XMU")

        @JvmField val XMV = of("XMV")

        @JvmField val XMW = of("XMW")

        @JvmField val XMX = of("XMX")

        @JvmField val XMY = of("XMY")

        @JvmField val XMZ = of("XMZ")

        @JvmField val XNA = of("XNA")

        @JvmField val XNB = of("XNB")

        @JvmField val XNC = of("XNC")

        @JvmField val XND = of("XND")

        @JvmField val XNE = of("XNE")

        @JvmField val XNF = of("XNF")

        @JvmField val XNG = of("XNG")

        @JvmField val XNH = of("XNH")

        @JvmField val XNI = of("XNI")

        @JvmField val XNJ = of("XNJ")

        @JvmField val XNK = of("XNK")

        @JvmField val XNL = of("XNL")

        @JvmField val XNM = of("XNM")

        @JvmField val XOA = of("XOA")

        @JvmField val XOB = of("XOB")

        @JvmField val XOC = of("XOC")

        @JvmField val XOD = of("XOD")

        @JvmField val XOE = of("XOE")

        @JvmField val XOF = of("XOF")

        @JvmField val XOG = of("XOG")

        @JvmField val XOH = of("XOH")

        @JvmField val XOI = of("XOI")

        @JvmField val XOJ = of("XOJ")

        @JvmField val XOK = of("XOK")

        @JvmField val XOL = of("XOL")

        @JvmField val XOM = of("XOM")

        @JvmField val XON = of("XON")

        @JvmField val XOO = of("XOO")

        @JvmField val XOP = of("XOP")

        @JvmField val XOQ = of("XOQ")

        @JvmField val XOR = of("XOR")

        @JvmField val XOS = of("XOS")

        @JvmField val XOT = of("XOT")

        @JvmField val XOU = of("XOU")

        @JvmField val XOV = of("XOV")

        @JvmField val XOW = of("XOW")

        @JvmField val XOX = of("XOX")

        @JvmField val XOY = of("XOY")

        @JvmField val XOZ = of("XOZ")

        @JvmField val XP1 = of("XP1")

        @JvmField val XP2 = of("XP2")

        @JvmField val XP3 = of("XP3")

        @JvmField val XP4 = of("XP4")

        @JvmField val XPA = of("XPA")

        @JvmField val XPB = of("XPB")

        @JvmField val XPC = of("XPC")

        @JvmField val XPD = of("XPD")

        @JvmField val XPE = of("XPE")

        @JvmField val XPF = of("XPF")

        @JvmField val XPG = of("XPG")

        @JvmField val XPH = of("XPH")

        @JvmField val XPI = of("XPI")

        @JvmField val XPJ = of("XPJ")

        @JvmField val XPK = of("XPK")

        @JvmField val XPL = of("XPL")

        @JvmField val XPM = of("XPM")

        @JvmField val XPN = of("XPN")

        @JvmField val XPO = of("XPO")

        @JvmField val XPP = of("XPP")

        @JvmField val XPQ = of("XPQ")

        @JvmField val XPR = of("XPR")

        @JvmField val XPS = of("XPS")

        @JvmField val XPT = of("XPT")

        @JvmField val XPU = of("XPU")

        @JvmField val XPV = of("XPV")

        @JvmField val XPW = of("XPW")

        @JvmField val XPX = of("XPX")

        @JvmField val XPY = of("XPY")

        @JvmField val XPZ = of("XPZ")

        @JvmField val XQA = of("XQA")

        @JvmField val XQB = of("XQB")

        @JvmField val XQC = of("XQC")

        @JvmField val XQD = of("XQD")

        @JvmField val XQE = of("XQE")

        @JvmField val XQF = of("XQF")

        @JvmField val XQG = of("XQG")

        @JvmField val XQH = of("XQH")

        @JvmField val XQI = of("XQI")

        @JvmField val XQJ = of("XQJ")

        @JvmField val XQK = of("XQK")

        @JvmField val XQL = of("XQL")

        @JvmField val XQM = of("XQM")

        @JvmField val XQN = of("XQN")

        @JvmField val XQO = of("XQO")

        @JvmField val XQP = of("XQP")

        @JvmField val XQQ = of("XQQ")

        @JvmField val XQR = of("XQR")

        @JvmField val XQS = of("XQS")

        @JvmField val XRD = of("XRD")

        @JvmField val XRE = of("XRE")

        @JvmField val XRF = of("XRF")

        @JvmField val XRG = of("XRG")

        @JvmField val XRH = of("XRH")

        @JvmField val XRI = of("XRI")

        @JvmField val XRJ = of("XRJ")

        @JvmField val XRK = of("XRK")

        @JvmField val XRL = of("XRL")

        @JvmField val XRM = of("XRM")

        @JvmField val XRN = of("XRN")

        @JvmField val XRO = of("XRO")

        @JvmField val XRP = of("XRP")

        @JvmField val XRQ = of("XRQ")

        @JvmField val XRR = of("XRR")

        @JvmField val XRS = of("XRS")

        @JvmField val XRT = of("XRT")

        @JvmField val XRU = of("XRU")

        @JvmField val XRV = of("XRV")

        @JvmField val XRW = of("XRW")

        @JvmField val XRX = of("XRX")

        @JvmField val XRY = of("XRY")

        @JvmField val XRZ = of("XRZ")

        @JvmField val XSA = of("XSA")

        @JvmField val XSB = of("XSB")

        @JvmField val XSC = of("XSC")

        @JvmField val XSD = of("XSD")

        @JvmField val XSE = of("XSE")

        @JvmField val XSF = of("XSF")

        @JvmField val XSG = of("XSG")

        @JvmField val XSH = of("XSH")

        @JvmField val XSI = of("XSI")

        @JvmField val XSJ = of("XSJ")

        @JvmField val XSK = of("XSK")

        @JvmField val XSL = of("XSL")

        @JvmField val XSM = of("XSM")

        @JvmField val XSN = of("XSN")

        @JvmField val XSO = of("XSO")

        @JvmField val XSP = of("XSP")

        @JvmField val XSQ = of("XSQ")

        @JvmField val XSR = of("XSR")

        @JvmField val XSS = of("XSS")

        @JvmField val XST = of("XST")

        @JvmField val XSU = of("XSU")

        @JvmField val XSV = of("XSV")

        @JvmField val XSW = of("XSW")

        @JvmField val XSX = of("XSX")

        @JvmField val XSY = of("XSY")

        @JvmField val XSZ = of("XSZ")

        @JvmField val XTA = of("XTA")

        @JvmField val XTB = of("XTB")

        @JvmField val XTC = of("XTC")

        @JvmField val XTD = of("XTD")

        @JvmField val XTE = of("XTE")

        @JvmField val XTF = of("XTF")

        @JvmField val XTG = of("XTG")

        @JvmField val XTI = of("XTI")

        @JvmField val XTJ = of("XTJ")

        @JvmField val XTK = of("XTK")

        @JvmField val XTL = of("XTL")

        @JvmField val XTM = of("XTM")

        @JvmField val XTN = of("XTN")

        @JvmField val XTO = of("XTO")

        @JvmField val XTR = of("XTR")

        @JvmField val XTS = of("XTS")

        @JvmField val XTT = of("XTT")

        @JvmField val XTU = of("XTU")

        @JvmField val XTV = of("XTV")

        @JvmField val XTW = of("XTW")

        @JvmField val XTX = of("XTX")

        @JvmField val XTY = of("XTY")

        @JvmField val XTZ = of("XTZ")

        @JvmField val XUC = of("XUC")

        @JvmField val XUN = of("XUN")

        @JvmField val XVA = of("XVA")

        @JvmField val XVG = of("XVG")

        @JvmField val XVI = of("XVI")

        @JvmField val XVK = of("XVK")

        @JvmField val XVL = of("XVL")

        @JvmField val XVN = of("XVN")

        @JvmField val XVO = of("XVO")

        @JvmField val XVP = of("XVP")

        @JvmField val XVQ = of("XVQ")

        @JvmField val XVR = of("XVR")

        @JvmField val XVS = of("XVS")

        @JvmField val XVY = of("XVY")

        @JvmField val XWA = of("XWA")

        @JvmField val XWB = of("XWB")

        @JvmField val XWC = of("XWC")

        @JvmField val XWD = of("XWD")

        @JvmField val XWF = of("XWF")

        @JvmField val XWG = of("XWG")

        @JvmField val XWH = of("XWH")

        @JvmField val XWJ = of("XWJ")

        @JvmField val XWK = of("XWK")

        @JvmField val XWL = of("XWL")

        @JvmField val XWM = of("XWM")

        @JvmField val XWN = of("XWN")

        @JvmField val XWP = of("XWP")

        @JvmField val XWQ = of("XWQ")

        @JvmField val XWR = of("XWR")

        @JvmField val XWS = of("XWS")

        @JvmField val XWT = of("XWT")

        @JvmField val XWU = of("XWU")

        @JvmField val XWV = of("XWV")

        @JvmField val XWW = of("XWW")

        @JvmField val XWX = of("XWX")

        @JvmField val XWY = of("XWY")

        @JvmField val XWZ = of("XWZ")

        @JvmField val XXA = of("XXA")

        @JvmField val XXB = of("XXB")

        @JvmField val XXC = of("XXC")

        @JvmField val XXD = of("XXD")

        @JvmField val XXF = of("XXF")

        @JvmField val XXG = of("XXG")

        @JvmField val XXH = of("XXH")

        @JvmField val XXJ = of("XXJ")

        @JvmField val XXK = of("XXK")

        @JvmField val XYA = of("XYA")

        @JvmField val XYB = of("XYB")

        @JvmField val XYC = of("XYC")

        @JvmField val XYD = of("XYD")

        @JvmField val XYF = of("XYF")

        @JvmField val XYG = of("XYG")

        @JvmField val XYH = of("XYH")

        @JvmField val XYJ = of("XYJ")

        @JvmField val XYK = of("XYK")

        @JvmField val XYL = of("XYL")

        @JvmField val XYM = of("XYM")

        @JvmField val XYN = of("XYN")

        @JvmField val XYP = of("XYP")

        @JvmField val XYQ = of("XYQ")

        @JvmField val XYR = of("XYR")

        @JvmField val XYS = of("XYS")

        @JvmField val XYT = of("XYT")

        @JvmField val XYV = of("XYV")

        @JvmField val XYW = of("XYW")

        @JvmField val XYX = of("XYX")

        @JvmField val XYY = of("XYY")

        @JvmField val XYZ = of("XYZ")

        @JvmField val XZA = of("XZA")

        @JvmField val XZB = of("XZB")

        @JvmField val XZC = of("XZC")

        @JvmField val XZD = of("XZD")

        @JvmField val XZF = of("XZF")

        @JvmField val XZG = of("XZG")

        @JvmField val XZH = of("XZH")

        @JvmField val XZJ = of("XZJ")

        @JvmField val XZK = of("XZK")

        @JvmField val XZL = of("XZL")

        @JvmField val XZM = of("XZM")

        @JvmField val XZN = of("XZN")

        @JvmField val XZP = of("XZP")

        @JvmField val XZQ = of("XZQ")

        @JvmField val XZR = of("XZR")

        @JvmField val XZS = of("XZS")

        @JvmField val XZT = of("XZT")

        @JvmField val XZU = of("XZU")

        @JvmField val XZV = of("XZV")

        @JvmField val XZW = of("XZW")

        @JvmField val XZX = of("XZX")

        @JvmField val XZY = of("XZY")

        @JvmField val XZZ = of("XZZ")

        @JvmField val ZZ = of("ZZ")

        @JvmField val NAR = of("NAR")

        @JvmField val C62 = of("C62")

        @JvmField val LTR = of("LTR")

        @JvmField val H87 = of("H87")

        @JvmField val AA = of("AA")

        @JvmField val AB = of("AB")

        @JvmField val ACT = of("ACT")

        @JvmField val AD = of("AD")

        @JvmField val AE = of("AE")

        @JvmField val AL = of("AL")

        @JvmField val AMP = of("AMP")

        @JvmField val APZ = of("APZ")

        @JvmField val AQ = of("AQ")

        @JvmField val AS = of("AS")

        @JvmField val ASM = of("ASM")

        @JvmField val ASU = of("ASU")

        @JvmField val ATM = of("ATM")

        @JvmField val AWG = of("AWG")

        @JvmField val AY = of("AY")

        @JvmField val AZ = of("AZ")

        @JvmField val B10 = of("B10")

        @JvmField val BP = of("BP")

        @JvmField val BPM = of("BPM")

        @JvmField val BQL = of("BQL")

        @JvmField val BTU = of("BTU")

        @JvmField val C3 = of("C3")

        @JvmField val C7 = of("C7")

        @JvmField val C8 = of("C8")

        @JvmField val C9 = of("C9")

        @JvmField val CCT = of("CCT")

        @JvmField val CEN = of("CEN")

        @JvmField val CG = of("CG")

        @JvmField val CGM = of("CGM")

        @JvmField val CKG = of("CKG")

        @JvmField val CLF = of("CLF")

        @JvmField val CTM = of("CTM")

        @JvmField val D03 = of("D03")

        @JvmField val D04 = of("D04")

        @JvmField val D1 = of("D1")

        @JvmField val D10 = of("D10")

        @JvmField val D11 = of("D11")

        @JvmField val D12 = of("D12")

        @JvmField val D13 = of("D13")

        @JvmField val D15 = of("D15")

        @JvmField val D16 = of("D16")

        @JvmField val D17 = of("D17")

        @JvmField val D18 = of("D18")

        @JvmField val D19 = of("D19")

        @JvmField val D2 = of("D2")

        @JvmField val D20 = of("D20")

        @JvmField val D21 = of("D21")

        @JvmField val D22 = of("D22")

        @JvmField val D23 = of("D23")

        @JvmField val D24 = of("D24")

        @JvmField val D25 = of("D25")

        @JvmField val D26 = of("D26")

        @JvmField val D27 = of("D27")

        @JvmField val D29 = of("D29")

        @JvmField val D30 = of("D30")

        @JvmField val D31 = of("D31")

        @JvmField val D32 = of("D32")

        @JvmField val D33 = of("D33")

        @JvmField val D34 = of("D34")

        @JvmField val D36 = of("D36")

        @JvmField val D41 = of("D41")

        @JvmField val D42 = of("D42")

        @JvmField val D43 = of("D43")

        @JvmField val D44 = of("D44")

        @JvmField val D45 = of("D45")

        @JvmField val D46 = of("D46")

        @JvmField val D47 = of("D47")

        @JvmField val D48 = of("D48")

        @JvmField val D49 = of("D49")

        @JvmField val D5 = of("D5")

        @JvmField val D50 = of("D50")

        @JvmField val D51 = of("D51")

        @JvmField val D52 = of("D52")

        @JvmField val D53 = of("D53")

        @JvmField val D54 = of("D54")

        @JvmField val D55 = of("D55")

        @JvmField val D56 = of("D56")

        @JvmField val D57 = of("D57")

        @JvmField val D58 = of("D58")

        @JvmField val D59 = of("D59")

        @JvmField val D6 = of("D6")

        @JvmField val D60 = of("D60")

        @JvmField val D61 = of("D61")

        @JvmField val D62 = of("D62")

        @JvmField val D63 = of("D63")

        @JvmField val D65 = of("D65")

        @JvmField val D68 = of("D68")

        @JvmField val D69 = of("D69")

        @JvmField val D73 = of("D73")

        @JvmField val D74 = of("D74")

        @JvmField val D77 = of("D77")

        @JvmField val D78 = of("D78")

        @JvmField val D80 = of("D80")

        @JvmField val D81 = of("D81")

        @JvmField val D82 = of("D82")

        @JvmField val D83 = of("D83")

        @JvmField val D85 = of("D85")

        @JvmField val D86 = of("D86")

        @JvmField val D87 = of("D87")

        @JvmField val D88 = of("D88")

        @JvmField val D89 = of("D89")

        @JvmField val D91 = of("D91")

        @JvmField val D93 = of("D93")

        @JvmField val D94 = of("D94")

        @JvmField val D95 = of("D95")

        @JvmField val DAA = of("DAA")

        @JvmField val DAD = of("DAD")

        @JvmField val DBM = of("DBM")

        @JvmField val DBW = of("DBW")

        @JvmField val DEC = of("DEC")

        @JvmField val DJ = of("DJ")

        @JvmField val DMA = of("DMA")

        @JvmField val DMO = of("DMO")

        @JvmField val DN = of("DN")

        @JvmField val DPR = of("DPR")

        @JvmField val DRI = of("DRI")

        @JvmField val DRL = of("DRL")

        @JvmField val DT = of("DT")

        @JvmField val DTN = of("DTN")

        @JvmField val DWT = of("DWT")

        @JvmField val E08 = of("E08")

        @JvmField val E15 = of("E15")

        @JvmField val E16 = of("E16")

        @JvmField val E18 = of("E18")

        @JvmField val E19 = of("E19")

        @JvmField val E21 = of("E21")

        @JvmField val E22 = of("E22")

        @JvmField val E28 = of("E28")

        @JvmField val E30 = of("E30")

        @JvmField val E32 = of("E32")

        @JvmField val E33 = of("E33")

        @JvmField val E4 = of("E4")

        @JvmField val E59 = of("E59")

        @JvmField val E61 = of("E61")

        @JvmField val E63 = of("E63")

        @JvmField val E64 = of("E64")

        @JvmField val E68 = of("E68")

        @JvmField val E72 = of("E72")

        @JvmField val E74 = of("E74")

        @JvmField val E77 = of("E77")

        @JvmField val E78 = of("E78")

        @JvmField val E79 = of("E79")

        @JvmField val E80 = of("E80")

        @JvmField val E81 = of("E81")

        @JvmField val E82 = of("E82")

        @JvmField val E83 = of("E83")

        @JvmField val E84 = of("E84")

        @JvmField val E85 = of("E85")

        @JvmField val E86 = of("E86")

        @JvmField val E87 = of("E87")

        @JvmField val E88 = of("E88")

        @JvmField val E89 = of("E89")

        @JvmField val E90 = of("E90")

        @JvmField val E91 = of("E91")

        @JvmField val E92 = of("E92")

        @JvmField val E93 = of("E93")

        @JvmField val E94 = of("E94")

        @JvmField val E95 = of("E95")

        @JvmField val E96 = of("E96")

        @JvmField val E97 = of("E97")

        @JvmField val E98 = of("E98")

        @JvmField val E99 = of("E99")

        @JvmField val EB = of("EB")

        @JvmField val EQ = of("EQ")

        @JvmField val F01 = of("F01")

        @JvmField val F02 = of("F02")

        @JvmField val F03 = of("F03")

        @JvmField val F04 = of("F04")

        @JvmField val F05 = of("F05")

        @JvmField val F06 = of("F06")

        @JvmField val F07 = of("F07")

        @JvmField val F08 = of("F08")

        @JvmField val F10 = of("F10")

        @JvmField val F11 = of("F11")

        @JvmField val F12 = of("F12")

        @JvmField val F13 = of("F13")

        @JvmField val F14 = of("F14")

        @JvmField val F15 = of("F15")

        @JvmField val F16 = of("F16")

        @JvmField val F17 = of("F17")

        @JvmField val F18 = of("F18")

        @JvmField val F19 = of("F19")

        @JvmField val F20 = of("F20")

        @JvmField val F21 = of("F21")

        @JvmField val F22 = of("F22")

        @JvmField val F23 = of("F23")

        @JvmField val F24 = of("F24")

        @JvmField val F25 = of("F25")

        @JvmField val F26 = of("F26")

        @JvmField val F27 = of("F27")

        @JvmField val F28 = of("F28")

        @JvmField val F29 = of("F29")

        @JvmField val F30 = of("F30")

        @JvmField val F31 = of("F31")

        @JvmField val F32 = of("F32")

        @JvmField val F33 = of("F33")

        @JvmField val F34 = of("F34")

        @JvmField val F35 = of("F35")

        @JvmField val F36 = of("F36")

        @JvmField val F37 = of("F37")

        @JvmField val F38 = of("F38")

        @JvmField val F39 = of("F39")

        @JvmField val F40 = of("F40")

        @JvmField val F41 = of("F41")

        @JvmField val F42 = of("F42")

        @JvmField val F43 = of("F43")

        @JvmField val F44 = of("F44")

        @JvmField val F45 = of("F45")

        @JvmField val F46 = of("F46")

        @JvmField val F47 = of("F47")

        @JvmField val F48 = of("F48")

        @JvmField val F49 = of("F49")

        @JvmField val F50 = of("F50")

        @JvmField val F51 = of("F51")

        @JvmField val F52 = of("F52")

        @JvmField val F53 = of("F53")

        @JvmField val F54 = of("F54")

        @JvmField val F55 = of("F55")

        @JvmField val F56 = of("F56")

        @JvmField val F57 = of("F57")

        @JvmField val F58 = of("F58")

        @JvmField val F59 = of("F59")

        @JvmField val F60 = of("F60")

        @JvmField val F61 = of("F61")

        @JvmField val F62 = of("F62")

        @JvmField val F63 = of("F63")

        @JvmField val F64 = of("F64")

        @JvmField val F65 = of("F65")

        @JvmField val F66 = of("F66")

        @JvmField val F67 = of("F67")

        @JvmField val F68 = of("F68")

        @JvmField val F69 = of("F69")

        @JvmField val F70 = of("F70")

        @JvmField val F71 = of("F71")

        @JvmField val F72 = of("F72")

        @JvmField val F73 = of("F73")

        @JvmField val F74 = of("F74")

        @JvmField val F75 = of("F75")

        @JvmField val F76 = of("F76")

        @JvmField val F77 = of("F77")

        @JvmField val F78 = of("F78")

        @JvmField val F79 = of("F79")

        @JvmField val F80 = of("F80")

        @JvmField val F81 = of("F81")

        @JvmField val F82 = of("F82")

        @JvmField val F83 = of("F83")

        @JvmField val F84 = of("F84")

        @JvmField val F85 = of("F85")

        @JvmField val F86 = of("F86")

        @JvmField val F87 = of("F87")

        @JvmField val F88 = of("F88")

        @JvmField val F89 = of("F89")

        @JvmField val F90 = of("F90")

        @JvmField val F91 = of("F91")

        @JvmField val F92 = of("F92")

        @JvmField val F93 = of("F93")

        @JvmField val F94 = of("F94")

        @JvmField val F95 = of("F95")

        @JvmField val F96 = of("F96")

        @JvmField val F97 = of("F97")

        @JvmField val F98 = of("F98")

        @JvmField val F99 = of("F99")

        @JvmField val FAH = of("FAH")

        @JvmField val FAR = of("FAR")

        @JvmField val FBM = of("FBM")

        @JvmField val FC = of("FC")

        @JvmField val FF = of("FF")

        @JvmField val FH = of("FH")

        @JvmField val FIT = of("FIT")

        @JvmField val FL = of("FL")

        @JvmField val FNU = of("FNU")

        @JvmField val FP = of("FP")

        @JvmField val FR = of("FR")

        @JvmField val FS = of("FS")

        @JvmField val G01 = of("G01")

        @JvmField val G04 = of("G04")

        @JvmField val G05 = of("G05")

        @JvmField val G06 = of("G06")

        @JvmField val G08 = of("G08")

        @JvmField val G09 = of("G09")

        @JvmField val G10 = of("G10")

        @JvmField val G11 = of("G11")

        @JvmField val G12 = of("G12")

        @JvmField val G13 = of("G13")

        @JvmField val G14 = of("G14")

        @JvmField val G15 = of("G15")

        @JvmField val G16 = of("G16")

        @JvmField val G17 = of("G17")

        @JvmField val G18 = of("G18")

        @JvmField val G19 = of("G19")

        @JvmField val G2 = of("G2")

        @JvmField val G20 = of("G20")

        @JvmField val G21 = of("G21")

        @JvmField val G23 = of("G23")

        @JvmField val G24 = of("G24")

        @JvmField val G25 = of("G25")

        @JvmField val G26 = of("G26")

        @JvmField val G27 = of("G27")

        @JvmField val G28 = of("G28")

        @JvmField val G29 = of("G29")

        @JvmField val G3 = of("G3")

        @JvmField val G30 = of("G30")

        @JvmField val G31 = of("G31")

        @JvmField val G32 = of("G32")

        @JvmField val G33 = of("G33")

        @JvmField val G34 = of("G34")

        @JvmField val G35 = of("G35")

        @JvmField val G36 = of("G36")

        @JvmField val G37 = of("G37")

        @JvmField val G38 = of("G38")

        @JvmField val G39 = of("G39")

        @JvmField val G40 = of("G40")

        @JvmField val G41 = of("G41")

        @JvmField val G42 = of("G42")

        @JvmField val G43 = of("G43")

        @JvmField val G44 = of("G44")

        @JvmField val G45 = of("G45")

        @JvmField val G46 = of("G46")

        @JvmField val G47 = of("G47")

        @JvmField val G48 = of("G48")

        @JvmField val G49 = of("G49")

        @JvmField val G50 = of("G50")

        @JvmField val G51 = of("G51")

        @JvmField val G52 = of("G52")

        @JvmField val G53 = of("G53")

        @JvmField val G54 = of("G54")

        @JvmField val G55 = of("G55")

        @JvmField val G56 = of("G56")

        @JvmField val G57 = of("G57")

        @JvmField val G58 = of("G58")

        @JvmField val G59 = of("G59")

        @JvmField val G60 = of("G60")

        @JvmField val G61 = of("G61")

        @JvmField val G62 = of("G62")

        @JvmField val G63 = of("G63")

        @JvmField val G64 = of("G64")

        @JvmField val G65 = of("G65")

        @JvmField val G66 = of("G66")

        @JvmField val G67 = of("G67")

        @JvmField val G68 = of("G68")

        @JvmField val G69 = of("G69")

        @JvmField val G70 = of("G70")

        @JvmField val G71 = of("G71")

        @JvmField val G72 = of("G72")

        @JvmField val G73 = of("G73")

        @JvmField val G74 = of("G74")

        @JvmField val G75 = of("G75")

        @JvmField val G76 = of("G76")

        @JvmField val G77 = of("G77")

        @JvmField val G78 = of("G78")

        @JvmField val G79 = of("G79")

        @JvmField val G80 = of("G80")

        @JvmField val G81 = of("G81")

        @JvmField val G82 = of("G82")

        @JvmField val G83 = of("G83")

        @JvmField val G84 = of("G84")

        @JvmField val G85 = of("G85")

        @JvmField val G86 = of("G86")

        @JvmField val G87 = of("G87")

        @JvmField val G88 = of("G88")

        @JvmField val G89 = of("G89")

        @JvmField val G90 = of("G90")

        @JvmField val G91 = of("G91")

        @JvmField val G92 = of("G92")

        @JvmField val G93 = of("G93")

        @JvmField val G94 = of("G94")

        @JvmField val G95 = of("G95")

        @JvmField val G96 = of("G96")

        @JvmField val G97 = of("G97")

        @JvmField val G98 = of("G98")

        @JvmField val G99 = of("G99")

        @JvmField val GB = of("GB")

        @JvmField val GBQ = of("GBQ")

        @JvmField val GDW = of("GDW")

        @JvmField val GE = of("GE")

        @JvmField val GF = of("GF")

        @JvmField val GFI = of("GFI")

        @JvmField val GGR = of("GGR")

        @JvmField val GIA = of("GIA")

        @JvmField val GIC = of("GIC")

        @JvmField val GII = of("GII")

        @JvmField val GIP = of("GIP")

        @JvmField val GJ = of("GJ")

        @JvmField val GL = of("GL")

        @JvmField val GLD = of("GLD")

        @JvmField val GM = of("GM")

        @JvmField val GO = of("GO")

        @JvmField val GP = of("GP")

        @JvmField val GQ = of("GQ")

        @JvmField val GRN = of("GRN")

        @JvmField val GV = of("GV")

        @JvmField val GWH = of("GWH")

        @JvmField val H03 = of("H03")

        @JvmField val H04 = of("H04")

        @JvmField val H05 = of("H05")

        @JvmField val H06 = of("H06")

        @JvmField val H07 = of("H07")

        @JvmField val H08 = of("H08")

        @JvmField val H09 = of("H09")

        @JvmField val H10 = of("H10")

        @JvmField val H11 = of("H11")

        @JvmField val H12 = of("H12")

        @JvmField val H13 = of("H13")

        @JvmField val H14 = of("H14")

        @JvmField val H15 = of("H15")

        @JvmField val H16 = of("H16")

        @JvmField val H18 = of("H18")

        @JvmField val H19 = of("H19")

        @JvmField val H20 = of("H20")

        @JvmField val H21 = of("H21")

        @JvmField val H22 = of("H22")

        @JvmField val H23 = of("H23")

        @JvmField val H24 = of("H24")

        @JvmField val H25 = of("H25")

        @JvmField val H26 = of("H26")

        @JvmField val H27 = of("H27")

        @JvmField val H28 = of("H28")

        @JvmField val H29 = of("H29")

        @JvmField val H30 = of("H30")

        @JvmField val H31 = of("H31")

        @JvmField val H32 = of("H32")

        @JvmField val H33 = of("H33")

        @JvmField val H34 = of("H34")

        @JvmField val H35 = of("H35")

        @JvmField val H36 = of("H36")

        @JvmField val H37 = of("H37")

        @JvmField val H38 = of("H38")

        @JvmField val H39 = of("H39")

        @JvmField val H40 = of("H40")

        @JvmField val H41 = of("H41")

        @JvmField val H42 = of("H42")

        @JvmField val H43 = of("H43")

        @JvmField val H44 = of("H44")

        @JvmField val H45 = of("H45")

        @JvmField val H46 = of("H46")

        @JvmField val H47 = of("H47")

        @JvmField val H48 = of("H48")

        @JvmField val H49 = of("H49")

        @JvmField val H50 = of("H50")

        @JvmField val H51 = of("H51")

        @JvmField val H52 = of("H52")

        @JvmField val H53 = of("H53")

        @JvmField val H54 = of("H54")

        @JvmField val H55 = of("H55")

        @JvmField val H56 = of("H56")

        @JvmField val H57 = of("H57")

        @JvmField val H58 = of("H58")

        @JvmField val H59 = of("H59")

        @JvmField val H60 = of("H60")

        @JvmField val H61 = of("H61")

        @JvmField val H62 = of("H62")

        @JvmField val H63 = of("H63")

        @JvmField val H64 = of("H64")

        @JvmField val H65 = of("H65")

        @JvmField val H66 = of("H66")

        @JvmField val H67 = of("H67")

        @JvmField val H68 = of("H68")

        @JvmField val H69 = of("H69")

        @JvmField val H70 = of("H70")

        @JvmField val H71 = of("H71")

        @JvmField val H72 = of("H72")

        @JvmField val H73 = of("H73")

        @JvmField val H74 = of("H74")

        @JvmField val H75 = of("H75")

        @JvmField val H76 = of("H76")

        @JvmField val H77 = of("H77")

        @JvmField val H79 = of("H79")

        @JvmField val H80 = of("H80")

        @JvmField val H81 = of("H81")

        @JvmField val H82 = of("H82")

        @JvmField val H83 = of("H83")

        @JvmField val H84 = of("H84")

        @JvmField val H85 = of("H85")

        @JvmField val H88 = of("H88")

        @JvmField val H89 = of("H89")

        @JvmField val H90 = of("H90")

        @JvmField val H91 = of("H91")

        @JvmField val H92 = of("H92")

        @JvmField val H93 = of("H93")

        @JvmField val H94 = of("H94")

        @JvmField val H95 = of("H95")

        @JvmField val H96 = of("H96")

        @JvmField val H98 = of("H98")

        @JvmField val H99 = of("H99")

        @JvmField val HA = of("HA")

        @JvmField val HAD = of("HAD")

        @JvmField val HBA = of("HBA")

        @JvmField val HBX = of("HBX")

        @JvmField val HC = of("HC")

        @JvmField val HDW = of("HDW")

        @JvmField val HEA = of("HEA")

        @JvmField val HGM = of("HGM")

        @JvmField val HH = of("HH")

        @JvmField val HIU = of("HIU")

        @JvmField val HKM = of("HKM")

        @JvmField val HLT = of("HLT")

        @JvmField val HM = of("HM")

        @JvmField val HMO = of("HMO")

        @JvmField val HMQ = of("HMQ")

        @JvmField val HMT = of("HMT")

        @JvmField val HPA = of("HPA")

        @JvmField val HWE = of("HWE")

        @JvmField val IA = of("IA")

        @JvmField val IE = of("IE")

        @JvmField val ISD = of("ISD")

        @JvmField val IU = of("IU")

        @JvmField val IUG = of("IUG")

        @JvmField val IV = of("IV")

        @JvmField val J10 = of("J10")

        @JvmField val J12 = of("J12")

        @JvmField val J13 = of("J13")

        @JvmField val J14 = of("J14")

        @JvmField val J15 = of("J15")

        @JvmField val J16 = of("J16")

        @JvmField val J17 = of("J17")

        @JvmField val J18 = of("J18")

        @JvmField val J19 = of("J19")

        @JvmField val J2 = of("J2")

        @JvmField val J20 = of("J20")

        @JvmField val J21 = of("J21")

        @JvmField val J22 = of("J22")

        @JvmField val J23 = of("J23")

        @JvmField val J24 = of("J24")

        @JvmField val J25 = of("J25")

        @JvmField val J26 = of("J26")

        @JvmField val J27 = of("J27")

        @JvmField val J28 = of("J28")

        @JvmField val J29 = of("J29")

        @JvmField val J30 = of("J30")

        @JvmField val J31 = of("J31")

        @JvmField val J32 = of("J32")

        @JvmField val J33 = of("J33")

        @JvmField val J34 = of("J34")

        @JvmField val J35 = of("J35")

        @JvmField val J36 = of("J36")

        @JvmField val J38 = of("J38")

        @JvmField val J39 = of("J39")

        @JvmField val J40 = of("J40")

        @JvmField val J41 = of("J41")

        @JvmField val J42 = of("J42")

        @JvmField val J43 = of("J43")

        @JvmField val J44 = of("J44")

        @JvmField val J45 = of("J45")

        @JvmField val J46 = of("J46")

        @JvmField val J47 = of("J47")

        @JvmField val J48 = of("J48")

        @JvmField val J49 = of("J49")

        @JvmField val J50 = of("J50")

        @JvmField val J51 = of("J51")

        @JvmField val J52 = of("J52")

        @JvmField val J53 = of("J53")

        @JvmField val J54 = of("J54")

        @JvmField val J55 = of("J55")

        @JvmField val J56 = of("J56")

        @JvmField val J57 = of("J57")

        @JvmField val J58 = of("J58")

        @JvmField val J59 = of("J59")

        @JvmField val J60 = of("J60")

        @JvmField val J61 = of("J61")

        @JvmField val J62 = of("J62")

        @JvmField val J63 = of("J63")

        @JvmField val J64 = of("J64")

        @JvmField val J65 = of("J65")

        @JvmField val J66 = of("J66")

        @JvmField val J67 = of("J67")

        @JvmField val J68 = of("J68")

        @JvmField val J69 = of("J69")

        @JvmField val J70 = of("J70")

        @JvmField val J71 = of("J71")

        @JvmField val J72 = of("J72")

        @JvmField val J73 = of("J73")

        @JvmField val J74 = of("J74")

        @JvmField val J75 = of("J75")

        @JvmField val J76 = of("J76")

        @JvmField val J78 = of("J78")

        @JvmField val J79 = of("J79")

        @JvmField val J81 = of("J81")

        @JvmField val J82 = of("J82")

        @JvmField val J83 = of("J83")

        @JvmField val J84 = of("J84")

        @JvmField val J85 = of("J85")

        @JvmField val J87 = of("J87")

        @JvmField val J90 = of("J90")

        @JvmField val J91 = of("J91")

        @JvmField val J92 = of("J92")

        @JvmField val J93 = of("J93")

        @JvmField val J95 = of("J95")

        @JvmField val J96 = of("J96")

        @JvmField val J97 = of("J97")

        @JvmField val J98 = of("J98")

        @JvmField val J99 = of("J99")

        @JvmField val JE = of("JE")

        @JvmField val JK = of("JK")

        @JvmField val JM = of("JM")

        @JvmField val JNT = of("JNT")

        @JvmField val JOU = of("JOU")

        @JvmField val JPS = of("JPS")

        @JvmField val JWL = of("JWL")

        @JvmField val K1 = of("K1")

        @JvmField val K10 = of("K10")

        @JvmField val K11 = of("K11")

        @JvmField val K12 = of("K12")

        @JvmField val K13 = of("K13")

        @JvmField val K14 = of("K14")

        @JvmField val K15 = of("K15")

        @JvmField val K16 = of("K16")

        @JvmField val K17 = of("K17")

        @JvmField val K18 = of("K18")

        @JvmField val K19 = of("K19")

        @JvmField val K2 = of("K2")

        @JvmField val K20 = of("K20")

        @JvmField val K21 = of("K21")

        @JvmField val K22 = of("K22")

        @JvmField val K23 = of("K23")

        @JvmField val K26 = of("K26")

        @JvmField val K27 = of("K27")

        @JvmField val K28 = of("K28")

        @JvmField val K3 = of("K3")

        @JvmField val K30 = of("K30")

        @JvmField val K31 = of("K31")

        @JvmField val K32 = of("K32")

        @JvmField val K33 = of("K33")

        @JvmField val K34 = of("K34")

        @JvmField val K35 = of("K35")

        @JvmField val K36 = of("K36")

        @JvmField val K37 = of("K37")

        @JvmField val K38 = of("K38")

        @JvmField val K39 = of("K39")

        @JvmField val K40 = of("K40")

        @JvmField val K41 = of("K41")

        @JvmField val K42 = of("K42")

        @JvmField val K43 = of("K43")

        @JvmField val K45 = of("K45")

        @JvmField val K46 = of("K46")

        @JvmField val K47 = of("K47")

        @JvmField val K48 = of("K48")

        @JvmField val K49 = of("K49")

        @JvmField val K50 = of("K50")

        @JvmField val K51 = of("K51")

        @JvmField val K52 = of("K52")

        @JvmField val K53 = of("K53")

        @JvmField val K54 = of("K54")

        @JvmField val K55 = of("K55")

        @JvmField val K58 = of("K58")

        @JvmField val K59 = of("K59")

        @JvmField val K6 = of("K6")

        @JvmField val K60 = of("K60")

        @JvmField val K61 = of("K61")

        @JvmField val K62 = of("K62")

        @JvmField val K63 = of("K63")

        @JvmField val K64 = of("K64")

        @JvmField val K65 = of("K65")

        @JvmField val K66 = of("K66")

        @JvmField val K67 = of("K67")

        @JvmField val K68 = of("K68")

        @JvmField val K69 = of("K69")

        @JvmField val K70 = of("K70")

        @JvmField val K71 = of("K71")

        @JvmField val K73 = of("K73")

        @JvmField val K74 = of("K74")

        @JvmField val K75 = of("K75")

        @JvmField val K76 = of("K76")

        @JvmField val K77 = of("K77")

        @JvmField val K78 = of("K78")

        @JvmField val K79 = of("K79")

        @JvmField val K80 = of("K80")

        @JvmField val K81 = of("K81")

        @JvmField val K82 = of("K82")

        @JvmField val K83 = of("K83")

        @JvmField val K84 = of("K84")

        @JvmField val K85 = of("K85")

        @JvmField val K86 = of("K86")

        @JvmField val K87 = of("K87")

        @JvmField val K88 = of("K88")

        @JvmField val K89 = of("K89")

        @JvmField val K90 = of("K90")

        @JvmField val K91 = of("K91")

        @JvmField val K92 = of("K92")

        @JvmField val K93 = of("K93")

        @JvmField val K94 = of("K94")

        @JvmField val K95 = of("K95")

        @JvmField val K96 = of("K96")

        @JvmField val K97 = of("K97")

        @JvmField val K98 = of("K98")

        @JvmField val K99 = of("K99")

        @JvmField val KA = of("KA")

        @JvmField val KAT = of("KAT")

        @JvmField val KB = of("KB")

        @JvmField val KBA = of("KBA")

        @JvmField val KCC = of("KCC")

        @JvmField val KDW = of("KDW")

        @JvmField val KEL = of("KEL")

        @JvmField val KGS = of("KGS")

        @JvmField val KHY = of("KHY")

        @JvmField val KHZ = of("KHZ")

        @JvmField val KI = of("KI")

        @JvmField val KIC = of("KIC")

        @JvmField val KIP = of("KIP")

        @JvmField val KJ = of("KJ")

        @JvmField val KJO = of("KJO")

        @JvmField val KL = of("KL")

        @JvmField val KLK = of("KLK")

        @JvmField val KLX = of("KLX")

        @JvmField val KMA = of("KMA")

        @JvmField val KMH = of("KMH")

        @JvmField val KMQ = of("KMQ")

        @JvmField val KNI = of("KNI")

        @JvmField val KNM = of("KNM")

        @JvmField val KNS = of("KNS")

        @JvmField val KNT = of("KNT")

        @JvmField val KO = of("KO")

        @JvmField val KPA = of("KPA")

        @JvmField val KPH = of("KPH")

        @JvmField val KPO = of("KPO")

        @JvmField val KPP = of("KPP")

        @JvmField val KR = of("KR")

        @JvmField val KSD = of("KSD")

        @JvmField val KSH = of("KSH")

        @JvmField val KT = of("KT")

        @JvmField val KTN = of("KTN")

        @JvmField val KUR = of("KUR")

        @JvmField val KVA = of("KVA")

        @JvmField val KVR = of("KVR")

        @JvmField val KVT = of("KVT")

        @JvmField val KW = of("KW")

        @JvmField val KWH = of("KWH")

        @JvmField val KWN = of("KWN")

        @JvmField val KWO = of("KWO")

        @JvmField val KWS = of("KWS")

        @JvmField val KWT = of("KWT")

        @JvmField val KWY = of("KWY")

        @JvmField val KX = of("KX")

        @JvmField val L10 = of("L10")

        @JvmField val L11 = of("L11")

        @JvmField val L12 = of("L12")

        @JvmField val L13 = of("L13")

        @JvmField val L14 = of("L14")

        @JvmField val L15 = of("L15")

        @JvmField val L16 = of("L16")

        @JvmField val L17 = of("L17")

        @JvmField val L18 = of("L18")

        @JvmField val L19 = of("L19")

        @JvmField val L2 = of("L2")

        @JvmField val L20 = of("L20")

        @JvmField val L21 = of("L21")

        @JvmField val L23 = of("L23")

        @JvmField val L24 = of("L24")

        @JvmField val L25 = of("L25")

        @JvmField val L26 = of("L26")

        @JvmField val L27 = of("L27")

        @JvmField val L28 = of("L28")

        @JvmField val L29 = of("L29")

        @JvmField val L30 = of("L30")

        @JvmField val L31 = of("L31")

        @JvmField val L32 = of("L32")

        @JvmField val L33 = of("L33")

        @JvmField val L34 = of("L34")

        @JvmField val L35 = of("L35")

        @JvmField val L36 = of("L36")

        @JvmField val L37 = of("L37")

        @JvmField val L38 = of("L38")

        @JvmField val L39 = of("L39")

        @JvmField val L40 = of("L40")

        @JvmField val L41 = of("L41")

        @JvmField val L42 = of("L42")

        @JvmField val L43 = of("L43")

        @JvmField val L44 = of("L44")

        @JvmField val L45 = of("L45")

        @JvmField val L46 = of("L46")

        @JvmField val L47 = of("L47")

        @JvmField val L48 = of("L48")

        @JvmField val L49 = of("L49")

        @JvmField val L50 = of("L50")

        @JvmField val L51 = of("L51")

        @JvmField val L52 = of("L52")

        @JvmField val L53 = of("L53")

        @JvmField val L54 = of("L54")

        @JvmField val L55 = of("L55")

        @JvmField val L56 = of("L56")

        @JvmField val L57 = of("L57")

        @JvmField val L58 = of("L58")

        @JvmField val L59 = of("L59")

        @JvmField val L60 = of("L60")

        @JvmField val L63 = of("L63")

        @JvmField val L64 = of("L64")

        @JvmField val L65 = of("L65")

        @JvmField val L66 = of("L66")

        @JvmField val L67 = of("L67")

        @JvmField val L68 = of("L68")

        @JvmField val L69 = of("L69")

        @JvmField val L70 = of("L70")

        @JvmField val L71 = of("L71")

        @JvmField val L72 = of("L72")

        @JvmField val L73 = of("L73")

        @JvmField val L74 = of("L74")

        @JvmField val L75 = of("L75")

        @JvmField val L76 = of("L76")

        @JvmField val L77 = of("L77")

        @JvmField val L78 = of("L78")

        @JvmField val L79 = of("L79")

        @JvmField val L80 = of("L80")

        @JvmField val L81 = of("L81")

        @JvmField val L82 = of("L82")

        @JvmField val L83 = of("L83")

        @JvmField val L84 = of("L84")

        @JvmField val L85 = of("L85")

        @JvmField val L86 = of("L86")

        @JvmField val L87 = of("L87")

        @JvmField val L88 = of("L88")

        @JvmField val L89 = of("L89")

        @JvmField val L90 = of("L90")

        @JvmField val L91 = of("L91")

        @JvmField val L92 = of("L92")

        @JvmField val L93 = of("L93")

        @JvmField val L94 = of("L94")

        @JvmField val L95 = of("L95")

        @JvmField val L96 = of("L96")

        @JvmField val L98 = of("L98")

        @JvmField val L99 = of("L99")

        @JvmField val LA = of("LA")

        @JvmField val LAC = of("LAC")

        @JvmField val LBT = of("LBT")

        @JvmField val LD = of("LD")

        @JvmField val LEF = of("LEF")

        @JvmField val LF = of("LF")

        @JvmField val LH = of("LH")

        @JvmField val LK = of("LK")

        @JvmField val LM = of("LM")

        @JvmField val LN = of("LN")

        @JvmField val LO = of("LO")

        @JvmField val LP = of("LP")

        @JvmField val LPA = of("LPA")

        @JvmField val LR = of("LR")

        @JvmField val LS = of("LS")

        @JvmField val LTN = of("LTN")

        @JvmField val LUB = of("LUB")

        @JvmField val LUM = of("LUM")

        @JvmField val LUX = of("LUX")

        @JvmField val LY = of("LY")

        @JvmField val M1 = of("M1")

        @JvmField val M10 = of("M10")

        @JvmField val M11 = of("M11")

        @JvmField val M12 = of("M12")

        @JvmField val M13 = of("M13")

        @JvmField val M14 = of("M14")

        @JvmField val M15 = of("M15")

        @JvmField val M16 = of("M16")

        @JvmField val M17 = of("M17")

        @JvmField val M18 = of("M18")

        @JvmField val M19 = of("M19")

        @JvmField val M20 = of("M20")

        @JvmField val M21 = of("M21")

        @JvmField val M22 = of("M22")

        @JvmField val M23 = of("M23")

        @JvmField val M24 = of("M24")

        @JvmField val M25 = of("M25")

        @JvmField val M26 = of("M26")

        @JvmField val M27 = of("M27")

        @JvmField val M29 = of("M29")

        @JvmField val M30 = of("M30")

        @JvmField val M31 = of("M31")

        @JvmField val M32 = of("M32")

        @JvmField val M33 = of("M33")

        @JvmField val M34 = of("M34")

        @JvmField val M35 = of("M35")

        @JvmField val M36 = of("M36")

        @JvmField val M37 = of("M37")

        @JvmField val M38 = of("M38")

        @JvmField val M39 = of("M39")

        @JvmField val M4 = of("M4")

        @JvmField val M40 = of("M40")

        @JvmField val M41 = of("M41")

        @JvmField val M42 = of("M42")

        @JvmField val M43 = of("M43")

        @JvmField val M44 = of("M44")

        @JvmField val M45 = of("M45")

        @JvmField val M46 = of("M46")

        @JvmField val M47 = of("M47")

        @JvmField val M48 = of("M48")

        @JvmField val M49 = of("M49")

        @JvmField val M5 = of("M5")

        @JvmField val M50 = of("M50")

        @JvmField val M51 = of("M51")

        @JvmField val M52 = of("M52")

        @JvmField val M53 = of("M53")

        @JvmField val M55 = of("M55")

        @JvmField val M56 = of("M56")

        @JvmField val M57 = of("M57")

        @JvmField val M58 = of("M58")

        @JvmField val M59 = of("M59")

        @JvmField val M60 = of("M60")

        @JvmField val M61 = of("M61")

        @JvmField val M62 = of("M62")

        @JvmField val M63 = of("M63")

        @JvmField val M64 = of("M64")

        @JvmField val M65 = of("M65")

        @JvmField val M66 = of("M66")

        @JvmField val M67 = of("M67")

        @JvmField val M68 = of("M68")

        @JvmField val M69 = of("M69")

        @JvmField val M7 = of("M7")

        @JvmField val M70 = of("M70")

        @JvmField val M71 = of("M71")

        @JvmField val M72 = of("M72")

        @JvmField val M73 = of("M73")

        @JvmField val M74 = of("M74")

        @JvmField val M75 = of("M75")

        @JvmField val M76 = of("M76")

        @JvmField val M77 = of("M77")

        @JvmField val M78 = of("M78")

        @JvmField val M79 = of("M79")

        @JvmField val M80 = of("M80")

        @JvmField val M81 = of("M81")

        @JvmField val M82 = of("M82")

        @JvmField val M83 = of("M83")

        @JvmField val M84 = of("M84")

        @JvmField val M85 = of("M85")

        @JvmField val M86 = of("M86")

        @JvmField val M87 = of("M87")

        @JvmField val M88 = of("M88")

        @JvmField val M89 = of("M89")

        @JvmField val M9 = of("M9")

        @JvmField val M90 = of("M90")

        @JvmField val M91 = of("M91")

        @JvmField val M92 = of("M92")

        @JvmField val M93 = of("M93")

        @JvmField val M94 = of("M94")

        @JvmField val M95 = of("M95")

        @JvmField val M96 = of("M96")

        @JvmField val M97 = of("M97")

        @JvmField val M98 = of("M98")

        @JvmField val M99 = of("M99")

        @JvmField val MAH = of("MAH")

        @JvmField val MAL = of("MAL")

        @JvmField val MAM = of("MAM")

        @JvmField val MAR = of("MAR")

        @JvmField val MAW = of("MAW")

        @JvmField val MBE = of("MBE")

        @JvmField val MBF = of("MBF")

        @JvmField val MBR = of("MBR")

        @JvmField val MC = of("MC")

        @JvmField val MCU = of("MCU")

        @JvmField val MD = of("MD")

        @JvmField val MGM = of("MGM")

        @JvmField val MHZ = of("MHZ")

        @JvmField val MIK = of("MIK")

        @JvmField val MIL = of("MIL")

        @JvmField val MIO = of("MIO")

        @JvmField val MIU = of("MIU")

        @JvmField val MKD = of("MKD")

        @JvmField val MKM = of("MKM")

        @JvmField val MKW = of("MKW")

        @JvmField val MLD = of("MLD")

        @JvmField val MMQ = of("MMQ")

        @JvmField val MND = of("MND")

        @JvmField val MNJ = of("MNJ")

        @JvmField val MPA = of("MPA")

        @JvmField val MQD = of("MQD")

        @JvmField val MQH = of("MQH")

        @JvmField val MQM = of("MQM")

        @JvmField val MQS = of("MQS")

        @JvmField val MQW = of("MQW")

        @JvmField val MRD = of("MRD")

        @JvmField val MRM = of("MRM")

        @JvmField val MRW = of("MRW")

        @JvmField val MSK = of("MSK")

        @JvmField val MTS = of("MTS")

        @JvmField val MTZ = of("MTZ")

        @JvmField val MVA = of("MVA")

        @JvmField val MWH = of("MWH")

        @JvmField val N1 = of("N1")

        @JvmField val N10 = of("N10")

        @JvmField val N11 = of("N11")

        @JvmField val N12 = of("N12")

        @JvmField val N13 = of("N13")

        @JvmField val N14 = of("N14")

        @JvmField val N15 = of("N15")

        @JvmField val N16 = of("N16")

        @JvmField val N17 = of("N17")

        @JvmField val N18 = of("N18")

        @JvmField val N19 = of("N19")

        @JvmField val N20 = of("N20")

        @JvmField val N21 = of("N21")

        @JvmField val N22 = of("N22")

        @JvmField val N23 = of("N23")

        @JvmField val N24 = of("N24")

        @JvmField val N25 = of("N25")

        @JvmField val N26 = of("N26")

        @JvmField val N27 = of("N27")

        @JvmField val N28 = of("N28")

        @JvmField val N29 = of("N29")

        @JvmField val N3 = of("N3")

        @JvmField val N30 = of("N30")

        @JvmField val N31 = of("N31")

        @JvmField val N32 = of("N32")

        @JvmField val N33 = of("N33")

        @JvmField val N34 = of("N34")

        @JvmField val N35 = of("N35")

        @JvmField val N36 = of("N36")

        @JvmField val N37 = of("N37")

        @JvmField val N38 = of("N38")

        @JvmField val N39 = of("N39")

        @JvmField val N40 = of("N40")

        @JvmField val N41 = of("N41")

        @JvmField val N42 = of("N42")

        @JvmField val N43 = of("N43")

        @JvmField val N44 = of("N44")

        @JvmField val N45 = of("N45")

        @JvmField val N46 = of("N46")

        @JvmField val N47 = of("N47")

        @JvmField val N48 = of("N48")

        @JvmField val N49 = of("N49")

        @JvmField val N50 = of("N50")

        @JvmField val N51 = of("N51")

        @JvmField val N52 = of("N52")

        @JvmField val N53 = of("N53")

        @JvmField val N54 = of("N54")

        @JvmField val N55 = of("N55")

        @JvmField val N56 = of("N56")

        @JvmField val N57 = of("N57")

        @JvmField val N58 = of("N58")

        @JvmField val N59 = of("N59")

        @JvmField val N60 = of("N60")

        @JvmField val N61 = of("N61")

        @JvmField val N62 = of("N62")

        @JvmField val N63 = of("N63")

        @JvmField val N64 = of("N64")

        @JvmField val N65 = of("N65")

        @JvmField val N66 = of("N66")

        @JvmField val N67 = of("N67")

        @JvmField val N68 = of("N68")

        @JvmField val N69 = of("N69")

        @JvmField val N70 = of("N70")

        @JvmField val N71 = of("N71")

        @JvmField val N72 = of("N72")

        @JvmField val N73 = of("N73")

        @JvmField val N74 = of("N74")

        @JvmField val N75 = of("N75")

        @JvmField val N76 = of("N76")

        @JvmField val N77 = of("N77")

        @JvmField val N78 = of("N78")

        @JvmField val N79 = of("N79")

        @JvmField val N80 = of("N80")

        @JvmField val N81 = of("N81")

        @JvmField val N82 = of("N82")

        @JvmField val N83 = of("N83")

        @JvmField val N84 = of("N84")

        @JvmField val N85 = of("N85")

        @JvmField val N86 = of("N86")

        @JvmField val N87 = of("N87")

        @JvmField val N88 = of("N88")

        @JvmField val N89 = of("N89")

        @JvmField val N90 = of("N90")

        @JvmField val N91 = of("N91")

        @JvmField val N92 = of("N92")

        @JvmField val N93 = of("N93")

        @JvmField val N94 = of("N94")

        @JvmField val N95 = of("N95")

        @JvmField val N96 = of("N96")

        @JvmField val N97 = of("N97")

        @JvmField val N98 = of("N98")

        @JvmField val N99 = of("N99")

        @JvmField val NA = of("NA")

        @JvmField val NCL = of("NCL")

        @JvmField val NEW = of("NEW")

        @JvmField val NF = of("NF")

        @JvmField val NIL = of("NIL")

        @JvmField val NIU = of("NIU")

        @JvmField val NL = of("NL")

        @JvmField val NM3 = of("NM3")

        @JvmField val NMI = of("NMI")

        @JvmField val NMP = of("NMP")

        @JvmField val NPT = of("NPT")

        @JvmField val NT = of("NT")

        @JvmField val NTU = of("NTU")

        @JvmField val NU = of("NU")

        @JvmField val NX = of("NX")

        @JvmField val OA = of("OA")

        @JvmField val ODE = of("ODE")

        @JvmField val ODG = of("ODG")

        @JvmField val ODK = of("ODK")

        @JvmField val ODM = of("ODM")

        @JvmField val OHM = of("OHM")

        @JvmField val ON = of("ON")

        @JvmField val OPM = of("OPM")

        @JvmField val OT = of("OT")

        @JvmField val OZA = of("OZA")

        @JvmField val OZI = of("OZI")

        @JvmField val P1 = of("P1")

        @JvmField val P10 = of("P10")

        @JvmField val P11 = of("P11")

        @JvmField val P12 = of("P12")

        @JvmField val P13 = of("P13")

        @JvmField val P14 = of("P14")

        @JvmField val P15 = of("P15")

        @JvmField val P16 = of("P16")

        @JvmField val P17 = of("P17")

        @JvmField val P18 = of("P18")

        @JvmField val P19 = of("P19")

        @JvmField val P2 = of("P2")

        @JvmField val P20 = of("P20")

        @JvmField val P21 = of("P21")

        @JvmField val P22 = of("P22")

        @JvmField val P23 = of("P23")

        @JvmField val P24 = of("P24")

        @JvmField val P25 = of("P25")

        @JvmField val P26 = of("P26")

        @JvmField val P27 = of("P27")

        @JvmField val P28 = of("P28")

        @JvmField val P29 = of("P29")

        @JvmField val P30 = of("P30")

        @JvmField val P31 = of("P31")

        @JvmField val P32 = of("P32")

        @JvmField val P33 = of("P33")

        @JvmField val P34 = of("P34")

        @JvmField val P35 = of("P35")

        @JvmField val P36 = of("P36")

        @JvmField val P37 = of("P37")

        @JvmField val P38 = of("P38")

        @JvmField val P39 = of("P39")

        @JvmField val P40 = of("P40")

        @JvmField val P41 = of("P41")

        @JvmField val P42 = of("P42")

        @JvmField val P43 = of("P43")

        @JvmField val P44 = of("P44")

        @JvmField val P45 = of("P45")

        @JvmField val P46 = of("P46")

        @JvmField val P47 = of("P47")

        @JvmField val P48 = of("P48")

        @JvmField val P49 = of("P49")

        @JvmField val P5 = of("P5")

        @JvmField val P50 = of("P50")

        @JvmField val P51 = of("P51")

        @JvmField val P52 = of("P52")

        @JvmField val P53 = of("P53")

        @JvmField val P54 = of("P54")

        @JvmField val P55 = of("P55")

        @JvmField val P56 = of("P56")

        @JvmField val P57 = of("P57")

        @JvmField val P58 = of("P58")

        @JvmField val P59 = of("P59")

        @JvmField val P60 = of("P60")

        @JvmField val P61 = of("P61")

        @JvmField val P62 = of("P62")

        @JvmField val P63 = of("P63")

        @JvmField val P64 = of("P64")

        @JvmField val P65 = of("P65")

        @JvmField val P66 = of("P66")

        @JvmField val P67 = of("P67")

        @JvmField val P68 = of("P68")

        @JvmField val P69 = of("P69")

        @JvmField val P70 = of("P70")

        @JvmField val P71 = of("P71")

        @JvmField val P72 = of("P72")

        @JvmField val P73 = of("P73")

        @JvmField val P74 = of("P74")

        @JvmField val P75 = of("P75")

        @JvmField val P76 = of("P76")

        @JvmField val P77 = of("P77")

        @JvmField val P78 = of("P78")

        @JvmField val P79 = of("P79")

        @JvmField val P80 = of("P80")

        @JvmField val P81 = of("P81")

        @JvmField val P82 = of("P82")

        @JvmField val P83 = of("P83")

        @JvmField val P84 = of("P84")

        @JvmField val P85 = of("P85")

        @JvmField val P86 = of("P86")

        @JvmField val P87 = of("P87")

        @JvmField val P88 = of("P88")

        @JvmField val P89 = of("P89")

        @JvmField val P90 = of("P90")

        @JvmField val P91 = of("P91")

        @JvmField val P92 = of("P92")

        @JvmField val P93 = of("P93")

        @JvmField val P94 = of("P94")

        @JvmField val P95 = of("P95")

        @JvmField val P96 = of("P96")

        @JvmField val P97 = of("P97")

        @JvmField val P98 = of("P98")

        @JvmField val P99 = of("P99")

        @JvmField val PAL = of("PAL")

        @JvmField val PD = of("PD")

        @JvmField val PFL = of("PFL")

        @JvmField val PGL = of("PGL")

        @JvmField val PI = of("PI")

        @JvmField val PLA = of("PLA")

        @JvmField val PO = of("PO")

        @JvmField val PQ = of("PQ")

        @JvmField val PR = of("PR")

        @JvmField val PS = of("PS")

        @JvmField val PTD = of("PTD")

        @JvmField val PTI = of("PTI")

        @JvmField val PTL = of("PTL")

        @JvmField val PTN = of("PTN")

        @JvmField val Q10 = of("Q10")

        @JvmField val Q11 = of("Q11")

        @JvmField val Q12 = of("Q12")

        @JvmField val Q13 = of("Q13")

        @JvmField val Q14 = of("Q14")

        @JvmField val Q15 = of("Q15")

        @JvmField val Q16 = of("Q16")

        @JvmField val Q17 = of("Q17")

        @JvmField val Q18 = of("Q18")

        @JvmField val Q19 = of("Q19")

        @JvmField val Q20 = of("Q20")

        @JvmField val Q21 = of("Q21")

        @JvmField val Q22 = of("Q22")

        @JvmField val Q23 = of("Q23")

        @JvmField val Q24 = of("Q24")

        @JvmField val Q25 = of("Q25")

        @JvmField val Q26 = of("Q26")

        @JvmField val Q27 = of("Q27")

        @JvmField val Q28 = of("Q28")

        @JvmField val Q29 = of("Q29")

        @JvmField val Q3 = of("Q3")

        @JvmField val Q30 = of("Q30")

        @JvmField val Q31 = of("Q31")

        @JvmField val Q32 = of("Q32")

        @JvmField val Q33 = of("Q33")

        @JvmField val Q34 = of("Q34")

        @JvmField val Q35 = of("Q35")

        @JvmField val Q36 = of("Q36")

        @JvmField val Q37 = of("Q37")

        @JvmField val Q38 = of("Q38")

        @JvmField val Q39 = of("Q39")

        @JvmField val Q40 = of("Q40")

        @JvmField val Q41 = of("Q41")

        @JvmField val Q42 = of("Q42")

        @JvmField val QA = of("QA")

        @JvmField val QAN = of("QAN")

        @JvmField val QB = of("QB")

        @JvmField val QR = of("QR")

        @JvmField val QTD = of("QTD")

        @JvmField val QTI = of("QTI")

        @JvmField val QTL = of("QTL")

        @JvmField val QTR = of("QTR")

        @JvmField val R1 = of("R1")

        @JvmField val R9 = of("R9")

        @JvmField val RH = of("RH")

        @JvmField val RM = of("RM")

        @JvmField val ROM = of("ROM")

        @JvmField val RP = of("RP")

        @JvmField val RPM = of("RPM")

        @JvmField val RPS = of("RPS")

        @JvmField val RT = of("RT")

        @JvmField val S3 = of("S3")

        @JvmField val S4 = of("S4")

        @JvmField val SAN = of("SAN")

        @JvmField val SCO = of("SCO")

        @JvmField val SCR = of("SCR")

        @JvmField val SET = of("SET")

        @JvmField val SG = of("SG")

        @JvmField val SIE = of("SIE")

        @JvmField val SM3 = of("SM3")

        @JvmField val SQ = of("SQ")

        @JvmField val SQR = of("SQR")

        @JvmField val SR = of("SR")

        @JvmField val STC = of("STC")

        @JvmField val STI = of("STI")

        @JvmField val STK = of("STK")

        @JvmField val STL = of("STL")

        @JvmField val STN = of("STN")

        @JvmField val STW = of("STW")

        @JvmField val SW = of("SW")

        @JvmField val SX = of("SX")

        @JvmField val SYR = of("SYR")

        @JvmField val T0 = of("T0")

        @JvmField val T3 = of("T3")

        @JvmField val TAH = of("TAH")

        @JvmField val TAN = of("TAN")

        @JvmField val TI = of("TI")

        @JvmField val TIC = of("TIC")

        @JvmField val TIP = of("TIP")

        @JvmField val TKM = of("TKM")

        @JvmField val TMS = of("TMS")

        @JvmField val TP = of("TP")

        @JvmField val TPI = of("TPI")

        @JvmField val TPR = of("TPR")

        @JvmField val TQD = of("TQD")

        @JvmField val TRL = of("TRL")

        @JvmField val TST = of("TST")

        @JvmField val TTS = of("TTS")

        @JvmField val U1 = of("U1")

        @JvmField val U2 = of("U2")

        @JvmField val UB = of("UB")

        @JvmField val UC = of("UC")

        @JvmField val VA = of("VA")

        @JvmField val VP = of("VP")

        @JvmField val W2 = of("W2")

        @JvmField val WA = of("WA")

        @JvmField val WB = of("WB")

        @JvmField val WCD = of("WCD")

        @JvmField val WE = of("WE")

        @JvmField val WEB = of("WEB")

        @JvmField val WEE = of("WEE")

        @JvmField val WG = of("WG")

        @JvmField val WHR = of("WHR")

        @JvmField val WM = of("WM")

        @JvmField val WSD = of("WSD")

        @JvmField val X1 = of("X1")

        @JvmField val Z11 = of("Z11")

        @JvmField val Z9 = of("Z9")

        @JvmField val ZP = of("ZP")

        @JvmField val X1A = of("X1A")

        @JvmField val X1B = of("X1B")

        @JvmField val X1D = of("X1D")

        @JvmField val X1F = of("X1F")

        @JvmField val X1G = of("X1G")

        @JvmField val X1W = of("X1W")

        @JvmField val X2C = of("X2C")

        @JvmField val X3A = of("X3A")

        @JvmField val X3H = of("X3H")

        @JvmField val X43 = of("X43")

        @JvmField val X44 = of("X44")

        @JvmField val X4A = of("X4A")

        @JvmField val X4B = of("X4B")

        @JvmField val X4C = of("X4C")

        @JvmField val X4D = of("X4D")

        @JvmField val X4F = of("X4F")

        @JvmField val X4G = of("X4G")

        @JvmField val X4H = of("X4H")

        @JvmField val X5H = of("X5H")

        @JvmField val X5L = of("X5L")

        @JvmField val X5M = of("X5M")

        @JvmField val X6H = of("X6H")

        @JvmField val X6P = of("X6P")

        @JvmField val X7A = of("X7A")

        @JvmField val X7B = of("X7B")

        @JvmField val X8A = of("X8A")

        @JvmField val X8B = of("X8B")

        @JvmField val X8C = of("X8C")

        @JvmField val XIZ = of("XIZ")

        @JvmField val XKG = of("XKG")

        @JvmField val XKI = of("XKI")

        @JvmField val XNS = of("XNS")

        @JvmField val XNT = of("XNT")

        @JvmField val XNU = of("XNU")

        @JvmField val XNV = of("XNV")

        @JvmField val XO1 = of("XO1")

        @JvmField val XO2 = of("XO2")

        @JvmField val XO3 = of("XO3")

        @JvmField val XO4 = of("XO4")

        @JvmField val XO5 = of("XO5")

        @JvmField val XO6 = of("XO6")

        @JvmField val XO7 = of("XO7")

        @JvmField val XO8 = of("XO8")

        @JvmField val XO9 = of("XO9")

        @JvmField val XT1 = of("XT1")

        @JvmStatic fun of(value: String) = UnitOfMeasureCode(JsonField.of(value))

        /*
         * Lookup tables used by [value] and [known] instead of a `when` expression: with thousands
         * of members, a `when` compiles to a branch chain deep enough to overflow ProGuard's
         * recursive stack-size analysis. Member names are the wire values with `_` removed (codes
         * consist of `[A-Z0-9]` only), and keys compare like `when (this)` did, via [equals].
         */
        private val KNOWN_BY_CODE: Map<UnitOfMeasureCode, Known> by lazy {
            Known.values().associateBy { of(it.name.replace("_", "")) }
        }

        private val VALUE_BY_CODE: Map<UnitOfMeasureCode, Value> by lazy {
            Value.values()
                .filter { it != Value._UNKNOWN }
                .associateBy { of(it.name.replace("_", "")) }
        }
    }

    /** An enum containing [UnitOfMeasureCode]'s known values. */
    enum class Known {
        _10,
        _11,
        _13,
        _14,
        _15,
        _20,
        _21,
        _22,
        _23,
        _24,
        _25,
        _27,
        _28,
        _33,
        _34,
        _35,
        _37,
        _38,
        _40,
        _41,
        _56,
        _57,
        _58,
        _59,
        _60,
        _61,
        _74,
        _77,
        _80,
        _81,
        _85,
        _87,
        _89,
        _91,
        _1_I,
        EA,
        E01,
        E07,
        E09,
        E10,
        E12,
        E14,
        E17,
        E20,
        E23,
        E25,
        E27,
        E31,
        E34,
        E35,
        E36,
        E37,
        E38,
        E39,
        E40,
        E41,
        E42,
        E43,
        E44,
        E45,
        E46,
        E47,
        E48,
        E49,
        E50,
        E51,
        E52,
        E53,
        E54,
        E55,
        E56,
        E57,
        E58,
        E60,
        E62,
        E65,
        E66,
        E67,
        E69,
        E70,
        E71,
        E73,
        E75,
        E76,
        _2_A,
        _2_B,
        _2_C,
        _2_G,
        _2_H,
        _2_I,
        _2_J,
        _2_K,
        _2_L,
        _2_M,
        _2_N,
        _2_P,
        _2_Q,
        _2_R,
        _2_U,
        _2_X,
        _2_Y,
        _2_Z,
        _3_B,
        _3_C,
        _4_C,
        _4_G,
        _4_H,
        _4_K,
        _4_L,
        _4_M,
        _4_N,
        _4_O,
        _4_P,
        _4_Q,
        _4_R,
        _4_T,
        _4_U,
        _4_W,
        _4_X,
        _5_A,
        _5_B,
        _5_E,
        _5_J,
        A10,
        A11,
        A12,
        A13,
        A14,
        A15,
        A16,
        A17,
        A18,
        A19,
        A2,
        A20,
        A21,
        A22,
        A23,
        A24,
        A26,
        A27,
        A28,
        A29,
        A3,
        A30,
        A31,
        A32,
        A33,
        A34,
        A35,
        A36,
        A37,
        A38,
        A39,
        A4,
        A40,
        A41,
        A42,
        A43,
        A44,
        A45,
        A46,
        A47,
        A48,
        A49,
        A5,
        A50,
        A51,
        A52,
        A53,
        A54,
        A55,
        A56,
        A57,
        A58,
        A59,
        A6,
        A60,
        A61,
        A62,
        A63,
        A64,
        A65,
        A66,
        A67,
        A68,
        A69,
        A7,
        A70,
        A71,
        A72,
        A73,
        A74,
        A75,
        A76,
        A77,
        A78,
        A79,
        A8,
        A80,
        A81,
        A82,
        A83,
        A84,
        A85,
        A86,
        A87,
        A88,
        A89,
        A9,
        A90,
        A91,
        A92,
        A93,
        A94,
        A95,
        A96,
        A97,
        A98,
        A99,
        ACR,
        AH,
        AI,
        AK,
        AMH,
        AMT,
        ANN,
        B1,
        B11,
        B12,
        B13,
        B14,
        B15,
        B16,
        B17,
        B18,
        B19,
        B20,
        B21,
        B22,
        B23,
        B24,
        B25,
        B26,
        B27,
        B28,
        B29,
        B3,
        B30,
        B31,
        B32,
        B33,
        B34,
        B35,
        B36,
        B37,
        B38,
        B39,
        B4,
        B40,
        B41,
        B42,
        B43,
        B44,
        B45,
        B46,
        B47,
        B48,
        B49,
        B5,
        B50,
        B52,
        B53,
        B54,
        B55,
        B56,
        B57,
        B58,
        B59,
        B6,
        B60,
        B61,
        B62,
        B63,
        B64,
        B65,
        B66,
        B67,
        B68,
        B69,
        B7,
        B70,
        B71,
        B72,
        B73,
        B74,
        B75,
        B76,
        B77,
        B78,
        B79,
        B8,
        B80,
        B81,
        B82,
        B83,
        B84,
        B85,
        B86,
        B87,
        B88,
        B89,
        B9,
        B90,
        B91,
        B92,
        B93,
        B94,
        B95,
        B96,
        B97,
        B98,
        B99,
        BAR,
        BB,
        BFT,
        BHP,
        BIL,
        BLD,
        BLL,
        BUA,
        BUI,
        C0,
        C10,
        C11,
        C12,
        C13,
        C14,
        C15,
        C16,
        C17,
        C18,
        C19,
        C20,
        C21,
        C22,
        C23,
        C24,
        C25,
        C26,
        C27,
        C28,
        C29,
        C30,
        C31,
        C32,
        C33,
        C34,
        C35,
        C36,
        C37,
        C38,
        C39,
        C40,
        C41,
        C42,
        C43,
        C44,
        C45,
        C46,
        C47,
        C48,
        C49,
        C50,
        C51,
        C52,
        C53,
        C54,
        C55,
        C56,
        C57,
        C58,
        C59,
        C60,
        C61,
        C63,
        C64,
        C65,
        C66,
        C67,
        C68,
        C69,
        C70,
        C71,
        C72,
        C73,
        C74,
        C75,
        C76,
        C77,
        C78,
        C79,
        C80,
        C81,
        C82,
        C83,
        C84,
        C85,
        C86,
        C87,
        C88,
        C89,
        C90,
        C91,
        C92,
        C93,
        C94,
        C95,
        C96,
        C97,
        C98,
        C99,
        CDL,
        CEL,
        CHU,
        CIU,
        CLT,
        CMK,
        CMQ,
        CMT,
        CNP,
        CNT,
        COU,
        CTG,
        CTN,
        CUR,
        CWA,
        CWI,
        DAN,
        DAY,
        DB,
        DD,
        DG,
        DI,
        DLT,
        DMK,
        DMQ,
        DMT,
        DPC,
        DPT,
        DRA,
        DZN,
        DZP,
        FOT,
        GLL,
        GLI,
        GRM,
        GRO,
        HUR,
        HTZ,
        INH,
        KGM,
        KMT,
        MTR,
        SMI,
        MIN,
        MON,
        ONZ,
        LBR,
        QT,
        SEC,
        FTK,
        INK,
        MTK,
        YDK,
        TNE,
        VLT,
        WTT,
        YRD,
        FTQ,
        INQ,
        MTQ,
        YDQ,
        HAR,
        KLT,
        MLT,
        MMT,
        KMK,
        MMK,
        XAA,
        XAB,
        XAC,
        XAD,
        XAE,
        XAF,
        XAG,
        XAH,
        XAI,
        XAJ,
        XAL,
        XAM,
        XAP,
        XAT,
        XAV,
        XB4,
        XBA,
        XBB,
        XBC,
        XBD,
        XBE,
        XBF,
        XBG,
        XBH,
        XBI,
        XBJ,
        XBK,
        XBL,
        XBM,
        XBN,
        XBO,
        XBP,
        XBQ,
        XBR,
        XBS,
        XBT,
        XBU,
        XBV,
        XBW,
        XBX,
        XBY,
        XBZ,
        XCA,
        XCB,
        XCC,
        XCD,
        XCE,
        XCF,
        XCG,
        XCH,
        XCI,
        XCJ,
        XCK,
        XCL,
        XCM,
        XCN,
        XCO,
        XCP,
        XCQ,
        XCR,
        XCS,
        XCT,
        XCU,
        XCV,
        XCW,
        XCX,
        XCY,
        XCZ,
        XDA,
        XDB,
        XDC,
        XDD,
        XDE,
        XDF,
        XDG,
        XDH,
        XDI,
        XDJ,
        XDK,
        XDL,
        XDM,
        XDN,
        XDP,
        XDQ,
        XDR,
        XDS,
        XDT,
        XDU,
        XDV,
        XDW,
        XDX,
        XDY,
        XDZ,
        XEA,
        XEB,
        XEC,
        XED,
        XEE,
        XEF,
        XEG,
        XEH,
        XEI,
        XEJ,
        XEK,
        XEL,
        XEM,
        XEN,
        XEP,
        XEQ,
        XER,
        XES,
        XET,
        XEU,
        XEV,
        XEW,
        XEX,
        XEY,
        XFB,
        XFC,
        XFD,
        XFE,
        XFF,
        XFG,
        XFH,
        XFI,
        XFJ,
        XFK,
        XFL,
        XFM,
        XFN,
        XFO,
        XFP,
        XFQ,
        XFR,
        XFS,
        XFT,
        XFU,
        XFV,
        XFW,
        XFX,
        XFY,
        XFZ,
        XGA,
        XGB,
        XGC,
        XGD,
        XGE,
        XGF,
        XGG,
        XGH,
        XGI,
        XGJ,
        XGK,
        XGL,
        XGM,
        XGN,
        XGO,
        XGP,
        XGQ,
        XGR,
        XGS,
        XGT,
        XGU,
        XGV,
        XGW,
        XGX,
        XGY,
        XGZ,
        XHA,
        XHB,
        XHC,
        XHD,
        XHE,
        XHF,
        XHG,
        XHH,
        XHI,
        XHJ,
        XHK,
        XHL,
        XHM,
        XHN,
        XHP,
        XHQ,
        XHR,
        XHS,
        XHT,
        XHU,
        XHV,
        XHW,
        XHX,
        XHY,
        XHZ,
        XIA,
        XIB,
        XIC,
        XID,
        XIE,
        XIF,
        XIG,
        XIH,
        XII,
        XIJ,
        XIK,
        XIL,
        XIM,
        XIN,
        XIO,
        XJA,
        XJB,
        XJC,
        XJD,
        XJE,
        XJF,
        XJG,
        XJH,
        XJI,
        XJJ,
        XJK,
        XJL,
        XJM,
        XJN,
        XJO,
        XJP,
        XJQ,
        XJR,
        XJS,
        XJT,
        XJU,
        XJV,
        XJW,
        XJX,
        XJY,
        XJZ,
        XLA,
        XLB,
        XLC,
        XLD,
        XLE,
        XLF,
        XLG,
        XLH,
        XLI,
        XLJ,
        XLK,
        XLL,
        XLM,
        XLN,
        XLO,
        XLP,
        XLQ,
        XLR,
        XLS,
        XLT,
        XLU,
        XLV,
        XLW,
        XLX,
        XLY,
        XLZ,
        XMA,
        XMB,
        XMC,
        XMD,
        XME,
        XMF,
        XMG,
        XMH,
        XMI,
        XMJ,
        XMK,
        XML,
        XMM,
        XMN,
        XMO,
        XMP,
        XMQ,
        XMR,
        XMS,
        XMT,
        XMU,
        XMV,
        XMW,
        XMX,
        XMY,
        XMZ,
        XNA,
        XNB,
        XNC,
        XND,
        XNE,
        XNF,
        XNG,
        XNH,
        XNI,
        XNJ,
        XNK,
        XNL,
        XNM,
        XOA,
        XOB,
        XOC,
        XOD,
        XOE,
        XOF,
        XOG,
        XOH,
        XOI,
        XOJ,
        XOK,
        XOL,
        XOM,
        XON,
        XOO,
        XOP,
        XOQ,
        XOR,
        XOS,
        XOT,
        XOU,
        XOV,
        XOW,
        XOX,
        XOY,
        XOZ,
        XP1,
        XP2,
        XP3,
        XP4,
        XPA,
        XPB,
        XPC,
        XPD,
        XPE,
        XPF,
        XPG,
        XPH,
        XPI,
        XPJ,
        XPK,
        XPL,
        XPM,
        XPN,
        XPO,
        XPP,
        XPQ,
        XPR,
        XPS,
        XPT,
        XPU,
        XPV,
        XPW,
        XPX,
        XPY,
        XPZ,
        XQA,
        XQB,
        XQC,
        XQD,
        XQE,
        XQF,
        XQG,
        XQH,
        XQI,
        XQJ,
        XQK,
        XQL,
        XQM,
        XQN,
        XQO,
        XQP,
        XQQ,
        XQR,
        XQS,
        XRD,
        XRE,
        XRF,
        XRG,
        XRH,
        XRI,
        XRJ,
        XRK,
        XRL,
        XRM,
        XRN,
        XRO,
        XRP,
        XRQ,
        XRR,
        XRS,
        XRT,
        XRU,
        XRV,
        XRW,
        XRX,
        XRY,
        XRZ,
        XSA,
        XSB,
        XSC,
        XSD,
        XSE,
        XSF,
        XSG,
        XSH,
        XSI,
        XSJ,
        XSK,
        XSL,
        XSM,
        XSN,
        XSO,
        XSP,
        XSQ,
        XSR,
        XSS,
        XST,
        XSU,
        XSV,
        XSW,
        XSX,
        XSY,
        XSZ,
        XTA,
        XTB,
        XTC,
        XTD,
        XTE,
        XTF,
        XTG,
        XTI,
        XTJ,
        XTK,
        XTL,
        XTM,
        XTN,
        XTO,
        XTR,
        XTS,
        XTT,
        XTU,
        XTV,
        XTW,
        XTX,
        XTY,
        XTZ,
        XUC,
        XUN,
        XVA,
        XVG,
        XVI,
        XVK,
        XVL,
        XVN,
        XVO,
        XVP,
        XVQ,
        XVR,
        XVS,
        XVY,
        XWA,
        XWB,
        XWC,
        XWD,
        XWF,
        XWG,
        XWH,
        XWJ,
        XWK,
        XWL,
        XWM,
        XWN,
        XWP,
        XWQ,
        XWR,
        XWS,
        XWT,
        XWU,
        XWV,
        XWW,
        XWX,
        XWY,
        XWZ,
        XXA,
        XXB,
        XXC,
        XXD,
        XXF,
        XXG,
        XXH,
        XXJ,
        XXK,
        XYA,
        XYB,
        XYC,
        XYD,
        XYF,
        XYG,
        XYH,
        XYJ,
        XYK,
        XYL,
        XYM,
        XYN,
        XYP,
        XYQ,
        XYR,
        XYS,
        XYT,
        XYV,
        XYW,
        XYX,
        XYY,
        XYZ,
        XZA,
        XZB,
        XZC,
        XZD,
        XZF,
        XZG,
        XZH,
        XZJ,
        XZK,
        XZL,
        XZM,
        XZN,
        XZP,
        XZQ,
        XZR,
        XZS,
        XZT,
        XZU,
        XZV,
        XZW,
        XZX,
        XZY,
        XZZ,
        ZZ,
        NAR,
        C62,
        LTR,
        H87,
        AA,
        AB,
        ACT,
        AD,
        AE,
        AL,
        AMP,
        APZ,
        AQ,
        AS,
        ASM,
        ASU,
        ATM,
        AWG,
        AY,
        AZ,
        B10,
        BP,
        BPM,
        BQL,
        BTU,
        C3,
        C7,
        C8,
        C9,
        CCT,
        CEN,
        CG,
        CGM,
        CKG,
        CLF,
        CTM,
        D03,
        D04,
        D1,
        D10,
        D11,
        D12,
        D13,
        D15,
        D16,
        D17,
        D18,
        D19,
        D2,
        D20,
        D21,
        D22,
        D23,
        D24,
        D25,
        D26,
        D27,
        D29,
        D30,
        D31,
        D32,
        D33,
        D34,
        D36,
        D41,
        D42,
        D43,
        D44,
        D45,
        D46,
        D47,
        D48,
        D49,
        D5,
        D50,
        D51,
        D52,
        D53,
        D54,
        D55,
        D56,
        D57,
        D58,
        D59,
        D6,
        D60,
        D61,
        D62,
        D63,
        D65,
        D68,
        D69,
        D73,
        D74,
        D77,
        D78,
        D80,
        D81,
        D82,
        D83,
        D85,
        D86,
        D87,
        D88,
        D89,
        D91,
        D93,
        D94,
        D95,
        DAA,
        DAD,
        DBM,
        DBW,
        DEC,
        DJ,
        DMA,
        DMO,
        DN,
        DPR,
        DRI,
        DRL,
        DT,
        DTN,
        DWT,
        E08,
        E15,
        E16,
        E18,
        E19,
        E21,
        E22,
        E28,
        E30,
        E32,
        E33,
        E4,
        E59,
        E61,
        E63,
        E64,
        E68,
        E72,
        E74,
        E77,
        E78,
        E79,
        E80,
        E81,
        E82,
        E83,
        E84,
        E85,
        E86,
        E87,
        E88,
        E89,
        E90,
        E91,
        E92,
        E93,
        E94,
        E95,
        E96,
        E97,
        E98,
        E99,
        EB,
        EQ,
        F01,
        F02,
        F03,
        F04,
        F05,
        F06,
        F07,
        F08,
        F10,
        F11,
        F12,
        F13,
        F14,
        F15,
        F16,
        F17,
        F18,
        F19,
        F20,
        F21,
        F22,
        F23,
        F24,
        F25,
        F26,
        F27,
        F28,
        F29,
        F30,
        F31,
        F32,
        F33,
        F34,
        F35,
        F36,
        F37,
        F38,
        F39,
        F40,
        F41,
        F42,
        F43,
        F44,
        F45,
        F46,
        F47,
        F48,
        F49,
        F50,
        F51,
        F52,
        F53,
        F54,
        F55,
        F56,
        F57,
        F58,
        F59,
        F60,
        F61,
        F62,
        F63,
        F64,
        F65,
        F66,
        F67,
        F68,
        F69,
        F70,
        F71,
        F72,
        F73,
        F74,
        F75,
        F76,
        F77,
        F78,
        F79,
        F80,
        F81,
        F82,
        F83,
        F84,
        F85,
        F86,
        F87,
        F88,
        F89,
        F90,
        F91,
        F92,
        F93,
        F94,
        F95,
        F96,
        F97,
        F98,
        F99,
        FAH,
        FAR,
        FBM,
        FC,
        FF,
        FH,
        FIT,
        FL,
        FNU,
        FP,
        FR,
        FS,
        G01,
        G04,
        G05,
        G06,
        G08,
        G09,
        G10,
        G11,
        G12,
        G13,
        G14,
        G15,
        G16,
        G17,
        G18,
        G19,
        G2,
        G20,
        G21,
        G23,
        G24,
        G25,
        G26,
        G27,
        G28,
        G29,
        G3,
        G30,
        G31,
        G32,
        G33,
        G34,
        G35,
        G36,
        G37,
        G38,
        G39,
        G40,
        G41,
        G42,
        G43,
        G44,
        G45,
        G46,
        G47,
        G48,
        G49,
        G50,
        G51,
        G52,
        G53,
        G54,
        G55,
        G56,
        G57,
        G58,
        G59,
        G60,
        G61,
        G62,
        G63,
        G64,
        G65,
        G66,
        G67,
        G68,
        G69,
        G70,
        G71,
        G72,
        G73,
        G74,
        G75,
        G76,
        G77,
        G78,
        G79,
        G80,
        G81,
        G82,
        G83,
        G84,
        G85,
        G86,
        G87,
        G88,
        G89,
        G90,
        G91,
        G92,
        G93,
        G94,
        G95,
        G96,
        G97,
        G98,
        G99,
        GB,
        GBQ,
        GDW,
        GE,
        GF,
        GFI,
        GGR,
        GIA,
        GIC,
        GII,
        GIP,
        GJ,
        GL,
        GLD,
        GM,
        GO,
        GP,
        GQ,
        GRN,
        GV,
        GWH,
        H03,
        H04,
        H05,
        H06,
        H07,
        H08,
        H09,
        H10,
        H11,
        H12,
        H13,
        H14,
        H15,
        H16,
        H18,
        H19,
        H20,
        H21,
        H22,
        H23,
        H24,
        H25,
        H26,
        H27,
        H28,
        H29,
        H30,
        H31,
        H32,
        H33,
        H34,
        H35,
        H36,
        H37,
        H38,
        H39,
        H40,
        H41,
        H42,
        H43,
        H44,
        H45,
        H46,
        H47,
        H48,
        H49,
        H50,
        H51,
        H52,
        H53,
        H54,
        H55,
        H56,
        H57,
        H58,
        H59,
        H60,
        H61,
        H62,
        H63,
        H64,
        H65,
        H66,
        H67,
        H68,
        H69,
        H70,
        H71,
        H72,
        H73,
        H74,
        H75,
        H76,
        H77,
        H79,
        H80,
        H81,
        H82,
        H83,
        H84,
        H85,
        H88,
        H89,
        H90,
        H91,
        H92,
        H93,
        H94,
        H95,
        H96,
        H98,
        H99,
        HA,
        HAD,
        HBA,
        HBX,
        HC,
        HDW,
        HEA,
        HGM,
        HH,
        HIU,
        HKM,
        HLT,
        HM,
        HMO,
        HMQ,
        HMT,
        HPA,
        HWE,
        IA,
        IE,
        ISD,
        IU,
        IUG,
        IV,
        J10,
        J12,
        J13,
        J14,
        J15,
        J16,
        J17,
        J18,
        J19,
        J2,
        J20,
        J21,
        J22,
        J23,
        J24,
        J25,
        J26,
        J27,
        J28,
        J29,
        J30,
        J31,
        J32,
        J33,
        J34,
        J35,
        J36,
        J38,
        J39,
        J40,
        J41,
        J42,
        J43,
        J44,
        J45,
        J46,
        J47,
        J48,
        J49,
        J50,
        J51,
        J52,
        J53,
        J54,
        J55,
        J56,
        J57,
        J58,
        J59,
        J60,
        J61,
        J62,
        J63,
        J64,
        J65,
        J66,
        J67,
        J68,
        J69,
        J70,
        J71,
        J72,
        J73,
        J74,
        J75,
        J76,
        J78,
        J79,
        J81,
        J82,
        J83,
        J84,
        J85,
        J87,
        J90,
        J91,
        J92,
        J93,
        J95,
        J96,
        J97,
        J98,
        J99,
        JE,
        JK,
        JM,
        JNT,
        JOU,
        JPS,
        JWL,
        K1,
        K10,
        K11,
        K12,
        K13,
        K14,
        K15,
        K16,
        K17,
        K18,
        K19,
        K2,
        K20,
        K21,
        K22,
        K23,
        K26,
        K27,
        K28,
        K3,
        K30,
        K31,
        K32,
        K33,
        K34,
        K35,
        K36,
        K37,
        K38,
        K39,
        K40,
        K41,
        K42,
        K43,
        K45,
        K46,
        K47,
        K48,
        K49,
        K50,
        K51,
        K52,
        K53,
        K54,
        K55,
        K58,
        K59,
        K6,
        K60,
        K61,
        K62,
        K63,
        K64,
        K65,
        K66,
        K67,
        K68,
        K69,
        K70,
        K71,
        K73,
        K74,
        K75,
        K76,
        K77,
        K78,
        K79,
        K80,
        K81,
        K82,
        K83,
        K84,
        K85,
        K86,
        K87,
        K88,
        K89,
        K90,
        K91,
        K92,
        K93,
        K94,
        K95,
        K96,
        K97,
        K98,
        K99,
        KA,
        KAT,
        KB,
        KBA,
        KCC,
        KDW,
        KEL,
        KGS,
        KHY,
        KHZ,
        KI,
        KIC,
        KIP,
        KJ,
        KJO,
        KL,
        KLK,
        KLX,
        KMA,
        KMH,
        KMQ,
        KNI,
        KNM,
        KNS,
        KNT,
        KO,
        KPA,
        KPH,
        KPO,
        KPP,
        KR,
        KSD,
        KSH,
        KT,
        KTN,
        KUR,
        KVA,
        KVR,
        KVT,
        KW,
        KWH,
        KWN,
        KWO,
        KWS,
        KWT,
        KWY,
        KX,
        L10,
        L11,
        L12,
        L13,
        L14,
        L15,
        L16,
        L17,
        L18,
        L19,
        L2,
        L20,
        L21,
        L23,
        L24,
        L25,
        L26,
        L27,
        L28,
        L29,
        L30,
        L31,
        L32,
        L33,
        L34,
        L35,
        L36,
        L37,
        L38,
        L39,
        L40,
        L41,
        L42,
        L43,
        L44,
        L45,
        L46,
        L47,
        L48,
        L49,
        L50,
        L51,
        L52,
        L53,
        L54,
        L55,
        L56,
        L57,
        L58,
        L59,
        L60,
        L63,
        L64,
        L65,
        L66,
        L67,
        L68,
        L69,
        L70,
        L71,
        L72,
        L73,
        L74,
        L75,
        L76,
        L77,
        L78,
        L79,
        L80,
        L81,
        L82,
        L83,
        L84,
        L85,
        L86,
        L87,
        L88,
        L89,
        L90,
        L91,
        L92,
        L93,
        L94,
        L95,
        L96,
        L98,
        L99,
        LA,
        LAC,
        LBT,
        LD,
        LEF,
        LF,
        LH,
        LK,
        LM,
        LN,
        LO,
        LP,
        LPA,
        LR,
        LS,
        LTN,
        LUB,
        LUM,
        LUX,
        LY,
        M1,
        M10,
        M11,
        M12,
        M13,
        M14,
        M15,
        M16,
        M17,
        M18,
        M19,
        M20,
        M21,
        M22,
        M23,
        M24,
        M25,
        M26,
        M27,
        M29,
        M30,
        M31,
        M32,
        M33,
        M34,
        M35,
        M36,
        M37,
        M38,
        M39,
        M4,
        M40,
        M41,
        M42,
        M43,
        M44,
        M45,
        M46,
        M47,
        M48,
        M49,
        M5,
        M50,
        M51,
        M52,
        M53,
        M55,
        M56,
        M57,
        M58,
        M59,
        M60,
        M61,
        M62,
        M63,
        M64,
        M65,
        M66,
        M67,
        M68,
        M69,
        M7,
        M70,
        M71,
        M72,
        M73,
        M74,
        M75,
        M76,
        M77,
        M78,
        M79,
        M80,
        M81,
        M82,
        M83,
        M84,
        M85,
        M86,
        M87,
        M88,
        M89,
        M9,
        M90,
        M91,
        M92,
        M93,
        M94,
        M95,
        M96,
        M97,
        M98,
        M99,
        MAH,
        MAL,
        MAM,
        MAR,
        MAW,
        MBE,
        MBF,
        MBR,
        MC,
        MCU,
        MD,
        MGM,
        MHZ,
        MIK,
        MIL,
        MIO,
        MIU,
        MKD,
        MKM,
        MKW,
        MLD,
        MMQ,
        MND,
        MNJ,
        MPA,
        MQD,
        MQH,
        MQM,
        MQS,
        MQW,
        MRD,
        MRM,
        MRW,
        MSK,
        MTS,
        MTZ,
        MVA,
        MWH,
        N1,
        N10,
        N11,
        N12,
        N13,
        N14,
        N15,
        N16,
        N17,
        N18,
        N19,
        N20,
        N21,
        N22,
        N23,
        N24,
        N25,
        N26,
        N27,
        N28,
        N29,
        N3,
        N30,
        N31,
        N32,
        N33,
        N34,
        N35,
        N36,
        N37,
        N38,
        N39,
        N40,
        N41,
        N42,
        N43,
        N44,
        N45,
        N46,
        N47,
        N48,
        N49,
        N50,
        N51,
        N52,
        N53,
        N54,
        N55,
        N56,
        N57,
        N58,
        N59,
        N60,
        N61,
        N62,
        N63,
        N64,
        N65,
        N66,
        N67,
        N68,
        N69,
        N70,
        N71,
        N72,
        N73,
        N74,
        N75,
        N76,
        N77,
        N78,
        N79,
        N80,
        N81,
        N82,
        N83,
        N84,
        N85,
        N86,
        N87,
        N88,
        N89,
        N90,
        N91,
        N92,
        N93,
        N94,
        N95,
        N96,
        N97,
        N98,
        N99,
        NA,
        NCL,
        NEW,
        NF,
        NIL,
        NIU,
        NL,
        NM3,
        NMI,
        NMP,
        NPT,
        NT,
        NTU,
        NU,
        NX,
        OA,
        ODE,
        ODG,
        ODK,
        ODM,
        OHM,
        ON,
        OPM,
        OT,
        OZA,
        OZI,
        P1,
        P10,
        P11,
        P12,
        P13,
        P14,
        P15,
        P16,
        P17,
        P18,
        P19,
        P2,
        P20,
        P21,
        P22,
        P23,
        P24,
        P25,
        P26,
        P27,
        P28,
        P29,
        P30,
        P31,
        P32,
        P33,
        P34,
        P35,
        P36,
        P37,
        P38,
        P39,
        P40,
        P41,
        P42,
        P43,
        P44,
        P45,
        P46,
        P47,
        P48,
        P49,
        P5,
        P50,
        P51,
        P52,
        P53,
        P54,
        P55,
        P56,
        P57,
        P58,
        P59,
        P60,
        P61,
        P62,
        P63,
        P64,
        P65,
        P66,
        P67,
        P68,
        P69,
        P70,
        P71,
        P72,
        P73,
        P74,
        P75,
        P76,
        P77,
        P78,
        P79,
        P80,
        P81,
        P82,
        P83,
        P84,
        P85,
        P86,
        P87,
        P88,
        P89,
        P90,
        P91,
        P92,
        P93,
        P94,
        P95,
        P96,
        P97,
        P98,
        P99,
        PAL,
        PD,
        PFL,
        PGL,
        PI,
        PLA,
        PO,
        PQ,
        PR,
        PS,
        PTD,
        PTI,
        PTL,
        PTN,
        Q10,
        Q11,
        Q12,
        Q13,
        Q14,
        Q15,
        Q16,
        Q17,
        Q18,
        Q19,
        Q20,
        Q21,
        Q22,
        Q23,
        Q24,
        Q25,
        Q26,
        Q27,
        Q28,
        Q29,
        Q3,
        Q30,
        Q31,
        Q32,
        Q33,
        Q34,
        Q35,
        Q36,
        Q37,
        Q38,
        Q39,
        Q40,
        Q41,
        Q42,
        QA,
        QAN,
        QB,
        QR,
        QTD,
        QTI,
        QTL,
        QTR,
        R1,
        R9,
        RH,
        RM,
        ROM,
        RP,
        RPM,
        RPS,
        RT,
        S3,
        S4,
        SAN,
        SCO,
        SCR,
        SET,
        SG,
        SIE,
        SM3,
        SQ,
        SQR,
        SR,
        STC,
        STI,
        STK,
        STL,
        STN,
        STW,
        SW,
        SX,
        SYR,
        T0,
        T3,
        TAH,
        TAN,
        TI,
        TIC,
        TIP,
        TKM,
        TMS,
        TP,
        TPI,
        TPR,
        TQD,
        TRL,
        TST,
        TTS,
        U1,
        U2,
        UB,
        UC,
        VA,
        VP,
        W2,
        WA,
        WB,
        WCD,
        WE,
        WEB,
        WEE,
        WG,
        WHR,
        WM,
        WSD,
        X1,
        Z11,
        Z9,
        ZP,
        X1A,
        X1B,
        X1D,
        X1F,
        X1G,
        X1W,
        X2C,
        X3A,
        X3H,
        X43,
        X44,
        X4A,
        X4B,
        X4C,
        X4D,
        X4F,
        X4G,
        X4H,
        X5H,
        X5L,
        X5M,
        X6H,
        X6P,
        X7A,
        X7B,
        X8A,
        X8B,
        X8C,
        XIZ,
        XKG,
        XKI,
        XNS,
        XNT,
        XNU,
        XNV,
        XO1,
        XO2,
        XO3,
        XO4,
        XO5,
        XO6,
        XO7,
        XO8,
        XO9,
        XT1,
    }

    /**
     * An enum containing [UnitOfMeasureCode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [UnitOfMeasureCode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        _10,
        _11,
        _13,
        _14,
        _15,
        _20,
        _21,
        _22,
        _23,
        _24,
        _25,
        _27,
        _28,
        _33,
        _34,
        _35,
        _37,
        _38,
        _40,
        _41,
        _56,
        _57,
        _58,
        _59,
        _60,
        _61,
        _74,
        _77,
        _80,
        _81,
        _85,
        _87,
        _89,
        _91,
        _1_I,
        EA,
        E01,
        E07,
        E09,
        E10,
        E12,
        E14,
        E17,
        E20,
        E23,
        E25,
        E27,
        E31,
        E34,
        E35,
        E36,
        E37,
        E38,
        E39,
        E40,
        E41,
        E42,
        E43,
        E44,
        E45,
        E46,
        E47,
        E48,
        E49,
        E50,
        E51,
        E52,
        E53,
        E54,
        E55,
        E56,
        E57,
        E58,
        E60,
        E62,
        E65,
        E66,
        E67,
        E69,
        E70,
        E71,
        E73,
        E75,
        E76,
        _2_A,
        _2_B,
        _2_C,
        _2_G,
        _2_H,
        _2_I,
        _2_J,
        _2_K,
        _2_L,
        _2_M,
        _2_N,
        _2_P,
        _2_Q,
        _2_R,
        _2_U,
        _2_X,
        _2_Y,
        _2_Z,
        _3_B,
        _3_C,
        _4_C,
        _4_G,
        _4_H,
        _4_K,
        _4_L,
        _4_M,
        _4_N,
        _4_O,
        _4_P,
        _4_Q,
        _4_R,
        _4_T,
        _4_U,
        _4_W,
        _4_X,
        _5_A,
        _5_B,
        _5_E,
        _5_J,
        A10,
        A11,
        A12,
        A13,
        A14,
        A15,
        A16,
        A17,
        A18,
        A19,
        A2,
        A20,
        A21,
        A22,
        A23,
        A24,
        A26,
        A27,
        A28,
        A29,
        A3,
        A30,
        A31,
        A32,
        A33,
        A34,
        A35,
        A36,
        A37,
        A38,
        A39,
        A4,
        A40,
        A41,
        A42,
        A43,
        A44,
        A45,
        A46,
        A47,
        A48,
        A49,
        A5,
        A50,
        A51,
        A52,
        A53,
        A54,
        A55,
        A56,
        A57,
        A58,
        A59,
        A6,
        A60,
        A61,
        A62,
        A63,
        A64,
        A65,
        A66,
        A67,
        A68,
        A69,
        A7,
        A70,
        A71,
        A72,
        A73,
        A74,
        A75,
        A76,
        A77,
        A78,
        A79,
        A8,
        A80,
        A81,
        A82,
        A83,
        A84,
        A85,
        A86,
        A87,
        A88,
        A89,
        A9,
        A90,
        A91,
        A92,
        A93,
        A94,
        A95,
        A96,
        A97,
        A98,
        A99,
        ACR,
        AH,
        AI,
        AK,
        AMH,
        AMT,
        ANN,
        B1,
        B11,
        B12,
        B13,
        B14,
        B15,
        B16,
        B17,
        B18,
        B19,
        B20,
        B21,
        B22,
        B23,
        B24,
        B25,
        B26,
        B27,
        B28,
        B29,
        B3,
        B30,
        B31,
        B32,
        B33,
        B34,
        B35,
        B36,
        B37,
        B38,
        B39,
        B4,
        B40,
        B41,
        B42,
        B43,
        B44,
        B45,
        B46,
        B47,
        B48,
        B49,
        B5,
        B50,
        B52,
        B53,
        B54,
        B55,
        B56,
        B57,
        B58,
        B59,
        B6,
        B60,
        B61,
        B62,
        B63,
        B64,
        B65,
        B66,
        B67,
        B68,
        B69,
        B7,
        B70,
        B71,
        B72,
        B73,
        B74,
        B75,
        B76,
        B77,
        B78,
        B79,
        B8,
        B80,
        B81,
        B82,
        B83,
        B84,
        B85,
        B86,
        B87,
        B88,
        B89,
        B9,
        B90,
        B91,
        B92,
        B93,
        B94,
        B95,
        B96,
        B97,
        B98,
        B99,
        BAR,
        BB,
        BFT,
        BHP,
        BIL,
        BLD,
        BLL,
        BUA,
        BUI,
        C0,
        C10,
        C11,
        C12,
        C13,
        C14,
        C15,
        C16,
        C17,
        C18,
        C19,
        C20,
        C21,
        C22,
        C23,
        C24,
        C25,
        C26,
        C27,
        C28,
        C29,
        C30,
        C31,
        C32,
        C33,
        C34,
        C35,
        C36,
        C37,
        C38,
        C39,
        C40,
        C41,
        C42,
        C43,
        C44,
        C45,
        C46,
        C47,
        C48,
        C49,
        C50,
        C51,
        C52,
        C53,
        C54,
        C55,
        C56,
        C57,
        C58,
        C59,
        C60,
        C61,
        C63,
        C64,
        C65,
        C66,
        C67,
        C68,
        C69,
        C70,
        C71,
        C72,
        C73,
        C74,
        C75,
        C76,
        C77,
        C78,
        C79,
        C80,
        C81,
        C82,
        C83,
        C84,
        C85,
        C86,
        C87,
        C88,
        C89,
        C90,
        C91,
        C92,
        C93,
        C94,
        C95,
        C96,
        C97,
        C98,
        C99,
        CDL,
        CEL,
        CHU,
        CIU,
        CLT,
        CMK,
        CMQ,
        CMT,
        CNP,
        CNT,
        COU,
        CTG,
        CTN,
        CUR,
        CWA,
        CWI,
        DAN,
        DAY,
        DB,
        DD,
        DG,
        DI,
        DLT,
        DMK,
        DMQ,
        DMT,
        DPC,
        DPT,
        DRA,
        DZN,
        DZP,
        FOT,
        GLL,
        GLI,
        GRM,
        GRO,
        HUR,
        HTZ,
        INH,
        KGM,
        KMT,
        MTR,
        SMI,
        MIN,
        MON,
        ONZ,
        LBR,
        QT,
        SEC,
        FTK,
        INK,
        MTK,
        YDK,
        TNE,
        VLT,
        WTT,
        YRD,
        FTQ,
        INQ,
        MTQ,
        YDQ,
        HAR,
        KLT,
        MLT,
        MMT,
        KMK,
        MMK,
        XAA,
        XAB,
        XAC,
        XAD,
        XAE,
        XAF,
        XAG,
        XAH,
        XAI,
        XAJ,
        XAL,
        XAM,
        XAP,
        XAT,
        XAV,
        XB4,
        XBA,
        XBB,
        XBC,
        XBD,
        XBE,
        XBF,
        XBG,
        XBH,
        XBI,
        XBJ,
        XBK,
        XBL,
        XBM,
        XBN,
        XBO,
        XBP,
        XBQ,
        XBR,
        XBS,
        XBT,
        XBU,
        XBV,
        XBW,
        XBX,
        XBY,
        XBZ,
        XCA,
        XCB,
        XCC,
        XCD,
        XCE,
        XCF,
        XCG,
        XCH,
        XCI,
        XCJ,
        XCK,
        XCL,
        XCM,
        XCN,
        XCO,
        XCP,
        XCQ,
        XCR,
        XCS,
        XCT,
        XCU,
        XCV,
        XCW,
        XCX,
        XCY,
        XCZ,
        XDA,
        XDB,
        XDC,
        XDD,
        XDE,
        XDF,
        XDG,
        XDH,
        XDI,
        XDJ,
        XDK,
        XDL,
        XDM,
        XDN,
        XDP,
        XDQ,
        XDR,
        XDS,
        XDT,
        XDU,
        XDV,
        XDW,
        XDX,
        XDY,
        XDZ,
        XEA,
        XEB,
        XEC,
        XED,
        XEE,
        XEF,
        XEG,
        XEH,
        XEI,
        XEJ,
        XEK,
        XEL,
        XEM,
        XEN,
        XEP,
        XEQ,
        XER,
        XES,
        XET,
        XEU,
        XEV,
        XEW,
        XEX,
        XEY,
        XFB,
        XFC,
        XFD,
        XFE,
        XFF,
        XFG,
        XFH,
        XFI,
        XFJ,
        XFK,
        XFL,
        XFM,
        XFN,
        XFO,
        XFP,
        XFQ,
        XFR,
        XFS,
        XFT,
        XFU,
        XFV,
        XFW,
        XFX,
        XFY,
        XFZ,
        XGA,
        XGB,
        XGC,
        XGD,
        XGE,
        XGF,
        XGG,
        XGH,
        XGI,
        XGJ,
        XGK,
        XGL,
        XGM,
        XGN,
        XGO,
        XGP,
        XGQ,
        XGR,
        XGS,
        XGT,
        XGU,
        XGV,
        XGW,
        XGX,
        XGY,
        XGZ,
        XHA,
        XHB,
        XHC,
        XHD,
        XHE,
        XHF,
        XHG,
        XHH,
        XHI,
        XHJ,
        XHK,
        XHL,
        XHM,
        XHN,
        XHP,
        XHQ,
        XHR,
        XHS,
        XHT,
        XHU,
        XHV,
        XHW,
        XHX,
        XHY,
        XHZ,
        XIA,
        XIB,
        XIC,
        XID,
        XIE,
        XIF,
        XIG,
        XIH,
        XII,
        XIJ,
        XIK,
        XIL,
        XIM,
        XIN,
        XIO,
        XJA,
        XJB,
        XJC,
        XJD,
        XJE,
        XJF,
        XJG,
        XJH,
        XJI,
        XJJ,
        XJK,
        XJL,
        XJM,
        XJN,
        XJO,
        XJP,
        XJQ,
        XJR,
        XJS,
        XJT,
        XJU,
        XJV,
        XJW,
        XJX,
        XJY,
        XJZ,
        XLA,
        XLB,
        XLC,
        XLD,
        XLE,
        XLF,
        XLG,
        XLH,
        XLI,
        XLJ,
        XLK,
        XLL,
        XLM,
        XLN,
        XLO,
        XLP,
        XLQ,
        XLR,
        XLS,
        XLT,
        XLU,
        XLV,
        XLW,
        XLX,
        XLY,
        XLZ,
        XMA,
        XMB,
        XMC,
        XMD,
        XME,
        XMF,
        XMG,
        XMH,
        XMI,
        XMJ,
        XMK,
        XML,
        XMM,
        XMN,
        XMO,
        XMP,
        XMQ,
        XMR,
        XMS,
        XMT,
        XMU,
        XMV,
        XMW,
        XMX,
        XMY,
        XMZ,
        XNA,
        XNB,
        XNC,
        XND,
        XNE,
        XNF,
        XNG,
        XNH,
        XNI,
        XNJ,
        XNK,
        XNL,
        XNM,
        XOA,
        XOB,
        XOC,
        XOD,
        XOE,
        XOF,
        XOG,
        XOH,
        XOI,
        XOJ,
        XOK,
        XOL,
        XOM,
        XON,
        XOO,
        XOP,
        XOQ,
        XOR,
        XOS,
        XOT,
        XOU,
        XOV,
        XOW,
        XOX,
        XOY,
        XOZ,
        XP1,
        XP2,
        XP3,
        XP4,
        XPA,
        XPB,
        XPC,
        XPD,
        XPE,
        XPF,
        XPG,
        XPH,
        XPI,
        XPJ,
        XPK,
        XPL,
        XPM,
        XPN,
        XPO,
        XPP,
        XPQ,
        XPR,
        XPS,
        XPT,
        XPU,
        XPV,
        XPW,
        XPX,
        XPY,
        XPZ,
        XQA,
        XQB,
        XQC,
        XQD,
        XQE,
        XQF,
        XQG,
        XQH,
        XQI,
        XQJ,
        XQK,
        XQL,
        XQM,
        XQN,
        XQO,
        XQP,
        XQQ,
        XQR,
        XQS,
        XRD,
        XRE,
        XRF,
        XRG,
        XRH,
        XRI,
        XRJ,
        XRK,
        XRL,
        XRM,
        XRN,
        XRO,
        XRP,
        XRQ,
        XRR,
        XRS,
        XRT,
        XRU,
        XRV,
        XRW,
        XRX,
        XRY,
        XRZ,
        XSA,
        XSB,
        XSC,
        XSD,
        XSE,
        XSF,
        XSG,
        XSH,
        XSI,
        XSJ,
        XSK,
        XSL,
        XSM,
        XSN,
        XSO,
        XSP,
        XSQ,
        XSR,
        XSS,
        XST,
        XSU,
        XSV,
        XSW,
        XSX,
        XSY,
        XSZ,
        XTA,
        XTB,
        XTC,
        XTD,
        XTE,
        XTF,
        XTG,
        XTI,
        XTJ,
        XTK,
        XTL,
        XTM,
        XTN,
        XTO,
        XTR,
        XTS,
        XTT,
        XTU,
        XTV,
        XTW,
        XTX,
        XTY,
        XTZ,
        XUC,
        XUN,
        XVA,
        XVG,
        XVI,
        XVK,
        XVL,
        XVN,
        XVO,
        XVP,
        XVQ,
        XVR,
        XVS,
        XVY,
        XWA,
        XWB,
        XWC,
        XWD,
        XWF,
        XWG,
        XWH,
        XWJ,
        XWK,
        XWL,
        XWM,
        XWN,
        XWP,
        XWQ,
        XWR,
        XWS,
        XWT,
        XWU,
        XWV,
        XWW,
        XWX,
        XWY,
        XWZ,
        XXA,
        XXB,
        XXC,
        XXD,
        XXF,
        XXG,
        XXH,
        XXJ,
        XXK,
        XYA,
        XYB,
        XYC,
        XYD,
        XYF,
        XYG,
        XYH,
        XYJ,
        XYK,
        XYL,
        XYM,
        XYN,
        XYP,
        XYQ,
        XYR,
        XYS,
        XYT,
        XYV,
        XYW,
        XYX,
        XYY,
        XYZ,
        XZA,
        XZB,
        XZC,
        XZD,
        XZF,
        XZG,
        XZH,
        XZJ,
        XZK,
        XZL,
        XZM,
        XZN,
        XZP,
        XZQ,
        XZR,
        XZS,
        XZT,
        XZU,
        XZV,
        XZW,
        XZX,
        XZY,
        XZZ,
        ZZ,
        NAR,
        C62,
        LTR,
        H87,
        AA,
        AB,
        ACT,
        AD,
        AE,
        AL,
        AMP,
        APZ,
        AQ,
        AS,
        ASM,
        ASU,
        ATM,
        AWG,
        AY,
        AZ,
        B10,
        BP,
        BPM,
        BQL,
        BTU,
        C3,
        C7,
        C8,
        C9,
        CCT,
        CEN,
        CG,
        CGM,
        CKG,
        CLF,
        CTM,
        D03,
        D04,
        D1,
        D10,
        D11,
        D12,
        D13,
        D15,
        D16,
        D17,
        D18,
        D19,
        D2,
        D20,
        D21,
        D22,
        D23,
        D24,
        D25,
        D26,
        D27,
        D29,
        D30,
        D31,
        D32,
        D33,
        D34,
        D36,
        D41,
        D42,
        D43,
        D44,
        D45,
        D46,
        D47,
        D48,
        D49,
        D5,
        D50,
        D51,
        D52,
        D53,
        D54,
        D55,
        D56,
        D57,
        D58,
        D59,
        D6,
        D60,
        D61,
        D62,
        D63,
        D65,
        D68,
        D69,
        D73,
        D74,
        D77,
        D78,
        D80,
        D81,
        D82,
        D83,
        D85,
        D86,
        D87,
        D88,
        D89,
        D91,
        D93,
        D94,
        D95,
        DAA,
        DAD,
        DBM,
        DBW,
        DEC,
        DJ,
        DMA,
        DMO,
        DN,
        DPR,
        DRI,
        DRL,
        DT,
        DTN,
        DWT,
        E08,
        E15,
        E16,
        E18,
        E19,
        E21,
        E22,
        E28,
        E30,
        E32,
        E33,
        E4,
        E59,
        E61,
        E63,
        E64,
        E68,
        E72,
        E74,
        E77,
        E78,
        E79,
        E80,
        E81,
        E82,
        E83,
        E84,
        E85,
        E86,
        E87,
        E88,
        E89,
        E90,
        E91,
        E92,
        E93,
        E94,
        E95,
        E96,
        E97,
        E98,
        E99,
        EB,
        EQ,
        F01,
        F02,
        F03,
        F04,
        F05,
        F06,
        F07,
        F08,
        F10,
        F11,
        F12,
        F13,
        F14,
        F15,
        F16,
        F17,
        F18,
        F19,
        F20,
        F21,
        F22,
        F23,
        F24,
        F25,
        F26,
        F27,
        F28,
        F29,
        F30,
        F31,
        F32,
        F33,
        F34,
        F35,
        F36,
        F37,
        F38,
        F39,
        F40,
        F41,
        F42,
        F43,
        F44,
        F45,
        F46,
        F47,
        F48,
        F49,
        F50,
        F51,
        F52,
        F53,
        F54,
        F55,
        F56,
        F57,
        F58,
        F59,
        F60,
        F61,
        F62,
        F63,
        F64,
        F65,
        F66,
        F67,
        F68,
        F69,
        F70,
        F71,
        F72,
        F73,
        F74,
        F75,
        F76,
        F77,
        F78,
        F79,
        F80,
        F81,
        F82,
        F83,
        F84,
        F85,
        F86,
        F87,
        F88,
        F89,
        F90,
        F91,
        F92,
        F93,
        F94,
        F95,
        F96,
        F97,
        F98,
        F99,
        FAH,
        FAR,
        FBM,
        FC,
        FF,
        FH,
        FIT,
        FL,
        FNU,
        FP,
        FR,
        FS,
        G01,
        G04,
        G05,
        G06,
        G08,
        G09,
        G10,
        G11,
        G12,
        G13,
        G14,
        G15,
        G16,
        G17,
        G18,
        G19,
        G2,
        G20,
        G21,
        G23,
        G24,
        G25,
        G26,
        G27,
        G28,
        G29,
        G3,
        G30,
        G31,
        G32,
        G33,
        G34,
        G35,
        G36,
        G37,
        G38,
        G39,
        G40,
        G41,
        G42,
        G43,
        G44,
        G45,
        G46,
        G47,
        G48,
        G49,
        G50,
        G51,
        G52,
        G53,
        G54,
        G55,
        G56,
        G57,
        G58,
        G59,
        G60,
        G61,
        G62,
        G63,
        G64,
        G65,
        G66,
        G67,
        G68,
        G69,
        G70,
        G71,
        G72,
        G73,
        G74,
        G75,
        G76,
        G77,
        G78,
        G79,
        G80,
        G81,
        G82,
        G83,
        G84,
        G85,
        G86,
        G87,
        G88,
        G89,
        G90,
        G91,
        G92,
        G93,
        G94,
        G95,
        G96,
        G97,
        G98,
        G99,
        GB,
        GBQ,
        GDW,
        GE,
        GF,
        GFI,
        GGR,
        GIA,
        GIC,
        GII,
        GIP,
        GJ,
        GL,
        GLD,
        GM,
        GO,
        GP,
        GQ,
        GRN,
        GV,
        GWH,
        H03,
        H04,
        H05,
        H06,
        H07,
        H08,
        H09,
        H10,
        H11,
        H12,
        H13,
        H14,
        H15,
        H16,
        H18,
        H19,
        H20,
        H21,
        H22,
        H23,
        H24,
        H25,
        H26,
        H27,
        H28,
        H29,
        H30,
        H31,
        H32,
        H33,
        H34,
        H35,
        H36,
        H37,
        H38,
        H39,
        H40,
        H41,
        H42,
        H43,
        H44,
        H45,
        H46,
        H47,
        H48,
        H49,
        H50,
        H51,
        H52,
        H53,
        H54,
        H55,
        H56,
        H57,
        H58,
        H59,
        H60,
        H61,
        H62,
        H63,
        H64,
        H65,
        H66,
        H67,
        H68,
        H69,
        H70,
        H71,
        H72,
        H73,
        H74,
        H75,
        H76,
        H77,
        H79,
        H80,
        H81,
        H82,
        H83,
        H84,
        H85,
        H88,
        H89,
        H90,
        H91,
        H92,
        H93,
        H94,
        H95,
        H96,
        H98,
        H99,
        HA,
        HAD,
        HBA,
        HBX,
        HC,
        HDW,
        HEA,
        HGM,
        HH,
        HIU,
        HKM,
        HLT,
        HM,
        HMO,
        HMQ,
        HMT,
        HPA,
        HWE,
        IA,
        IE,
        ISD,
        IU,
        IUG,
        IV,
        J10,
        J12,
        J13,
        J14,
        J15,
        J16,
        J17,
        J18,
        J19,
        J2,
        J20,
        J21,
        J22,
        J23,
        J24,
        J25,
        J26,
        J27,
        J28,
        J29,
        J30,
        J31,
        J32,
        J33,
        J34,
        J35,
        J36,
        J38,
        J39,
        J40,
        J41,
        J42,
        J43,
        J44,
        J45,
        J46,
        J47,
        J48,
        J49,
        J50,
        J51,
        J52,
        J53,
        J54,
        J55,
        J56,
        J57,
        J58,
        J59,
        J60,
        J61,
        J62,
        J63,
        J64,
        J65,
        J66,
        J67,
        J68,
        J69,
        J70,
        J71,
        J72,
        J73,
        J74,
        J75,
        J76,
        J78,
        J79,
        J81,
        J82,
        J83,
        J84,
        J85,
        J87,
        J90,
        J91,
        J92,
        J93,
        J95,
        J96,
        J97,
        J98,
        J99,
        JE,
        JK,
        JM,
        JNT,
        JOU,
        JPS,
        JWL,
        K1,
        K10,
        K11,
        K12,
        K13,
        K14,
        K15,
        K16,
        K17,
        K18,
        K19,
        K2,
        K20,
        K21,
        K22,
        K23,
        K26,
        K27,
        K28,
        K3,
        K30,
        K31,
        K32,
        K33,
        K34,
        K35,
        K36,
        K37,
        K38,
        K39,
        K40,
        K41,
        K42,
        K43,
        K45,
        K46,
        K47,
        K48,
        K49,
        K50,
        K51,
        K52,
        K53,
        K54,
        K55,
        K58,
        K59,
        K6,
        K60,
        K61,
        K62,
        K63,
        K64,
        K65,
        K66,
        K67,
        K68,
        K69,
        K70,
        K71,
        K73,
        K74,
        K75,
        K76,
        K77,
        K78,
        K79,
        K80,
        K81,
        K82,
        K83,
        K84,
        K85,
        K86,
        K87,
        K88,
        K89,
        K90,
        K91,
        K92,
        K93,
        K94,
        K95,
        K96,
        K97,
        K98,
        K99,
        KA,
        KAT,
        KB,
        KBA,
        KCC,
        KDW,
        KEL,
        KGS,
        KHY,
        KHZ,
        KI,
        KIC,
        KIP,
        KJ,
        KJO,
        KL,
        KLK,
        KLX,
        KMA,
        KMH,
        KMQ,
        KNI,
        KNM,
        KNS,
        KNT,
        KO,
        KPA,
        KPH,
        KPO,
        KPP,
        KR,
        KSD,
        KSH,
        KT,
        KTN,
        KUR,
        KVA,
        KVR,
        KVT,
        KW,
        KWH,
        KWN,
        KWO,
        KWS,
        KWT,
        KWY,
        KX,
        L10,
        L11,
        L12,
        L13,
        L14,
        L15,
        L16,
        L17,
        L18,
        L19,
        L2,
        L20,
        L21,
        L23,
        L24,
        L25,
        L26,
        L27,
        L28,
        L29,
        L30,
        L31,
        L32,
        L33,
        L34,
        L35,
        L36,
        L37,
        L38,
        L39,
        L40,
        L41,
        L42,
        L43,
        L44,
        L45,
        L46,
        L47,
        L48,
        L49,
        L50,
        L51,
        L52,
        L53,
        L54,
        L55,
        L56,
        L57,
        L58,
        L59,
        L60,
        L63,
        L64,
        L65,
        L66,
        L67,
        L68,
        L69,
        L70,
        L71,
        L72,
        L73,
        L74,
        L75,
        L76,
        L77,
        L78,
        L79,
        L80,
        L81,
        L82,
        L83,
        L84,
        L85,
        L86,
        L87,
        L88,
        L89,
        L90,
        L91,
        L92,
        L93,
        L94,
        L95,
        L96,
        L98,
        L99,
        LA,
        LAC,
        LBT,
        LD,
        LEF,
        LF,
        LH,
        LK,
        LM,
        LN,
        LO,
        LP,
        LPA,
        LR,
        LS,
        LTN,
        LUB,
        LUM,
        LUX,
        LY,
        M1,
        M10,
        M11,
        M12,
        M13,
        M14,
        M15,
        M16,
        M17,
        M18,
        M19,
        M20,
        M21,
        M22,
        M23,
        M24,
        M25,
        M26,
        M27,
        M29,
        M30,
        M31,
        M32,
        M33,
        M34,
        M35,
        M36,
        M37,
        M38,
        M39,
        M4,
        M40,
        M41,
        M42,
        M43,
        M44,
        M45,
        M46,
        M47,
        M48,
        M49,
        M5,
        M50,
        M51,
        M52,
        M53,
        M55,
        M56,
        M57,
        M58,
        M59,
        M60,
        M61,
        M62,
        M63,
        M64,
        M65,
        M66,
        M67,
        M68,
        M69,
        M7,
        M70,
        M71,
        M72,
        M73,
        M74,
        M75,
        M76,
        M77,
        M78,
        M79,
        M80,
        M81,
        M82,
        M83,
        M84,
        M85,
        M86,
        M87,
        M88,
        M89,
        M9,
        M90,
        M91,
        M92,
        M93,
        M94,
        M95,
        M96,
        M97,
        M98,
        M99,
        MAH,
        MAL,
        MAM,
        MAR,
        MAW,
        MBE,
        MBF,
        MBR,
        MC,
        MCU,
        MD,
        MGM,
        MHZ,
        MIK,
        MIL,
        MIO,
        MIU,
        MKD,
        MKM,
        MKW,
        MLD,
        MMQ,
        MND,
        MNJ,
        MPA,
        MQD,
        MQH,
        MQM,
        MQS,
        MQW,
        MRD,
        MRM,
        MRW,
        MSK,
        MTS,
        MTZ,
        MVA,
        MWH,
        N1,
        N10,
        N11,
        N12,
        N13,
        N14,
        N15,
        N16,
        N17,
        N18,
        N19,
        N20,
        N21,
        N22,
        N23,
        N24,
        N25,
        N26,
        N27,
        N28,
        N29,
        N3,
        N30,
        N31,
        N32,
        N33,
        N34,
        N35,
        N36,
        N37,
        N38,
        N39,
        N40,
        N41,
        N42,
        N43,
        N44,
        N45,
        N46,
        N47,
        N48,
        N49,
        N50,
        N51,
        N52,
        N53,
        N54,
        N55,
        N56,
        N57,
        N58,
        N59,
        N60,
        N61,
        N62,
        N63,
        N64,
        N65,
        N66,
        N67,
        N68,
        N69,
        N70,
        N71,
        N72,
        N73,
        N74,
        N75,
        N76,
        N77,
        N78,
        N79,
        N80,
        N81,
        N82,
        N83,
        N84,
        N85,
        N86,
        N87,
        N88,
        N89,
        N90,
        N91,
        N92,
        N93,
        N94,
        N95,
        N96,
        N97,
        N98,
        N99,
        NA,
        NCL,
        NEW,
        NF,
        NIL,
        NIU,
        NL,
        NM3,
        NMI,
        NMP,
        NPT,
        NT,
        NTU,
        NU,
        NX,
        OA,
        ODE,
        ODG,
        ODK,
        ODM,
        OHM,
        ON,
        OPM,
        OT,
        OZA,
        OZI,
        P1,
        P10,
        P11,
        P12,
        P13,
        P14,
        P15,
        P16,
        P17,
        P18,
        P19,
        P2,
        P20,
        P21,
        P22,
        P23,
        P24,
        P25,
        P26,
        P27,
        P28,
        P29,
        P30,
        P31,
        P32,
        P33,
        P34,
        P35,
        P36,
        P37,
        P38,
        P39,
        P40,
        P41,
        P42,
        P43,
        P44,
        P45,
        P46,
        P47,
        P48,
        P49,
        P5,
        P50,
        P51,
        P52,
        P53,
        P54,
        P55,
        P56,
        P57,
        P58,
        P59,
        P60,
        P61,
        P62,
        P63,
        P64,
        P65,
        P66,
        P67,
        P68,
        P69,
        P70,
        P71,
        P72,
        P73,
        P74,
        P75,
        P76,
        P77,
        P78,
        P79,
        P80,
        P81,
        P82,
        P83,
        P84,
        P85,
        P86,
        P87,
        P88,
        P89,
        P90,
        P91,
        P92,
        P93,
        P94,
        P95,
        P96,
        P97,
        P98,
        P99,
        PAL,
        PD,
        PFL,
        PGL,
        PI,
        PLA,
        PO,
        PQ,
        PR,
        PS,
        PTD,
        PTI,
        PTL,
        PTN,
        Q10,
        Q11,
        Q12,
        Q13,
        Q14,
        Q15,
        Q16,
        Q17,
        Q18,
        Q19,
        Q20,
        Q21,
        Q22,
        Q23,
        Q24,
        Q25,
        Q26,
        Q27,
        Q28,
        Q29,
        Q3,
        Q30,
        Q31,
        Q32,
        Q33,
        Q34,
        Q35,
        Q36,
        Q37,
        Q38,
        Q39,
        Q40,
        Q41,
        Q42,
        QA,
        QAN,
        QB,
        QR,
        QTD,
        QTI,
        QTL,
        QTR,
        R1,
        R9,
        RH,
        RM,
        ROM,
        RP,
        RPM,
        RPS,
        RT,
        S3,
        S4,
        SAN,
        SCO,
        SCR,
        SET,
        SG,
        SIE,
        SM3,
        SQ,
        SQR,
        SR,
        STC,
        STI,
        STK,
        STL,
        STN,
        STW,
        SW,
        SX,
        SYR,
        T0,
        T3,
        TAH,
        TAN,
        TI,
        TIC,
        TIP,
        TKM,
        TMS,
        TP,
        TPI,
        TPR,
        TQD,
        TRL,
        TST,
        TTS,
        U1,
        U2,
        UB,
        UC,
        VA,
        VP,
        W2,
        WA,
        WB,
        WCD,
        WE,
        WEB,
        WEE,
        WG,
        WHR,
        WM,
        WSD,
        X1,
        Z11,
        Z9,
        ZP,
        X1A,
        X1B,
        X1D,
        X1F,
        X1G,
        X1W,
        X2C,
        X3A,
        X3H,
        X43,
        X44,
        X4A,
        X4B,
        X4C,
        X4D,
        X4F,
        X4G,
        X4H,
        X5H,
        X5L,
        X5M,
        X6H,
        X6P,
        X7A,
        X7B,
        X8A,
        X8B,
        X8C,
        XIZ,
        XKG,
        XKI,
        XNS,
        XNT,
        XNU,
        XNV,
        XO1,
        XO2,
        XO3,
        XO4,
        XO5,
        XO6,
        XO7,
        XO8,
        XO9,
        XT1,
        /**
         * An enum member indicating that [UnitOfMeasureCode] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value = VALUE_BY_CODE[this] ?: Value._UNKNOWN

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws EInvoiceInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        KNOWN_BY_CODE[this]
            ?: throw EInvoiceInvalidDataException("Unknown UnitOfMeasureCode: $value")

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws EInvoiceInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { EInvoiceInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws EInvoiceInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UnitOfMeasureCode = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnitOfMeasureCode && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
