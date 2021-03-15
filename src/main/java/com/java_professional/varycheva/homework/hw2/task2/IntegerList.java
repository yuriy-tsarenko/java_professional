package com.java_professional.varycheva.homework.hw2.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IntegerList {

    private final List<Integer> integerList = new LinkedList<>();
    private final int size;

    public IntegerList() {
        System.out.println("Введите с клавиатуры число N:");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
    }

    public List<Integer> getIntegerList() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }

    public int getSize() {
        return size;
    }

    public int getMinimum() {
        int min = integerList.get(0);
        for (int i = 1; i < getSize(); i++) {
            if (integerList.get(i) < min) {
                min = integerList.get(i);
            }
        }
        return min;
    }
}
