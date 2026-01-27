package com.christyjohn.springboot.cruddemo.dao;

import com.christyjohn.springboot.cruddemo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path="todolist")
public interface TaskRepository extends JpaRepository<Task, Integer> {

    // that's it ... no need to write any code LOL!
}
