package com.java_professional.tsarenko.classwork.lesson9.example10;

import java.util.concurrent.Exchanger;

class GetThread implements Runnable {

    Exchanger<String> exchanger;
    String message;

    GetThread(Exchanger<String> exchanger, String message) {

        this.exchanger = exchanger;
        this.message = message;
    }

    public void run() {

        try {
            message = exchanger.exchange(message);
            System.out.println(Thread.currentThread().getName() + " :" + message);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
