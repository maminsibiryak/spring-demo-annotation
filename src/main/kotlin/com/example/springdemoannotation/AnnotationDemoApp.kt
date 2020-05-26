package com.example.springdemoannotation

import com.example.springdemoannotation.domain.SwimCoach
import com.example.springdemoannotation.service.Coach
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    //read spring config file
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
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