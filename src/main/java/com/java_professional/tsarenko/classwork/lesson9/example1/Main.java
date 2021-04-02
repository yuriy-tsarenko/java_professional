package com.java_professional.tsarenko.classwork.lesson9.example1;

public class Main {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo(5_000);
        t.start();
    }
}
