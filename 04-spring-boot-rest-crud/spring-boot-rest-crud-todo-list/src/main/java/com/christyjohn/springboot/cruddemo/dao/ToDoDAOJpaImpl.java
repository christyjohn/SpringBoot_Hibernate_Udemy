package com.christyjohn.springboot.cruddemo.dao;

import com.christyjohn.springboot.cruddemo.entity.ToDo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToDoDAOJpaImpl implements ToDoDAO {

    private EntityManager entityManager;

    @Autowired
    public ToDoDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<ToDo> findAll() {
        // create a query
        TypedQuery<ToDo> query = entityManager.createQuery("from ToDo", ToDo.class);

        // execute query and get result list
        List<ToDo> toDoList = query.getResultList();

        return toDoList;
    }
}
