package com.green.otd_healthcare.application.healthlog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class HealthLogController {
    private final HealthLogService healthLogService;
}
