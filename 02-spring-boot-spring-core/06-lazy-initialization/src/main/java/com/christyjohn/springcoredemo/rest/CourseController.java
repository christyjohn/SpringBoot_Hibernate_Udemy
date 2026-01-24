package com.christyjohn.springcoredemo.rest;

import com.christyjohn.springcoredemo.common.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private Tutor theTutor;

    @Autowired
    public CourseController(@Qualifier("designPatternsTutor") Tutor theTutor) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.theTutor = theTutor;
    }


    @GetMapping("/dailyCourseSchedule")
    public String getDailyCourseShedule() {
        return theTutor.getDailyCourseSchedule();
    }
}
