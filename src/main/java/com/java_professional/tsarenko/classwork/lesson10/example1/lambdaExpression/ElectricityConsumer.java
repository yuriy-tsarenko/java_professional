package com.java_professional.tsarenko.classwork.lesson10.example1.lambdaExpression;

// Функциональный интерфейс( с 1 методом )
// Аннотация контролиует, что интерфейс является функциональным
@FunctionalInterface
public interface ElectricityConsumer {

    void electricityOn(Object sender);
}
