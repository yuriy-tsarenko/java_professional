package diledsys.homework.calculator;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MathCalc mathCalc = new MathCalc();
        Class<?> c = MathCalc.class;
        try {
            Method method = c.getDeclaredMethod("add", int.class, int.class);
            InputData inputData = method.getAnnotation(InputData.class);
            System.out.println(mathCalc.add(inputData.a(), inputData.b()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
