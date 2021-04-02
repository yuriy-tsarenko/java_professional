package com.java_professional.tsarenko.classwork.lesson5;

public class SimpleStringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);

        String str5 = new StringBuilder().append(str1).append(str2).toString();
    }
}
