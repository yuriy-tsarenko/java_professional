package com.java_professional.tsarenko.classwork.lesson9.example6;

// класс Производитель
public class Plant implements Runnable {

    Store store;

    Plant(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
