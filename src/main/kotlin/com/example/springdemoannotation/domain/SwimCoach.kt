package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SwimCoach() : Coach {
    @Value("\${foo.email}")
    lateinit var email: String

    @Value("\${foo.team}")
    lateinit var team: String

    constructor(email: String, team: String) : this() {
        this.email = email
        this.team = team
    }

    @Autowired
    @Qualifier("fileFortuneService")
    private lateinit var fortuneService: FortuneService

    override fun getDailyWorkout(): String {
        return "Swim, swim, swim"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }
}