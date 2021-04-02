package com.java_professional.tsarenko.classwork.lesson9.example7;

import java.util.concurrent.Semaphore;

class SemaphoreMain {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1); // 1 разрешение
        CommonResource resource = new CommonResource();
        new Thread(new CountThread(resource, semaphore, "CountThread 1")).start();
        new Thread(new CountThread(resource, semaphore, "CountThread 2")).start();
        new Thread(new CountThread(resource, semaphore, "CountThread 3")).start();
    }

}
