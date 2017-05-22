package com.jing._26;

/**
 * 复杂链表的复制
 * 
 * @version 1.0.0
 * @author JingBo
 * @see Node
 */

public class CopyComplexList {

    public static <T> Node<T> copy(Node<T> head) {
        if (head == null) {
            return null;
        }
        Node<T> node = head;
        Node<T> duplicate = null;
        while (node != null) {
            Node<T> next = node.getNext();
            duplicate = new Node<>(node.getValue(), next, null);
            node.setNext(duplicate);
            node = next;
        }
        node = head;
        while (node != null) {
            duplicate = node.getNext();
            Node<T> sibling = node.getSibling();
            if (sibling != null) {
                duplicate.setSibling(sibling.getNext());
            }
            node = duplicate.getNext();
        }
        node = head;
        Node<T> duplicateHead = node.getNext();
        while (node != null) {
            duplicate = node.getNext();
            Node<T> next = duplicate.getNext();
            node.setNext(next);
            if (next == null) {
                duplicate.setNext(null);
            } else {
                Node<T> duplicateNext = next.getNext();
                duplicate.setNext(duplicateNext);
            }
            node = next;
        }
        return duplicateHead;
    }

}
