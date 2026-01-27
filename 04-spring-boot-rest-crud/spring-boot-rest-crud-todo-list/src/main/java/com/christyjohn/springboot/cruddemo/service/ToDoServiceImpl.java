package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.dao.ToDoDAO;
import com.christyjohn.springboot.cruddemo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoDAO toDoDAO;

    @Autowired
    public ToDoServiceImpl(ToDoDAO toDoDAO) {
        this.toDoDAO = toDoDAO;
    }

    @Override
    public List<ToDo> findAll() {
        return toDoDAO.findAll();
    }
}
