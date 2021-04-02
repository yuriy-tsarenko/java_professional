package com.java_professional.tsarenko.classwork.lesson8.clone.shallow.cloning;

import lombok.ToString;

@ToString
public class Student implements Cloneable {
    public String name;
    public int age;
    public Group group;

    Student() {

    }

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
