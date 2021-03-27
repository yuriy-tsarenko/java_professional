package com.java_professional.pnivchuk.homework.lesson_1.Task_1;
/*Вывод на экран элементов List: Создать список, заполнить его на
10 элементов и вывести на экран содержимое используя iterator.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(200));
        }

        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
