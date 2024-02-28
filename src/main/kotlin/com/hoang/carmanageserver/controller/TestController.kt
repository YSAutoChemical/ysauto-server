package com.hoang.carmanageserver.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @Value("\${config}")
    lateinit var config: String

    @GetMapping("")
    fun hi() {
        println("hi~")
        println(config)
    }
}