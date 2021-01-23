package com.examplespringbean.demo.config;

import com.examplespringbean.demo.Dog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Value("${dog.say}")
    private String say;

    @Bean
    public Dog getDog() {
        Dog dog = new Dog();
       dog.setSay(say);
        return dog;
    }

}
