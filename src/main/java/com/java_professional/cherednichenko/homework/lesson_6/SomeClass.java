package com.java_professional.cherednichenko.homework.lesson_6;

import java.util.List;

public abstract class SomeClass {
    private int someInt;
    protected String someString;
    public List<String> someList;

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }

    public SomeClass(int someInt, String someString, List<String> someList) {
        this.someInt = someInt;
        this.someString = someString;
        this.someList = someList;
    }
}
