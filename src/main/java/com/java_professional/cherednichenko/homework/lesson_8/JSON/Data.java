package com.java_professional.cherednichenko.homework.lesson_8.JSON;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Data {
    public int id;
    public String name;
    public String description;
    public String image;
    public String price;
    public String discount_amount;
    public boolean status;
    public List<Category> categories;

    @Override
    public String toString() {
        return "\nid=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                ", discount_amount='" + discount_amount + '\'' +
                ", status=" + status +
                ", categories=" + categories;
    }
}
