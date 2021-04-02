package com.java_professional.cherednichenko.homework.lesson_2.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleValues doubleValues = new DoubleValues(stringList());
        doubleValues.doubleValue();
        for (String s : doubleValues.getList()) {
            System.out.println(s);
        }
    }

    public static List<String> stringList() {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Input word:  ");
            list.add(scanner.nextLine());
        }
        return list;
    }
}
