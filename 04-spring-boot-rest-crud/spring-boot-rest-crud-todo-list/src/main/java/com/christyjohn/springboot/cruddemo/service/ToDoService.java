package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.entity.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> findAll();
}
