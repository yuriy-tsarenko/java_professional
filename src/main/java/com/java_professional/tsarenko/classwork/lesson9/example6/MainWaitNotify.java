package com.java_professional.tsarenko.classwork.lesson9.example6;

public class MainWaitNotify {

    public static void main(String[] args) {
        Store store = new Store();
        Plant plant = new Plant(store);
        Consumer consumer = new Consumer(store);
        new Thread(plant).start();
        new Thread(consumer).start();
    }
}
