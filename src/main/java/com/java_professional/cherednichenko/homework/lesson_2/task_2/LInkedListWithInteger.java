package com.java_professional.cherednichenko.homework.lesson_2.task_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
// Задание 3
//         Минимальное из N чисел(использовать LinkedList):
//         1. Ввести с клавиатуры число N.
//         2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//         3. Найти минимальное число среди элементов списка - метод getMinimum
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
