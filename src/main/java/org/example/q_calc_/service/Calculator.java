package org.example.q_calc_.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    private double result;

    // Standard Operations
    public void add(double d, double e) {
        double result = d + e;
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public void subtract(double num1, double num2) {
        double result = num1 - num2;
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public void multiply(double d, double e) {
        double result = d * e;
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        result = num1 / num2;
    }

    // Scientific Operations
    public void sin(double a) {
        result = Math.sin(a);
    }

    public void cos(double a) {
        result = Math.cos(a);
    }

    public void tan(double a) {
        result = Math.tan(a);
    }

    public void log(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Logarithm domain error");
        }
        result = Math.log(a);
    }

    public void sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Square root domain error");
        }
        result = Math.sqrt(a);
    }

    public void cbrt(double a) {
        result = Math.cbrt(a);
    }

    public void square(double a) {
        double result = Math.pow(a, 2);
        if (Double.isInfinite(result)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    // Logic Operations
    public void and(int num1, int num2) {
        result = num1 & num2;
    }

    public void or(int num1, int num2) {
        result = num1 | num2;
    }

    public void xor(int num1, int num2) {
        result = num1 ^ num2;
    }

    public void not(int num1) {
        result = ~num1;
    }

    public double getResult() {
        return result;
    }
}
