package diledsys.homework.reflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflexion {
    public void full(String nameClass) {
        Class<?> classDiscowery = null;
        try {
            classDiscowery = Class.forName(nameClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert classDiscowery != null;
        System.out.println("Имя класса: " + classDiscowery.arrayType().getSimpleName());
        String classModifier = modifierType(classDiscowery.getSuperclass().getModifiers());
        System.out.println("модификатор класса: " + classModifier);
        System.out.println("список интерфейсов");
        listClassInterfaces(classDiscowery);
        System.out.println("список конструкторов");
        listClassConstructor(classDiscowery);
        System.out.println("список полей");
        listClassField(classDiscowery);
        System.out.println("список методов");
        listClassMethod(classDiscowery);
    }

    private String modifierType(int mod) {
        if (Modifier.isPublic(mod)) {
            return "public";
        }
        if (Modifier.isAbstract(mod)) {
            return "abstract";
        }
        if (Modifier.isFinal(mod)) {
            return "final";
        }
        if (Modifier.isInterface(mod)) {
            return "interface";
        }
        if (Modifier.isPrivate(mod)) {
            return "private";
        }
        if (Modifier.isProtected(mod)) {
            return "protected";
        }
        if (Modifier.isStatic(mod)) {
            return "static";
        }
        return null;
    }

    public void listClassInterfaces(Class<?> tested) {
        Class<?>[] list = tested.getInterfaces();
        for (Class<?> interfaces : list) {
            System.out.println(":" + interfaces);
        }
    }

    public void listClassConstructor(Class<?> tested) {
        Constructor[] list = tested.getConstructors();
        for (Constructor<?> constructor : list) {
            System.out.println(":" + constructor.toGenericString());
        }
    }

    public void listClassField(Class<?> tested) {
        Field[] fields = tested.getDeclaredFields();
        for (Field field : fields) {
            try {
                String nameField = field.getName();
                Class<?> typeField = tested.getDeclaredField(field.getName()).getType();
                System.out.println(modifierType(field.getModifiers()) + " " + typeField.getSimpleName()
                        + " " + nameField);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

    public void listClassMethod(Class<?> tested) {
        Method[] methods = tested.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            String type = method.getReturnType().getSimpleName();
            System.out.println(methodName + " " + type);
        }
    }
}
