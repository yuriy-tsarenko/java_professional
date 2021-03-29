package com.java_professional.cherednichenko.homework.lesson_8.XML;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.car.add(new Car("BMW", "200", "black", "10000", "2021-26-03"));
        vehicle.car.add(new Car("BMW", "250", "black", "15000", "2021-29-03"));
        vehicle.bike.add(new Bike("Kawasaki", "230", "red", "5000", "2021-26-03"));
        vehicle.bike.add(new Bike("Kawasaki", "270", "red", "7000", "2021-29-03"));
        File file = new File("src\\main\\java\\com\\java_professional\\cherednichenko\\"
                + "homework\\lesson_8\\XML\\Vehicle.xml");
        Xml xml = new Xml(file, vehicle);
        xml.toXml();
        xml.FromXml();
    }
}
