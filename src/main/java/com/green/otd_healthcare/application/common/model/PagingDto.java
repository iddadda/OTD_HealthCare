package com.green.otd_healthcare.application.common.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagingDto {
    private Integer startIdx;
    private Integer size;
}
