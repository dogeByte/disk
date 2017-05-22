package com.jing._26;

/**
 * 复杂链表的节点
 * 
 * @version 1.0.0
 * @author JingBo
 * @see CopyComplexList
 */

public class Node<T> {

    private T value;
    private Node<T> next;
    private Node<T> sibling;

    public Node(T value, Node<T> next, Node<T> sibling) {
        this.value = value;
        this.next = next;
        this.sibling = sibling;
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

    public Node<T> getSibling() {
        return sibling;
    }

    public void setSibling(Node<T> sibling) {
        this.sibling = sibling;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((next == null) ? 0 : next.value.hashCode());
        result = prime * result + ((sibling == null) ? 0 : sibling.value.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node<?> other = (Node<?>) obj;
        if (next == null) {
            if (other.next != null)
                return false;
        } else if (!next.value.equals(other.next.value))
            return false;
        if (sibling == null) {
            if (other.sibling != null)
                return false;
        } else if (!sibling.value.equals(other.sibling.value))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
}
