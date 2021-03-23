package com.java_professional.diledsys.homework.myArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<String> myList = new MyArrayList();
        myList.add("Si");
        myList.add("Hr");
        myList.add("Fe");
        myList.add("Mg");
        myList.add("Cu");
        myList.add("Cu");
        myList.add("Cu2");
        myList.add("Cu");
        myList.add("Cu3");
        System.out.println(Arrays.toString(myList.toArray()));
        System.out.println(myList.size());
        System.out.println(myList.remove("Cu3"));
        System.out.println(myList.size());
        System.out.println("mylist.lastIndexOf(\"Cu\")= " + myList.lastIndexOf("Cu"));
        System.out.println("indexOf(\"Mg\") = " + myList.indexOf("Mg"));
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("index" + i + " =" + myList.get(i));
        }
        myList.set(2, "null");
        //myList.clear();
        System.out.println("замена индекса 2");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("index" + i + " =" + myList.get(i));
        }
    }
}
