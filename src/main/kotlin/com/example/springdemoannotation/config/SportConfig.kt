package com.example.springdemoannotation.config

import com.example.springdemoannotation.domain.SwimUdemyCoach
import com.example.springdemoannotation.service.Coach
import com.example.springdemoannotation.service.FortuneService
import com.example.springdemoannotation.service.SadFortuneService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource


@Configuration
//@ComponentScan("com.example.springdemoannotation")
@PropertySource("classpath:properties/sport.properties")
class SportConfig {
    //define bean for a sad fortune service
    @Bean
    fun sadFortuneService(): FortuneService {
        return SadFortuneService()
    }

    //define bean for our swim coach AND inject dependency
    @Bean
    fun swimUdemyCoach(): Coach {
        return SwimUdemyCoach(sadFortuneService())
    }
}
