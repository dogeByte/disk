package com.jing._06;

import java.util.Arrays;

/**
 * 根据前序序列和中序序列重建二叉树
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class BuildBinaryTree {

    public static <T> Node<T> rebuild(T[] preorder, T[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        if (length != inorder.length) {
            throw new IllegalArgumentException("前序序列和中序序列不匹配");
        }
        Node<T> root = new Node<>(preorder[0]);
        int rootAtInorder = 0;
        while ((rootAtInorder < length) && (!root.getValue().equals(inorder[rootAtInorder]))) {
            rootAtInorder++;
        }
        if (rootAtInorder >= length) {
            throw new IllegalArgumentException("前序序列和中序序列不匹配");
        }
        if (rootAtInorder != 0) {
            T[] leftPreorder = Arrays.copyOfRange(preorder, 1, rootAtInorder + 1);
            T[] leftInorder = Arrays.copyOfRange(inorder, 0, rootAtInorder);
            root.setLeft(rebuild(leftPreorder, leftInorder));
        }
        if (rootAtInorder != length - 1) {
            T[] rightPreorder = Arrays.copyOfRange(preorder, rootAtInorder + 1, length);
            T[] rightInorder = Arrays.copyOfRange(inorder, rootAtInorder + 1, length);
            root.setRight(rebuild(rightPreorder, rightInorder));
        }
        return root;
    }
}
