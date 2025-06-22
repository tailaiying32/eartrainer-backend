package com.eartrainer.eartrainer.controller;

import com.eartrainer.eartrainer.service.IntervalService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/exercise/intervals")
public class IntervalController {

    private final IntervalService intervalService;

    public IntervalController(IntervalService intervalService) {
        this.intervalService = intervalService;
    }

    @GetMapping
    public String[] generateInterval(int level) {
        try {
            return intervalService.generateInterval(level);
        } catch (Exception e) {
            return new String[]{e.getMessage()};
        }
    }
}
