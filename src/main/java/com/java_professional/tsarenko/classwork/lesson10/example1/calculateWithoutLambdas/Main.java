package com.java_professional.tsarenko.classwork.lesson10.example1.calculateWithoutLambdas;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation() {
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int z = operation.calculate(20, 10);

        System.out.println(z); // 30
    }
}

