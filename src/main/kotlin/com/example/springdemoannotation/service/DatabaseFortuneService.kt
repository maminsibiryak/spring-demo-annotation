package com.example.springdemoannotation.service

import org.springframework.stereotype.Component

@Component
class DatabaseFortuneService : FortuneService {
    override fun getFortune(): String {
        TODO("Not yet implemented")
    }
}