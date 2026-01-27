package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.dao.TaskDAO;
import com.christyjohn.springboot.cruddemo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    @Autowired
    public TaskServiceImpl(TaskDAO taskDao) {
        this.taskDAO = taskDao;
    }

    @Override
    public List<Task> findAll() {
        return taskDAO.findAll();
    }

    @Override
    public Task findById(int id) {
        return taskDAO.findById(id);
    }

    @Override
    @Transactional
    public Task save(Task task) {
        return taskDAO.save(task);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        taskDAO.deleteById(id);
    }
}
