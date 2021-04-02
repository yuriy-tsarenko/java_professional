package com.java_professional.tsarenko.classwork.lesson9.example7;

import java.util.concurrent.Semaphore;

class CountThread implements Runnable {

    private final CommonResource commonResource;
    private final Semaphore semaphore;
    private final String name;

    CountThread(CommonResource commonResource, Semaphore semaphore, String name) {
        this.commonResource = commonResource;
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {

        try {
            System.out.println(this.name + " ожидает разрешение");
            semaphore.acquire();
            Thread.sleep(2_000);
            System.out.println(this.name + " разрешение получил");
            commonResource.setResource(1);
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + " работает");
                commonResource.setResource(i);
                Thread.sleep(2_000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();
        System.out.println(name + " завершил работу");
    }
}
