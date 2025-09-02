package com.green.otd_healthcare.configuration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Builder
public class ResultResponse<T> {
    private final boolean success;
    private final String message;
    private final T resultData;
    private final int statusCode;
    private final String path;
    private final LocalDateTime timestamp;

    public static <T> ResultResponse<T> success(T data, String path) {
        return ResultResponse.<T>builder()
                .success(true)
                .message("요청이 성공했습니다.")
                .resultData(data)
                .statusCode(200)
                .path(path)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public static <T> ResultResponse<T> failure(String message, int statusCode, String path) {
        return ResultResponse.<T>builder()
                .success(false)
                .message(message)
                .resultData(null)
                .statusCode(statusCode)
                .path(path)
                .timestamp(LocalDateTime.now())
                .build();
    }
}