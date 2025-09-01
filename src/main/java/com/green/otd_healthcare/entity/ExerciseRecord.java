package com.green.otd_healthcare.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ExerciseRecord extends CreatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long exerciseRecordId;

    @ManyToOne
    @JoinColumn(nullable = false, name = "exercise_id")
    private Exercise exercise;

    @Column(nullable = false)
    private int effortLevel;

    @Column(nullable = false)
    private int exerciseDuration;

    @Column(nullable = false)
    private int exerciseKcal;






}
