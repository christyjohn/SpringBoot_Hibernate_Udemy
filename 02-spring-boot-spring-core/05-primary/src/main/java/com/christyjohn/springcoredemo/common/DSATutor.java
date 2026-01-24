package com.christyjohn.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Qualifier has preference over Primary
public class DSATutor implements Tutor {

    @Override
    public String getDailyCourseSchedule() {
        return "Learn Graph Algorithms and practice 5 problems (easy, medium, and hard each)" +
                " from Leetcode.";
    }
}
