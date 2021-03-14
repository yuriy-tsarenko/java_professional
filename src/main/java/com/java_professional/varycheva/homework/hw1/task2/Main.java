package com.java_professional.varycheva.homework.hw1.task2;

import com.java_professional.varycheva.homework.hw1.task1.Brand;
import com.java_professional.varycheva.homework.hw1.task1.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Создать класс Product c 5-мя полями на выбор и реализовать сортирование в разных направлениях учитывая все поля
 */
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, 2370.0, "name1", Category.LAPTOP, Brand.LENOVO));
        products.add(new Product(2, 3230.0, "name2", Category.SMARTPHONE, Brand.ASUS));
        products.add(new Product(3, 1530.0, "name3", Category.LAPTOP, Brand.LENOVO));
        products.add(new Product(4, 2300.0, "name4", Category.SMARTPHONE, Brand.SAMSUNG));
        products.add(new Product(5, 6230.0, "name5", Category.MONITOR, Brand.DELL));
        products.add(new Product(6, 830.0, "name6", Category.LAPTOP, Brand.DELL));
        products.add(new Product(7, 230.0, "Bname", Category.MONITOR, Brand.ASUS));
        products.add(new Product(8, 230.0, "Aname", Category.TABLET, Brand.ASUS));
        products.add(new Product(9, 2330.0, "name9", Category.TABLET, Brand.SAMSUNG));
        products.add(new Product(10, 930.0, "name10", Category.TABLET, Brand.LENOVO));
        System.out.println(products.stream().sorted().collect(Collectors.toList()));
    }
}
