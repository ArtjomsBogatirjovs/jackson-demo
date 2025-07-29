package org.example.jacksondemo.jackson.bait

import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"flag":0}""")
data class TestByteField1(val flag: Byte = 0)

@ExpectedJson("""{"byteFlag":0}""")
data class TestByteField2(val byteFlag: Byte = 0)

@ExpectedJson("""{"byte_flag":0}""")
data class TestByteField3(val byte_flag: Byte = 0)

@ExpectedJson("""{"flag":0}""")
data class TestByteField4(val FLAG: Byte = 0)

@ExpectedJson("""{"flag123":0}""")
data class TestByteField5(val flag123: Byte = 0)
