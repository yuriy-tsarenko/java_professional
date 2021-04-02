package com.java_professional.pnivchuk.homework.lesson_1.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Создать класс Product c 5-мя полями на выбор и реализовать сортирование в разных направлениях учитывая все поля*/
public class Main {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Rozetka","Laptop", 10, 5, true));
        list.add(new Product("Citrus", "Phone", 11, 15,  false));
        list.add(new Product("Aitrus", "Ahone", 11, 15,  false));
        list.add(new Product("Aitrus", "Phone", 11, 15,  false));
        list.add(new Product("Aitrus", "Ahone", 12, 15,  false));
        list.add(new Product("Aitrus", "Ahone", 11, 16,  false));
        list.add(new Product("Aitrus", "Ahone", 11, 16,  true));


        Collections.sort(list, Comparator.comparing(Product::getShop)
                .thenComparing(Product::getName)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getCount)
                .thenComparing(Product::getCount));

        for (Product tmp : list) {
            System.out.println(tmp);
        }

    }
}
