package com.christyjohn.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaTutor implements Tutor {

    public JavaTutor() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
        public String getDailyCourseSchedule() {
        return "Read Java Concurrency in Practice";
    }
}
