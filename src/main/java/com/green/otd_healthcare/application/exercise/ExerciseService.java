package com.green.otd_healthcare.application.exercise;

import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExerciseService {
    ExerciseRepository exerciseRepository;


}
