package com.jing._16;

/**
 * 反转单向链表
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */
public class ReverseList {

    // 循环实现
    public static <T> Node<T> reverse(Node<T> head) {
        Node<T> last = null;
        while (head != null) {
            Node<T> next = head.getNext();
            head.setNext(last);
            last = head;
            head = next;
        }
        return last;
    }

    // 递归实现
    public static <T> Node<T> reverseRecursively(Node<T> head) {
        return reverseRecursively(head, null);
    }

    private static <T> Node<T> reverseRecursively(Node<T> present, Node<T> last) {
        if (present == null) {
            return last;
        }
        Node<T> next = present.getNext();
        present.setNext(last);
        return reverseRecursively(next, present);
    }

}
