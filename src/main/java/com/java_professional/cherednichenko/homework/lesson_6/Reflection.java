package com.java_professional.cherednichenko.homework.lesson_6;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) {
        getInfo(SomeClass.class);
    }

    public static void getInfo(Class<?> t) {
        System.out.println("ClassName:" + t.getName());
        Class<?> superClass = t.getSuperclass();
        System.out.println("SuperClassName:" + superClass.getName());
        System.out.println("--------------------------------------------------------------------------");
        int mods = t.getModifiers();
        System.out.println("Modifiers:");
        System.out.println(getModifier(mods));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Interfaces:");
        Class<?>[] interfaces = t.getInterfaces();
        for (Class<?> ifc : interfaces) {
            System.out.println(ifc.getName());
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Constructors:");
        Constructor<?>[] constructors = t.getConstructors();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Fields:");
        Field[] fields = t.getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            Class<?> fld = field.getType();
            System.out.println("Fields name : " + field.getName());
            System.out.println("Modifier type : " + getModifier(mod));
            System.out.println("Fields type : " + fld.getName());
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Methods:");
        Method[] methods = t.getMethods();
        for (Method method : methods) {
            int mod = method.getModifiers();
            System.out.println("Method name : " + method.getName());
            System.out.println("Modifier type : " + getModifier(mod));
            System.out.println("Return type : " +
                    method.getReturnType().getName());

            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (Class<?> paramType : params) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
        }
    }

    public static String getModifier(int mod) {
        String result = "";
        if (Modifier.isPublic(mod)) {
            result += "Public ";
        }
        if (Modifier.isPrivate(mod)) {
            result += "Private ";
        }
        if (Modifier.isProtected(mod)) {
            result += "Protected ";
        }
        if (Modifier.isAbstract(mod)) {
            result += "Abstract ";
        }
        if (Modifier.isFinal(mod)) {
            result += "Fina ";
        }
        return result;
    }
}
