package com.java_professional.tsarenko.classwork.lesson6.regex_data.regex.tokenizer;

import java.util.StringTokenizer;

public class Tokenizer {
    public static String testString = "Название=Учим Java professional;Тема=регулярные выражения;Пример=№1;"
            + "Дата=22-01-2021";

    public static void main(String[] args) {
        System.out.println(createTokens(testString));
    }

    public static String createTokens(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input, "=;");
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String key = tokenizer.nextToken();
            String val = tokenizer.nextToken();
            builder
                    .append(key)
                    .append(" : ")
                    .append(val)
                    .append("\n");
        }
        return builder.toString();
    }
}
