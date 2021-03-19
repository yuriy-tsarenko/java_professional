package com.java_professional.cherednichenko.myArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class MyAbstractList<T> implements Iterable<T> {
    T get(int index) {
        return null;
    }

    boolean isEmpty() {
        return false;
    }

    int size() {
        return 0;
    }

    int indexOf(Object o) {
        return 0;
    }

    boolean contains(Object o) {
        return false;
    }

    int lastIndexOf(Object o) {
        return 0;
    }

    Object[] toArray() {
        return new Object[0];
    }

    public T set(int index, T element) {
        return null;
    }

    void resize(int newLength) {

    }

    void add(T element) {

    }

    T remove(T element) {
        return null;
    }

    void clear() {

    }

    boolean addAll(Collection<? extends T> c) {
        return false;
    }

    boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

}
