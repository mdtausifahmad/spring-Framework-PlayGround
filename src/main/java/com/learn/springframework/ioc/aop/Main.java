package com.learn.springframework.ioc.aop;

import com.learn.springframework.ioc.mybeans.Cat;
import com.learn.springframework.ioc.mybeans.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Throwable {

         ApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AnimalFarmConfig.class);

        Dog dog = annotationConfigApplicationContext.getBean(Dog.class);
        dog.bark();

        Cat cat = annotationConfigApplicationContext.getBean(Cat.class);
        cat.meow();
    }
}
