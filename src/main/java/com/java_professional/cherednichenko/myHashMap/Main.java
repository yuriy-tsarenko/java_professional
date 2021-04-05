package com.java_professional.cherednichenko.myHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.insert(1, "Value");
        myHashMap.insert(1, "ssss");
        myHashMap.insert(1, "sss134124s");
        myHashMap.insert(1, "ss12412ss");
        myHashMap.insert(1, "sstgergss");
        myHashMap.insert(2, "Value21");
        myHashMap.insert(1, "Value2");
        System.out.println(myHashMap.get(2));
        myHashMap.delete(2);
        myHashMap.insert(2, "Value21");
        myHashMap.insert(2, "Value21");
        System.out.println(myHashMap.get(2));
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Value");
        hashMap.put(1, "ssss");
        hashMap.put(2, "Value");
        hashMap.remove(2);
        hashMap.put(2, "Value");
        hashMap.put(1, "Value");
        System.out.println(hashMap.size());
        System.out.println(myHashMap.size());
    }
}
