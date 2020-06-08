package com.example.springdemoannotation.service

class SadFortuneService : FortuneService {
    override fun getFortune(): String {
        return "Today is a sad day"
    }
}