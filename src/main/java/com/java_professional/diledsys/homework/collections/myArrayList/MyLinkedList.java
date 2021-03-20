package com.java_professional.diledsys.homework.collections.myArrayList;

import java.util.Spliterator;

public class MyLinkedList<E> extends MyArrayList implements MyDeque {
    private Node head;
    private Node last;

    private int size;

    @Override
    public void add(Object o) {
        addFirst(o);
    }

    @Override
    public void addFirst(Object o) {
        Node node = new Node();
        node.element = o;
        if (head == null) {
            head = node;
            last = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(Object o) {
        Node node = new Node();
        node.element = o;
        if (head == null) {
            head = node;
            last = node;
        } else {
            node.next = last;
            last = node;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object remove(Object o) {
        if (head == null) {
            return null;
        }

        if (head == last) {
            head = null;
            last = null;
            return null;
        }

        if (head.element == o) {
            head = head.next;
            return head.element;
        }

        Node t = head;
        while (t.next != null) {
            if (t.next.element == o) {
                if (last == t.next) {
                    last = t;
                }
                t.next = t.next.next;
                return t.element;
            }
            t = t.next;
        }
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Object get(int index) {
        return find(index);
    }

    private Object find(int index) {
        Node t = head;
        Object o = null;
        for (int i = 0; i < index; i++) {
            o = t.element;
            t = t.next;
        }
        return o;
    }

    class Node<E> {
        E element;
        Node next;
    }
}
