package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.dao.TaskDAO;
import com.christyjohn.springboot.cruddemo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    @Autowired
    public TaskServiceImpl(TaskDAO toDoDAO) {
        this.taskDAO = toDoDAO;
    }

    @Override
    public List<Task> findAll() {
        return taskDAO.findAll();
    }
}
