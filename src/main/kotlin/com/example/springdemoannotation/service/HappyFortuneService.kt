package com.example.springdemoannotation.service

import org.springframework.stereotype.Component

@Component
class HappyFortuneService : FortuneService {
    override fun getFortune(): String {
        return "Today is your lucky day"
    }
}