package com.christyjohn.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="instructor_detail")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NonNull
    @Column(name="youtube_channel")
    private String youtubeChannel;

    @NonNull
    @Column(name="hobby")
    private String hobby;
}
