package com.java_professional.tsarenko.collection_custom;

import java.io.Serializable;
import java.util.Collection;

public interface Data<T> extends Iterable<T>, Serializable {

    /**
     * Method call returns the logical size of collection
     *
     * @return logical size
     */
    int size();

    /**
     * Method call returns one element of collection by index position
     *
     * @param index - element position
     * @return - expected element
     */
    T get(int index);

    /**
     * Method call adds one new element to collection
     *
     * @param newElement - new element which will be added
     * @return - true if operation is success
     */
    boolean add(T newElement);

    /**
     * Method call removes one element from collection by it's index position
     *
     * @param index - index position
     */
    void remove(int index);

    /**
     * Method call replaces collection old element with new element by index
     *
     * @param newElement - new element which will be added
     * @param index      - replacement index position
     * @return - true if operation is success
     */
    boolean set(T newElement, int index);

    /**
     * Method call search checkedElement in collection and returns true if checkedElement is present
     *
     * @param checkedElement - element which will be search
     * @return - true if operation is present
     */
    boolean contains(T checkedElement);

    /**
     * Method call search checkedElement in collection and returns actual index position if checkedElement is present
     * or returns -1 if checkedElement isn't present
     *
     * @param checkedElement - element which will be search
     * @return -  actual index position or -1
     */
    int indexOf(T checkedElement);

    /**
     * Method call search checkedElement in collection and returns last actual index position
     * if checkedElement is present or returns -1 if checkedElement isn't present
     *
     * @param checkedElement - element which will be search
     * @return - last actual index position or -1
     */
    int lastIndexOf(T checkedElement);

    /**
     * Method call clears collection and refresh it with it's default settings
     */
    void clear();

    /**
     * Method call converts collection to array
     *
     * @return array of type
     */
    T[] toArray();

    /**
     * Method call checks collection for any containing data
     *
     * @return true if collection have any containing data or false in opposite situation
     */
    boolean isEmpty();

    /**
     * Method call merges all collection as arg to current collection
     * As result we'll have all old data from current collection and new data from added
     *
     * @param collection - collections inherited from Collection interface
     */
    void addAll(Collection<? extends T> collection);

    /**
     * Method call merges all collection as arg to current collection according to startIndex
     * As result we'll have all old data from current collection and new data from added
     *
     * @param collection - collections inherited from Collection interface
     */
    void addAll(Collection<? extends T> collection, int startIndex);

}
