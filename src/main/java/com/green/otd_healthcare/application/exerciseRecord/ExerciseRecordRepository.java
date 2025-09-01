package com.green.otd_healthcare.application.exerciseRecord;

import com.green.otd_healthcare.entity.ExerciseRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRecordRepository extends JpaRepository<ExerciseRecord, Long> {
}
