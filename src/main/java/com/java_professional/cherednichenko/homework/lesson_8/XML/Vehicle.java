package com.java_professional.cherednichenko.homework.lesson_8.XML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Vehicle {
    @XmlElement
    public List<Car> car = new ArrayList<>();
    @XmlElement
    public List<Bike> bike = new ArrayList<>();
}
