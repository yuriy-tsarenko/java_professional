package com.java_professional.cherednichenko.homework.extratask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 1, 2, 5, 6, 7, 4, 6};
        Arrays.sort(integers);
        System.out.println(stringBuilder(sort(integers)));
        String[] strings = new String[]{"Monday", "Wednesday", "Friday", "Saturday", "Sunday"};
        System.out.println(stringBuilder(sort(getIntegers(strings))));
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
            } else if ((integers[i] - integers[i - 1] >= 1 & integers[i + 1] - integers[i] > 1)) {
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

    public static Integer[] sort(Integer[] integers) {
        Set<Integer> set = new HashSet<>(Arrays.asList(integers));
        integers = set.toArray(new Integer[set.size()]);
        return integers;
    }
}
