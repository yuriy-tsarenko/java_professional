package com.java_professional.pnivchuk.homework.lesson_2.Task_2;
/* Минимальное из N чисел(использовать LinkedList):
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input length of list.");
        Integer length = null;


        while (length == null) {
            try {
                length = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("O-la-la! Something wrong with your input! It must be number!!!");
                System.out.println("try again.");
            } catch (NumberFormatException e) {
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
        //try {
        for (int i = 0; i < length; i++) {
            System.out.println("Please, input number!");
            try {
                list.add(Integer.parseInt(reader.readLine()));System.out.println("try again.");
            } catch (IOException e) {
                System.out.println("O-la-la! Something wrong with your input! It must be number!!!");
                i--;
                System.out.println("try again.");
            } catch (NumberFormatException e) {
                System.out.println("O-la-la! Something wrong with your input! It must be number!!!");
                System.out.println("try again.");
                i--;
            }
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer firstInt, Integer secondInt) {
                if ((firstInt - secondInt) > 0) {
                    return 1;
                } else if ((firstInt - secondInt) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return list.get(0);

    }
}
