package com.java_professional.pnivchuk.homework.lesson_2.Task_2;
/* Минимальное из N чисел(использовать LinkedList):
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input length of list.");
        Integer length = null;


        while (length == null) {
            try {
                length = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("O-la-la! Something wrong with your input! It must be number!!!");
                System.out.println("try again.");
            }
        }

        LinkedList<Integer> intList = getIntegerList(length);

        System.out.println("minimum is " + getMinimum(intList));
    }

    public static LinkedList<Integer> getIntegerList(int length) /*throws IOException, NumberFormatException*/ {
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < length; i++) {
            System.out.println("Please, input number!");
            try {
                list.add(Integer.parseInt(reader.readLine()));
                System.out.println("try again.");
            } catch (Exception e) {
                System.out.println("O-la-la! Something wrong with your input! It must be number!!!");
                i--;
                System.out.println("try again.");
            }
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }
}
