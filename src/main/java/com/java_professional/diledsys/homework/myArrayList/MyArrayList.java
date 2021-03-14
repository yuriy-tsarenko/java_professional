package com.java_professional.diledsys.homework.myArrayList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList {
private int size;
private volatile int  cursor;
private Object arr[];

    public MyArrayList() {
        this.size=1;
        arr = new Object[size];
    }

    public MyArrayList(int size) {
        this.size =size;
        arr = new Object[size];
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size==0)return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(o))return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (o.equals(arr[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(o)) index=i;
        }
        return index;
    }

    @Override
    public Object[] toArray() {
        return arr;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public void set(int index, Object o) {
        if (index>size) throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        arr[index] = o;
    }

    @Override
    public void add(Object o) {
        if (cursor>=size){ grow();}
        arr[cursor] = o;
        cursor++;
    }

    @Override
    public Object remove(Object o) {
        if (!contains(o))return null;
        for (int i = indexOf(o); i < arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        --size;
        return o;
    }

    @Override
    public void clear() {
     arr = Arrays.copyOf(arr,0);
     size=0;
    }
    private void grow() {
     arr = Arrays.copyOf(arr,++size);
    }
}
