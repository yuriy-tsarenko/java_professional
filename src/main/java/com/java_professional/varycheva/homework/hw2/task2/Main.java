package com.java_professional.varycheva.homework.hw2.task2;

/*
Минимальное из N чисел(использовать LinkedList):
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum
 */
public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerList();
        System.out.println(integerList.getIntegerList());
        System.out.println(integerList.getMinimum());
    }
}
