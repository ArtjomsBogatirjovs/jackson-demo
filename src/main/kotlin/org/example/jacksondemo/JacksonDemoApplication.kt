package org.example.jacksondemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JacksonDemoApplication

fun main(args: Array<String>) {
    runApplication<JacksonDemoApplication>(*args)
}
