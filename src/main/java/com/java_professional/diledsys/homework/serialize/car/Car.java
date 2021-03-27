package diledsys.homework.serialize.car;

import java.io.Serializable;

public class Car implements Serializable {
    String make;
    private String name;
    private int speed;
    private String color;

    public Car(String name, int speed, String color, String make) {
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
