package com.example.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SampleController() {

    @GetMapping("/")
    fun index(): String {
        return "/index.html"
    }

}