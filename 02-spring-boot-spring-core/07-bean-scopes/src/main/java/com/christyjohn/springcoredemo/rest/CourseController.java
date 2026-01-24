package com.christyjohn.springcoredemo.rest;

import com.christyjohn.springcoredemo.common.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private Tutor theTutor;
    private Tutor anotherTutor;

    @Autowired
    public CourseController(@Qualifier("javaTutor") Tutor theTutor,
                            @Qualifier("javaTutor") Tutor anotherTutor) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.theTutor = theTutor;
        this.anotherTutor = anotherTutor;
    }

    @GetMapping("/dailyCourseSchedule")
    public String getDailyCourseShedule() {
        return theTutor.getDailyCourseSchedule();
    }

    @GetMapping("/checkscope")
    public String checkScope() {
        return "Comparing beans: theTutor == anotherTutor, " +
                (theTutor == anotherTutor);
    }
}
