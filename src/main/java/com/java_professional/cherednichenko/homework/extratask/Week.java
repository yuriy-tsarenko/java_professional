package com.java_professional.cherednichenko.homework.extratask;

import java.util.HashMap;

public class Week {
    public static HashMap<Integer, String> allWeek() {
        HashMap<Integer, String> week = new HashMap<>();
        week.put(1, "Monday");
        week.put(2, "Tuesday");
        week.put(3, "Wednesday");
        week.put(4, "Thursday");
        week.put(5, "Friday");
        week.put(6, "Saturday");
        week.put(7, "Sunday");
        return week;
    }
}
