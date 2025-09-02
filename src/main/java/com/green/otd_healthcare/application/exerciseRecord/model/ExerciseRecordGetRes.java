package com.green.otd_healthcare.application.exerciseRecord.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ExerciseRecordGetRes {
    private int exerciseRecordId;
    private int exerciseId;
    private int exerciseDuration;
    private int exerciseKcal;
    private int effortLevel;
    private String exerciseDatetime;
}
