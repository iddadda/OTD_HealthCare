package com.green.otd_healthcare.application.exercise;

import com.green.otd_healthcare.application.exercise.model.ExerciseGetRes;
import com.green.otd_healthcare.configuration.model.ResultResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/OTD/health")
@RequiredArgsConstructor
public class ExerciseController {
    private final ExerciseService exerciseService;

//    [GET] exercises
    @GetMapping
    public ResponseEntity<?> getExercise() {
        List<ExerciseGetRes> result = exerciseService.getExercises();
        return ResponseEntity.ok(result);
    }
}
