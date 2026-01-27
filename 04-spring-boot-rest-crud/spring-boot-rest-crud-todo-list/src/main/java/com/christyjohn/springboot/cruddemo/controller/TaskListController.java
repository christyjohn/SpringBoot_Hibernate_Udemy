package com.christyjohn.springboot.cruddemo.controller;

import com.christyjohn.springboot.cruddemo.entity.Task;
import com.christyjohn.springboot.cruddemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskListController {

    private TaskService taskService;

    @Autowired
    public TaskListController(TaskService toDoService) {
        this.taskService = toDoService;
    }

    @GetMapping("/tasklist")
    public List<Task> findAll() {
        return taskService.findAll();
    }
}
