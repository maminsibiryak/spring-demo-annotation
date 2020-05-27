package com.example.springdemoannotation

import com.example.springdemoannotation.service.Coach
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    //load spring config file
    val context = ClassPathXmlApplicationContext("applicationContext.xml")

    //retrieve bean from spring container
    val coach = context.getBean("tennisCoach", Coach::class.java)
    val alphaCoach = context.getBean("tennisCoach", Coach::class.java)

    //check if they are the same
    val result = coach == alphaCoach

    //print out the result
    println("coach memory location $coach")
    println("alphaCoach memory location $alphaCoach")
    println("result $result")

    context.close()
}