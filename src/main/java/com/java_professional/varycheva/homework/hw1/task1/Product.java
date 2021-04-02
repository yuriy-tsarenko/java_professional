package com.java_professional.varycheva.homework.hw1.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Product {
    private int id;
    private double price;
    private String title;
    private Category category;
    private Brand brand;
}
