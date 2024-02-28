package com.hoang.carmanageserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarManageServerApplication

fun main(args: Array<String>) {
    runApplication<CarManageServerApplication>(*args)
}
