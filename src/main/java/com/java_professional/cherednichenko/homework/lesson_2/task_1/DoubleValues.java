package com.java_professional.cherednichenko.homework.lesson_2.task_1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Задание 2
//        Используя коллекцию удвойте слово:
//        1. Введите с клавиатуры 5 слов в список строк.
//        2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
//        3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
@Getter
public class DoubleValues {
    List<String> list = new ArrayList<>();

    public DoubleValues(List<String> list) {
        this.list = list;
    }

    public void doubleValue() {
        while (listIterator().hasNext()) {
            listIterator().add(listIterator().next());
            //Or
//            listIterator().set(listIterator().next() + listIterator().previous());
//            listIterator().next();
        }
    }

    private ListIterator<String> listIterator() {
        return this.list.listIterator();
    }

}
