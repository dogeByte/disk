package com.jing._19;

/**
 * 二叉树的镜像
 * 
 * @version 1.0.0
 * @author JingBo
 * @see Node
 */

public class MirrorOfBinaryTree {

    // 递归实现
    public static <T> Node<T> mirrorRecursively(Node<T> head) {
        if (head == null) {
            return null;
        }
        Node<T> left = head.getLeft();
        Node<T> right = head.getRight();
        if (head.getLeft() == null && head.getRight() == null) {
            return head;
        }
        head.setLeft(mirrorRecursively(right));
        head.setRight(mirrorRecursively(left));
        return head;
    }

}
