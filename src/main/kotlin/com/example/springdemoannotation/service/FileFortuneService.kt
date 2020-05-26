package com.example.springdemoannotation.service

import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Component
import java.util.*
import javax.annotation.PostConstruct


@Component
class FileFortuneService : FortuneService {
    private var dataFromFile = listOf<String>()
    private val random = Random()

    @PostConstruct
    private fun init(): List<String> {
        val resource = ClassPathResource("data.txt").file
        dataFromFile = resource.bufferedReader().readLines()
        return dataFromFile
    }

    override fun getFortune(): String {
        return init()[random.nextInt(init().size)]
    }
}