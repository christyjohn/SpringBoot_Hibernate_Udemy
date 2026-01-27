package com.christyjohn.springboot.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="todo_list")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NonNull
    @Column(name="title")
    private String title;

    @NonNull
    @Column(name="description")
    private String description;

    @NonNull
    @Column(name="is_completed")
    private boolean completed;

    @NonNull
    @Column(name="created_at")
    private LocalDate cratedAt;
}
