package com.java_professional.tsarenko.classwork.lesson6.reflection.ex_003_ClassForName.featuresOfClass;

import java.lang.reflect.Member;
import java.util.HashMap;

// В параметрах добавить путь к классу(java.lang.String)
public class Main2 {
    public static void main(String[] args) {
        String path = "com.java_professional.tsarenko.classwork.lesson6.reflection.SimpleArrayListCapacity";
        try {
            // Получаем объект типа класс
            Class<?> c = Class.forName(args[0]);
            System.out.println(c);
            // Вызываем все поля класса
            printMembers(c.getFields());
            // Вызываем все конструкторы класса
            printMembers(c.getConstructors());
            // Вызываем все методы класса
            printMembers(c.getMethods());
        } catch (ClassNotFoundException e) {
            System.out.println("Неизвестный класс:" + args[0]);
        }
    }

    private static void printMembers(Member[] mems) {
        // Пробегаемся по всей длине интерфейса Member
        for (int i = 0; i < mems.length; i++) {
            if (mems[i].getDeclaringClass() == Object.class) {
                continue;
            }
            String decl = mems[i].toString();
            System.out.print("   ");
            System.out.println(decl);
        }
    }
}

