package com.java_professional.cherednichenko.homework.lesson_2.task_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LInkedListWithInteger {

    public void getIntegerReverseList(LinkedList<Integer> linkedList) {
        Comparator<Integer> comparator = Collections.reverseOrder();
        linkedList.sort(comparator);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }

    public void getIntegerShuffleList(LinkedList<Integer> linkedList) {
        Collections.shuffle(linkedList);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }

    public void getMinimum(LinkedList<Integer> linkedList) {
        System.out.println("Min: " + Collections.min(linkedList));
    }
}
