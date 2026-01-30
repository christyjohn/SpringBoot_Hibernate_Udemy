package com.christyjohn.cruddemo.dao;

import com.christyjohn.cruddemo.entity.Instructor;
import com.christyjohn.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int id);
}
