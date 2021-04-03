package com.java_professional.diledsys.homework.dayWeek.codeDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            String num = reader.nextLine();
            System.out.println(DayOfWeek.converter(num));
    }
}
