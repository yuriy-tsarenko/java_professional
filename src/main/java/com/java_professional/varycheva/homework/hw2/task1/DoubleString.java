package com.java_professional.varycheva.homework.hw2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DoubleString {

    private final String inputString;
    private final String[] values;

    public DoubleString() {
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();
        values = inputString.split(" ");
    }

    public String getInputString() {
        return inputString;
    }

    private int getSize() {
        return values.length;
    }

    private ArrayList<String> makeDoubleString() {
        ArrayList<String> array = new ArrayList<>(getSize() * 2);
        for (int i = 0; i < getSize(); i++) {
            array.addAll(Arrays.asList(values[i], values[i]));
        }
        return array;
    }

    public void printArray() {
        ArrayList<String> arrayList = makeDoubleString();
        arrayList.forEach(System.out::println);
    }
}
