package com.northcutt.quotetracker.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableAsync
public class AppConfig {
    @Bean
    public DataTransceiver dataTransceiver(){
        return new DataTransceiver();

    }

}
