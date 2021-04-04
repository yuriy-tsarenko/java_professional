package com.java_professional.cherednichenko.myHashMap;

public interface MyHashInterface<K, V> extends Iterable<V> {
    boolean insert(K key, V value);

    boolean delete(K key);

    V get(K key);

    int size();
}
