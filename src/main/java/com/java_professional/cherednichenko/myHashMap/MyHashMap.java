package com.java_professional.cherednichenko.myHashMap;

import javax.annotation.Nonnull;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap<K, V> implements MyHashInterface<K, V> {
    private MyNode<K, V>[] data;
    private int size = 0;
    private float threshOld;

    public MyHashMap() {
        this.data = new MyNode[16];
        this.threshOld = data.length * 0.75f;
    }

    @Override
    public boolean insert(final K key, final V value) {
        if (size + 1 >= threshOld) {
            threshOld *= 2;
            arrayDoubling();
        }
        MyNode<K, V> newMyNode = new MyNode<>(key, value);
        int index = newMyNode.hash();
        if (data[index] == null || data[index].getNext().size() == 0) {
            return simpleAdd(index, newMyNode);
        }
        List<MyNode<K, V>> next = data[index].getNext();
        for (MyNode<K, V> myNode : next) {
            if (newValue(myNode, newMyNode, value) || collision(myNode, newMyNode, next)) {
                return true;
            }
        }
        return false;
    }

    private boolean simpleAdd(int index, MyNode<K, V> myNode) {
        data[index] = new MyNode<>(null, null);
        data[index].getNext().add(myNode);
        size++;
        return true;
    }

    private boolean newValue(final MyNode<K, V> myNode, final MyNode<K, V> newMyNode, final V value) {
        if (newMyNode.getKey().equals(myNode.getKey())) {
            myNode.setValue(value);
            return true;
        }
        return false;
    }

    private boolean collision(final MyNode<K, V> myNode, final MyNode<K, V> newMyNode, final List<MyNode<K, V>> next) {
        if (newMyNode.hashCode() == myNode.hashCode() && !newMyNode.equals(myNode)) {
            next.add(newMyNode);
            size++;
            return true;
        }
        return false;
    }

    private void arrayDoubling() {
        MyNode<K, V>[] oldData = data;
        data = new MyNode[oldData.length * 2];
        size = 0;
        for (MyNode<K, V> myNode : oldData) {
            if (myNode != null) {
                for (MyNode<K, V> m : myNode.getNext()) {
                    insert(m.key, m.value);
                }
            }
        }
    }

    @Override
    public boolean delete(K key) {
        int index = hash(key);
        if (data[index] == null) {
            return false;
        }
        if (data[index].getNext().size() == 1) {
            data[index].getNext().remove(0);
            size--;
            return true;
        }
        List<MyNode<K, V>> next = data[index].getNext();
        for (MyNode<K, V> myNode : next) {
            if (key.equals(myNode.getKey())) {
                next.remove(myNode);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        if (index < data.length && data[index] != null) {
            List<MyNode<K, V>> next = data[index].getNext();
            for (MyNode<K, V> myNode : next) {
                if (key.equals(myNode.getKey())) {
                    return myNode.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @Nonnull
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            int counterArray = 0;
            int valueCounter = 0;
            Iterator<MyNode<K, V>> subIterator = null;

            @Override
            public boolean hasNext() {
                if (valueCounter == size) {
                    return false;
                }
                if (subIterator == null || !subIterator.hasNext()) {
                    if (moveToNextCell()) {
                        subIterator = data[counterArray].getNext().iterator();
                    } else {
                        return false;
                    }
                }
                return subIterator.hasNext();
            }

            private boolean moveToNextCell() {
                counterArray++;
                while (data[counterArray] == null) {
                    counterArray++;
                }
                return data[counterArray] != null;
            }

            @Override
            public V next() {
                valueCounter++;
                return subIterator.next().getValue();
            }
        };
    }

    public void add(K key, V value) {
        MyNode<K, V> newNode = new MyNode<>(key, value);
    }

    private int hash(MyNode<K, V> myNode) {
        return myNode.hashCode() % data.length;
    }

    private int hash(final K key) {
        int hash = 12;
        hash = hash * 17 + key.hashCode();
        return hash % data.length;
    }

    private class MyNode<K, V> {
        private int hash;
        private K key;
        private V value;
        private List<MyNode<K, V>> next;

        public MyNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = new LinkedList<MyNode<K, V>>();
        }

        private List<MyNode<K, V>> getNext() {
            return next;
        }

        private int hash() {
            int hash = 47;
            hash = hash * 31 * hashCode();
            return hash % data.length;
        }

        private K getKey() {
            return key;
        }

        private V getValue() {
            return value;
        }

        private void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof MyNode)) {
                return false;
            }
            MyNode<?, ?> myNode = (MyNode<?, ?>) o;
            return key.equals(myNode.key) && value.equals(myNode.value);
        }

        @Override
        public int hashCode() {
            int hash = 12;
            hash = hash * 17 + key.hashCode();
            return hash % data.length;
        }
    }
}
