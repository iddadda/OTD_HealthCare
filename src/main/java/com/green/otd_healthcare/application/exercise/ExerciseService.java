package com.green.otd_healthcare.application.exercise;

import com.green.otd_healthcare.application.exercise.model.ExerciseGetRes;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordPostReq;
import com.green.otd_healthcare.entity.Exercise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExerciseService {
   private final ExerciseRepository exerciseRepository;

//    [GET] exercise
    public List<ExerciseGetRes> getExercises(){
       return exerciseRepository.findAll().stream()
               .map(e -> new ExerciseGetRes(
                       e.getExerciseId(),
                       e.getExerciseName(),
                       e.getMet()
               )).toList();

    }
}
