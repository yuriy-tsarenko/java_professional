package com.java_professional.cherednichenko.homework.lesson_2.task_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = getLinkedList();
        LInkedListWithInteger list = new LInkedListWithInteger();
        list.getIntegerReverseList(linkedList);
        list.getIntegerShuffleList(linkedList);
        list.getMinimum(linkedList);
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
