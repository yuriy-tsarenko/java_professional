package com.java_professional.tsarenko.classwork.lesson9.example1;

public class MainTwoThread {
    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo(7_000);
        ThreadDemo threadDemo = new ThreadDemo(5_000);

        thread.setName("thread-0");
        threadDemo.setName("thread-1");

        thread.start();
        threadDemo.start();
    }
}
