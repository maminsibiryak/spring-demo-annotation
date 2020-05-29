package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
@Scope("singleton")
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

    //define my init method
    @PostConstruct
    fun doMyStartupStaff() {
        println(">>TennisCoach : inside of doMyStartupStaff()")
    }

    //define my destroy method
    @PreDestroy
    fun doMyCleanupStaff() {
        println(">>TennisCoach : inside of doMyCleanupStaff()")
    }

    override fun getDailyWorkout(): String {
        return "Practice your backhand volley"
    }

    override fun getDailyFortune(): String {
        return fortuneService.getFortune()
    }
}