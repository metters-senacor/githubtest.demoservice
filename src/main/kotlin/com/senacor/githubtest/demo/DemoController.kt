package com.senacor.githubtest.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/demo/v1/demos")
class DemoController {
    @GetMapping
    fun getEndpoint(): Demo {
        return Demo("Demo")
    }
}

data class Demo(
    val name: String
)
