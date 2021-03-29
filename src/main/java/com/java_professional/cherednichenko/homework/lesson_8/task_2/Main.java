package com.java_professional.cherednichenko.homework.lesson_8.task_2;

public class Main {
    public static void main(String[] args) {
        TypeOfBird type = new TypeOfBird("Flying");
        Bird bird = new Bird(type, "BLUE", 3.42);

        try {
            Bird newBird = (Bird) bird.clone();
            newBird.setColor("RED");
            TypeOfBird newType = new TypeOfBird("NonFlying");
            newBird.setType(newType);
            System.out.println(bird);
            System.out.println(newBird);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
