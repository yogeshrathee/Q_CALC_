package org.example.q_calc_.controller;


import org.example.q_calc_.service.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Figure-out")
public class LogicCalculator {

    private final Calculator calculator;

    public LogicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    // Logic Operations
    @GetMapping("/and")
    public double and(@RequestParam int num1, @RequestParam int num2) {
        calculator.and(num1, num2);
        return calculator.getResult();
    }

    @GetMapping("/or")
    public double or(@RequestParam int num1, @RequestParam int num2) {
        calculator.or(num1, num2);
        return calculator.getResult();
    }

    @GetMapping("/xor")
    public double xor(@RequestParam int num1, @RequestParam int num2) {
        calculator.xor(num1, num2);
        return calculator.getResult();
    }

    @GetMapping("/not")
    public double not(@RequestParam int num1) {
        calculator.not(num1);
        return calculator.getResult();
    }
}