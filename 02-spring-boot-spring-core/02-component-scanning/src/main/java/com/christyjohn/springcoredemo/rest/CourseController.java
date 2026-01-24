package com.christyjohn.springcoredemo.rest;

import com.christyjohn.springcoredemo.common.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    // define a private field for the dependency
    private Tutor theTutor;

    @Autowired // if you have only 1 constructor this is optional
    public CourseController(@Qualifier("springTutor") Tutor theTutor) {
        this.theTutor = theTutor;
    }

    @GetMapping("/dailyCourseSchedule")
    public String getDailyCourseShedule() {
        return theTutor.getDailyCourseSchedule();
    }
}
