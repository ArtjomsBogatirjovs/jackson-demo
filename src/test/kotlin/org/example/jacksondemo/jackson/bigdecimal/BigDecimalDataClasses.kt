package org.example.jacksondemo.jackson.bigdecimal

import java.math.BigDecimal
import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"amount":0}""")
data class TestBigDecimalField1(val amount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"getAmount":0}""")
data class TestBigDecimalField2(val getAmount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"get_amount":0}""")
data class TestBigDecimalField3(val get_amount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"setAmount":0}""")
data class TestBigDecimalField4(val setAmount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"set_amount":0}""")
data class TestBigDecimalField5(val set_amount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"getter":0}""")
data class TestBigDecimalField6(val getter: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"setter":0}""")
data class TestBigDecimalField7(val setter: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"bigDecimalValue":0}""")
data class TestBigDecimalField8(val bigDecimalValue: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"big_decimal_value":0}""")
data class TestBigDecimalField9(val big_decimal_value: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"bigdecimalvalue":0}""")
data class TestBigDecimalField10(val BIGDECIMALVALUE: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"value123":0}""")
data class TestBigDecimalField11(val value123: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"amount42":0}""")
data class TestBigDecimalField12(val amount42: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"_amount":0}""")
data class TestBigDecimalField13(val _amount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"amount_":0}""")
data class TestBigDecimalField14(val amount_: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"getBigDecimal":0}""")
data class TestBigDecimalField15(val getBigDecimal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"setBigDecimal":0}""")
data class TestBigDecimalField16(val setBigDecimal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"getSetAmount":0}""")
data class TestBigDecimalField17(val getSetAmount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"setGetAmount":0}""")
data class TestBigDecimalField18(val setGetAmount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"decimal_value":0}""")
data class TestBigDecimalField19(val decimal_value: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"decimalvalue":0}""")
data class TestBigDecimalField20(val DECIMALVALUE: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"big_decimal42_value":0}""")
data class TestBigDecimalField21(val big_decimal42_value: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"big_decimal_value_123":0}""")
data class TestBigDecimalField23(val big_decimal_value_123: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"amountX":0}""")
data class TestBigDecimalField24(val amountX: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"value":0}""")
data class TestBigDecimalField25(val value: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"total":0}""")
data class TestBigDecimalField26(val total: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"default":0}""")
data class TestBigDecimalField27(val default: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"final":0}""")
data class TestBigDecimalField28(val final: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"open":0}""")
data class TestBigDecimalField29(val open: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"companion":0}""")
data class TestBigDecimalField30(val companion: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"getValue":0}""")
data class TestBigDecimalField31(val getValue: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"setTotal":0}""")
data class TestBigDecimalField32(val setTotal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"amount_value":0}""")
data class TestBigDecimalField33(val amount_value: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"value_total":0}""")
data class TestBigDecimalField34(val value_total: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"bigDecimal":0}""")
data class TestBigDecimalField35(val bigDecimal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"valueTotal42":0}""")
data class TestBigDecimalField36(val valueTotal42: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"class_":0}""")
data class TestBigDecimalField37(val class_: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"object_":0}""")
data class TestBigDecimalField38(val object_: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"package_":0}""")
data class TestBigDecimalField39(val package_: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"null_":0}""")
data class TestBigDecimalField40(val null_: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"сумма":0}""")
data class TestBigDecimalField41(val сумма: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"bigDecimal_1_value":0}""")
data class TestBigDecimalField42(val bigDecimal_1_value: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"isAmount":0}""")
data class TestBigDecimalField43(val isAmount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"is_amount":0}""")
data class TestBigDecimalField44(val is_amount: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"isBigDecimal":0}""")
data class TestBigDecimalField45(val isBigDecimal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"is_big_decimal":0}""")
data class TestBigDecimalField46(val is_big_decimal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"isAmountTotal":0}""")
data class TestBigDecimalField47(val isAmountTotal: BigDecimal = BigDecimal.ZERO)

@ExpectedJson("""{"isTotal42":0}""")
data class TestBigDecimalField48(val isTotal42: BigDecimal = BigDecimal.ZERO)

// nullable fields (BigDecimal?)
@ExpectedJson("""{"nullableAmount":null}""")
data class TestBigDecimalField49(val nullableAmount: BigDecimal? = null)

@ExpectedJson("""{"isNullable":null}""")
data class TestBigDecimalField50(val isNullable: BigDecimal? = null)

@ExpectedJson("""{"is_nullable":null}""")
data class TestBigDecimalField51(val is_nullable: BigDecimal? = null)

@ExpectedJson("""{"nullable_is_amount":null}""")
data class TestBigDecimalField52(val nullable_is_amount: BigDecimal? = null)

@ExpectedJson("""{"nullableIsAmount":null}""")
data class TestBigDecimalField53(val nullableIsAmount: BigDecimal? = null)

@ExpectedJson("""{"isGetAmount":null}""")
data class TestBigDecimalField54(val isGetAmount: BigDecimal? = null)

@ExpectedJson("""{"setIsAmount":null}""")
data class TestBigDecimalField55(val setIsAmount: BigDecimal? = null)

@ExpectedJson("""{"getIsAmount":null}""")
data class TestBigDecimalField56(val getIsAmount: BigDecimal? = null)

@ExpectedJson("""{"isSetGetAmount":null}""")
data class TestBigDecimalField57(val isSetGetAmount: BigDecimal? = null)

@ExpectedJson("""{"amountNullable":null}""")
data class TestBigDecimalField58(val amountNullable: BigDecimal? = null)

@ExpectedJson("""{"_isAmount":null}""")
data class TestBigDecimalField59(val _isAmount: BigDecimal? = null)

@ExpectedJson("""{"class_":null}""")
data class TestBigDecimalField60(val class_: BigDecimal? = null)

@ExpectedJson("""{"object_":null}""")
data class TestBigDecimalField61(val object_: BigDecimal? = null)
