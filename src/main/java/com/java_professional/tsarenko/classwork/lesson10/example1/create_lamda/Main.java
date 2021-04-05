package com.java_professional.tsarenko.classwork.lesson10.example1.create_lamda;

public class Main {
    public static void main(String[] args) {
        String[] name = new String[]{"John", "Victory", "Peter"};
        Workers<String> workers = new Workers<>(name);

        workers.someWork((worker) -> {
            System.out.println(worker + " Hello from lambda");
        });
    }
}
