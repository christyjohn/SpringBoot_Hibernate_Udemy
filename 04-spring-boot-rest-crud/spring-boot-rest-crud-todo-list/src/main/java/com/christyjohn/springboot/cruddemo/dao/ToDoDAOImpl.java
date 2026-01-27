package com.christyjohn.springboot.cruddemo.dao;

import com.christyjohn.springboot.cruddemo.entity.ToDo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ToDoDAOImpl implements ToDoDAO {

    @NonNull
    private EntityManager entityManager;

    @Override
    public List<ToDo> findAll() {
        // create a query
        TypedQuery<ToDo> query = entityManager.createQuery("from ToDo", ToDo.class);

        // execute query and get result list
        List<ToDo> toDoList = query.getResultList();

        return toDoList;
    }
}
