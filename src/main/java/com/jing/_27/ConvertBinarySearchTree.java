package com.jing._27;

/**
 * 把二叉搜索树转换为排序的双向链表
 * 
 * @version 1.0.0
 * @author JingBo
 * @see Node
 */

public class ConvertBinarySearchTree {

    public static <T extends Comparable<T>> Node<T> convert(Node<T> root) {
        if (root == null) {
            return null;
        }
        Node<T> last = convert(root, null);
        while (last.getLeft() != null) {
            last = last.getLeft();
        }
        return last;
    }

    private static <T extends Comparable<T>> Node<T> convert(Node<T> node, Node<T> last) {
        Node<T> left = node.getLeft();
        if (left != null) {
            last = convert(left, last);
        }
        node.setLeft(last);
        if (last != null) {
            last.setRight(node);
        }
        Node<T> right = node.getRight();
        last = node;
        if (right != null) {
            last = convert(right, last);
        }
        return last;
    }

}
