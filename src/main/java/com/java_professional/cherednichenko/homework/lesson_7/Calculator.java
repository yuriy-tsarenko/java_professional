package com.java_professional.cherednichenko.homework.lesson_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@InfoAnnotation(name = "Calculator", description = "this class contains methods with operations on numbers")
public class Calculator extends NewCalculator {
    private int firstNumb;
    private int secondNumb;

    @InfoAnnotation(name = "Summation", description = "this method adds two numbers")
    public int sum() {
        return firstNumb + secondNumb;
    }

    @InfoAnnotation(name = "Subtraction", description = "this method subtracts the second number from the first")
    public int sub() {
        return firstNumb - secondNumb;
    }

    @InfoAnnotation(name = "Multiplication", description = "this method multiplies two numbers")
    public int mul() {
        return firstNumb * secondNumb;
    }

    @InfoAnnotation(name = "Division", description = "this method divides the first number by the second")
    public int div() {
        return firstNumb / secondNumb;
    }

}
