package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import org.springframework.stereotype.Component

@Component("thatSillyCoach")
class TennisCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Practice your backhand volley"
    }
}