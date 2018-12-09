package com.learn.springframework.ioc.beanfactorypostprocessor;

import com.learn.springframework.ioc.mybeans.Cat;
import com.learn.springframework.ioc.mybeans.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalFarmConfig {
    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }

    // NB it's STATIC!
    @Bean
    static public SoxComplianceSuite complianceSuite() throws Throwable {
        return new SoxComplianceSuite();
    }


}
