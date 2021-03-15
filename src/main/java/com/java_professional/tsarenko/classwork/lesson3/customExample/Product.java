package com.java_professional.tsarenko.classwork.lesson3.customExample;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = "id")
public class Product implements Comparable<Product> {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer totalNumber;

    @Override
    public int compareTo(Product other) {
        return this.price - other.getPrice();
    }
}
