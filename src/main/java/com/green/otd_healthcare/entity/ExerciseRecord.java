package com.green.otd_healthcare.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ExerciseRecord{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long exerciseRecordId;

    @ManyToOne
    @JoinColumn(nullable = false, name = "exercise_id")
    private Exercise exercise;

    @Column(nullable = false)
    private Integer effortLevel;

    @Column(nullable = false)
    private Integer exerciseDuration;

    @Column(nullable = false)
    private Integer exerciseKcal;

    @Column(nullable = false)
    private LocalDateTime exerciseDatetime;





}
