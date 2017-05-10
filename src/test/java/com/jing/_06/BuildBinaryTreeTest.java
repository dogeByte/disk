package com.jing._06;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BuildBinaryTreeTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // 不完全二叉树
    @Test
    public void testRebuild_Incomplete() {
        Node<Integer> node8 = new Node<>(8, null, null);
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node6 = new Node<>(6, node8, null);
        Node<Integer> node5 = new Node<>(5, null, null);
        Node<Integer> node4 = new Node<>(4, null, node7);
        Node<Integer> node3 = new Node<>(3, node5, node6);
        Node<Integer> node2 = new Node<>(2, node4, null);
        Node<Integer> node1 = new Node<>(1, node2, node3);
        Integer[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        Integer[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        Assert.assertEquals(BuildBinaryTree.rebuild(preorder, inorder), node1);
    }

    // 完全二叉树
    @Test
    public void testRebuild_Complete() {
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node14 = new Node<>(14, null, null);
        Node<Integer> node13 = new Node<>(13, null, null);
        Node<Integer> node12 = new Node<>(12, null, null);
        Node<Integer> node11 = new Node<>(11, null, null);
        Node<Integer> node10 = new Node<>(10, null, null);
        Node<Integer> node9 = new Node<>(9, null, null);
        Node<Integer> node8 = new Node<>(8, null, null);
        Node<Integer> node7 = new Node<>(7, node14, node15);
        Node<Integer> node6 = new Node<>(6, node12, node13);
        Node<Integer> node5 = new Node<>(5, node10, node11);
        Node<Integer> node4 = new Node<>(4, node8, node9);
        Node<Integer> node3 = new Node<>(3, node6, node7);
        Node<Integer> node2 = new Node<>(2, node4, node5);
        Node<Integer> node1 = new Node<>(1, node2, node3);
        Integer[] preorder = {1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
        Integer[] inorder = {8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};
        Assert.assertEquals(BuildBinaryTree.rebuild(preorder, inorder), node1);
    }

    // 没有右子节点的二叉树
    @Test
    public void testRebuild_NoRight() {
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(3, node4, null);
        Node<Integer> node2 = new Node<>(2, node3, null);
        Node<Integer> node1 = new Node<>(1, node2, null);
        Integer[] preorder = {1, 2, 3, 4};
        Integer[] inorder = {4, 3, 2, 1};
        Assert.assertEquals(BuildBinaryTree.rebuild(preorder, inorder), node1);
    }

    // 没有左子节点的二叉树
    @Test
    public void testRebuild_NoLeft() {
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(3, null, node4);
        Node<Integer> node2 = new Node<>(2, null, node3);
        Node<Integer> node1 = new Node<>(1, null, node2);
        Integer[] preorder = {1, 2, 3, 4};
        Integer[] inorder = {1, 2, 3, 4};
        Assert.assertEquals(BuildBinaryTree.rebuild(preorder, inorder), node1);
    }

    // 只有根节点的二叉树
    @Test
    public void testRebuild_SoleRoot() {
        Node<Integer> node = new Node<>(1, null, null);
        Integer[] preorder = {1};
        Integer[] inorder = {1};
        Assert.assertEquals(BuildBinaryTree.rebuild(preorder, inorder), node);
    }

    // 空指针
    @Test
    public void testRebuild_Null() {
        Assert.assertEquals(BuildBinaryTree.rebuild(null, null), null);
    }

    // 前序序列和中序序列长度不同
    @Test
    public void testRebuild_NotMatch1() {
        Integer[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        Integer[] inorder = {4, 7, 2, 1, 5, 3, 8}; // 错误的中序序列
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("前序序列和中序序列不匹配");
        BuildBinaryTree.rebuild(preorder, inorder);
    }

    // 前序序列和中序序列长度不同
    @Test
    public void testRebuild_NotMatch2() {
        Integer[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        Integer[] inorder = {6, 7, 2, 1, 5, 3, 8, 4}; // 错误的中序序列
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("前序序列和中序序列不匹配");
        BuildBinaryTree.rebuild(preorder, inorder);
    }

}
