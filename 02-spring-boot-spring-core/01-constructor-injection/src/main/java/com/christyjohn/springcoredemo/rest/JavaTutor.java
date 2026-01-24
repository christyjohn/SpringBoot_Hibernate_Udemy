package com.christyjohn.springcoredemo.rest;

import org.springframework.stereotype.Component;

@Component
public class JavaTutor implements Tutor {

    @Override
    public String getDailyCourseSchedule() {
        return "Read Java Concurrency in Practice";
    }
}
