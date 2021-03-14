package com.java_professional.diledsys.homework.myArrayList;

public interface MyList<E> {
    public int size();

    boolean isEmpty();

    boolean contains(E o);

    int indexOf(E o);

   int lastIndexOf(Object o);

    E[] toArray();

    Object get(int index);

    void set(int index,E o);

   void add(E o);

    Object remove(E o);

    void clear();

    //void  addAll(Collection<? extends E> c)
    //removeAll(Collection<?> c)
}
