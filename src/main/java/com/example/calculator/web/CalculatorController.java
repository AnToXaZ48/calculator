package com.example.calculator.web;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculate")
    public String calculate(@RequestParam("averageSalary") float averageSalary,
                            @RequestParam("holidayDuration") int holidayDuration) {
        return "Отпускные: " + calculatorService.calculate(averageSalary, holidayDuration);
    }
}