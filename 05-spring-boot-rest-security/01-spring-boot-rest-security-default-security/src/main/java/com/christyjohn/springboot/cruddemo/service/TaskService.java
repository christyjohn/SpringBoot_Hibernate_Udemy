package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task findById(int id);

    Task save(Task task);

    void deleteById(int id);
}
