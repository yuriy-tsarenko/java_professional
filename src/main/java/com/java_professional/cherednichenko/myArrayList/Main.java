package com.java_professional.cherednichenko.myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("dddd");
        strings.add("dddd");
        strings.add("dddd");
        strings.add("dddd");
        strings.add("ddd");
        strings.remove("dddd");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(strings);
        System.out.println(strings.isEmpty());
        System.out.println(strings.contains("ddd"));
        System.out.println(strings.indexOf("ddd"));
        System.out.println(strings.lastIndexOf("dddd"));
        System.out.println("+++++++++++");
        strings.set(1, "aaa");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        strings.clear();
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
