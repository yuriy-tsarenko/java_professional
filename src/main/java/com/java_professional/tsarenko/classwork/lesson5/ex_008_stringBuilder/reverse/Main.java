package com.java_professional.tsarenko.classwork.lesson5.ex_008_stringBuilder.reverse;

public class Main {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();  // reverse it
        System.out.println(sb);
    }
}
