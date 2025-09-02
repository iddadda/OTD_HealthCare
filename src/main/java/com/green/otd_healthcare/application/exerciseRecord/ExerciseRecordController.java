package com.green.otd_healthcare.application.exerciseRecord;


import com.green.otd_healthcare.application.common.model.PagingReq;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordGetRes;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordPostReq;
import com.green.otd_healthcare.configuration.model.ResultResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<?> saveExerciseRecord(@Valid @RequestBody ExerciseRecordPostReq req) {
        log.info("req:{}", req);

        Long result = exerciseRecordService.saveExerciseRecord(req);
        return ResponseEntity.ok(result);

    }

    // 페이징
    @GetMapping("/elog/list")
    public ResponseEntity<?> getExerciseLogList(@ModelAttribute PagingReq req) {
        log.info("req:{}", req);
        List<ExerciseRecordGetRes> result = exerciseRecordService.getExerciseLogList(req);
        log.info("exerciseLogList_result:{}", result);
        return ResponseEntity.ok(result);

    }
}
