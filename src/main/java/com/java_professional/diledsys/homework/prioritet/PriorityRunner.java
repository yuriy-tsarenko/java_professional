package com.java_professional.diledsys.homework.prioritet;

public class PriorityRunner {
    public static void main(String[] args) {
        //MAX_PRIORITY
        PriorityThread priorityThread = new PriorityThread();
        priorityThread.setPriority(Thread.MAX_PRIORITY);
        priorityThread.setName("MAX_PRIORITY");
        priorityThread.start();
        //MIN_PRIORITY
        PriorityThread priorityThread2 = new PriorityThread();
        priorityThread2.setPriority(Thread.MIN_PRIORITY);
        priorityThread2.setName("MIN_PRIORITY");
        priorityThread2.start();
        //NORM_PRIORITY
        PriorityThread priorityThread3 = new PriorityThread();
        priorityThread3.setPriority(Thread.NORM_PRIORITY);
        priorityThread3.setName("NORM_PRIORITY");
        priorityThread3.start();
    }
}
