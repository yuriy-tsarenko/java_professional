package com.java_professional.cherednichenko.homework.lesson_5;

//Задание 3
//        Необходимо создать строку с текстом (текст взять любой из интернета).
//        Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.
public class CutString {
    public static void main(String[] args) {
        String text = "Необходимо создать строку с текстом (текст взять любой из интернета). "
                + "Разбить эту строку на 2 подстроки равной длине и "
                + "вывести на экран каждое предложения с новой строки.";
        int half = text.length() / 2;
        System.out.println(half);
        System.out.println(text.substring(0, half));
        System.out.println(text.substring(half));
    }
}
