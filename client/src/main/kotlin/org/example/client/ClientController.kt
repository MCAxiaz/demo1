package org.example.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
@RequestMapping("/local")
class ClientController(
    @param:Value("\${config}") val config: String,
) {

    @GetMapping
    fun getCloud(): ResponseEntity<Any> {
        return ResponseEntity.ok(config)
    }
}
