package com.christyjohn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SpringTutor implements Tutor {

    @Override
    public String getDailyCourseSchedule() {
        return "Implement Spring MVC JPA CRUD application.";
    }
}
