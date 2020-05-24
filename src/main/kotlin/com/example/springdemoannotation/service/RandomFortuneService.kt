package com.example.springdemoannotation.service

import org.springframework.stereotype.Component
import java.util.*

@Component
class RandomFortuneService : FortuneService {
    //create an array of strings
    private val data = listOf<String>(
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    )
    private val random = Random()
    override fun getFortune(): String {
        //pick a random string from the array
        val index = random.nextInt(data.size)
        return data[index]
    }
}