package com.web.jobs.core;

import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Configuration
@ComponentScan(basePackages = "com.web.jobs.core")
public class AppConfig {

    @Bean
    ErrorViewResolver supportPathBasedLocationStrategyWithoutHashes() {
        return (request, status, model) -> status == HttpStatus.NOT_FOUND ? 
                new ModelAndView("index", Collections.emptyMap(), HttpStatus.OK) : 
                null;
    }
}
