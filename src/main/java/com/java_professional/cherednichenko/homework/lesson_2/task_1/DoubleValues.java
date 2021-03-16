package com.java_professional.cherednichenko.homework.lesson_2.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//Задание 2
//        Используя коллекцию удвойте слово:
//        1. Введите с клавиатуры 5 слов в список строк.
//        2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
//        3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
public class DoubleValues {
    public static void main(String[] args) {
        List<String> strings = stringList();
        doubleValue(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static ListIterator<String> doubleValue(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.add(listIterator.next());
            //Or
//            listIterator.set(listIterator.next() + listIterator.previous());
//            listIterator.next();
        }
        return listIterator;
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
