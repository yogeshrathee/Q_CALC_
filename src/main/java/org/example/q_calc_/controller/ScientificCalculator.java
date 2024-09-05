package org.example.q_calc_.controller;


import org.example.q_calc_.service.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Figure-out")
public class ScientificCalculator {

    private final Calculator calculator;


    public ScientificCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    // Scientific Operations
    @GetMapping("/sin")
    public double sin(@RequestParam double a) {
        calculator.sin(a);
        return calculator.getResult();
    }

    @GetMapping("/cos")
    public double cos(@RequestParam double a) {
        calculator.cos(a);
        return calculator.getResult();
    }

    @GetMapping("/tan")
    public double tan(@RequestParam double a) {
        calculator.tan(a);
        return calculator.getResult();
    }

    @GetMapping("/log")
    public double log(@RequestParam double a) {
        calculator.log(a);
        return calculator.getResult();
    }

    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double a) {
        calculator.sqrt(a);
        return calculator.getResult();
    }

    @GetMapping("/cbrt")
    public double cbrt(@RequestParam double a) {
        calculator.cbrt(a);
        return calculator.getResult();
    }

    @GetMapping("/square")
    public double square(@RequestParam double a) {
        calculator.square(a);
        return calculator.getResult();
    }
}