package com.christyjohn.springboot.cruddemo.controller;

import com.christyjohn.springboot.cruddemo.entity.Task;
import com.christyjohn.springboot.cruddemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/tasklist/{taskId}")
    public Task getTask(@PathVariable int taskId) {
        Task task = taskService.findById(taskId);

        if(task  == null) {
            throw new RuntimeException("Task with id: " + taskId + " not found.");
        }

        return task;
    }

    @PostMapping("/tasklist")
    public Task addTask(@RequestBody Task task) {
        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        task.setId(0);

        Task newTask = taskService.save(task);

        return newTask;
    }

    @PutMapping("/tasklist")
    public Task updateTask(@RequestBody Task task) {
        Task updatedTask = taskService.save(task);

        return updatedTask;
    }

    @DeleteMapping("/tasklist/{taskId}")
    public String deleteTask(@PathVariable int taskId) {
        Task task = taskService.findById(taskId);

        if (task == null) {
            throw new RuntimeException("Task with id: " + taskId + " not found." );
        }

        taskService.deleteById(taskId);

        return "Deleted task with id: " + taskId;
    }
}
