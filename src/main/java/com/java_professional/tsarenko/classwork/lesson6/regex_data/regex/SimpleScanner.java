package com.java_professional.tsarenko.classwork.lesson6.regex_data.regex;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        String str = "1 Java 2 Java 3 Java";
//        Scanner sc = new Scanner(str).useDelimiter("Java");
        Scanner sc = new Scanner(str).useDelimiter("\\s*[a-z]*\\s*");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
    }
}
