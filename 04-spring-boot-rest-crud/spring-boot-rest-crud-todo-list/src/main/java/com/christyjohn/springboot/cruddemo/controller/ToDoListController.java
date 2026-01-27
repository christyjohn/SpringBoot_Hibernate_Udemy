package com.christyjohn.springboot.cruddemo.controller;

import com.christyjohn.springboot.cruddemo.entity.ToDo;
import com.christyjohn.springboot.cruddemo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToDoListController {

    private ToDoService toDoService;

    @Autowired
    public ToDoListController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/todolist")
    public List<ToDo> findAll() {
        return toDoService.findAll();
    }
}
