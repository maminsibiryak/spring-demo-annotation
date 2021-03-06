package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService
import org.springframework.beans.factory.annotation.Value

class SwimUdemyCoach(private val fortuneService: FortuneService) : Coach {

    @Value("\${swim.email}")
    val email: String = ""

    @Value("\${swim.team}")
    val team: String = ""

    override fun getDailyWorkout(): String {
        return "Swim 1000 meters as a warm up"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }

}