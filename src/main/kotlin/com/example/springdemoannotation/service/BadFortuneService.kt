package com.example.springdemoannotation.service

class BadFortuneService : FortuneService {
    override fun getFortune(): String {
        return "Have a badness day"
    }
}