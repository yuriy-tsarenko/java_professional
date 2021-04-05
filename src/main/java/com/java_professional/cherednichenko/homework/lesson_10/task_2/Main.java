package com.java_professional.cherednichenko.homework.lesson_10.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Product product = new Product(10, 20, "someProduct");
        Product productOne = new Product(5, 200, "someProductOne");
        Product productTwo = new Product(3, 20, "someProductTwo");
        FuncInterface funcInterface = new FuncInterface() {
            @Override
            public void getNamePrice(String name, Integer price) {
                System.out.println(name + ": " + price);
            }
        };
        funcInterface.getNamePrice(product.getName(), product.getPrice());
        FuncInterface funcInterfaceOne = ((name, price) -> System.out.println(name + ": " + price));
        funcInterfaceOne.getNamePrice(productOne.getName(), productOne.getPrice());
    }
}
