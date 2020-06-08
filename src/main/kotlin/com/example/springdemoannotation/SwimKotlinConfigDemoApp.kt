package com.example.springdemoannotation

import com.example.springdemoannotation.config.SportConfig
import com.example.springdemoannotation.service.Coach
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    //read spring config file
    val context = AnnotationConfigApplicationContext(SportConfig::class.java)
    //get the bean from spring container

    val swimCoach = context.getBean("swimUdemyCoach", Coach::class.java)

    //call a method on the bean
    println(swimCoach.getDailyFortune())
    println(swimCoach.getDailyWorkout())

    //close the context
    context.close()
}