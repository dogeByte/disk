package com.jing._17;

/**
 * 合并两个递增排序的单向链表
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class MergeSortedList {

    public static <T extends Comparable<T>> Node<T> merge(Node<T> head1, Node<T> head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        Node<T> head = new Node<>();
        if (head1.getValue().compareTo(head2.getValue()) < 0) {
            head = head1;
            head1 = head1.getNext();
        } else {
            head = head2;
            head2 = head2.getNext();
        }
        head.setNext(merge(head1, head2));
        return head;
    }

}
