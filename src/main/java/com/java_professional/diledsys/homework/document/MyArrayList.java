package diledsys.homework.document;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author Dmitriy
 * @version 2.1
 * @see
 * @since 1.0
 */
public class MyArrayList<E> implements MyList {
    private int size;
    private volatile int cursor;
    private Object[] arr;

    /**
     * Parameterless constructor, initializes an array with one element
     */
    public MyArrayList() {
        this.size = 1;
        arr = new Object[size];
    }

    /**
     * constructor with an internal length parameter, initializes an array with one element
     *
     * @param size
     */
    public MyArrayList(int size) {
        this.size = size;
        arr = new Object[size];
    }

    public int size() {
        return size;
    }

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Returns {@code true} if this list contains the specified element.
     * More formally, returns {@code true} if and only if this list contains
     * at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such index.
     */
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (o.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Returns an array containing all of the elements in this list
     * in proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in
     * proper sequence
     */
    @Override
    public Object[] toArray() {
        return arr;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public Object get(int index) {
        return arr[index];
    }

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param index index of the element to replace
     * @param o     element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public void set(int index, Object o) {
        if (index > size) throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        arr[index] = o;
    }

    /**
     * This helper method split out from add(E) to keep method
     * bytecode size under 35 (the -XX:MaxInlineSize default value),
     * which helps when add(E) is called in a C1-compiled loop.
     */
    @Override
    public void add(Object o) {
        if (cursor >= size) {
            grow();
        }
        arr[cursor] = o;
        cursor++;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param o the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public Object remove(Object o) {
        if (!contains(o)) {
            return null;
        }
        for (int i = indexOf(o); i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        --size;
        return o;
    }

    @Override
    public void clear() {
        arr = Arrays.copyOf(arr, 0);
        size = 0;
    }

    private void grow() {
        arr = Arrays.copyOf(arr, ++size);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
    }
}
