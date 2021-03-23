package com.java_professional.cherednichenko.homework.lesson_2.task_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LInkedListWithInteger list = new LInkedListWithInteger(getLinkedList());
        list.getIntegerReverseList();
        list.getIntegerShuffleList();
        list.getMinimum();
    }

    public static LinkedList<Integer> getLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner((System.in));
        for (int i = 0; i < 10; i++) {
            System.out.print("Input int: ");
            list.add(scanner.nextInt());
        }
        return list;
    }
}
