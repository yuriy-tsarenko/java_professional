package com.java_professional.varycheva.homework.hw3.task2;

public class SimpleHashMap<K, V> implements Map<K, V> {

    private Entry<K, V>[] entries;
    private int size;
    private final int capacity = 16;

    @Override
    public V get(K key) {
        V result = null;
        Entry<K, V> entry = entries[Math.abs(key.hashCode()) % capacity];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                break;
            }
            entry = entry.nextEl;
        }
        if (entry != null) {
            result = entry.getValue();
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object arg0) {
        return null;
    }

    @Override
    public Object replace(Object key, Object value) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public static class Entry<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> nextEl;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }
    }
}
