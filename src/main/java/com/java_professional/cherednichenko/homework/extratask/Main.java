package com.java_professional.cherednichenko.homework.extratask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 6, 7};
        System.out.println(stringBuilder(integers));
        String[] strings = new String[]{"Monday", "Wednesday", "Friday", "Saturday", "Sunday"};
        System.out.println(stringBuilder(getIntegers(strings)));

    }

    public static StringBuilder stringBuilder(Integer[] integers) {
        HashMap<Integer, String> hashMap = Week.allWeek();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < integers.length; i++) {
            if (i == 0) {
                string.append(hashMap.get(integers[0]));
            } else if (integers[i] - integers[i - 1] != 1) {
                string.append(", ");
                string.append(hashMap.get(integers[i]));
            } else if (i + 1 == integers.length) {
                string.append("-");
                string.append(hashMap.get(integers[i]));
            } else if ((integers[i] - integers[i - 1] == 1 & integers[i + 1] - integers[i] != 1)) {
                string.append("-");
                string.append(hashMap.get(integers[i]));
            }
        }
        return string;
    }

    public static Integer[] getIntegers(String[] weeks) {
        List<Integer> integers = new ArrayList<>();
        HashMap<Integer, String> hashMap = Week.allWeek();
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (String s : weeks) {
            for (Map.Entry<Integer, String> entry : entrySet) {
                if (s.equals(entry.getValue())) {
                    integers.add(entry.getKey());
                }
            }
        }
        Integer[] ints = new Integer[integers.size()];
        return integers.toArray(ints);
    }
}
