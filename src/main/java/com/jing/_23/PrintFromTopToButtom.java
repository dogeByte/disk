package com.jing._23;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树
 * 
 * @version 1.0.0
 * @author JingBo
 * @see Node
 */

public class PrintFromTopToButtom {

    public static <T> void print(Node<T> root) {
        if (root == null) {
            return;
        }
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();
            System.out.print(node.getValue() + ", ");
            Node<T> left = node.getLeft();
            Node<T> right = node.getRight();
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
        }
    }

}
