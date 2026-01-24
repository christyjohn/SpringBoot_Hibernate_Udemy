package com.christyjohn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SpringTutor implements Tutor {

    public SpringTutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyCourseSchedule() {
        return "Implement Spring MVC JPA CRUD application.";
    }
}
