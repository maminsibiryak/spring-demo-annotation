package com.example.springdemoannotation.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource


@Configuration
@ComponentScan("com.example.springdemoannotation")
@PropertySource("classpath:properties/sport.properties")
class SportConfig {

}
