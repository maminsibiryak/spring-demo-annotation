package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService

class ShootCoach(val fortuneService: FortuneService) : Coach {
    override fun getDailyWorkout(): String {
        return "Shoot Shoot and shoot"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }
}