package org.example.q_calc_.controller;


import org.example.q_calc_.service.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Figure-out")
public class StandardCalculator {

    private final Calculator calculator;


    public StandardCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    // Standard Operations
    @GetMapping("/add")
    public double add(@RequestParam double d, @RequestParam double e) {
        calculator.add(d, e);
        return calculator.getResult();
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double num1, @RequestParam double num2) {
        calculator.subtract(num1, num2);
        return calculator.getResult();
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double d, @RequestParam double e) {
        calculator.multiply(d, e);
        return calculator.getResult();
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        calculator.divide(num1, num2);
        return calculator.getResult();
    }
}