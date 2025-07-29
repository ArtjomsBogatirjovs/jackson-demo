package org.example.jacksondemo.jackson.integer

import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"number":0}""")
data class TestIntegerField1(val number: Int = 0)

@ExpectedJson("""{}""")
data class TestIntegerField2(val isNumber: Int = 0)

@ExpectedJson("""{"inNumber":0}""")
data class TestIntegerField3(val inNumber: Int = 0)

@ExpectedJson("""{"numberField":0}""")
data class TestIntegerField4(val numberField: Int = 0)

@ExpectedJson("""{"number_field":0}""")
data class TestIntegerField5(val number_field: Int = 0)

@ExpectedJson("""{"numberField42":0}""")
data class TestIntegerField6(val numberField42: Int = 0)

@ExpectedJson("""{"field42Number":0}""")
data class TestIntegerField7(val field42Number: Int = 0)

@ExpectedJson("""{"numBer":0}""")
data class TestIntegerField8(val numBer: Int = 0)

@ExpectedJson("""{"number":0}""")
data class TestIntegerField9(val nUMber: Int = 0)

@ExpectedJson("""{"number":0}""")
data class TestIntegerField10(val NUMBER: Int = 0)

@ExpectedJson("""{}""")
data class TestIntegerField11(val is_number: Int = 0)

@ExpectedJson("""{"_number":0}""")
data class TestIntegerField12(val _number: Int = 0)

@ExpectedJson("""{"num_ber":0}""")
data class TestIntegerField13(val num_ber: Int = 0)

@ExpectedJson("""{"numBerField":0}""")
data class TestIntegerField14(val numBerField: Int = 0)

@ExpectedJson("""{"numberFieldTest":0}""")
data class TestIntegerField15(val numberFieldTest: Int = 0)

@ExpectedJson("""{"testNumberField":0}""")
data class TestIntegerField16(val testNumberField: Int = 0)

@ExpectedJson("""{"avalue":0}""")
data class TestIntegerField17(val aValue: Int = 0)

@ExpectedJson("""{"avalue":0}""")
data class TestIntegerField18(val aVALUE: Int = 0)

@ExpectedJson("""{"avalue":0}""")
data class TestIntegerField19(val avalue: Int = 0)

@ExpectedJson("""{"avalueOne":0}""")
data class TestIntegerField20(val aValueOne: Int = 0)

@ExpectedJson("""{"number_one":0}""")
data class TestIntegerField21(val number_one: Int = 0)

@ExpectedJson("""{"number_One":0}""")
data class TestIntegerField22(val number_One: Int = 0)

@ExpectedJson("""{"numberone":0}""")
data class TestIntegerField23(val numberone: Int = 0)

@ExpectedJson("""{"getNumber":0}""")
data class TestIntegerField24(val getNumber: Int = 0)

@ExpectedJson("""{"getnumber":0}""")
data class TestIntegerField25(val getnumber: Int = 0)

@ExpectedJson("""{"get_number":0}""")
data class TestIntegerField26(val get_number: Int = 0)

@ExpectedJson("""{"setValue":0}""")
data class TestIntegerField27(val setValue: Int = 0)

@ExpectedJson("""{"setvalue":0}""")
data class TestIntegerField28(val setvalue: Int = 0)

@ExpectedJson("""{"set_value":0}""")
data class TestIntegerField29(val set_value: Int = 0)

@ExpectedJson("""{"getter":0}""")
data class TestIntegerField30(val getter: Int = 0)

@ExpectedJson("""{"setter":0}""")
data class TestIntegerField31(val setter: Int = 0)

@ExpectedJson("""{"getSet":0}""")
data class TestIntegerField32(val getSet: Int = 0)

@ExpectedJson("""{"setGet":0}""")
data class TestIntegerField33(val setGet: Int = 0)

@ExpectedJson("""{"getValue42":0}""")
data class TestIntegerField34(val getValue42: Int = 0)

@ExpectedJson("""{"set_value_1":0}""")
data class TestIntegerField35(val set_value_1: Int = 0)

@ExpectedJson("""{"getValueSet":0}""")
data class TestIntegerField36(val getValueSet: Int = 0)

@ExpectedJson("""{"setGetNumber":0}""")
data class TestIntegerField37(val setGetNumber: Int = 0)

@ExpectedJson("""{"getSet_value":0}""")
data class TestIntegerField38(val getSet_value: Int = 0)
