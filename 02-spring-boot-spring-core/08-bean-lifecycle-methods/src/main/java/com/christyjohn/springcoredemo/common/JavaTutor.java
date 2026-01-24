package com.christyjohn.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class JavaTutor implements Tutor {

    public JavaTutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println("In postConstruct of : " + getClass().getSimpleName() + " bean.");
        System.out.println("Brush up Java concurrency stuff:");
    }

    @Override
    public String getDailyCourseSchedule() {
        return "Read Java Concurrency in Practice";
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("In preDestroy of : " + getClass().getSimpleName() + " bean.");
        System.out.println("Code Producer - Consumer problem using multiple methodologies + (" +
                "synchronized, locks, and blockingQueues)");
    }
}
