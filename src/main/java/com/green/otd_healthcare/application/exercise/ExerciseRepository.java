package com.green.otd_healthcare.application.exercise;

import com.green.otd_healthcare.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
