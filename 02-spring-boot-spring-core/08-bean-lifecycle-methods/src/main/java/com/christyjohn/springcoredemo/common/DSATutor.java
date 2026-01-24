package com.christyjohn.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class DSATutor implements Tutor {

    public DSATutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyCourseSchedule() {
        return "Learn Graph Algorithms and practice 5 problems (easy, medium, and hard each)" +
                " from Leetcode.";
    }
}
