package com.green.otd_healthcare.application.exerciseRecord;


import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordPostReq;
import com.green.otd_healthcare.configuration.model.ResultResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/OTD/health")
@RequiredArgsConstructor
public class ExerciseRecordController {

    private final ExerciseRecordService exerciseRecordService;

    @PostMapping("/elog")
    public ResultResponse<?> saveExerciseRecord(@Valid @RequestBody ExerciseRecordPostReq req) {
        log.info("req:{}", req);

        Long result = exerciseRecordService.saveExerciseRecord(req);
        return new ResultResponse<>("운동기록 저장 성공", result);
    }
}
