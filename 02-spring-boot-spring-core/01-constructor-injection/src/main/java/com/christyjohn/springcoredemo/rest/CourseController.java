package com.christyjohn.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    // use constructor injection when you have required dependencies
    // recommended by the Spring Development team
	
	// use setter injection when you have optional dependencies

    // define a private field for the dependency
    private Tutor theTutor;

    @Autowired // if you have only 1 constructor this is optional
    public CourseController(Tutor theTutor) {
        this.theTutor = theTutor;
    }

    @GetMapping("/dailyCourseSchedule")
    public String getDailyCourseShedule() {
        return theTutor.getDailyCourseSchedule();
    }
}
