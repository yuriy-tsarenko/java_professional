package com.java_professional.cherednichenko.homework.lesson_8.task_2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Bird implements Cloneable {
    private TypeOfBird type;
    private String color;
    private double size;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
