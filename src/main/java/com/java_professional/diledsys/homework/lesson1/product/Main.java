package com.java_professional.diledsys.homework.lesson1.product;

import diledsys.homework.lesson1.product.Product;

public class Main {
    public static void main(String[] args) {
        for (Product product : Sklad.query()) {
            System.out.println(product);
        }
    }
}
