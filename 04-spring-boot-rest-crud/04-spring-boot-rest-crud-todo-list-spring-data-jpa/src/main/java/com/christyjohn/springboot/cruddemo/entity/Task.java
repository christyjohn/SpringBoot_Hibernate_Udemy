package com.christyjohn.springboot.cruddemo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Entity
@Table(name="task_list")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Task {

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

    @Column(name="created_at")
    @Builder.Default
    private LocalDate createdAt = Instant.ofEpochMilli(System.currentTimeMillis())
            .atZone(ZoneId.systemDefault()).toLocalDate();
}
