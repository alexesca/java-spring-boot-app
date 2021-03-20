package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Home {
    @Bean
    void generate() {
        System.out.println("Hello");
    }
}
