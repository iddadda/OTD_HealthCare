package com.green.otd_healthcare.application.exerciseRecord;

import com.green.otd_healthcare.application.common.model.PagingDto;
import com.green.otd_healthcare.application.exerciseRecord.model.ExerciseRecordGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExerciseRecordMapper {

    List<ExerciseRecordGetRes> findByLimitTo(PagingDto dto);
}
