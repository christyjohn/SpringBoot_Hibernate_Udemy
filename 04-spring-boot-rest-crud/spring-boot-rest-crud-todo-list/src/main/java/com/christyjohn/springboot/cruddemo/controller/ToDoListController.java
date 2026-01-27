package com.christyjohn.springboot.cruddemo.controller;

import com.christyjohn.springboot.cruddemo.dao.ToDoDAO;
import com.christyjohn.springboot.cruddemo.entity.ToDo;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ToDoListController {

    @NonNull
    private ToDoDAO toDoDAO;

    @GetMapping("/todolist")
    public List<ToDo> getToDOList() {
        return toDoDAO.findAll();
    }
}
