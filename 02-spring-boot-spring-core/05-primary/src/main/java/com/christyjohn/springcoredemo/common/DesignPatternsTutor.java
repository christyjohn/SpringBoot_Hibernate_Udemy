package com.christyjohn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class DesignPatternsTutor implements Tutor {

    @Override
    public String getDailyCourseSchedule() {
        return "Learn 1 new Design Pattern from Behavioral, Constructional, and Structural Patterns.";
    }
}
