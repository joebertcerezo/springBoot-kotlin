package com.`try`.tryMuna

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    
    @GetMapping("/")
    fun hello(): String {
        return "Hello, your Spddring Boot aaa is ddddd!"
    }
}
