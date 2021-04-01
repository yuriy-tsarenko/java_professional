package com.java_professional.cherednichenko.homework.lesson_7;

import com.java_professional.tsarenko.classwork.lesson7.ex_001_Annotations.methods.AnotherDog;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator(3, 6);
            Class<?> cl = calculator.getClass();
            Annotation[] classAnnotations = cl.getAnnotations();

            System.out.println(cl.getName() + "\nAnnotations:");
            for (Annotation annotation : classAnnotations) {
                System.out.println("\t" + annotation);
            }
            Method[] classMethods = cl.getMethods();
            for (Method method : classMethods) {
                InfoAnnotation infoAnnotation = method.getAnnotation(InfoAnnotation.class);
                if (infoAnnotation != null) {
                    System.out.println(infoAnnotation.name() + ": ");
                    System.out.println(method.invoke(calculator));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
