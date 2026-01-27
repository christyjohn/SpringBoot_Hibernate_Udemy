package com.christyjohn.springboot.cruddemo.dao;

import com.christyjohn.springboot.cruddemo.entity.ToDo;

import java.util.List;

public interface ToDoDAO {

    List<ToDo> findAll();
}
