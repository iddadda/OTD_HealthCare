package com.green.otd_healthcare.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class HealthRecord extends CreatedAt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long healthRecordId;

    @Column(nullable = false)
    private int sleepQuality;

    @Column(nullable = false)
    private int moodLevel;

    @Column(nullable = false)
    private int sugarLevel;

    @Column(nullable = false)
    private int diastolicBp;

    @Column(nullable = false)
    private int systolicBp;

    @Column(nullable = false)
    private int height;

    @Column(nullable = false)
    private int weight;
}
