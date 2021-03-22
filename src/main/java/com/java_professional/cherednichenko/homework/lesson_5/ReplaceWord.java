package com.java_professional.cherednichenko.homework.lesson_5;

import java.util.Arrays;

//        Задание 2
//        В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
public class ReplaceWord {
    public static void main(String[] args) {
        String text = "В любой из профильных книг (Хорстман, Эккель) найти соответствующие темы и закрепить материал."
                + "Использование YouTube, Quizful приветствуется."
                + "В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения."
                + "Необходимо создать строку с текстом (текст взять любой из интернета)."
                + " Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.";
        String[] arr = text.split("\\.");
        String first;
        String last;
        String[] arr1;
        StringBuilder newText = new StringBuilder();
        for (String s : arr) {
            arr1 = s.split("\\s");
            first = arr1[0];
            last = arr1[arr1.length - 1];
            arr1[0] = last;
            arr1[arr1.length - 1] = first + ".";
            for (String d : arr1) {
                newText.append(d).append(" ");
            }
        }
        System.out.println(newText);
    }
}

