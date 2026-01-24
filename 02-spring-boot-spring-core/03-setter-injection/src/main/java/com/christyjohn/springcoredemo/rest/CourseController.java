package com.christyjohn.springcoredemo.rest;

import com.christyjohn.springcoredemo.common.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    // use setter injection when you have optional dependencies

    // use constructor injection when you have required dependencies
    // recommended by the Spring Development team

    // define a private field for the dependency

    // can use field ijection by autowiring the field and
    // removing constructors and setters. Not preferred anymore

    // @Autowired
    private Tutor theTutor;

    @Autowired
    public void setTheTutor(Tutor theTutor) {
        this.theTutor = theTutor;
    }

    // can autowire any method


    @GetMapping("/dailyCourseSchedule")
    public String getDailyCourseShedule() {
        return theTutor.getDailyCourseSchedule();
    }
}
