package com.example.springdemoannotation

import org.springframework.stereotype.Component

@Component("thatSillyCoach")
class TennisCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Practice your backhand volley"
    }
}