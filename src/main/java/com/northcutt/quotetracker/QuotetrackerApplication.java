package com.northcutt.quotetracker;

import com.northcutt.quotetracker.backend.DataTransceiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication


public class QuotetrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuotetrackerApplication.class, args);
        DataTransceiver dataTransceiver = new DataTransceiver();

    }
}
