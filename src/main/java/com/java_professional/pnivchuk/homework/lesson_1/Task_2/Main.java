package com.java_professional.pnivchuk.homework.lesson_1.Task_2;

import java.util.Arrays;

/*Создать класс Product c 5-мя полями на выбор и реализовать сортирование в разных направлениях учитывая все поля*/
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Rozetka","Laptop", 10, 5, true);
        Product product1 = new Product("Citrus", "Phone", 11, 15,  false);
        Product product3 = new Product("Aitrus", "Ahone", 11, 15,  false);
        Product product4 = new Product("Aitrus", "Phone", 11, 15,  false);
        Product product5 = new Product("Aitrus", "Ahone", 12, 15,  false);
        Product product6 = new Product("Aitrus", "Ahone", 11, 16,  false);
        Product product7 = new Product("Aitrus", "Ahone", 11, 16,  true);

        Product[] arr = {product, product1, product3, product4, product5, product6, product7};
        Arrays.sort(arr);

        for (Product tmp : arr) {
            System.out.println(tmp);
        }

    }
}
