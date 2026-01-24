package com.christyjohn.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dsaTutor") // we need to add annotation at both levels
public class DSATutor implements Tutor {

    @Override
    public String getDailyCourseSchedule() {
        return "Learn Graph Algorithms and practice 5 problems (easy, medium, and hard each)" +
                " from Leetcode.";
    }
}
