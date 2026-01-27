package com.christyjohn.springboot.cruddemo.dao;

import com.christyjohn.springboot.cruddemo.entity.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOJPAImpl implements TaskDAO {

    private EntityManager entityManager;

    @Autowired
    public TaskDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Task> findAll() {
        // create a query
        TypedQuery<Task> query = entityManager.createQuery("from Task", Task.class);

        // execute query and get result list
        List<Task> taskList = query.getResultList();

        return taskList;
    }

    @Override
    public Task findById(int id) {
        return null;
    }

    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
