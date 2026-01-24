package com.christyjohn.springcoredemo.common;

public class BigDataTutor implements Tutor{
    public BigDataTutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyCourseSchedule() {
        return "Do a project with Spark";
    }
}
