package com.christyjohn.cruddemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="instructor_detail")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
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

    // add @OneToOne annotation
    @OneToOne(mappedBy="instructorDetail", cascade = CascadeType.ALL)
    private Instructor instructor;

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
