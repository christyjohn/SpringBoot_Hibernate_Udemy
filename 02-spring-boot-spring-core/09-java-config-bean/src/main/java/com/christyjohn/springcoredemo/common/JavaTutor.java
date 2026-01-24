package com.christyjohn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class JavaTutor implements Tutor {

    public JavaTutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyCourseSchedule() {
        return "Read Java Concurrency in Practice";
    }
}
