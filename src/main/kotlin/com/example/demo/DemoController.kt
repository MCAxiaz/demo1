package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/local")
class DemoController(
    @param:Value("\${config}") val config: String,
) {

    @GetMapping
    fun getCloud(): ResponseEntity<Any> {
        return ResponseEntity.ok(config)
    }
}
