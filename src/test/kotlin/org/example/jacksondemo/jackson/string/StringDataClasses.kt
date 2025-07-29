package org.example.jacksondemo.jackson.string

import com.fasterxml.jackson.annotation.JsonProperty
import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"name":""}""")
data class TestStringField1(val name: String = "")

@ExpectedJson("""{"userName":""}""")
data class TestStringField2(val userName: String = "")

@ExpectedJson("""{"user_name":""}""")
data class TestStringField3(val user_name: String = "")

@ExpectedJson("""{"username":""}""")
data class TestStringField4(val USERNAME: String = "")

@ExpectedJson("""{"userName123":""}""")
data class TestStringField5(val userName123: String = "")

@ExpectedJson("""{"strField":""}""")
data class TestStringField6(val strField: String = "")

@ExpectedJson("""{"field1":""}""")
data class TestStringField7(val field1: String = "")

@ExpectedJson("""{"xxyY":""}""")
data class TestStringField8(val xXyY: String = "")

@ExpectedJson("""{"_custom":""}""")
data class TestStringField9(val _custom: String = "")

@ExpectedJson("""{"with_underscore":""}""")
data class TestStringField10(val with_underscore: String = "")

@ExpectedJson("""{"_name":""}""")
data class TestStringField11(val _name: String = "")

@ExpectedJson("""{"first_name":""}""")
data class TestStringField12(val first_name: String = "")

@ExpectedJson("""{"firstName":""}""")
data class TestStringField13(val FirstName: String = "")

@ExpectedJson("""{"firstName":""}""")
data class TestStringField14(val firstName: String = "")

@ExpectedJson("""{"first1Name":""}""")
data class TestStringField15(val first1Name: String = "")

@ExpectedJson("""{"firstName2":""}""")
data class TestStringField16(val firstName2: String = "")

@ExpectedJson("""{"a":""}""")
data class TestStringField17(val a: String = "")

@ExpectedJson("""{"abc":""}""")
data class TestStringField18(val abc: String = "")

@ExpectedJson("""{"a_b_c":""}""")
data class TestStringField19(val a_b_c: String = "")

@ExpectedJson("""{"abc_xyz":""}""")
data class TestStringField20(val abc_xyz: String = "")

@ExpectedJson("""{"abcXyz":""}""")
data class TestStringField21(val abcXyz: String = "")

@ExpectedJson("""{"a_bC":""}""")
data class TestStringField22(val a_bC: String = "")

@ExpectedJson("""{"abc":""}""")
data class TestStringField23(val Abc: String = "")

@ExpectedJson("""{"abC":""}""")
data class TestStringField24(val abC: String = "")

@ExpectedJson("""{"__abc":""}""")
data class TestStringField25(val __abc: String = "")

@ExpectedJson("""{"abc_":""}""")
data class TestStringField26(val abc_: String = "")

@ExpectedJson("""{"a_b_c_d_e":""}""")
data class TestStringField27(val a_b_c_d_e: String = "")

@ExpectedJson("""{"camelCase":""}""")
data class TestStringField28(val camelCase: String = "")

@ExpectedJson("""{"pascalCase":""}""")
data class TestStringField29(val PascalCase: String = "")

@ExpectedJson("""{"screaming_SNAKE":""}""")
data class TestStringField30(val SCREAMING_SNAKE: String = "")

@ExpectedJson("""{"snake_case_with_1":""}""")
data class TestStringField31(val snake_case_with_1: String = "")

@ExpectedJson("""{"snake_Case_With123":""}""")
data class TestStringField32(val snake_Case_With123: String = "")

@ExpectedJson("""{"xyz":""}""")
data class TestStringField33(val xYz: String = "")

@ExpectedJson("""{"_xYz":""}""")
data class TestStringField34(val _xYz: String = "")

@ExpectedJson("""{"name1":""}""")
data class TestStringField35(val name1: String = "")

@ExpectedJson("""{"_1name":""}""")
data class TestStringField36(val _1name: String = "")

@ExpectedJson("""{"name_1":""}""")
data class TestStringField37(val name_1: String = "")

@ExpectedJson("""{"n1a2m3e":""}""")
data class TestStringField38(val n1a2m3e: String = "")

@ExpectedJson("""{"valUe":""}""")
data class TestStringField40(val vAlUe: String = "")

@ExpectedJson("""{"null_":""}""")
data class TestStringField41(val null_: String = "")

@ExpectedJson("""{"class_":""}""")
data class TestStringField42(val class_: String = "")

@ExpectedJson("""{"break_":""}""")
data class TestStringField43(val break_: String = "")

@ExpectedJson("""{"averyLongStringFieldNameWithNumbers1234567890AndUnderscores____":""}""")
data class TestStringField44(val aVeryLongStringFieldNameWithNumbers1234567890AndUnderscores____: String = "")

@ExpectedJson("""{"русский":""}""")
data class TestStringField45(val русский: String = "")

@ExpectedJson("""{"withЁ":""}""")
data class TestStringField46(val withЁ: String = "")

@ExpectedJson("""{"dash-field":""}""")
data class TestStringField48(@field:JsonProperty("dash-field") val dash_field: String = "")

@ExpectedJson("""{"space field":""}""")
data class TestStringField49(@field:JsonProperty("space field") val space_field: String = "")

@ExpectedJson("""{"empty":""}""")
data class TestStringField50(val empty: String = "")

@ExpectedJson("""{"getName":""}""")
data class TestStringField51(val getName: String = "")

@ExpectedJson("""{"get_name":""}""")
data class TestStringField52(val get_name: String = "")

@ExpectedJson("""{"getter":""}""")
data class TestStringField53(val getter: String = "")

@ExpectedJson("""{"setName":""}""")
data class TestStringField54(val setName: String = "")

@ExpectedJson("""{"set_name":""}""")
data class TestStringField55(val set_name: String = "")

@ExpectedJson("""{"setter":""}""")
data class TestStringField56(val setter: String = "")

@ExpectedJson("""{"isActive":""}""")
data class TestStringField57(val isActive: String = "")

@ExpectedJson("""{"is_active":""}""")
data class TestStringField58(val is_active: String = "")

@ExpectedJson("""{"isString":""}""")
data class TestStringField59(val isString: String = "")

@ExpectedJson("""{"isStringValue":""}""")
data class TestStringField60(val isStringValue: String = "")

@ExpectedJson("""{"is_string":""}""")
data class TestStringField61(val is_string: String = "")

@ExpectedJson("""{"isstring":""}""")
data class TestStringField62(val isstring: String = "")

@ExpectedJson("""{"get":""}""")
data class TestStringField63(val get: String = "")

@ExpectedJson("""{"set":""}""")
data class TestStringField64(val set: String = "")

@ExpectedJson("""{"is_":""}""")
data class TestStringField65(val is_: String = "")

@ExpectedJson("""{"default":""}""")
data class TestStringField66(val default: String = "")

@ExpectedJson("""{"value":""}""")
data class TestStringField67(val value: String = "")

@ExpectedJson("""{"type":""}""")
data class TestStringField68(val type: String = "")

@ExpectedJson("""{"data":""}""")
data class TestStringField69(val data: String = "")

@ExpectedJson("""{"class_":""}""")
data class TestStringField70(val class_: String = "")

@ExpectedJson("""{"object_":""}""")
data class TestStringField71(val object_: String = "")

@ExpectedJson("""{"package_":""}""")
data class TestStringField72(val package_: String = "")

@ExpectedJson("""{"null_":""}""")
data class TestStringField73(val null_: String = "")

@ExpectedJson("""{"true_":""}""")
data class TestStringField74(val true_: String = "")

@ExpectedJson("""{"false_":""}""")
data class TestStringField75(val false_: String = "")

@ExpectedJson("""{"override":""}""")
data class TestStringField76(val override: String = "")

@ExpectedJson("""{"open":""}""")
data class TestStringField77(val open: String = "")

@ExpectedJson("""{"final":""}""")
data class TestStringField78(val final: String = "")

@ExpectedJson("""{"companion":""}""")
data class TestStringField79(val companion: String = "")

// Edge-case: get/set/is + special word
@ExpectedJson("""{"getValue":""}""")
data class TestStringField80(val getValue: String = "")

@ExpectedJson("""{"setDefault":""}""")
data class TestStringField81(val setDefault: String = "")

@ExpectedJson("""{"isType":""}""")
data class TestStringField82(val isType: String = "")

@ExpectedJson("""{"get_data":""}""")
data class TestStringField83(val get_data: String = "")

@ExpectedJson("""{"set_data":""}""")
data class TestStringField84(val set_data: String = "")

@ExpectedJson("""{"is_data":""}""")
data class TestStringField85(val is_data: String = "")
