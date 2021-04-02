package com.java_professional.tsarenko.classwork.lesson8.serialization.serialization1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Car implements Serializable {
    private int price;
    private String model;

    Car(int price, String model) {
        this.price = price;
        this.model = model;
    }
}