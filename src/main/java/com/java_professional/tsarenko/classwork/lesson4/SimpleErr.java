package com.java_professional.tsarenko.classwork.lesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {
        System.out.println("sadasads");
        System.err.println("File opening failed");
//        try {
//            InputStream inputStream = new FileInputStream("D:");
//            System.out.println("File opened");
//        } catch (FileNotFoundException e) {
//            System.err.println("File opening failed");
//            e.printStackTrace();
//        }
    }
}
