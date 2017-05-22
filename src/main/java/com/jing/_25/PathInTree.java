package com.jing._25;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 打印二叉树中节点值的和为指定值的所有路径
 * 
 * @version 1.0.0
 * @author JingBo
 * @see Node
 */

public class PathInTree {

    public static void print(Node<Integer> root, int expectedSum) {
        if (root == null) {
            return;
        }
        print(root, expectedSum, 0, new ArrayDeque<Integer>());
    }

    private static void print(Node<Integer> node, int expectedSum, int actualSum, Deque<Integer> stack) {
        int value = node.getValue();
        stack.addLast(value);
        actualSum += value;
        Node<Integer> left = node.getLeft();
        Node<Integer> right = node.getRight();
        if (actualSum == expectedSum && left == null && right == null) {
            System.out.println(Arrays.toString(stack.toArray()));
        }
        if (left != null) {
            print(left, expectedSum, actualSum, stack);
        }
        if (right != null) {
            print(right, expectedSum, actualSum, stack);
        }
        stack.removeLast();
    }

}
