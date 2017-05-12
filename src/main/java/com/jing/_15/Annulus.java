package com.jing._15;

/**
 * 判断单向链表是否成环
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class Annulus {

    public static <T> boolean isAnnular(Node<T> head) {
        if (head == null) {
            return false;
        }
        Node<T> slow = head.getNext();
        if (slow == null) {
            return false;
        }
        Node<T> fast = slow.getNext();
        while (fast != null) {
            if (fast.equals(slow)) {
                return true;
            }
            fast = fast.getNext();
            if (fast != null) {
                fast = fast.getNext();
                slow = slow.getNext();
            }
        }
        return false;
    }

}
