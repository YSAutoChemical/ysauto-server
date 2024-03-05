package com.ys.carmanageserver.controller

import com.ys.carmanageserver.common.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {
    @GetMapping("")
    fun hi() {
        Logger.logger.error("hi")
    }
}
