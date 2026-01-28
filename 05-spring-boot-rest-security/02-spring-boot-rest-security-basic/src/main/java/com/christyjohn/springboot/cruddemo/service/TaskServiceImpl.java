package com.christyjohn.springboot.cruddemo.service;

import com.christyjohn.springboot.cruddemo.dao.TaskRepository;
import com.christyjohn.springboot.cruddemo.entity.Task;
import com.christyjohn.springboot.cruddemo.exceptions.TaskNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(int id) {
        Optional<Task> result = taskRepository.findById(id);

        Task task  = null;

        if(result.isPresent()) {
            task = result.get();
        } else {
            throw new TaskNotFoundException("Did not find task with id - " + id);
        }

        return task;
    }

    @Override
    @Transactional
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        taskRepository.deleteById(id);
    }
}
