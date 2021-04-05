package com.java_professional.tsarenko.classwork.lesson10.example1.withoutLambdaExpression;

public class Lamp implements ElectricityConsumer {

    private void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
