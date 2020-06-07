package com.example.springdemoannotation

import com.example.springdemoannotation.config.SportConfig
import com.example.springdemoannotation.domain.SwimCoach
import com.example.springdemoannotation.service.Coach
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    //read spring config file
    val context = AnnotationConfigApplicationContext(SportConfig::class.java)
    //get the bean from spring container
    val thatSillyCoach = context.getBean("tennisCoach", Coach::class.java)
    val gamer = context.getBean("gamer", Coach::class.java)
    val swimCoach = context.getBean("swimCoach", SwimCoach::class.java)
    //call a method on the bean
    println(thatSillyCoach.getDailyWorkout())
    println(gamer.getDailyWorkout())
    println(thatSillyCoach.getDailyFortune())
    println(swimCoach.getDailyFortune())
    println(swimCoach.email)
    println(swimCoach.team)
    //close the context
    context.close()
}