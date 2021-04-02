package com.java_professional.tsarenko.classwork.lesson5.ex_007_stringBuffer.stringBuffer;

public class Main {
    public static void main(String[] args) {
        String str1 = "cat has ";
        String str2 = " legs";
        int paws = 4;
        StringBuffer stringBuffer = new StringBuffer(20);
        stringBuffer.append(str1).append(paws).append(str2);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer);

        stringBuffer.append("line").append("line2");
        stringBuffer.append("line2");
    }
}
