package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class TennisCoach() : Coach {
    //field injection
    @Autowired
    @Qualifier("randomFortuneService")
    private lateinit var fortuneService: FortuneService
    //   constructor injection
    //    @Autowired
    //    constructor(@Qualifier("randomFortuneService") theFortuneService: FortuneService) : this() {
    //        this.fortuneService = theFortuneService
    //    }

    //setter injection
    /*@Autowired
    fun doSomeCrazy(fortuneService: FortuneService) {
        this.fortuneService = fortuneService
    }*/

    //constructor injection
    //  @Autowired
    //   private var fortuneServiceBad: FortuneService = theFortuneService

    override fun getDailyWorkout(): String {
        return "Practice your backhand volley"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }
}