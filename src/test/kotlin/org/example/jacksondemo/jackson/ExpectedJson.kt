package org.example.jacksondemo.jackson

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ExpectedJson(val value: String)
