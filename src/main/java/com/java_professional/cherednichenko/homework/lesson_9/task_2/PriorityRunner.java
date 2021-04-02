package com.java_professional.cherednichenko.homework.lesson_9.task_2;

import com.java_professional.tsarenko.classwork.lesson9.ProgressBar;

public class PriorityRunner implements Runnable {
    @Override
    public void run() {
        ProgressBar progressBar = new ProgressBar();
        for (int i = 1; i <= 50; i++) {
            progressBar.setProgress(i, 50);
        }
    }
}
