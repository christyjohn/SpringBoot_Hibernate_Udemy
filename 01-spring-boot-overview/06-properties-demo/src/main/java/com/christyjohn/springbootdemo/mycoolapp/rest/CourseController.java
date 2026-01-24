package com.christyjohn.springbootdemo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    // inject properties
    @Value("${tutor.name}")
    private String tutor;

    @Value("${course.name}")
    private String courseName;

    @Value("${student.name}")
    private String student;

    @GetMapping("/course")
    public String getCourse() {
        return student + " is taking a course on '" + courseName + "' by " +
                tutor;
    }
}
