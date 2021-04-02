package com.java_professional.tsarenko.classwork.lesson8.clone.deep.cloning.with.constructor;

import lombok.ToString;

@ToString
public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // copy constructor
    public Student(Student other) {
        this(other.age, other.name);
    }
}
