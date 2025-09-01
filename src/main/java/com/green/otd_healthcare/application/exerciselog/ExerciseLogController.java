package com.green.otd_healthcare.application.exerciselog;

import com.green.otd_healthcare.application.exercise.ExerciseRepository;
import com.green.otd_healthcare.application.exercise.ExerciseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class ExerciseLogController {
    private final ExerciseService exerciseService;
}
