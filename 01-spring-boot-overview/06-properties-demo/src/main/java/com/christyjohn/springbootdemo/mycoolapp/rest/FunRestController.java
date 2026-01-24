package com.christyjohn.springbootdemo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose  "/" endpoint that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Welcome to Spring Boot Training!";
    }

    // expose a new endpoint for workout
    @GetMapping("/dailytask")
    public String getDailyWorkout() {
        return "Spend 3 hours on Udemy Spring Boot Course!";
    }

    // expose a new endpoint for fortune
    @GetMapping("/homework")
    public String getDailyFortune() {
        return "Revise the lessons at the end of the day!";
    }
}
