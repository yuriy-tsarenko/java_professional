package com.java_professional.tsarenko.classwork.lesson8.clone.deep.cloning.with.staticmethod;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Setter
public class Human {
    private int age;
    private String name;

    public static Human getHumanInstanceWithAgeAndString(int age, String name) {
        Human instance = new Human();
        instance.setAge(age);
        instance.setName(name);
        return instance;
    }
}
