package com.java_professional.tsarenko.classwork.lesson8.clone.deep.cloning.with.constructor;


public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(20, "Alex");
        Student cloneStudent = new Student(originalStudent);

        System.out.println(originalStudent);
        System.out.println(cloneStudent);
    }
}
