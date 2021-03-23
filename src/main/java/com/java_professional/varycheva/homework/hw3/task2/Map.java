package com.java_professional.varycheva.homework.hw3.task2;

public interface Map <K, V> {
    interface Entry<K, V> {
        K getKey();
        V getValue();
        V setValue(V value);
    }

    V get(K key);
    boolean isEmpty();
    V put(K arg0, V arg1);
    V remove(Object arg0);
    V replace(K key, V value);
    int size();
}

