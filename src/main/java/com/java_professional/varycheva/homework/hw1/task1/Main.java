package com.java_professional.varycheva.homework.hw1.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Вывод на экран элементов List:
Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
 */
public class Main {
    public static void main(String[] args) {
        List<Product> newList = new ArrayList<>();
        newList.add(new Product(1, 2370.0, "name1", Category.LAPTOP, Brand.LENOVO));
        newList.add(new Product(2, 3230.0, "name2", Category.SMARTPHONE, Brand.ASUS));
        newList.add(new Product(3, 1530.0, "name3", Category.LAPTOP, Brand.LENOVO));
        newList.add(new Product(4, 2300.0, "name4", Category.SMARTPHONE, Brand.SAMSUNG));
        newList.add(new Product(5, 6230.0, "name5", Category.MONITOR, Brand.DELL));
        newList.add(new Product(6, 830.0, "name6", Category.LAPTOP, Brand.DELL));
        newList.add(new Product(7, 230.0, "name7", Category.MONITOR, Brand.ASUS));
        newList.add(new Product(8, 330.0, "name8", Category.TABLET, Brand.ASUS));
        newList.add(new Product(9, 2330.0, "name9", Category.TABLET, Brand.SAMSUNG));
        newList.add(new Product(10, 930.0, "name10", Category.TABLET, Brand.LENOVO));

        Iterator<Product> iterator = newList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
