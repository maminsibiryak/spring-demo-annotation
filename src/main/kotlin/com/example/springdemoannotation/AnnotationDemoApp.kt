package com.example.springdemoannotation

import com.example.springdemoannotation.service.Coach
import org.springframework.context.support.ClassPathXmlApplicationContext

class AnnotationDemoApp {
}

fun main() {
    //read spring config file
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    //get the bean from spring container
    val thatSillyCoach = context.getBean("tennisCoach", Coach::class.java)
    val gamer = context.getBean("gamer", Coach::class.java)
    //call a method on the bean
    println(thatSillyCoach.getDailyWorkout())
    println(gamer.getDailyWorkout())
    println(thatSillyCoach.getDailyFortune())
    //close the context
    context.close()
}