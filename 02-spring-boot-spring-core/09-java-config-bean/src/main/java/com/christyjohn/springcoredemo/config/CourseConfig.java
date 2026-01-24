package com.christyjohn.springcoredemo.config;

import com.christyjohn.springcoredemo.common.BigDataTutor;
import com.christyjohn.springcoredemo.common.Tutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {

    @Bean // bean name is same as method name
    public Tutor bigDataTutor() {
        return new BigDataTutor();
    }
}
