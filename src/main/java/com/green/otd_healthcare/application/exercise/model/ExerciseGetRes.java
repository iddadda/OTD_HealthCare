package com.green.otd_healthcare.application.exercise.model;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExerciseGetRes {
    private Long exerciseId;
    private String exerciseName;
    private double met;
}
