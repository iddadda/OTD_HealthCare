package com.green.otd_healthcare.application.exerciseRecord;

import com.green.otd_healthcare.application.common.model.PagingDto;
import com.green.otd_healthcare.application.common.model.PagingReq;
import com.green.otd_healthcare.application.exercise.ExerciseRepository;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordGetRes;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordPostReq;
import com.green.otd_healthcare.entity.Exercise;
import com.green.otd_healthcare.entity.ExerciseRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExerciseRecordService {
    private final ExerciseRecordRepository exerciseRecordRepository;
    private final ExerciseRepository exerciseRepository;
    private final ExerciseRecordMapper exerciseRecordMapper;

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
                .exerciseDatetime(req.getExerciseDateTime())
                .build();


        return exerciseRecordRepository.save(exerciseRecord).getExerciseRecordId();
    }

    //    [GET] recordList -> page
    public List<ExerciseRecordGetRes> getExerciseLogList(PagingReq req) {
        PagingDto dto = PagingDto.builder()
                .size(req.getRowPerPage())
                .startIdx((req.getPage() - 1) * req.getRowPerPage())
                .build();

        return exerciseRecordMapper.findByLimitTo(dto);
    }

}
