package com.java_professional.cherednichenko.homework.lesson_2.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DoubleValues {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Input word:  ");
            stringList.add(scanner.nextLine());
        }
        doubleValue(stringList);
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public static void doubleValue(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            listIterator.set(s + " " + s);
        }
    }
}
