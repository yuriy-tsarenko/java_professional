package com.java_professional.tsarenko.classwork.lesson5.ex_007_stringBuffer.bufferMethods;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("length ->" + stringBuffer.length());
        System.out.println("capacity ->" + stringBuffer.capacity());
//        stringBuffer = "Java"; // ошибка, только для класса String можно через литерал создавать
        stringBuffer.append("Java");
        System.out.println("stringBuffer ->" + stringBuffer);
        System.out.println("length ->" + stringBuffer.length());
        System.out.println("capacity ->" + stringBuffer.capacity());
        System.out.println("reverse ->" + stringBuffer.reverse());
    }
}

