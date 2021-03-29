package com.java_professional.tsarenko.classwork.lesson9.example10;

import java.util.concurrent.Exchanger;

public class DemoExchanger {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        PutThread target = new PutThread(exchanger, "Thread - 0");

        Thread thread = new Thread(target);
        thread.start();

        GetThread target1 = new GetThread(exchanger, "Thread - 1");

        Thread thread1 = new Thread(target1);
        thread1.start();
    }
}

