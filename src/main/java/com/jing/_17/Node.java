package com.jing._17;

/**
 * 单向链表的节点
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     MergeSorterList
 */

public class Node<T> {

    private T value;
    private Node<T> next;

    public Node() {
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
