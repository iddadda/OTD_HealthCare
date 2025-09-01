package com.green.otd_healthcare.configuration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ResultResponse<T> {
    private String message;
    private T result;
}
