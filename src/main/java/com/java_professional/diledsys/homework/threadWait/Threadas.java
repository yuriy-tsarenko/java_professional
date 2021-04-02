package com.java_professional.diledsys.homework.threadWait;

import java.util.ArrayList;

public class Threadas extends Thread {
    @Override
    public void run() {
        ArrayList<Thread> arrayList = new ArrayList();
        arrayList.add(new Thread("first"));
        arrayList.add(new Thread("second"));
        arrayList.add(new Thread("three"));
        arrayList.forEach(Thread::start);
        arrayList.forEach(Thread::interrupt);
        arrayList.forEach(thread -> {
            if (thread.isInterrupted()) System.out.println(thread.getName() + " закончил работу");
        });
    }
}
