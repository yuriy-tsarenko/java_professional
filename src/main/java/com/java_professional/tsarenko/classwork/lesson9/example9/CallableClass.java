package com.java_professional.tsarenko.classwork.lesson9.example9;

import java.util.concurrent.Callable;

//-----------------------------------------------------
// Класс, реализующий интерфейс Callable
class CallableClass implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        // наименование потока, выполняющего
        // callable задачу
        return Thread.currentThread().getName() + " Hello from Thread";
    }
}
