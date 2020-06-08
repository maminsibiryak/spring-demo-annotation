package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService

class SwimUdemyCoach(private val fortuneService: FortuneService) : Coach {

    override fun getDailyWorkout(): String {
        return "Swim 1000 meters as a warm up"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }
}