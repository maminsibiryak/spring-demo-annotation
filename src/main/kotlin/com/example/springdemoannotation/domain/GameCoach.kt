package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService
import org.springframework.stereotype.Component

@Component("gamer")
class GameCoach : Coach {

    private lateinit var fortuneService: FortuneService

    override fun getDailyWorkout(): String {
        return "Practice your reaction"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }
}