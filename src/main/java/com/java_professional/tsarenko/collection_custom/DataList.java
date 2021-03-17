package com.java_professional.tsarenko.collection_custom;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class DataList<T> implements Data<T> {

    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 30;
    private static final int MAX_CAPACITY = Integer.MAX_VALUE;

    public DataList(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public DataList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public DataList(Collection<T> collection) {
        Object[] array = collection.toArray();
        this.data = Arrays.copyOf(array, array.length);
    }

    public DataList(T[] array) {
        data = Arrays.copyOf(array, array.length);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public boolean add(T newElement) {
        int length = data.length;
        if (length < MAX_CAPACITY) {
            if ((length == size)) {
                increaseCapacity();
            }
            data[size] = newElement;
            size++;
            return size() == size;
        }
        return false;
    }

    @Override
    public void remove(int index) {
        System.arraycopy(data, index + 1, data, index, size - (index + 1));
        data[size -= 1] = null;
    }

    @Override
    public boolean set(T newElement, int index) {
        data[index] = newElement;
        return data[index].equals(newElement);
    }

    @Override
    public boolean contains(T checkedElement) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(checkedElement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T checkedElement) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(checkedElement)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T checkedElement) {
        int temp = -1;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(checkedElement)) {
                temp = i;
            }
        }
        return temp;
    }

    @Override
    public void clear() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[]) data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addAll(Collection<? extends T> collection) {
        Object[] array = collection.toArray();
        int addingLength = array.length;
        int actualLength = size;
        data = Arrays.copyOf(data, addingLength + actualLength);
        System.arraycopy(array, 0, data, size, addingLength);
        size = addingLength + actualLength;
    }

    @Override
    public void addAll(Collection<? extends T> collection, int startIndex) {
        if (startIndex < size) {
            Object[] array = collection.toArray();
            int secondHalf = size - startIndex;

            Object[] copyOfFirstHalf = Arrays.copyOf(data, startIndex);
            Object[] copyOfSecondHalf = new Object[secondHalf];

            System.arraycopy(data, startIndex, copyOfSecondHalf, 0, secondHalf);

            data = new Object[array.length + copyOfSecondHalf.length + copyOfFirstHalf.length];

            System.arraycopy(copyOfFirstHalf, 0, data, 0, copyOfFirstHalf.length);
            System.arraycopy(array, 0, data, copyOfFirstHalf.length, array.length);
            System.arraycopy(copyOfSecondHalf, 0, data, copyOfFirstHalf.length + array.length, copyOfSecondHalf.length);

            size = data.length;
        } else if (startIndex == size) {
            addAll(collection);
        }
    }

    private void increaseCapacity() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DataList<?> otherList = (DataList<?>) obj;
        if (size != otherList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!data[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (Objects.hashCode(size));

        for (Object element : data) {
            hash = 31 * hash + (element == null ? 0 : element.hashCode());
        }
        return hash;
    }

    @Override
    @Nonnull
    public Iterator<T> iterator() {
        return new DataListIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        if (action != null) {
            for (int i = 0; i < size; i++) {
                action.accept(get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                line.append(data[i].toString()).append(", ");
            } else {
                line.append(data[i].toString());
            }
        }
        return "DataList[" + line + ']';
    }

    private class DataListIterator implements Iterator<T> {
        int runner;

        @Override
        public boolean hasNext() {
            boolean result = (runner) < size;
            runner++;
            return result;
        }

        @Override
        public T next() {
            return get(runner - 1);
        }
    }
}
