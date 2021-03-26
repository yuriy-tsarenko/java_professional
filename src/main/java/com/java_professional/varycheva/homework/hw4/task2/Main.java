package com.java_professional.varycheva.homework.hw4.task2;

import static com.java_professional.varycheva.homework.hw4.task2.FileWithNumbers.*;

public class Main {
    public static void main(String[] args) {
        createAndWriteRandomNumbersToFile("randomNumb.txt", 10);
        readAndSortNumbers("randomNumb.txt");
    }
}
