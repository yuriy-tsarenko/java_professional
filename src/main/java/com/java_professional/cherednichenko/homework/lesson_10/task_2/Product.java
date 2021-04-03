package com.java_professional.cherednichenko.homework.lesson_10.task_2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {
    private int amount;
    private int price;
    private String name;
}
