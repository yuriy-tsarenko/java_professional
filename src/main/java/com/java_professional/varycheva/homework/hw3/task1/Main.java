package com.java_professional.varycheva.homework.hw3.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Программа определяет, какая семья (фамилия) живёт в городе:
Пример ввода:
Москва - Ивановы
Киев - Петровы
Лондон - Абрамовичи
ввести город:  Лондон
фамилия: Абрамовичи
 */
public class Main {

    public static String inputCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input city");
        return scanner.next();
    }

    public static Map<String, String> inputDictionary() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> result = new HashMap<>();
        System.out.println("If you want to exit enter 'exit'");
        while (scanner.hasNext()) {
            String city = scanner.next();
            if (city.equals("exit")) {
                break;
            }
            String familyName = scanner.next();
            result.put(familyName, city);
        }
        return result;
    }

    public static String getCityByFamily(Map<String, String> map, String city) {
        String result = null;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(city)) {
                result = pair.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, String> map = inputDictionary();
        System.out.println(getCityByFamily(map, inputCity()));
    }
}
