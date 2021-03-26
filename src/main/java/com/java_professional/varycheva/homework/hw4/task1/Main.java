package com.java_professional.varycheva.homework.hw4.task1;

import java.io.File;

import static com.java_professional.varycheva.homework.hw4.task1.WorkWithFile.*;

public class Main {
    public static void main(String[] args) {
        String filename = "src/main/java/com/java_professional/varycheva/homework/hw4/task1/hw.txt";
        createAndWriteFile(filename, "Test data");
        System.out.println(readFile(new File(filename)));

    }
}
