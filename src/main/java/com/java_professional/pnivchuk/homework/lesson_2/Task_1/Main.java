package com.java_professional.pnivchuk.homework.lesson_2.Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Используя коллекцию удвойте слово: 1. Введите с клавиатуры 5 слов в список строк. 2. Метод doubleValues должен
удваивать слова по принципу a,b,c -> a,a,b,b,c,c. 3. Используя цикл for выведите результат на экран,
каждое значение с новой строки.*/

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> newList;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Please, input word " + (i));
                list.add(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("O-la-la!!! Something went wrong!");
            e.getStackTrace();
        }

        newList = doubleValues(list);

        for (int a = 0; a < newList.size(); a++) {
            System.out.println(newList.get(a));
        }
    }

    public static List<String> doubleValues(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 2; j++) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
