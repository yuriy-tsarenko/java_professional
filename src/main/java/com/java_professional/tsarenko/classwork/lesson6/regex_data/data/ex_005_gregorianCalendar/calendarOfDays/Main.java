package com.java_professional.tsarenko.classwork.lesson6.regex_data.data.ex_005_gregorianCalendar.calendarOfDays;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);
        System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat");

        for (int i = Calendar.SUNDAY; i < weekday; i++) {
            System.out.print("      ");
        }

        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%4d", day);
            if (day == today) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            if (weekday == Calendar.SATURDAY) {
                System.out.println();
            }
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (d.get(Calendar.MONTH) == month);
    }
}
