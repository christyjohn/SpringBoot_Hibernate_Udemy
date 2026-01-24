package com.christyjohn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class DesignPatternsTutor implements Tutor {

    public DesignPatternsTutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyCourseSchedule() {
        return "Learn 1 new Design Pattern from Behavioral, Constructional, and Structural Patterns.";
    }
}
