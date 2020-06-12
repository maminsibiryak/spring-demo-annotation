package com.example.springdemoannotation

import com.example.springdemoannotation.config.SportConfig
import com.example.springdemoannotation.domain.ShootCoach
import com.example.springdemoannotation.domain.SwimUdemyCoach
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    //read spring config file
    val context = AnnotationConfigApplicationContext(SportConfig::class.java)
    //get the bean from spring container

    val swimCoach = context.getBean("swimUdemyCoach", SwimUdemyCoach::class.java)
    val shootCoach = context.getBean("shootCoach", ShootCoach::class.java)

    //call a method on the bean
    println(swimCoach.getDailyFortune())
    println(swimCoach.getDailyWorkout())

    //call a method on the bean
    println("Shoot Coach {")
    println(shootCoach.getDailyFortune())
    println(shootCoach.getDailyWorkout())
    println("            }")

    println(swimCoach.email)
    println(swimCoach.team)

    //close the context
    context.close()
}