package com.jing._05;

/**
 * 单向链表的节点
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     PrintListReversingly
 */

public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return (T) this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
