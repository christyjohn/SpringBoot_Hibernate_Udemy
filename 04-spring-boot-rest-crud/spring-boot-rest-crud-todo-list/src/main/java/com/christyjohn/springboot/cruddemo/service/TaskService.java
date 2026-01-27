package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
}
