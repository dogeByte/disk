package com.jing._05;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 倒序打印单向链表
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class PrintListReversingly {

    public static <T> void print(Node<T> head) {
        if (head == null) {
            return;
        }
        Deque<T> stack = new ArrayDeque<>();
        Node<T> node = head;
        while (node != null) {
            stack.offerFirst(node.getValue());
            node = node.getNext();
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pollFirst() + " ");
        }
    }

    public static <T> void printRecursively(Node<T> head) {
        if (head == null) {
            return;
        }
        printRecursively(head.getNext());
        System.out.print(head.getValue() + " ");
    }
}
