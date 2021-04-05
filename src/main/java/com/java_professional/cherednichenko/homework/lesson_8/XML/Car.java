package com.java_professional.cherednichenko.homework.lesson_8.XML;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private String speed;
    private String color;
    private String price;
    private String date;

    @XmlElement
    public String getBrand() {
        return brand;
    }

    @XmlElement
    public String getSpeed() {
        return speed;
    }

    @XmlElement
    public String getColor() {
        return color;
    }

    @XmlElement
    public String getPrice() {
        return price;
    }

    @XmlElement
    public String getDate() {
        return date;
    }
}
