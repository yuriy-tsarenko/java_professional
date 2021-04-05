package com.java_professional.cherednichenko.homework.lesson_9.task_1;

public class Main {
    public static void main(String[] args) {
        NewThread first = new NewThread(5_000);
        NewThread second = new NewThread(6_000);
        NewThread main = new NewThread(7_000);
        first.setName("First_Thread");
        second.setName("Second_Thread");
        main.setName("Main_Thread");
        second.start();
        first.start();
        main.start();
    }
}
