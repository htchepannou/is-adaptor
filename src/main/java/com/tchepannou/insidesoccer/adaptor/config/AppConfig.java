package com.tchepannou.insidesoccer.adaptor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.tchepannou.insidesoccer.adaptor.service.GreetingService;
import com.tchepannou.insidesoccer.adaptor.service.impl.GreetingServiceImpl;

/**
 * Declare your services here!
 */
@Configuration
public class AppConfig {
    @Bean
    GreetingService greetingService (){
        return new GreetingServiceImpl();
    }
}
