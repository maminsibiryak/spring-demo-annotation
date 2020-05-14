package com.example.springdemoannotation

import org.springframework.context.support.ClassPathXmlApplicationContext

class AnnotationDemoApp {
}

fun main() {
    //read spring config file
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    //get the bean from spring container
    val thatSillyCoach = context.getBean("thatSillyCoach", Coach::class.java)
    //call a method on the bean
    println(thatSillyCoach.getDailyWorkout())
    //close the context
    context.close()
}