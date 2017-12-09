package com.example.sampleapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example.*")
class SampleappApplication

fun main(args: Array<String>) {
    runApplication<SampleappApplication>(*args)
}
