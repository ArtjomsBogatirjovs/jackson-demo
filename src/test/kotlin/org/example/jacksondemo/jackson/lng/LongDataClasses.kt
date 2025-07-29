package org.example.jacksondemo.jackson.lng

import org.example.jacksondemo.jackson.ExpectedJson

@ExpectedJson("""{"id":0}""")
data class TestLongField1(val id: Long = 0L)

@ExpectedJson("""{"longId":0}""")
data class TestLongField2(val longId: Long = 0L)

@ExpectedJson("""{"long_id":0}""")
data class TestLongField3(val long_id: Long = 0L)

@ExpectedJson("""{"id":0}""")
data class TestLongField4(val ID: Long = 0L)

@ExpectedJson("""{"id123":0}""")
data class TestLongField5(val id123: Long = 0L)

@ExpectedJson("""{"bigId":0}""")
data class TestLongField6(val bigId: Long = 0L)
