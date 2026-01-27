package com.christyjohn.springboot.cruddemo.controller;

import com.christyjohn.springboot.cruddemo.entity.Task;
import com.christyjohn.springboot.cruddemo.exceptions.TaskNotAllowedException;
import com.christyjohn.springboot.cruddemo.exceptions.TaskNotFoundException;
import com.christyjohn.springboot.cruddemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TaskListController {

    private TaskService taskService;
    private JsonMapper jsonMapper;

    @Autowired
    public TaskListController(TaskService toDoService, JsonMapper jsonMapper) {
        this.taskService = toDoService;
        this.jsonMapper = jsonMapper;
    }

    @GetMapping("/tasklist")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @GetMapping("/tasklist/{taskId}")
    public Task getTask(@PathVariable int taskId) {
        Task task = taskService.findById(taskId);

        if(task  == null) {
            throw new TaskNotFoundException("Task with id: " + taskId + " not found.");
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
            throw new TaskNotFoundException("Task with id: " + taskId + " not found." );
        }

        taskService.deleteById(taskId);

        return "Deleted task with id: " + taskId;
    }

    @PatchMapping("tasklist/{taskId}")
    public Task patchTask(@PathVariable int taskId, @RequestBody Map<String, Object> patchPayload) {
        Task task = taskService.findById(taskId);

        if (task == null) {
            throw new TaskNotFoundException("Task with id: " + taskId + " not found." );
        }

        if(patchPayload.containsKey("id")) {
            throw new TaskNotAllowedException("Task Id is not allowed in the request body: " +
                    taskId);
        }

        // Apply the partial updates to the existing task object
        Task patchedTask = jsonMapper.updateValue(task, patchPayload);
        patchedTask = taskService.save(patchedTask);

        return patchedTask;
    }
}
