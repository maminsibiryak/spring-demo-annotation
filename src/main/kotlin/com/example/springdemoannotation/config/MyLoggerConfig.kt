package com.example.springdemoannotation.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.SimpleFormatter
import javax.annotation.PostConstruct


@Configuration
@PropertySource("classpath:properties/logging.properties")
class MyLoggerConfig {
    @Value("\${root.logger.level}")
    private val rootLoggerLevel: String? = null

    @Value("\${printed.logger.level}")
    private val printedLoggerLevel: String? = null

    @PostConstruct
    fun initLogger() {

        // parse levels
        val rootLevel = Level.parse(rootLoggerLevel)
        val printedLevel = Level.parse(printedLoggerLevel)

        // get logger for app context
        val applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext::class.java.name)

        // get parent logger
        val loggerParent = applicationContextLogger.parent

        // set root logging level
        loggerParent.level = rootLevel

        // set up console handler
        val consoleHandler = ConsoleHandler()
        consoleHandler.level = printedLevel
        consoleHandler.formatter = SimpleFormatter()

        // add handler to the logger
        loggerParent.addHandler(consoleHandler)
    }
}