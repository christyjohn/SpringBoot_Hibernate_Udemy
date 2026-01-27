package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.dao.ToDoDAO;
import com.christyjohn.springboot.cruddemo.entity.ToDo;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoServiceImpl implements ToDoService {

    @NonNull
    private ToDoDAO toDoDAO;

    @Override
    public List<ToDo> findAll() {
        return toDoDAO.findAll();
    }
}
