package com.learn.springframework.aop;

import com.learn.springframework.mybeans.Cat;
import com.learn.springframework.mybeans.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration 
@EnableAspectJAutoProxy
public class AnimalFarmConfig {
    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public MethodTimeLoggingAspect aspect() {
        return new MethodTimeLoggingAspect();
    }
}
