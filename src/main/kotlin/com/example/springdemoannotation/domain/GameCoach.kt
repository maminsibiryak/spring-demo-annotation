package com.example.springdemoannotation.domain

import com.example.springdemoannotation.service.Coach
import org.springframework.stereotype.Component

@Component("gamer")
class GameCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Practice your reaction"
    }
}