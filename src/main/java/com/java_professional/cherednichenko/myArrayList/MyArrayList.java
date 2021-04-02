package com.java_professional.cherednichenko.myArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;


public class MyArrayList<T> implements MyAbstractList<T> {
    private final int size = 16;
    private T[] array = (T[]) new Object[size];
    private int pointer = 0;

    public T get(int index) {
        return (T) array[index];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int size() {
        return pointer;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < pointer; i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, pointer);
    }

    public T set(int index, T element) {
        T oldValue = (T) array[index];
        array[index] = element;
        return oldValue;
    }

    public void resize(int newLength) {
        T[] newArray = (T[]) new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void add(T element) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyArrayList)) {
            return false;
        }
        MyArrayList<?> that = (MyArrayList<?>) o;
        return pointer == that.pointer && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, pointer);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    public T remove(T element) {
        if (!contains(element)) {
            return null;
        }
        if (pointer + 1 - indexOf(element) >= 0) {
            System.arraycopy(array, indexOf(element) + 1, array, indexOf(element),
                    pointer + 1 - indexOf(element));
        }
        pointer--;
        return element;
    }

    public void clear() {
        for (int i = 0; i < pointer; i++) {
            array[i] = null;
        }
        pointer = 0;
    }

    public boolean addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();
        if (a.length == 0) {
            return false;
        }
        for (int i = 0; i < a.length - 1; i++) {
            add((T) a[i]);
        }
        return true;
    }

    public boolean removeAll(Collection<?> c) {
        Object[] a = c.toArray();
        if (a.length == 0) {
            return false;
        }
        for (int i = 0; i < a.length - 1; i++) {
            remove((T) a[i]);
        }
        return true;
    }

    static <T> T elementAt(Object[] es, int index) {
        return (T) es[index];
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Object[] objects = new Object[pointer];
        System.arraycopy(array, 0, objects, 0, pointer);
        Objects.requireNonNull(action);
        for (int i = 0; i < pointer; i++) {
            action.accept(elementAt(objects, i));
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < pointer && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        T[] arrayToString = (T[]) new Object[pointer];
        if (arrayToString.length - 1 >= 0) {
            System.arraycopy(array, 0, arrayToString, 0, pointer);
        }
        return Arrays.toString(arrayToString);
    }
}
