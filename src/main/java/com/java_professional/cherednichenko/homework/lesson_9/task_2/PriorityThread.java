package com.java_professional.cherednichenko.homework.lesson_9.task_2;

public class PriorityThread extends Thread {
    public PriorityThread(String name, Runnable runnable) {
        super(runnable, name);
    }

    public static void main(String[] args) {
        PriorityRunner priorityRunner = new PriorityRunner();
        PriorityThread firstPriorityThread = new PriorityThread("Max", priorityRunner);
        PriorityThread secondPriorityThread = new PriorityThread("Mid", priorityRunner);
        PriorityThread thirdPriorityThread = new PriorityThread("Min", priorityRunner);
        firstPriorityThread.setPriority(Thread.MAX_PRIORITY);
        firstPriorityThread.start();
        secondPriorityThread.setPriority(Thread.NORM_PRIORITY);
        secondPriorityThread.start();
        thirdPriorityThread.setPriority(Thread.MIN_PRIORITY);
        thirdPriorityThread.start();
    }
}
