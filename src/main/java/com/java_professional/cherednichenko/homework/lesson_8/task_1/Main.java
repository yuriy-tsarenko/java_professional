package com.java_professional.cherednichenko.homework.lesson_8.task_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\java_professional\\cherednichenko"
                + "\\homework\\lesson_8\\task_1\\Car.txt");
        Car car = new Car(412.2, new String[2]);
        serialize(file, car);
        Car newCar = (Car) deSerialize(file);
        System.out.println(newCar);
    }

    public static void serialize(File file, Object o) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Object deSerialize(File file) {
        Object o = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            o = inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return o;
    }
}
