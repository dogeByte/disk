package com.jing._15;

/**
 * 以O(1)的时间找到单向链表中倒数第k个元素
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class LastKthNode {

    public static <T> Node<T> find(Node<T> head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node<T> fast = head;
        Node<T> slow = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.getNext();
            if (fast == null) {
                return null;
            }
        }
        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }

}
