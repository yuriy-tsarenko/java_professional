package com.java_professional.tsarenko.classwork.lesson8.clone.deep.cloning.with.reflection;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;


public class Main {
   private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Cow originalCow = new Cow("Milka", 5, 1);
        System.out.println("Original cow = " + originalCow);

        Cow copiedCow = reflectionCloning(originalCow);
        System.out.println(copiedCow);
    }

    private static Cow reflectionCloning(Cow originalCow) {
        Cow copiedCow = originalCow;

        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");

            name.setAccessible(true);
            head.setAccessible(true);

            name.set(copiedCow, "Byrenka");
            head.set(copiedCow, 2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            log.error(e);
        }
        return copiedCow;
    }
}
