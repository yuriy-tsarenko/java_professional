package com.java_professional.varycheva.homework.hw1.task2;

import com.java_professional.varycheva.homework.hw1.task1.Brand;
import com.java_professional.varycheva.homework.hw1.task1.Category;
import lombok.*;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Comparable<Product> {

    private int id;
    private double price;
    private String title;
    private Category category;
    private Brand brand;

    @Override
    public int compareTo(Product product) {
        return Comparator.comparing(Product::getPrice)
                .thenComparing(Product::getTitle, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(Product::getCategory)
                .thenComparing(Product::getBrand)
                .compare(this, product);
    }
}
