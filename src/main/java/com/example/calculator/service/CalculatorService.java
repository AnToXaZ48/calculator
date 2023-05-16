package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public float calculate(float averageSalary, int holidayDuration) {
        return averageSalary / 30 * holidayDuration;
    }
}