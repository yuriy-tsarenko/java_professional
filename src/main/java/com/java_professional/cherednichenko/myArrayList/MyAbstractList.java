package com.java_professional.cherednichenko.myArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface MyAbstractList<T> extends Iterable<T> {
    T get(int index);

    boolean isEmpty();

    int size();

    int indexOf(Object o);

    boolean contains(Object o);

    int lastIndexOf(Object o);

    Object[] toArray();

    public T set(int index, T element);

    void resize(int newLength);

    void add(T element);

    T remove(T element);

    void clear();

    boolean addAll(Collection<? extends T> c);

    boolean removeAll(Collection<?> c);

    @Override
    public void forEach(Consumer<? super T> action);

    @Override
    public Iterator<T> iterator();

}
