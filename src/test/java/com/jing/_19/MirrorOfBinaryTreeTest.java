package com.jing._19;

import org.junit.Assert;
import org.junit.Test;

public class MirrorOfBinaryTreeTest {

    // 不完全二叉树
    @Test
    public void testMirror_Incomplete() {
        Node<Integer> node1_8 = new Node<>(8, null, null);
        Node<Integer> node1_7 = new Node<>(7, null, null);
        Node<Integer> node1_6 = new Node<>(6, node1_8, null);
        Node<Integer> node1_5 = new Node<>(5, null, null);
        Node<Integer> node1_4 = new Node<>(4, null, node1_7);
        Node<Integer> node1_3 = new Node<>(3, node1_5, node1_6);
        Node<Integer> node1_2 = new Node<>(2, node1_4, null);
        Node<Integer> node1_1 = new Node<>(1, node1_2, node1_3);
        Node<Integer> node2_8 = new Node<>(8, null, null);
        Node<Integer> node2_7 = new Node<>(7, null, null);
        Node<Integer> node2_6 = new Node<>(6, null, node2_8);
        Node<Integer> node2_5 = new Node<>(5, null, null);
        Node<Integer> node2_4 = new Node<>(4, node2_7, null);
        Node<Integer> node2_3 = new Node<>(3, node2_6, node2_5);
        Node<Integer> node2_2 = new Node<>(2, null, node2_4);
        Node<Integer> node2_1 = new Node<>(1, node2_3, node2_2);
        Assert.assertEquals(MirrorOfBinaryTree.mirrorRecursively(node1_1), node2_1);
    }

    // 完全二叉树
    @Test
    public void testMirror_Complete() {
        Node<Integer> node1_15 = new Node<>(15, null, null);
        Node<Integer> node1_14 = new Node<>(14, null, null);
        Node<Integer> node1_13 = new Node<>(13, null, null);
        Node<Integer> node1_12 = new Node<>(12, null, null);
        Node<Integer> node1_11 = new Node<>(11, null, null);
        Node<Integer> node1_10 = new Node<>(10, null, null);
        Node<Integer> node1_9 = new Node<>(9, null, null);
        Node<Integer> node1_8 = new Node<>(8, null, null);
        Node<Integer> node1_7 = new Node<>(7, node1_14, node1_15);
        Node<Integer> node1_6 = new Node<>(6, node1_12, node1_13);
        Node<Integer> node1_5 = new Node<>(5, node1_10, node1_11);
        Node<Integer> node1_4 = new Node<>(4, node1_8, node1_9);
        Node<Integer> node1_3 = new Node<>(3, node1_6, node1_7);
        Node<Integer> node1_2 = new Node<>(2, node1_4, node1_5);
        Node<Integer> node1_1 = new Node<>(1, node1_2, node1_3);
        Node<Integer> node2_15 = new Node<>(15, null, null);
        Node<Integer> node2_14 = new Node<>(14, null, null);
        Node<Integer> node2_13 = new Node<>(13, null, null);
        Node<Integer> node2_12 = new Node<>(12, null, null);
        Node<Integer> node2_11 = new Node<>(11, null, null);
        Node<Integer> node2_10 = new Node<>(10, null, null);
        Node<Integer> node2_9 = new Node<>(9, null, null);
        Node<Integer> node2_8 = new Node<>(8, null, null);
        Node<Integer> node2_7 = new Node<>(7, node2_15, node2_14);
        Node<Integer> node2_6 = new Node<>(6, node2_13, node2_12);
        Node<Integer> node2_5 = new Node<>(5, node2_11, node2_10);
        Node<Integer> node2_4 = new Node<>(4, node2_9, node2_8);
        Node<Integer> node2_3 = new Node<>(3, node2_7, node2_6);
        Node<Integer> node2_2 = new Node<>(2, node2_5, node2_4);
        Node<Integer> node2_1 = new Node<>(1, node2_3, node2_2);
        Assert.assertEquals(MirrorOfBinaryTree.mirrorRecursively(node1_1), node2_1);
    }

    // 没有右子节点的二叉树
    @Test
    public void testMirror_NoRight() {
        Node<Integer> node1_4 = new Node<>(4, null, null);
        Node<Integer> node1_3 = new Node<>(3, node1_4, null);
        Node<Integer> node1_2 = new Node<>(2, node1_3, null);
        Node<Integer> node1_1 = new Node<>(1, node1_2, null);
        Node<Integer> node2_4 = new Node<>(4, null, null);
        Node<Integer> node2_3 = new Node<>(3, null, node2_4);
        Node<Integer> node2_2 = new Node<>(2, null, node2_3);
        Node<Integer> node2_1 = new Node<>(1, null, node2_2);
        Assert.assertEquals(MirrorOfBinaryTree.mirrorRecursively(node1_1), node2_1);
    }

    // 没有左子节点的二叉树
    @Test
    public void testMirror_NoLeft() {
        Node<Integer> node1_4 = new Node<>(4, null, null);
        Node<Integer> node1_3 = new Node<>(3, null, node1_4);
        Node<Integer> node1_2 = new Node<>(2, null, node1_3);
        Node<Integer> node1_1 = new Node<>(1, null, node1_2);
        Node<Integer> node2_4 = new Node<>(4, null, null);
        Node<Integer> node2_3 = new Node<>(3, node2_4, null);
        Node<Integer> node2_2 = new Node<>(2, node2_3, null);
        Node<Integer> node2_1 = new Node<>(1, node2_2, null);
        Assert.assertEquals(MirrorOfBinaryTree.mirrorRecursively(node1_1), node2_1);
    }

    // 只有根节点的二叉树
    @Test
    public void testMirror_SoleRoot() {
        Node<Integer> node1 = new Node<>(1, null, null);
        Node<Integer> node2 = new Node<>(1, null, null);
        Assert.assertEquals(MirrorOfBinaryTree.mirrorRecursively(node1), node2);
    }

    // 空指针
    @Test
    public void testMirror_Null() {
        Assert.assertEquals(MirrorOfBinaryTree.mirrorRecursively(null), null);
    }

}
