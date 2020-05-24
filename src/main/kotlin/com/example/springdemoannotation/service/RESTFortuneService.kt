package com.example.springdemoannotation.service

import org.springframework.stereotype.Component

@Component
class RESTFortuneService : FortuneService {
    override fun getFortune(): String {
        return "REST fortune service"
    }
}