package org.example.jacksondemo.jackson.bool

import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"isTrue":false}""")
data class TestBooleanField1(val isTrue: Boolean = false)

@ExpectedJson("""{"isfalse":false}""")
data class TestBooleanField2(val isfalse: Boolean = false)

@ExpectedJson("""{"isXXa":false}""")
data class TestBooleanField3(val isXXa: Boolean = false)

@ExpectedJson("""{"isXX":false}""")
data class TestBooleanField4(val isXX: Boolean = false)

@ExpectedJson("""{"isXXaX":false}""")
data class TestBooleanField5(val isXXaX: Boolean = false)

@ExpectedJson("""{"is_XXaX":false}""")
data class TestBooleanField6(val is_XXaX: Boolean = false)

@ExpectedJson("""{"isxxx":false}""")
data class TestBooleanField7(val ISXXX: Boolean = false)

@ExpectedJson("""{"upper":false}""")
data class TestBooleanField8(val UPPER: Boolean = false)

@ExpectedJson("""{"toUPPER":false}""")
data class TestBooleanField9(val toUPPER: Boolean = false)

@ExpectedJson("""{"xaax":false}""")
data class TestBooleanField10(val xAAx: Boolean = false)

@ExpectedJson("""{"avalue":false}""")
data class TestBooleanField11(val aValue: Boolean = false)

@ExpectedJson("""{"avalue":false}""")
data class TestBooleanField13(val aVAlue: Boolean = false)

@ExpectedJson("""{"avalue":false}""")
data class TestBooleanField14(val aVALUE: Boolean = false)

@ExpectedJson("""{"avAlue":false}""")
data class TestBooleanField15(val avAlue: Boolean = false)

@ExpectedJson("""{"xaaxA":false}""")
data class TestBooleanField16(val xAAxA: Boolean = false)

@ExpectedJson("""{"avalueOne":false}""")
data class TestBooleanField17(val aValueOne: Boolean = false)

@ExpectedJson("""{"isIsTrue":false}""")
data class TestBooleanField18(val isIsTrue: Boolean = false)

@ExpectedJson("""{"isIsis":false}""")
data class TestBooleanField19(val isIsis: Boolean = false)

@ExpectedJson("""{"is_true":false}""")
data class TestBooleanField20(val is_true: Boolean = false)

@ExpectedJson("""{"is_is_true":false}""")
data class TestBooleanField21(val is_is_true: Boolean = false)

@ExpectedJson("""{"isHTML":false}""")
data class TestBooleanField22(val isHTML: Boolean = false)

@ExpectedJson("""{"html":false}""")
data class TestBooleanField23(val HTML: Boolean = false)

@ExpectedJson("""{"isXML":false}""")
data class TestBooleanField24(val isXML: Boolean = false)

@ExpectedJson("""{"xml":false}""")
data class TestBooleanField25(val XML: Boolean = false)

@ExpectedJson("""{"is_foo_bar":false}""")
data class TestBooleanField26(val is_foo_bar: Boolean = false)

@ExpectedJson("""{"foo_bar":false}""")
data class TestBooleanField27(val foo_bar: Boolean = false)

@ExpectedJson("""{"isField123":false}""")
data class TestBooleanField28(val isField123: Boolean = false)

@ExpectedJson("""{"field123is":false}""")
data class TestBooleanField29(val field123is: Boolean = false)

@ExpectedJson("""{"is123is":false}""")
data class TestBooleanField30(val is123is: Boolean = false)

@ExpectedJson("""{"island":false}""")
data class TestBooleanField31(val island: Boolean = false)

@ExpectedJson("""{"thisIsTest":false}""")
data class TestBooleanField32(val thisIsTest: Boolean = false)

@ExpectedJson("""{"testIsWorking":false}""")
data class TestBooleanField33(val testIsWorking: Boolean = false)

@ExpectedJson("""{"is_":false}""")
data class TestBooleanField34(val is_: Boolean = false)

@ExpectedJson("""{"isX_x":false}""")
data class TestBooleanField35(val isX_x: Boolean = false)

@ExpectedJson("""{"is_xX":false}""")
data class TestBooleanField36(val is_xX: Boolean = false)

@ExpectedJson("""{"fieldis":false}""")
data class TestBooleanField37(val fieldis: Boolean = false)

@ExpectedJson("""{"isТест":false}""")
data class TestBooleanField38(val isТест: Boolean = false)

@ExpectedJson("""{"getValue":false}""")
data class TestBooleanField39(val getValue: Boolean = false)

@ExpectedJson("""{"getvalue":false}""")
data class TestBooleanField40(val getvalue: Boolean = false)

@ExpectedJson("""{"get_value":false}""")
data class TestBooleanField41(val get_value: Boolean = false)

@ExpectedJson("""{"setFlag":false}""")
data class TestBooleanField42(val setFlag: Boolean = false)

@ExpectedJson("""{"set_flag":false}""")
data class TestBooleanField43(val set_flag: Boolean = false)

@ExpectedJson("""{"setflag":false}""")
data class TestBooleanField44(val setflag: Boolean = false)

@ExpectedJson("""{"getter":false}""")
data class TestBooleanField45(val getter: Boolean = false)

@ExpectedJson("""{"setter":false}""")
data class TestBooleanField46(val setter: Boolean = false)

@ExpectedJson("""{"getIsTrue":false}""")
data class TestBooleanField47(val getIsTrue: Boolean = false)

@ExpectedJson("""{"setIsTrue":false}""")
data class TestBooleanField48(val setIsTrue: Boolean = false)

@ExpectedJson("""{"getIs_set":false}""")
data class TestBooleanField49(val getIs_set: Boolean = false)
