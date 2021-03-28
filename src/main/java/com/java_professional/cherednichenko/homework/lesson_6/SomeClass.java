package com.java_professional.cherednichenko.homework.lesson_6;

import java.util.List;

public abstract class SomeClass {
    private int a;
    protected String b;
    public List<String> c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<String> getC() {
        return c;
    }

    public void setC(List<String> c) {
        this.c = c;
    }

    public SomeClass(int a, String b, List<String> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
