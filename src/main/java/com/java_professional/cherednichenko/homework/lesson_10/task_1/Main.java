package com.java_professional.cherednichenko.homework.lesson_10.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        Optional<Integer> newLong = list.stream()
                .map(s -> s * s)
                .reduce(Integer::sum);
        newLong.ifPresent(System.out::println);
    }
}
