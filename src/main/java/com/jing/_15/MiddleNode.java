package com.jing._15;

/**
 * 以O(1)的时间查找单向链表的中间元素
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class MiddleNode {

    public static <T> Node<T> find(Node<T> head) {
        if (head == null) {
            return null;
        }
        Node<T> slow = head.getNext();
        if (slow == null) {
            return head;
        }
        Node<T> fast = slow.getNext();
        while (fast != null) {
            fast = fast.getNext();
            if (fast != null) {
                fast = fast.getNext();
                slow = slow.getNext();
            }
        }
        return slow;
    }

}
