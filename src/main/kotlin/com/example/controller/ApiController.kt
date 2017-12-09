package com.example.controller

import com.example.domain.ApiModel
import com.example.response.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value ="api")
class ApiController() {

    @GetMapping(value = "hello")
    fun hello(): ResponseEntity<ApiResponse> {
        val apiModel = ApiModel("1", 2)
        val apiResponse = ApiResponse("2017-12-01T00:00:00+09:00", "randomvalue", apiModel)
        return ResponseEntity.ok(apiResponse)
    }

}