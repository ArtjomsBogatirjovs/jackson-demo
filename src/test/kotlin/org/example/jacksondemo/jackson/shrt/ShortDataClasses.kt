package org.example.jacksondemo.jackson.shrt

import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"size":0}""")
data class TestShortField1(val size: Short = 0)

@ExpectedJson("""{"shortSize":0}""")
data class TestShortField2(val shortSize: Short = 0)

@ExpectedJson("""{"short_size":0}""")
data class TestShortField3(val short_size: Short = 0)

@ExpectedJson("""{"size":0}""")
data class TestShortField4(val SIZE: Short = 0)

@ExpectedJson("""{"size123":0}""")
data class TestShortField5(val size123: Short = 0)
