package org.example.jacksondemo.jackson

import com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
import com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.reflections.Reflections
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.primaryConstructor


class JacksonTest {
    val jsonObjectMapper: JsonMapper = JsonMapper.builder()
        .addModule(ParameterNamesModule())
        .addModule(Jdk8Module())
        .addModule(JavaTimeModule())
        .addModule(KotlinModule.Builder().build())
        .disable(FAIL_ON_UNKNOWN_PROPERTIES)
        .disable(WRITE_DATES_AS_TIMESTAMPS)
        .enable(ACCEPT_CASE_INSENSITIVE_ENUMS)
        .build()

    private val jacksonMapper: ObjectMapper = jsonObjectMapper

    companion object {
        @JvmStatic
        fun dataClassesWithExpectedBoolean(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.bool")
        }

        @JvmStatic
        fun dataClassesWithExpectedInteger(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.integer")
        }

        @JvmStatic
        fun dataClassesWithExpectedShort(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.shrt")
        }

        @JvmStatic
        fun dataClassesWithExpectedByte(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.bait")
        }

        @JvmStatic
        fun dataClassesWithExpectedLong(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.lng")
        }

        @JvmStatic
        fun dataClassesWithExpectedString(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.string")
        }

        @JvmStatic
        fun dataClassesWithExpectedLocalDateTime(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.localdatetime")
        }

        @JvmStatic
        fun dataClassesWithExpectedBigDecimal(): List<Pair<Any, String>> {
            return dataClassesWithExpected("org.example.jacksondemo.jackson.bigdecimal")
        }

        private fun dataClassesWithExpected(path: String): List<Pair<Any, String>> {
            val reflections = Reflections(path)
            return reflections.getTypesAnnotatedWith(ExpectedJson::class.java)
                .mapNotNull { clazz ->
                    val kClass = (clazz as Class<*>).kotlin
                    val annotation = kClass.findAnnotation<ExpectedJson>() ?: return@mapNotNull null
                    val ctor = kClass.primaryConstructor ?: return@mapNotNull null
                    val instance = ctor.callBy(emptyMap())
                    instance to annotation.value
                }
        }
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedBoolean")
    fun `test boolean field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedLocalDateTime")
    fun `test LocalDate and LocalDateTime field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedBigDecimal")
    fun `test BigDecimal field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedInteger")
    fun `test integer field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedString")
    fun `test String field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedLong")
    fun `test Long field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedByte")
    fun `test byte field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    @ParameterizedTest
    @MethodSource("dataClassesWithExpectedShort")
    fun `test short field serialization`(input: Pair<Any, String>) {
        testRunner(input)
    }

    private fun testRunner(input: Pair<Any, String>) {
        val (instance, expectedJson) = input
        val actualJson = jacksonMapper.writeValueAsString(instance)
        org.junit.jupiter.api.Assertions.assertEquals(expectedJson, actualJson)
    }
}