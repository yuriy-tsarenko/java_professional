package com.java_professional.cherednichenko.homework.lesson_8.task_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car implements Serializable {
    private static String engine = "VeryGoodEngine";
    private double speed;
    private String[] details;
}
