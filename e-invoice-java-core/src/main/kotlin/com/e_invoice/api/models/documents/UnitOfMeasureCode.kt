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

        @JvmField val PCE = of("PCE")

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

        @JvmStatic fun of(value: String) = UnitOfMeasureCode(JsonField.of(value))
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
        PCE,
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
        PCE,
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
    fun value(): Value =
        when (this) {
            _10 -> Value._10
            _11 -> Value._11
            _13 -> Value._13
            _14 -> Value._14
            _15 -> Value._15
            _20 -> Value._20
            _21 -> Value._21
            _22 -> Value._22
            _23 -> Value._23
            _24 -> Value._24
            _25 -> Value._25
            _27 -> Value._27
            _28 -> Value._28
            _33 -> Value._33
            _34 -> Value._34
            _35 -> Value._35
            _37 -> Value._37
            _38 -> Value._38
            _40 -> Value._40
            _41 -> Value._41
            _56 -> Value._56
            _57 -> Value._57
            _58 -> Value._58
            _59 -> Value._59
            _60 -> Value._60
            _61 -> Value._61
            _74 -> Value._74
            _77 -> Value._77
            _80 -> Value._80
            _81 -> Value._81
            _85 -> Value._85
            _87 -> Value._87
            _89 -> Value._89
            _91 -> Value._91
            _1_I -> Value._1_I
            EA -> Value.EA
            E01 -> Value.E01
            E07 -> Value.E07
            E09 -> Value.E09
            E10 -> Value.E10
            E12 -> Value.E12
            E14 -> Value.E14
            E17 -> Value.E17
            E20 -> Value.E20
            E23 -> Value.E23
            E25 -> Value.E25
            E27 -> Value.E27
            E31 -> Value.E31
            E34 -> Value.E34
            E35 -> Value.E35
            E36 -> Value.E36
            E37 -> Value.E37
            E38 -> Value.E38
            E39 -> Value.E39
            E40 -> Value.E40
            E41 -> Value.E41
            E42 -> Value.E42
            E43 -> Value.E43
            E44 -> Value.E44
            E45 -> Value.E45
            E46 -> Value.E46
            E47 -> Value.E47
            E48 -> Value.E48
            E49 -> Value.E49
            E50 -> Value.E50
            E51 -> Value.E51
            E52 -> Value.E52
            E53 -> Value.E53
            E54 -> Value.E54
            E55 -> Value.E55
            E56 -> Value.E56
            E57 -> Value.E57
            E58 -> Value.E58
            E60 -> Value.E60
            E62 -> Value.E62
            E65 -> Value.E65
            E66 -> Value.E66
            E67 -> Value.E67
            E69 -> Value.E69
            E70 -> Value.E70
            E71 -> Value.E71
            E73 -> Value.E73
            E75 -> Value.E75
            E76 -> Value.E76
            _2_A -> Value._2_A
            _2_B -> Value._2_B
            _2_C -> Value._2_C
            _2_G -> Value._2_G
            _2_H -> Value._2_H
            _2_I -> Value._2_I
            _2_J -> Value._2_J
            _2_K -> Value._2_K
            _2_L -> Value._2_L
            _2_M -> Value._2_M
            _2_N -> Value._2_N
            _2_P -> Value._2_P
            _2_Q -> Value._2_Q
            _2_R -> Value._2_R
            _2_U -> Value._2_U
            _2_X -> Value._2_X
            _2_Y -> Value._2_Y
            _2_Z -> Value._2_Z
            _3_B -> Value._3_B
            _3_C -> Value._3_C
            _4_C -> Value._4_C
            _4_G -> Value._4_G
            _4_H -> Value._4_H
            _4_K -> Value._4_K
            _4_L -> Value._4_L
            _4_M -> Value._4_M
            _4_N -> Value._4_N
            _4_O -> Value._4_O
            _4_P -> Value._4_P
            _4_Q -> Value._4_Q
            _4_R -> Value._4_R
            _4_T -> Value._4_T
            _4_U -> Value._4_U
            _4_W -> Value._4_W
            _4_X -> Value._4_X
            _5_A -> Value._5_A
            _5_B -> Value._5_B
            _5_E -> Value._5_E
            _5_J -> Value._5_J
            A10 -> Value.A10
            A11 -> Value.A11
            A12 -> Value.A12
            A13 -> Value.A13
            A14 -> Value.A14
            A15 -> Value.A15
            A16 -> Value.A16
            A17 -> Value.A17
            A18 -> Value.A18
            A19 -> Value.A19
            A2 -> Value.A2
            A20 -> Value.A20
            A21 -> Value.A21
            A22 -> Value.A22
            A23 -> Value.A23
            A24 -> Value.A24
            A26 -> Value.A26
            A27 -> Value.A27
            A28 -> Value.A28
            A29 -> Value.A29
            A3 -> Value.A3
            A30 -> Value.A30
            A31 -> Value.A31
            A32 -> Value.A32
            A33 -> Value.A33
            A34 -> Value.A34
            A35 -> Value.A35
            A36 -> Value.A36
            A37 -> Value.A37
            A38 -> Value.A38
            A39 -> Value.A39
            A4 -> Value.A4
            A40 -> Value.A40
            A41 -> Value.A41
            A42 -> Value.A42
            A43 -> Value.A43
            A44 -> Value.A44
            A45 -> Value.A45
            A46 -> Value.A46
            A47 -> Value.A47
            A48 -> Value.A48
            A49 -> Value.A49
            A5 -> Value.A5
            A50 -> Value.A50
            A51 -> Value.A51
            A52 -> Value.A52
            A53 -> Value.A53
            A54 -> Value.A54
            A55 -> Value.A55
            A56 -> Value.A56
            A57 -> Value.A57
            A58 -> Value.A58
            A59 -> Value.A59
            A6 -> Value.A6
            A60 -> Value.A60
            A61 -> Value.A61
            A62 -> Value.A62
            A63 -> Value.A63
            A64 -> Value.A64
            A65 -> Value.A65
            A66 -> Value.A66
            A67 -> Value.A67
            A68 -> Value.A68
            A69 -> Value.A69
            A7 -> Value.A7
            A70 -> Value.A70
            A71 -> Value.A71
            A72 -> Value.A72
            A73 -> Value.A73
            A74 -> Value.A74
            A75 -> Value.A75
            A76 -> Value.A76
            A77 -> Value.A77
            A78 -> Value.A78
            A79 -> Value.A79
            A8 -> Value.A8
            A80 -> Value.A80
            A81 -> Value.A81
            A82 -> Value.A82
            A83 -> Value.A83
            A84 -> Value.A84
            A85 -> Value.A85
            A86 -> Value.A86
            A87 -> Value.A87
            A88 -> Value.A88
            A89 -> Value.A89
            A9 -> Value.A9
            A90 -> Value.A90
            A91 -> Value.A91
            A92 -> Value.A92
            A93 -> Value.A93
            A94 -> Value.A94
            A95 -> Value.A95
            A96 -> Value.A96
            A97 -> Value.A97
            A98 -> Value.A98
            A99 -> Value.A99
            ACR -> Value.ACR
            AH -> Value.AH
            AI -> Value.AI
            AK -> Value.AK
            AMH -> Value.AMH
            AMT -> Value.AMT
            ANN -> Value.ANN
            B1 -> Value.B1
            B11 -> Value.B11
            B12 -> Value.B12
            B13 -> Value.B13
            B14 -> Value.B14
            B15 -> Value.B15
            B16 -> Value.B16
            B17 -> Value.B17
            B18 -> Value.B18
            B19 -> Value.B19
            B20 -> Value.B20
            B21 -> Value.B21
            B22 -> Value.B22
            B23 -> Value.B23
            B24 -> Value.B24
            B25 -> Value.B25
            B26 -> Value.B26
            B27 -> Value.B27
            B28 -> Value.B28
            B29 -> Value.B29
            B3 -> Value.B3
            B30 -> Value.B30
            B31 -> Value.B31
            B32 -> Value.B32
            B33 -> Value.B33
            B34 -> Value.B34
            B35 -> Value.B35
            B36 -> Value.B36
            B37 -> Value.B37
            B38 -> Value.B38
            B39 -> Value.B39
            B4 -> Value.B4
            B40 -> Value.B40
            B41 -> Value.B41
            B42 -> Value.B42
            B43 -> Value.B43
            B44 -> Value.B44
            B45 -> Value.B45
            B46 -> Value.B46
            B47 -> Value.B47
            B48 -> Value.B48
            B49 -> Value.B49
            B5 -> Value.B5
            B50 -> Value.B50
            B52 -> Value.B52
            B53 -> Value.B53
            B54 -> Value.B54
            B55 -> Value.B55
            B56 -> Value.B56
            B57 -> Value.B57
            B58 -> Value.B58
            B59 -> Value.B59
            B6 -> Value.B6
            B60 -> Value.B60
            B61 -> Value.B61
            B62 -> Value.B62
            B63 -> Value.B63
            B64 -> Value.B64
            B65 -> Value.B65
            B66 -> Value.B66
            B67 -> Value.B67
            B68 -> Value.B68
            B69 -> Value.B69
            B7 -> Value.B7
            B70 -> Value.B70
            B71 -> Value.B71
            B72 -> Value.B72
            B73 -> Value.B73
            B74 -> Value.B74
            B75 -> Value.B75
            B76 -> Value.B76
            B77 -> Value.B77
            B78 -> Value.B78
            B79 -> Value.B79
            B8 -> Value.B8
            B80 -> Value.B80
            B81 -> Value.B81
            B82 -> Value.B82
            B83 -> Value.B83
            B84 -> Value.B84
            B85 -> Value.B85
            B86 -> Value.B86
            B87 -> Value.B87
            B88 -> Value.B88
            B89 -> Value.B89
            B9 -> Value.B9
            B90 -> Value.B90
            B91 -> Value.B91
            B92 -> Value.B92
            B93 -> Value.B93
            B94 -> Value.B94
            B95 -> Value.B95
            B96 -> Value.B96
            B97 -> Value.B97
            B98 -> Value.B98
            B99 -> Value.B99
            BAR -> Value.BAR
            BB -> Value.BB
            BFT -> Value.BFT
            BHP -> Value.BHP
            BIL -> Value.BIL
            BLD -> Value.BLD
            BLL -> Value.BLL
            BUA -> Value.BUA
            BUI -> Value.BUI
            C0 -> Value.C0
            C10 -> Value.C10
            C11 -> Value.C11
            C12 -> Value.C12
            C13 -> Value.C13
            C14 -> Value.C14
            C15 -> Value.C15
            C16 -> Value.C16
            C17 -> Value.C17
            C18 -> Value.C18
            C19 -> Value.C19
            C20 -> Value.C20
            C21 -> Value.C21
            C22 -> Value.C22
            C23 -> Value.C23
            C24 -> Value.C24
            C25 -> Value.C25
            C26 -> Value.C26
            C27 -> Value.C27
            C28 -> Value.C28
            C29 -> Value.C29
            C30 -> Value.C30
            C31 -> Value.C31
            C32 -> Value.C32
            C33 -> Value.C33
            C34 -> Value.C34
            C35 -> Value.C35
            C36 -> Value.C36
            C37 -> Value.C37
            C38 -> Value.C38
            C39 -> Value.C39
            C40 -> Value.C40
            C41 -> Value.C41
            C42 -> Value.C42
            C43 -> Value.C43
            C44 -> Value.C44
            C45 -> Value.C45
            C46 -> Value.C46
            C47 -> Value.C47
            C48 -> Value.C48
            C49 -> Value.C49
            C50 -> Value.C50
            C51 -> Value.C51
            C52 -> Value.C52
            C53 -> Value.C53
            C54 -> Value.C54
            C55 -> Value.C55
            C56 -> Value.C56
            C57 -> Value.C57
            C58 -> Value.C58
            C59 -> Value.C59
            C60 -> Value.C60
            C61 -> Value.C61
            C63 -> Value.C63
            C64 -> Value.C64
            C65 -> Value.C65
            C66 -> Value.C66
            C67 -> Value.C67
            C68 -> Value.C68
            C69 -> Value.C69
            C70 -> Value.C70
            C71 -> Value.C71
            C72 -> Value.C72
            C73 -> Value.C73
            C74 -> Value.C74
            C75 -> Value.C75
            C76 -> Value.C76
            C77 -> Value.C77
            C78 -> Value.C78
            C79 -> Value.C79
            C80 -> Value.C80
            C81 -> Value.C81
            C82 -> Value.C82
            C83 -> Value.C83
            C84 -> Value.C84
            C85 -> Value.C85
            C86 -> Value.C86
            C87 -> Value.C87
            C88 -> Value.C88
            C89 -> Value.C89
            C90 -> Value.C90
            C91 -> Value.C91
            C92 -> Value.C92
            C93 -> Value.C93
            C94 -> Value.C94
            C95 -> Value.C95
            C96 -> Value.C96
            C97 -> Value.C97
            C98 -> Value.C98
            C99 -> Value.C99
            CDL -> Value.CDL
            CEL -> Value.CEL
            CHU -> Value.CHU
            CIU -> Value.CIU
            CLT -> Value.CLT
            CMK -> Value.CMK
            CMQ -> Value.CMQ
            CMT -> Value.CMT
            CNP -> Value.CNP
            CNT -> Value.CNT
            COU -> Value.COU
            CTG -> Value.CTG
            CTN -> Value.CTN
            CUR -> Value.CUR
            CWA -> Value.CWA
            CWI -> Value.CWI
            DAN -> Value.DAN
            DAY -> Value.DAY
            DB -> Value.DB
            DD -> Value.DD
            DG -> Value.DG
            DI -> Value.DI
            DLT -> Value.DLT
            DMK -> Value.DMK
            DMQ -> Value.DMQ
            DMT -> Value.DMT
            DPC -> Value.DPC
            DPT -> Value.DPT
            DRA -> Value.DRA
            DZN -> Value.DZN
            DZP -> Value.DZP
            FOT -> Value.FOT
            GLL -> Value.GLL
            GLI -> Value.GLI
            GRM -> Value.GRM
            GRO -> Value.GRO
            HUR -> Value.HUR
            HTZ -> Value.HTZ
            INH -> Value.INH
            KGM -> Value.KGM
            KMT -> Value.KMT
            MTR -> Value.MTR
            SMI -> Value.SMI
            MIN -> Value.MIN
            MON -> Value.MON
            ONZ -> Value.ONZ
            PCE -> Value.PCE
            LBR -> Value.LBR
            QT -> Value.QT
            SEC -> Value.SEC
            FTK -> Value.FTK
            INK -> Value.INK
            MTK -> Value.MTK
            YDK -> Value.YDK
            TNE -> Value.TNE
            VLT -> Value.VLT
            WTT -> Value.WTT
            YRD -> Value.YRD
            FTQ -> Value.FTQ
            INQ -> Value.INQ
            MTQ -> Value.MTQ
            YDQ -> Value.YDQ
            HAR -> Value.HAR
            KLT -> Value.KLT
            MLT -> Value.MLT
            MMT -> Value.MMT
            KMK -> Value.KMK
            MMK -> Value.MMK
            XAA -> Value.XAA
            XAB -> Value.XAB
            XAC -> Value.XAC
            XAD -> Value.XAD
            XAE -> Value.XAE
            XAF -> Value.XAF
            XAG -> Value.XAG
            XAH -> Value.XAH
            XAI -> Value.XAI
            XAJ -> Value.XAJ
            XAL -> Value.XAL
            XAM -> Value.XAM
            XAP -> Value.XAP
            XAT -> Value.XAT
            XAV -> Value.XAV
            XB4 -> Value.XB4
            XBA -> Value.XBA
            XBB -> Value.XBB
            XBC -> Value.XBC
            XBD -> Value.XBD
            XBE -> Value.XBE
            XBF -> Value.XBF
            XBG -> Value.XBG
            XBH -> Value.XBH
            XBI -> Value.XBI
            XBJ -> Value.XBJ
            XBK -> Value.XBK
            XBL -> Value.XBL
            XBM -> Value.XBM
            XBN -> Value.XBN
            XBO -> Value.XBO
            XBP -> Value.XBP
            XBQ -> Value.XBQ
            XBR -> Value.XBR
            XBS -> Value.XBS
            XBT -> Value.XBT
            XBU -> Value.XBU
            XBV -> Value.XBV
            XBW -> Value.XBW
            XBX -> Value.XBX
            XBY -> Value.XBY
            XBZ -> Value.XBZ
            XCA -> Value.XCA
            XCB -> Value.XCB
            XCC -> Value.XCC
            XCD -> Value.XCD
            XCE -> Value.XCE
            XCF -> Value.XCF
            XCG -> Value.XCG
            XCH -> Value.XCH
            XCI -> Value.XCI
            XCJ -> Value.XCJ
            XCK -> Value.XCK
            XCL -> Value.XCL
            XCM -> Value.XCM
            XCN -> Value.XCN
            XCO -> Value.XCO
            XCP -> Value.XCP
            XCQ -> Value.XCQ
            XCR -> Value.XCR
            XCS -> Value.XCS
            XCT -> Value.XCT
            XCU -> Value.XCU
            XCV -> Value.XCV
            XCW -> Value.XCW
            XCX -> Value.XCX
            XCY -> Value.XCY
            XCZ -> Value.XCZ
            XDA -> Value.XDA
            XDB -> Value.XDB
            XDC -> Value.XDC
            XDD -> Value.XDD
            XDE -> Value.XDE
            XDF -> Value.XDF
            XDG -> Value.XDG
            XDH -> Value.XDH
            XDI -> Value.XDI
            XDJ -> Value.XDJ
            XDK -> Value.XDK
            XDL -> Value.XDL
            XDM -> Value.XDM
            XDN -> Value.XDN
            XDP -> Value.XDP
            XDQ -> Value.XDQ
            XDR -> Value.XDR
            XDS -> Value.XDS
            XDT -> Value.XDT
            XDU -> Value.XDU
            XDV -> Value.XDV
            XDW -> Value.XDW
            XDX -> Value.XDX
            XDY -> Value.XDY
            XDZ -> Value.XDZ
            XEA -> Value.XEA
            XEB -> Value.XEB
            XEC -> Value.XEC
            XED -> Value.XED
            XEE -> Value.XEE
            XEF -> Value.XEF
            XEG -> Value.XEG
            XEH -> Value.XEH
            XEI -> Value.XEI
            XEJ -> Value.XEJ
            XEK -> Value.XEK
            XEL -> Value.XEL
            XEM -> Value.XEM
            XEN -> Value.XEN
            XEP -> Value.XEP
            XEQ -> Value.XEQ
            XER -> Value.XER
            XES -> Value.XES
            XET -> Value.XET
            XEU -> Value.XEU
            XEV -> Value.XEV
            XEW -> Value.XEW
            XEX -> Value.XEX
            XEY -> Value.XEY
            XFB -> Value.XFB
            XFC -> Value.XFC
            XFD -> Value.XFD
            XFE -> Value.XFE
            XFF -> Value.XFF
            XFG -> Value.XFG
            XFH -> Value.XFH
            XFI -> Value.XFI
            XFJ -> Value.XFJ
            XFK -> Value.XFK
            XFL -> Value.XFL
            XFM -> Value.XFM
            XFN -> Value.XFN
            XFO -> Value.XFO
            XFP -> Value.XFP
            XFQ -> Value.XFQ
            XFR -> Value.XFR
            XFS -> Value.XFS
            XFT -> Value.XFT
            XFU -> Value.XFU
            XFV -> Value.XFV
            XFW -> Value.XFW
            XFX -> Value.XFX
            XFY -> Value.XFY
            XFZ -> Value.XFZ
            XGA -> Value.XGA
            XGB -> Value.XGB
            XGC -> Value.XGC
            XGD -> Value.XGD
            XGE -> Value.XGE
            XGF -> Value.XGF
            XGG -> Value.XGG
            XGH -> Value.XGH
            XGI -> Value.XGI
            XGJ -> Value.XGJ
            XGK -> Value.XGK
            XGL -> Value.XGL
            XGM -> Value.XGM
            XGN -> Value.XGN
            XGO -> Value.XGO
            XGP -> Value.XGP
            XGQ -> Value.XGQ
            XGR -> Value.XGR
            XGS -> Value.XGS
            XGT -> Value.XGT
            XGU -> Value.XGU
            XGV -> Value.XGV
            XGW -> Value.XGW
            XGX -> Value.XGX
            XGY -> Value.XGY
            XGZ -> Value.XGZ
            XHA -> Value.XHA
            XHB -> Value.XHB
            XHC -> Value.XHC
            XHD -> Value.XHD
            XHE -> Value.XHE
            XHF -> Value.XHF
            XHG -> Value.XHG
            XHH -> Value.XHH
            XHI -> Value.XHI
            XHJ -> Value.XHJ
            XHK -> Value.XHK
            XHL -> Value.XHL
            XHM -> Value.XHM
            XHN -> Value.XHN
            XHP -> Value.XHP
            XHQ -> Value.XHQ
            XHR -> Value.XHR
            XHS -> Value.XHS
            XHT -> Value.XHT
            XHU -> Value.XHU
            XHV -> Value.XHV
            XHW -> Value.XHW
            XHX -> Value.XHX
            XHY -> Value.XHY
            XHZ -> Value.XHZ
            XIA -> Value.XIA
            XIB -> Value.XIB
            XIC -> Value.XIC
            XID -> Value.XID
            XIE -> Value.XIE
            XIF -> Value.XIF
            XIG -> Value.XIG
            XIH -> Value.XIH
            XII -> Value.XII
            XIJ -> Value.XIJ
            XIK -> Value.XIK
            XIL -> Value.XIL
            XIM -> Value.XIM
            XIN -> Value.XIN
            XIO -> Value.XIO
            XJA -> Value.XJA
            XJB -> Value.XJB
            XJC -> Value.XJC
            XJD -> Value.XJD
            XJE -> Value.XJE
            XJF -> Value.XJF
            XJG -> Value.XJG
            XJH -> Value.XJH
            XJI -> Value.XJI
            XJJ -> Value.XJJ
            XJK -> Value.XJK
            XJL -> Value.XJL
            XJM -> Value.XJM
            XJN -> Value.XJN
            XJO -> Value.XJO
            XJP -> Value.XJP
            XJQ -> Value.XJQ
            XJR -> Value.XJR
            XJS -> Value.XJS
            XJT -> Value.XJT
            XJU -> Value.XJU
            XJV -> Value.XJV
            XJW -> Value.XJW
            XJX -> Value.XJX
            XJY -> Value.XJY
            XJZ -> Value.XJZ
            XLA -> Value.XLA
            XLB -> Value.XLB
            XLC -> Value.XLC
            XLD -> Value.XLD
            XLE -> Value.XLE
            XLF -> Value.XLF
            XLG -> Value.XLG
            XLH -> Value.XLH
            XLI -> Value.XLI
            XLJ -> Value.XLJ
            XLK -> Value.XLK
            XLL -> Value.XLL
            XLM -> Value.XLM
            XLN -> Value.XLN
            XLO -> Value.XLO
            XLP -> Value.XLP
            XLQ -> Value.XLQ
            XLR -> Value.XLR
            XLS -> Value.XLS
            XLT -> Value.XLT
            XLU -> Value.XLU
            XLV -> Value.XLV
            XLW -> Value.XLW
            XLX -> Value.XLX
            XLY -> Value.XLY
            XLZ -> Value.XLZ
            XMA -> Value.XMA
            XMB -> Value.XMB
            XMC -> Value.XMC
            XMD -> Value.XMD
            XME -> Value.XME
            XMF -> Value.XMF
            XMG -> Value.XMG
            XMH -> Value.XMH
            XMI -> Value.XMI
            XMJ -> Value.XMJ
            XMK -> Value.XMK
            XML -> Value.XML
            XMM -> Value.XMM
            XMN -> Value.XMN
            XMO -> Value.XMO
            XMP -> Value.XMP
            XMQ -> Value.XMQ
            XMR -> Value.XMR
            XMS -> Value.XMS
            XMT -> Value.XMT
            XMU -> Value.XMU
            XMV -> Value.XMV
            XMW -> Value.XMW
            XMX -> Value.XMX
            XMY -> Value.XMY
            XMZ -> Value.XMZ
            XNA -> Value.XNA
            XNB -> Value.XNB
            XNC -> Value.XNC
            XND -> Value.XND
            XNE -> Value.XNE
            XNF -> Value.XNF
            XNG -> Value.XNG
            XNH -> Value.XNH
            XNI -> Value.XNI
            XNJ -> Value.XNJ
            XNK -> Value.XNK
            XNL -> Value.XNL
            XNM -> Value.XNM
            XOA -> Value.XOA
            XOB -> Value.XOB
            XOC -> Value.XOC
            XOD -> Value.XOD
            XOE -> Value.XOE
            XOF -> Value.XOF
            XOG -> Value.XOG
            XOH -> Value.XOH
            XOI -> Value.XOI
            XOJ -> Value.XOJ
            XOK -> Value.XOK
            XOL -> Value.XOL
            XOM -> Value.XOM
            XON -> Value.XON
            XOO -> Value.XOO
            XOP -> Value.XOP
            XOQ -> Value.XOQ
            XOR -> Value.XOR
            XOS -> Value.XOS
            XOT -> Value.XOT
            XOU -> Value.XOU
            XOV -> Value.XOV
            XOW -> Value.XOW
            XOX -> Value.XOX
            XOY -> Value.XOY
            XOZ -> Value.XOZ
            XP1 -> Value.XP1
            XP2 -> Value.XP2
            XP3 -> Value.XP3
            XP4 -> Value.XP4
            XPA -> Value.XPA
            XPB -> Value.XPB
            XPC -> Value.XPC
            XPD -> Value.XPD
            XPE -> Value.XPE
            XPF -> Value.XPF
            XPG -> Value.XPG
            XPH -> Value.XPH
            XPI -> Value.XPI
            XPJ -> Value.XPJ
            XPK -> Value.XPK
            XPL -> Value.XPL
            XPM -> Value.XPM
            XPN -> Value.XPN
            XPO -> Value.XPO
            XPP -> Value.XPP
            XPQ -> Value.XPQ
            XPR -> Value.XPR
            XPS -> Value.XPS
            XPT -> Value.XPT
            XPU -> Value.XPU
            XPV -> Value.XPV
            XPW -> Value.XPW
            XPX -> Value.XPX
            XPY -> Value.XPY
            XPZ -> Value.XPZ
            XQA -> Value.XQA
            XQB -> Value.XQB
            XQC -> Value.XQC
            XQD -> Value.XQD
            XQE -> Value.XQE
            XQF -> Value.XQF
            XQG -> Value.XQG
            XQH -> Value.XQH
            XQI -> Value.XQI
            XQJ -> Value.XQJ
            XQK -> Value.XQK
            XQL -> Value.XQL
            XQM -> Value.XQM
            XQN -> Value.XQN
            XQO -> Value.XQO
            XQP -> Value.XQP
            XQQ -> Value.XQQ
            XQR -> Value.XQR
            XQS -> Value.XQS
            XRD -> Value.XRD
            XRE -> Value.XRE
            XRF -> Value.XRF
            XRG -> Value.XRG
            XRH -> Value.XRH
            XRI -> Value.XRI
            XRJ -> Value.XRJ
            XRK -> Value.XRK
            XRL -> Value.XRL
            XRM -> Value.XRM
            XRN -> Value.XRN
            XRO -> Value.XRO
            XRP -> Value.XRP
            XRQ -> Value.XRQ
            XRR -> Value.XRR
            XRS -> Value.XRS
            XRT -> Value.XRT
            XRU -> Value.XRU
            XRV -> Value.XRV
            XRW -> Value.XRW
            XRX -> Value.XRX
            XRY -> Value.XRY
            XRZ -> Value.XRZ
            XSA -> Value.XSA
            XSB -> Value.XSB
            XSC -> Value.XSC
            XSD -> Value.XSD
            XSE -> Value.XSE
            XSF -> Value.XSF
            XSG -> Value.XSG
            XSH -> Value.XSH
            XSI -> Value.XSI
            XSJ -> Value.XSJ
            XSK -> Value.XSK
            XSL -> Value.XSL
            XSM -> Value.XSM
            XSN -> Value.XSN
            XSO -> Value.XSO
            XSP -> Value.XSP
            XSQ -> Value.XSQ
            XSR -> Value.XSR
            XSS -> Value.XSS
            XST -> Value.XST
            XSU -> Value.XSU
            XSV -> Value.XSV
            XSW -> Value.XSW
            XSX -> Value.XSX
            XSY -> Value.XSY
            XSZ -> Value.XSZ
            XTA -> Value.XTA
            XTB -> Value.XTB
            XTC -> Value.XTC
            XTD -> Value.XTD
            XTE -> Value.XTE
            XTF -> Value.XTF
            XTG -> Value.XTG
            XTI -> Value.XTI
            XTJ -> Value.XTJ
            XTK -> Value.XTK
            XTL -> Value.XTL
            XTM -> Value.XTM
            XTN -> Value.XTN
            XTO -> Value.XTO
            XTR -> Value.XTR
            XTS -> Value.XTS
            XTT -> Value.XTT
            XTU -> Value.XTU
            XTV -> Value.XTV
            XTW -> Value.XTW
            XTX -> Value.XTX
            XTY -> Value.XTY
            XTZ -> Value.XTZ
            XUC -> Value.XUC
            XUN -> Value.XUN
            XVA -> Value.XVA
            XVG -> Value.XVG
            XVI -> Value.XVI
            XVK -> Value.XVK
            XVL -> Value.XVL
            XVN -> Value.XVN
            XVO -> Value.XVO
            XVP -> Value.XVP
            XVQ -> Value.XVQ
            XVR -> Value.XVR
            XVS -> Value.XVS
            XVY -> Value.XVY
            XWA -> Value.XWA
            XWB -> Value.XWB
            XWC -> Value.XWC
            XWD -> Value.XWD
            XWF -> Value.XWF
            XWG -> Value.XWG
            XWH -> Value.XWH
            XWJ -> Value.XWJ
            XWK -> Value.XWK
            XWL -> Value.XWL
            XWM -> Value.XWM
            XWN -> Value.XWN
            XWP -> Value.XWP
            XWQ -> Value.XWQ
            XWR -> Value.XWR
            XWS -> Value.XWS
            XWT -> Value.XWT
            XWU -> Value.XWU
            XWV -> Value.XWV
            XWW -> Value.XWW
            XWX -> Value.XWX
            XWY -> Value.XWY
            XWZ -> Value.XWZ
            XXA -> Value.XXA
            XXB -> Value.XXB
            XXC -> Value.XXC
            XXD -> Value.XXD
            XXF -> Value.XXF
            XXG -> Value.XXG
            XXH -> Value.XXH
            XXJ -> Value.XXJ
            XXK -> Value.XXK
            XYA -> Value.XYA
            XYB -> Value.XYB
            XYC -> Value.XYC
            XYD -> Value.XYD
            XYF -> Value.XYF
            XYG -> Value.XYG
            XYH -> Value.XYH
            XYJ -> Value.XYJ
            XYK -> Value.XYK
            XYL -> Value.XYL
            XYM -> Value.XYM
            XYN -> Value.XYN
            XYP -> Value.XYP
            XYQ -> Value.XYQ
            XYR -> Value.XYR
            XYS -> Value.XYS
            XYT -> Value.XYT
            XYV -> Value.XYV
            XYW -> Value.XYW
            XYX -> Value.XYX
            XYY -> Value.XYY
            XYZ -> Value.XYZ
            XZA -> Value.XZA
            XZB -> Value.XZB
            XZC -> Value.XZC
            XZD -> Value.XZD
            XZF -> Value.XZF
            XZG -> Value.XZG
            XZH -> Value.XZH
            XZJ -> Value.XZJ
            XZK -> Value.XZK
            XZL -> Value.XZL
            XZM -> Value.XZM
            XZN -> Value.XZN
            XZP -> Value.XZP
            XZQ -> Value.XZQ
            XZR -> Value.XZR
            XZS -> Value.XZS
            XZT -> Value.XZT
            XZU -> Value.XZU
            XZV -> Value.XZV
            XZW -> Value.XZW
            XZX -> Value.XZX
            XZY -> Value.XZY
            XZZ -> Value.XZZ
            ZZ -> Value.ZZ
            NAR -> Value.NAR
            C62 -> Value.C62
            LTR -> Value.LTR
            H87 -> Value.H87
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws EInvoiceInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            _10 -> Known._10
            _11 -> Known._11
            _13 -> Known._13
            _14 -> Known._14
            _15 -> Known._15
            _20 -> Known._20
            _21 -> Known._21
            _22 -> Known._22
            _23 -> Known._23
            _24 -> Known._24
            _25 -> Known._25
            _27 -> Known._27
            _28 -> Known._28
            _33 -> Known._33
            _34 -> Known._34
            _35 -> Known._35
            _37 -> Known._37
            _38 -> Known._38
            _40 -> Known._40
            _41 -> Known._41
            _56 -> Known._56
            _57 -> Known._57
            _58 -> Known._58
            _59 -> Known._59
            _60 -> Known._60
            _61 -> Known._61
            _74 -> Known._74
            _77 -> Known._77
            _80 -> Known._80
            _81 -> Known._81
            _85 -> Known._85
            _87 -> Known._87
            _89 -> Known._89
            _91 -> Known._91
            _1_I -> Known._1_I
            EA -> Known.EA
            E01 -> Known.E01
            E07 -> Known.E07
            E09 -> Known.E09
            E10 -> Known.E10
            E12 -> Known.E12
            E14 -> Known.E14
            E17 -> Known.E17
            E20 -> Known.E20
            E23 -> Known.E23
            E25 -> Known.E25
            E27 -> Known.E27
            E31 -> Known.E31
            E34 -> Known.E34
            E35 -> Known.E35
            E36 -> Known.E36
            E37 -> Known.E37
            E38 -> Known.E38
            E39 -> Known.E39
            E40 -> Known.E40
            E41 -> Known.E41
            E42 -> Known.E42
            E43 -> Known.E43
            E44 -> Known.E44
            E45 -> Known.E45
            E46 -> Known.E46
            E47 -> Known.E47
            E48 -> Known.E48
            E49 -> Known.E49
            E50 -> Known.E50
            E51 -> Known.E51
            E52 -> Known.E52
            E53 -> Known.E53
            E54 -> Known.E54
            E55 -> Known.E55
            E56 -> Known.E56
            E57 -> Known.E57
            E58 -> Known.E58
            E60 -> Known.E60
            E62 -> Known.E62
            E65 -> Known.E65
            E66 -> Known.E66
            E67 -> Known.E67
            E69 -> Known.E69
            E70 -> Known.E70
            E71 -> Known.E71
            E73 -> Known.E73
            E75 -> Known.E75
            E76 -> Known.E76
            _2_A -> Known._2_A
            _2_B -> Known._2_B
            _2_C -> Known._2_C
            _2_G -> Known._2_G
            _2_H -> Known._2_H
            _2_I -> Known._2_I
            _2_J -> Known._2_J
            _2_K -> Known._2_K
            _2_L -> Known._2_L
            _2_M -> Known._2_M
            _2_N -> Known._2_N
            _2_P -> Known._2_P
            _2_Q -> Known._2_Q
            _2_R -> Known._2_R
            _2_U -> Known._2_U
            _2_X -> Known._2_X
            _2_Y -> Known._2_Y
            _2_Z -> Known._2_Z
            _3_B -> Known._3_B
            _3_C -> Known._3_C
            _4_C -> Known._4_C
            _4_G -> Known._4_G
            _4_H -> Known._4_H
            _4_K -> Known._4_K
            _4_L -> Known._4_L
            _4_M -> Known._4_M
            _4_N -> Known._4_N
            _4_O -> Known._4_O
            _4_P -> Known._4_P
            _4_Q -> Known._4_Q
            _4_R -> Known._4_R
            _4_T -> Known._4_T
            _4_U -> Known._4_U
            _4_W -> Known._4_W
            _4_X -> Known._4_X
            _5_A -> Known._5_A
            _5_B -> Known._5_B
            _5_E -> Known._5_E
            _5_J -> Known._5_J
            A10 -> Known.A10
            A11 -> Known.A11
            A12 -> Known.A12
            A13 -> Known.A13
            A14 -> Known.A14
            A15 -> Known.A15
            A16 -> Known.A16
            A17 -> Known.A17
            A18 -> Known.A18
            A19 -> Known.A19
            A2 -> Known.A2
            A20 -> Known.A20
            A21 -> Known.A21
            A22 -> Known.A22
            A23 -> Known.A23
            A24 -> Known.A24
            A26 -> Known.A26
            A27 -> Known.A27
            A28 -> Known.A28
            A29 -> Known.A29
            A3 -> Known.A3
            A30 -> Known.A30
            A31 -> Known.A31
            A32 -> Known.A32
            A33 -> Known.A33
            A34 -> Known.A34
            A35 -> Known.A35
            A36 -> Known.A36
            A37 -> Known.A37
            A38 -> Known.A38
            A39 -> Known.A39
            A4 -> Known.A4
            A40 -> Known.A40
            A41 -> Known.A41
            A42 -> Known.A42
            A43 -> Known.A43
            A44 -> Known.A44
            A45 -> Known.A45
            A46 -> Known.A46
            A47 -> Known.A47
            A48 -> Known.A48
            A49 -> Known.A49
            A5 -> Known.A5
            A50 -> Known.A50
            A51 -> Known.A51
            A52 -> Known.A52
            A53 -> Known.A53
            A54 -> Known.A54
            A55 -> Known.A55
            A56 -> Known.A56
            A57 -> Known.A57
            A58 -> Known.A58
            A59 -> Known.A59
            A6 -> Known.A6
            A60 -> Known.A60
            A61 -> Known.A61
            A62 -> Known.A62
            A63 -> Known.A63
            A64 -> Known.A64
            A65 -> Known.A65
            A66 -> Known.A66
            A67 -> Known.A67
            A68 -> Known.A68
            A69 -> Known.A69
            A7 -> Known.A7
            A70 -> Known.A70
            A71 -> Known.A71
            A72 -> Known.A72
            A73 -> Known.A73
            A74 -> Known.A74
            A75 -> Known.A75
            A76 -> Known.A76
            A77 -> Known.A77
            A78 -> Known.A78
            A79 -> Known.A79
            A8 -> Known.A8
            A80 -> Known.A80
            A81 -> Known.A81
            A82 -> Known.A82
            A83 -> Known.A83
            A84 -> Known.A84
            A85 -> Known.A85
            A86 -> Known.A86
            A87 -> Known.A87
            A88 -> Known.A88
            A89 -> Known.A89
            A9 -> Known.A9
            A90 -> Known.A90
            A91 -> Known.A91
            A92 -> Known.A92
            A93 -> Known.A93
            A94 -> Known.A94
            A95 -> Known.A95
            A96 -> Known.A96
            A97 -> Known.A97
            A98 -> Known.A98
            A99 -> Known.A99
            ACR -> Known.ACR
            AH -> Known.AH
            AI -> Known.AI
            AK -> Known.AK
            AMH -> Known.AMH
            AMT -> Known.AMT
            ANN -> Known.ANN
            B1 -> Known.B1
            B11 -> Known.B11
            B12 -> Known.B12
            B13 -> Known.B13
            B14 -> Known.B14
            B15 -> Known.B15
            B16 -> Known.B16
            B17 -> Known.B17
            B18 -> Known.B18
            B19 -> Known.B19
            B20 -> Known.B20
            B21 -> Known.B21
            B22 -> Known.B22
            B23 -> Known.B23
            B24 -> Known.B24
            B25 -> Known.B25
            B26 -> Known.B26
            B27 -> Known.B27
            B28 -> Known.B28
            B29 -> Known.B29
            B3 -> Known.B3
            B30 -> Known.B30
            B31 -> Known.B31
            B32 -> Known.B32
            B33 -> Known.B33
            B34 -> Known.B34
            B35 -> Known.B35
            B36 -> Known.B36
            B37 -> Known.B37
            B38 -> Known.B38
            B39 -> Known.B39
            B4 -> Known.B4
            B40 -> Known.B40
            B41 -> Known.B41
            B42 -> Known.B42
            B43 -> Known.B43
            B44 -> Known.B44
            B45 -> Known.B45
            B46 -> Known.B46
            B47 -> Known.B47
            B48 -> Known.B48
            B49 -> Known.B49
            B5 -> Known.B5
            B50 -> Known.B50
            B52 -> Known.B52
            B53 -> Known.B53
            B54 -> Known.B54
            B55 -> Known.B55
            B56 -> Known.B56
            B57 -> Known.B57
            B58 -> Known.B58
            B59 -> Known.B59
            B6 -> Known.B6
            B60 -> Known.B60
            B61 -> Known.B61
            B62 -> Known.B62
            B63 -> Known.B63
            B64 -> Known.B64
            B65 -> Known.B65
            B66 -> Known.B66
            B67 -> Known.B67
            B68 -> Known.B68
            B69 -> Known.B69
            B7 -> Known.B7
            B70 -> Known.B70
            B71 -> Known.B71
            B72 -> Known.B72
            B73 -> Known.B73
            B74 -> Known.B74
            B75 -> Known.B75
            B76 -> Known.B76
            B77 -> Known.B77
            B78 -> Known.B78
            B79 -> Known.B79
            B8 -> Known.B8
            B80 -> Known.B80
            B81 -> Known.B81
            B82 -> Known.B82
            B83 -> Known.B83
            B84 -> Known.B84
            B85 -> Known.B85
            B86 -> Known.B86
            B87 -> Known.B87
            B88 -> Known.B88
            B89 -> Known.B89
            B9 -> Known.B9
            B90 -> Known.B90
            B91 -> Known.B91
            B92 -> Known.B92
            B93 -> Known.B93
            B94 -> Known.B94
            B95 -> Known.B95
            B96 -> Known.B96
            B97 -> Known.B97
            B98 -> Known.B98
            B99 -> Known.B99
            BAR -> Known.BAR
            BB -> Known.BB
            BFT -> Known.BFT
            BHP -> Known.BHP
            BIL -> Known.BIL
            BLD -> Known.BLD
            BLL -> Known.BLL
            BUA -> Known.BUA
            BUI -> Known.BUI
            C0 -> Known.C0
            C10 -> Known.C10
            C11 -> Known.C11
            C12 -> Known.C12
            C13 -> Known.C13
            C14 -> Known.C14
            C15 -> Known.C15
            C16 -> Known.C16
            C17 -> Known.C17
            C18 -> Known.C18
            C19 -> Known.C19
            C20 -> Known.C20
            C21 -> Known.C21
            C22 -> Known.C22
            C23 -> Known.C23
            C24 -> Known.C24
            C25 -> Known.C25
            C26 -> Known.C26
            C27 -> Known.C27
            C28 -> Known.C28
            C29 -> Known.C29
            C30 -> Known.C30
            C31 -> Known.C31
            C32 -> Known.C32
            C33 -> Known.C33
            C34 -> Known.C34
            C35 -> Known.C35
            C36 -> Known.C36
            C37 -> Known.C37
            C38 -> Known.C38
            C39 -> Known.C39
            C40 -> Known.C40
            C41 -> Known.C41
            C42 -> Known.C42
            C43 -> Known.C43
            C44 -> Known.C44
            C45 -> Known.C45
            C46 -> Known.C46
            C47 -> Known.C47
            C48 -> Known.C48
            C49 -> Known.C49
            C50 -> Known.C50
            C51 -> Known.C51
            C52 -> Known.C52
            C53 -> Known.C53
            C54 -> Known.C54
            C55 -> Known.C55
            C56 -> Known.C56
            C57 -> Known.C57
            C58 -> Known.C58
            C59 -> Known.C59
            C60 -> Known.C60
            C61 -> Known.C61
            C63 -> Known.C63
            C64 -> Known.C64
            C65 -> Known.C65
            C66 -> Known.C66
            C67 -> Known.C67
            C68 -> Known.C68
            C69 -> Known.C69
            C70 -> Known.C70
            C71 -> Known.C71
            C72 -> Known.C72
            C73 -> Known.C73
            C74 -> Known.C74
            C75 -> Known.C75
            C76 -> Known.C76
            C77 -> Known.C77
            C78 -> Known.C78
            C79 -> Known.C79
            C80 -> Known.C80
            C81 -> Known.C81
            C82 -> Known.C82
            C83 -> Known.C83
            C84 -> Known.C84
            C85 -> Known.C85
            C86 -> Known.C86
            C87 -> Known.C87
            C88 -> Known.C88
            C89 -> Known.C89
            C90 -> Known.C90
            C91 -> Known.C91
            C92 -> Known.C92
            C93 -> Known.C93
            C94 -> Known.C94
            C95 -> Known.C95
            C96 -> Known.C96
            C97 -> Known.C97
            C98 -> Known.C98
            C99 -> Known.C99
            CDL -> Known.CDL
            CEL -> Known.CEL
            CHU -> Known.CHU
            CIU -> Known.CIU
            CLT -> Known.CLT
            CMK -> Known.CMK
            CMQ -> Known.CMQ
            CMT -> Known.CMT
            CNP -> Known.CNP
            CNT -> Known.CNT
            COU -> Known.COU
            CTG -> Known.CTG
            CTN -> Known.CTN
            CUR -> Known.CUR
            CWA -> Known.CWA
            CWI -> Known.CWI
            DAN -> Known.DAN
            DAY -> Known.DAY
            DB -> Known.DB
            DD -> Known.DD
            DG -> Known.DG
            DI -> Known.DI
            DLT -> Known.DLT
            DMK -> Known.DMK
            DMQ -> Known.DMQ
            DMT -> Known.DMT
            DPC -> Known.DPC
            DPT -> Known.DPT
            DRA -> Known.DRA
            DZN -> Known.DZN
            DZP -> Known.DZP
            FOT -> Known.FOT
            GLL -> Known.GLL
            GLI -> Known.GLI
            GRM -> Known.GRM
            GRO -> Known.GRO
            HUR -> Known.HUR
            HTZ -> Known.HTZ
            INH -> Known.INH
            KGM -> Known.KGM
            KMT -> Known.KMT
            MTR -> Known.MTR
            SMI -> Known.SMI
            MIN -> Known.MIN
            MON -> Known.MON
            ONZ -> Known.ONZ
            PCE -> Known.PCE
            LBR -> Known.LBR
            QT -> Known.QT
            SEC -> Known.SEC
            FTK -> Known.FTK
            INK -> Known.INK
            MTK -> Known.MTK
            YDK -> Known.YDK
            TNE -> Known.TNE
            VLT -> Known.VLT
            WTT -> Known.WTT
            YRD -> Known.YRD
            FTQ -> Known.FTQ
            INQ -> Known.INQ
            MTQ -> Known.MTQ
            YDQ -> Known.YDQ
            HAR -> Known.HAR
            KLT -> Known.KLT
            MLT -> Known.MLT
            MMT -> Known.MMT
            KMK -> Known.KMK
            MMK -> Known.MMK
            XAA -> Known.XAA
            XAB -> Known.XAB
            XAC -> Known.XAC
            XAD -> Known.XAD
            XAE -> Known.XAE
            XAF -> Known.XAF
            XAG -> Known.XAG
            XAH -> Known.XAH
            XAI -> Known.XAI
            XAJ -> Known.XAJ
            XAL -> Known.XAL
            XAM -> Known.XAM
            XAP -> Known.XAP
            XAT -> Known.XAT
            XAV -> Known.XAV
            XB4 -> Known.XB4
            XBA -> Known.XBA
            XBB -> Known.XBB
            XBC -> Known.XBC
            XBD -> Known.XBD
            XBE -> Known.XBE
            XBF -> Known.XBF
            XBG -> Known.XBG
            XBH -> Known.XBH
            XBI -> Known.XBI
            XBJ -> Known.XBJ
            XBK -> Known.XBK
            XBL -> Known.XBL
            XBM -> Known.XBM
            XBN -> Known.XBN
            XBO -> Known.XBO
            XBP -> Known.XBP
            XBQ -> Known.XBQ
            XBR -> Known.XBR
            XBS -> Known.XBS
            XBT -> Known.XBT
            XBU -> Known.XBU
            XBV -> Known.XBV
            XBW -> Known.XBW
            XBX -> Known.XBX
            XBY -> Known.XBY
            XBZ -> Known.XBZ
            XCA -> Known.XCA
            XCB -> Known.XCB
            XCC -> Known.XCC
            XCD -> Known.XCD
            XCE -> Known.XCE
            XCF -> Known.XCF
            XCG -> Known.XCG
            XCH -> Known.XCH
            XCI -> Known.XCI
            XCJ -> Known.XCJ
            XCK -> Known.XCK
            XCL -> Known.XCL
            XCM -> Known.XCM
            XCN -> Known.XCN
            XCO -> Known.XCO
            XCP -> Known.XCP
            XCQ -> Known.XCQ
            XCR -> Known.XCR
            XCS -> Known.XCS
            XCT -> Known.XCT
            XCU -> Known.XCU
            XCV -> Known.XCV
            XCW -> Known.XCW
            XCX -> Known.XCX
            XCY -> Known.XCY
            XCZ -> Known.XCZ
            XDA -> Known.XDA
            XDB -> Known.XDB
            XDC -> Known.XDC
            XDD -> Known.XDD
            XDE -> Known.XDE
            XDF -> Known.XDF
            XDG -> Known.XDG
            XDH -> Known.XDH
            XDI -> Known.XDI
            XDJ -> Known.XDJ
            XDK -> Known.XDK
            XDL -> Known.XDL
            XDM -> Known.XDM
            XDN -> Known.XDN
            XDP -> Known.XDP
            XDQ -> Known.XDQ
            XDR -> Known.XDR
            XDS -> Known.XDS
            XDT -> Known.XDT
            XDU -> Known.XDU
            XDV -> Known.XDV
            XDW -> Known.XDW
            XDX -> Known.XDX
            XDY -> Known.XDY
            XDZ -> Known.XDZ
            XEA -> Known.XEA
            XEB -> Known.XEB
            XEC -> Known.XEC
            XED -> Known.XED
            XEE -> Known.XEE
            XEF -> Known.XEF
            XEG -> Known.XEG
            XEH -> Known.XEH
            XEI -> Known.XEI
            XEJ -> Known.XEJ
            XEK -> Known.XEK
            XEL -> Known.XEL
            XEM -> Known.XEM
            XEN -> Known.XEN
            XEP -> Known.XEP
            XEQ -> Known.XEQ
            XER -> Known.XER
            XES -> Known.XES
            XET -> Known.XET
            XEU -> Known.XEU
            XEV -> Known.XEV
            XEW -> Known.XEW
            XEX -> Known.XEX
            XEY -> Known.XEY
            XFB -> Known.XFB
            XFC -> Known.XFC
            XFD -> Known.XFD
            XFE -> Known.XFE
            XFF -> Known.XFF
            XFG -> Known.XFG
            XFH -> Known.XFH
            XFI -> Known.XFI
            XFJ -> Known.XFJ
            XFK -> Known.XFK
            XFL -> Known.XFL
            XFM -> Known.XFM
            XFN -> Known.XFN
            XFO -> Known.XFO
            XFP -> Known.XFP
            XFQ -> Known.XFQ
            XFR -> Known.XFR
            XFS -> Known.XFS
            XFT -> Known.XFT
            XFU -> Known.XFU
            XFV -> Known.XFV
            XFW -> Known.XFW
            XFX -> Known.XFX
            XFY -> Known.XFY
            XFZ -> Known.XFZ
            XGA -> Known.XGA
            XGB -> Known.XGB
            XGC -> Known.XGC
            XGD -> Known.XGD
            XGE -> Known.XGE
            XGF -> Known.XGF
            XGG -> Known.XGG
            XGH -> Known.XGH
            XGI -> Known.XGI
            XGJ -> Known.XGJ
            XGK -> Known.XGK
            XGL -> Known.XGL
            XGM -> Known.XGM
            XGN -> Known.XGN
            XGO -> Known.XGO
            XGP -> Known.XGP
            XGQ -> Known.XGQ
            XGR -> Known.XGR
            XGS -> Known.XGS
            XGT -> Known.XGT
            XGU -> Known.XGU
            XGV -> Known.XGV
            XGW -> Known.XGW
            XGX -> Known.XGX
            XGY -> Known.XGY
            XGZ -> Known.XGZ
            XHA -> Known.XHA
            XHB -> Known.XHB
            XHC -> Known.XHC
            XHD -> Known.XHD
            XHE -> Known.XHE
            XHF -> Known.XHF
            XHG -> Known.XHG
            XHH -> Known.XHH
            XHI -> Known.XHI
            XHJ -> Known.XHJ
            XHK -> Known.XHK
            XHL -> Known.XHL
            XHM -> Known.XHM
            XHN -> Known.XHN
            XHP -> Known.XHP
            XHQ -> Known.XHQ
            XHR -> Known.XHR
            XHS -> Known.XHS
            XHT -> Known.XHT
            XHU -> Known.XHU
            XHV -> Known.XHV
            XHW -> Known.XHW
            XHX -> Known.XHX
            XHY -> Known.XHY
            XHZ -> Known.XHZ
            XIA -> Known.XIA
            XIB -> Known.XIB
            XIC -> Known.XIC
            XID -> Known.XID
            XIE -> Known.XIE
            XIF -> Known.XIF
            XIG -> Known.XIG
            XIH -> Known.XIH
            XII -> Known.XII
            XIJ -> Known.XIJ
            XIK -> Known.XIK
            XIL -> Known.XIL
            XIM -> Known.XIM
            XIN -> Known.XIN
            XIO -> Known.XIO
            XJA -> Known.XJA
            XJB -> Known.XJB
            XJC -> Known.XJC
            XJD -> Known.XJD
            XJE -> Known.XJE
            XJF -> Known.XJF
            XJG -> Known.XJG
            XJH -> Known.XJH
            XJI -> Known.XJI
            XJJ -> Known.XJJ
            XJK -> Known.XJK
            XJL -> Known.XJL
            XJM -> Known.XJM
            XJN -> Known.XJN
            XJO -> Known.XJO
            XJP -> Known.XJP
            XJQ -> Known.XJQ
            XJR -> Known.XJR
            XJS -> Known.XJS
            XJT -> Known.XJT
            XJU -> Known.XJU
            XJV -> Known.XJV
            XJW -> Known.XJW
            XJX -> Known.XJX
            XJY -> Known.XJY
            XJZ -> Known.XJZ
            XLA -> Known.XLA
            XLB -> Known.XLB
            XLC -> Known.XLC
            XLD -> Known.XLD
            XLE -> Known.XLE
            XLF -> Known.XLF
            XLG -> Known.XLG
            XLH -> Known.XLH
            XLI -> Known.XLI
            XLJ -> Known.XLJ
            XLK -> Known.XLK
            XLL -> Known.XLL
            XLM -> Known.XLM
            XLN -> Known.XLN
            XLO -> Known.XLO
            XLP -> Known.XLP
            XLQ -> Known.XLQ
            XLR -> Known.XLR
            XLS -> Known.XLS
            XLT -> Known.XLT
            XLU -> Known.XLU
            XLV -> Known.XLV
            XLW -> Known.XLW
            XLX -> Known.XLX
            XLY -> Known.XLY
            XLZ -> Known.XLZ
            XMA -> Known.XMA
            XMB -> Known.XMB
            XMC -> Known.XMC
            XMD -> Known.XMD
            XME -> Known.XME
            XMF -> Known.XMF
            XMG -> Known.XMG
            XMH -> Known.XMH
            XMI -> Known.XMI
            XMJ -> Known.XMJ
            XMK -> Known.XMK
            XML -> Known.XML
            XMM -> Known.XMM
            XMN -> Known.XMN
            XMO -> Known.XMO
            XMP -> Known.XMP
            XMQ -> Known.XMQ
            XMR -> Known.XMR
            XMS -> Known.XMS
            XMT -> Known.XMT
            XMU -> Known.XMU
            XMV -> Known.XMV
            XMW -> Known.XMW
            XMX -> Known.XMX
            XMY -> Known.XMY
            XMZ -> Known.XMZ
            XNA -> Known.XNA
            XNB -> Known.XNB
            XNC -> Known.XNC
            XND -> Known.XND
            XNE -> Known.XNE
            XNF -> Known.XNF
            XNG -> Known.XNG
            XNH -> Known.XNH
            XNI -> Known.XNI
            XNJ -> Known.XNJ
            XNK -> Known.XNK
            XNL -> Known.XNL
            XNM -> Known.XNM
            XOA -> Known.XOA
            XOB -> Known.XOB
            XOC -> Known.XOC
            XOD -> Known.XOD
            XOE -> Known.XOE
            XOF -> Known.XOF
            XOG -> Known.XOG
            XOH -> Known.XOH
            XOI -> Known.XOI
            XOJ -> Known.XOJ
            XOK -> Known.XOK
            XOL -> Known.XOL
            XOM -> Known.XOM
            XON -> Known.XON
            XOO -> Known.XOO
            XOP -> Known.XOP
            XOQ -> Known.XOQ
            XOR -> Known.XOR
            XOS -> Known.XOS
            XOT -> Known.XOT
            XOU -> Known.XOU
            XOV -> Known.XOV
            XOW -> Known.XOW
            XOX -> Known.XOX
            XOY -> Known.XOY
            XOZ -> Known.XOZ
            XP1 -> Known.XP1
            XP2 -> Known.XP2
            XP3 -> Known.XP3
            XP4 -> Known.XP4
            XPA -> Known.XPA
            XPB -> Known.XPB
            XPC -> Known.XPC
            XPD -> Known.XPD
            XPE -> Known.XPE
            XPF -> Known.XPF
            XPG -> Known.XPG
            XPH -> Known.XPH
            XPI -> Known.XPI
            XPJ -> Known.XPJ
            XPK -> Known.XPK
            XPL -> Known.XPL
            XPM -> Known.XPM
            XPN -> Known.XPN
            XPO -> Known.XPO
            XPP -> Known.XPP
            XPQ -> Known.XPQ
            XPR -> Known.XPR
            XPS -> Known.XPS
            XPT -> Known.XPT
            XPU -> Known.XPU
            XPV -> Known.XPV
            XPW -> Known.XPW
            XPX -> Known.XPX
            XPY -> Known.XPY
            XPZ -> Known.XPZ
            XQA -> Known.XQA
            XQB -> Known.XQB
            XQC -> Known.XQC
            XQD -> Known.XQD
            XQE -> Known.XQE
            XQF -> Known.XQF
            XQG -> Known.XQG
            XQH -> Known.XQH
            XQI -> Known.XQI
            XQJ -> Known.XQJ
            XQK -> Known.XQK
            XQL -> Known.XQL
            XQM -> Known.XQM
            XQN -> Known.XQN
            XQO -> Known.XQO
            XQP -> Known.XQP
            XQQ -> Known.XQQ
            XQR -> Known.XQR
            XQS -> Known.XQS
            XRD -> Known.XRD
            XRE -> Known.XRE
            XRF -> Known.XRF
            XRG -> Known.XRG
            XRH -> Known.XRH
            XRI -> Known.XRI
            XRJ -> Known.XRJ
            XRK -> Known.XRK
            XRL -> Known.XRL
            XRM -> Known.XRM
            XRN -> Known.XRN
            XRO -> Known.XRO
            XRP -> Known.XRP
            XRQ -> Known.XRQ
            XRR -> Known.XRR
            XRS -> Known.XRS
            XRT -> Known.XRT
            XRU -> Known.XRU
            XRV -> Known.XRV
            XRW -> Known.XRW
            XRX -> Known.XRX
            XRY -> Known.XRY
            XRZ -> Known.XRZ
            XSA -> Known.XSA
            XSB -> Known.XSB
            XSC -> Known.XSC
            XSD -> Known.XSD
            XSE -> Known.XSE
            XSF -> Known.XSF
            XSG -> Known.XSG
            XSH -> Known.XSH
            XSI -> Known.XSI
            XSJ -> Known.XSJ
            XSK -> Known.XSK
            XSL -> Known.XSL
            XSM -> Known.XSM
            XSN -> Known.XSN
            XSO -> Known.XSO
            XSP -> Known.XSP
            XSQ -> Known.XSQ
            XSR -> Known.XSR
            XSS -> Known.XSS
            XST -> Known.XST
            XSU -> Known.XSU
            XSV -> Known.XSV
            XSW -> Known.XSW
            XSX -> Known.XSX
            XSY -> Known.XSY
            XSZ -> Known.XSZ
            XTA -> Known.XTA
            XTB -> Known.XTB
            XTC -> Known.XTC
            XTD -> Known.XTD
            XTE -> Known.XTE
            XTF -> Known.XTF
            XTG -> Known.XTG
            XTI -> Known.XTI
            XTJ -> Known.XTJ
            XTK -> Known.XTK
            XTL -> Known.XTL
            XTM -> Known.XTM
            XTN -> Known.XTN
            XTO -> Known.XTO
            XTR -> Known.XTR
            XTS -> Known.XTS
            XTT -> Known.XTT
            XTU -> Known.XTU
            XTV -> Known.XTV
            XTW -> Known.XTW
            XTX -> Known.XTX
            XTY -> Known.XTY
            XTZ -> Known.XTZ
            XUC -> Known.XUC
            XUN -> Known.XUN
            XVA -> Known.XVA
            XVG -> Known.XVG
            XVI -> Known.XVI
            XVK -> Known.XVK
            XVL -> Known.XVL
            XVN -> Known.XVN
            XVO -> Known.XVO
            XVP -> Known.XVP
            XVQ -> Known.XVQ
            XVR -> Known.XVR
            XVS -> Known.XVS
            XVY -> Known.XVY
            XWA -> Known.XWA
            XWB -> Known.XWB
            XWC -> Known.XWC
            XWD -> Known.XWD
            XWF -> Known.XWF
            XWG -> Known.XWG
            XWH -> Known.XWH
            XWJ -> Known.XWJ
            XWK -> Known.XWK
            XWL -> Known.XWL
            XWM -> Known.XWM
            XWN -> Known.XWN
            XWP -> Known.XWP
            XWQ -> Known.XWQ
            XWR -> Known.XWR
            XWS -> Known.XWS
            XWT -> Known.XWT
            XWU -> Known.XWU
            XWV -> Known.XWV
            XWW -> Known.XWW
            XWX -> Known.XWX
            XWY -> Known.XWY
            XWZ -> Known.XWZ
            XXA -> Known.XXA
            XXB -> Known.XXB
            XXC -> Known.XXC
            XXD -> Known.XXD
            XXF -> Known.XXF
            XXG -> Known.XXG
            XXH -> Known.XXH
            XXJ -> Known.XXJ
            XXK -> Known.XXK
            XYA -> Known.XYA
            XYB -> Known.XYB
            XYC -> Known.XYC
            XYD -> Known.XYD
            XYF -> Known.XYF
            XYG -> Known.XYG
            XYH -> Known.XYH
            XYJ -> Known.XYJ
            XYK -> Known.XYK
            XYL -> Known.XYL
            XYM -> Known.XYM
            XYN -> Known.XYN
            XYP -> Known.XYP
            XYQ -> Known.XYQ
            XYR -> Known.XYR
            XYS -> Known.XYS
            XYT -> Known.XYT
            XYV -> Known.XYV
            XYW -> Known.XYW
            XYX -> Known.XYX
            XYY -> Known.XYY
            XYZ -> Known.XYZ
            XZA -> Known.XZA
            XZB -> Known.XZB
            XZC -> Known.XZC
            XZD -> Known.XZD
            XZF -> Known.XZF
            XZG -> Known.XZG
            XZH -> Known.XZH
            XZJ -> Known.XZJ
            XZK -> Known.XZK
            XZL -> Known.XZL
            XZM -> Known.XZM
            XZN -> Known.XZN
            XZP -> Known.XZP
            XZQ -> Known.XZQ
            XZR -> Known.XZR
            XZS -> Known.XZS
            XZT -> Known.XZT
            XZU -> Known.XZU
            XZV -> Known.XZV
            XZW -> Known.XZW
            XZX -> Known.XZX
            XZY -> Known.XZY
            XZZ -> Known.XZZ
            ZZ -> Known.ZZ
            NAR -> Known.NAR
            C62 -> Known.C62
            LTR -> Known.LTR
            H87 -> Known.H87
            else -> throw EInvoiceInvalidDataException("Unknown UnitOfMeasureCode: $value")
        }

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
