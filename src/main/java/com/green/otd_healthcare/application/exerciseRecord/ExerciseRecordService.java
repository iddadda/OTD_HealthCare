package com.green.otd_healthcare.application.exerciseRecord;

import com.green.otd_healthcare.application.exercise.ExerciseRepository;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordPostReq;
import com.green.otd_healthcare.entity.Exercise;
import com.green.otd_healthcare.entity.ExerciseRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExerciseRecordService {
    private final ExerciseRecordRepository exerciseRecordRepository;
    private final ExerciseRepository exerciseRepository;

    //    [post] exerciseRecord
    public Long saveExerciseRecord(ExerciseRecordPostReq req) {
//        exercise 존재 여부 확인
        Exercise exerciseId = exerciseRepository.findById(req.getExerciseId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "존재하지 않는 운동입니다."));

//                exerciseRecord 생성
        ExerciseRecord exerciseRecord = ExerciseRecord.builder()
                .exerciseDuration(req.getExerciseDuration())
                .exerciseKcal(req.getExerciseKcal())
                .effortLevel(req.getEffortLevel())
                .exercise(exerciseId)
                .exerciseDateTime(req.getExerciseDateTime())
                .build();


        return exerciseRecordRepository.save(exerciseRecord).getExerciseRecordId();
    }

}
