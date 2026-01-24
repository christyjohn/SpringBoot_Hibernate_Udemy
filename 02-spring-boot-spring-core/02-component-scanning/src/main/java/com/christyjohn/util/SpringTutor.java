package com.christyjohn.util;

import com.christyjohn.springcoredemo.common.Tutor;
import org.springframework.stereotype.Component;

@Component
public class SpringTutor implements Tutor {

    @Override
    public String getDailyCourseSchedule() {
        return "Implement a Spring CRUD JPA application.";
    }
}
