package com.jing._13;

/**
 * 以O(1)的时间删除单向链表中的指定元素
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class DeleteNodeInList {

    public static <T> void delete(Node<T> head, Node<T> node) {
        Node<T> next = node.getNext();
        if (next != null) {
            node.setNext(next.getNext());
            node.setValue(next.getValue());
        } else if (head.equals(node)) {
            head.setValue(null);
        } else {
            while (!head.getNext().equals(node)) {
                head = head.getNext();
            }
            head.setNext(null);
        }
    }

}
