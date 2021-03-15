package com.java_professional.diledsys.homework.myArrayList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private int size;
    private E[] arr;

    public MyArrayList() {
        arr = (E[]) new Object[10];
    }

    public MyArrayList(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(arr[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(obj)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public E[] toArray() {
        return arr;
    }

    @Override
    public E get(int index) {
        return arr[index];
    }

    @Override
    public void set(int index, E value) {
        if (index > size) throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        arr[index] = value;
    }

    @Override
    public void add(E value) {
        if (arr.length == size) {
            grow();
        }

        arr[size] = value;
        size++;
    }

    @Override
    public Object remove(Object o) {
        if (!contains(o)) return null;
        if (arr.length - 1 - indexOf(o) >= 0)
            System.arraycopy(arr, indexOf(o) + 1, arr, indexOf(o), arr.length - 1 - indexOf(o));
        size--;
        return o;
    }

    @Override
    public void clear() {
        arr = (E[]) new Object[10];
        size = 0;
    }

    private void grow() {
        E[] newArr = (E[]) new Object[size * 2];

        System.arraycopy(arr, 0, newArr, 0, size);

        arr = newArr;
    }
}
