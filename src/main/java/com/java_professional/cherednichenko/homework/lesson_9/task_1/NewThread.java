package com.java_professional.cherednichenko.homework.lesson_9.task_1;

import org.apache.log4j.Logger;

import java.util.Date;

public class NewThread extends Thread {
    private final Logger logger = Logger.getLogger(NewThread.class);
    private final long timeOut;

    public NewThread(long timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeOut);
            Date date = new Date();
            System.out.println(this.getName() + " task executed!" + "\nFinished at: " + date);
        } catch (InterruptedException e) {
            logger.error(e);
        }
    }
}
