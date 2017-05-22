package com.jing._27;

import org.junit.Assert;
import org.junit.Test;

public class ConvertBinarySearchTreeTest {

    // 完全二叉树
    @Test
    public void testConvert_Complete() {
        Node<Integer> tree7 = new Node<>(16, null, null);
        Node<Integer> tree6 = new Node<>(12, null, null);
        Node<Integer> tree5 = new Node<>(8, null, null);
        Node<Integer> tree4 = new Node<>(4, null, null);
        Node<Integer> tree3 = new Node<>(14, tree6, tree7);
        Node<Integer> tree2 = new Node<>(6, tree4, tree5);
        Node<Integer> tree1 = new Node<>(10, tree2, tree3);
        Node<Integer> list1 = new Node<>(4, null, null);
        Node<Integer> list2 = new Node<>(6, list1, null);
        Node<Integer> list3 = new Node<>(8, list2, null);
        Node<Integer> list4 = new Node<>(10, list3, null);
        Node<Integer> list5 = new Node<>(12, list4, null);
        Node<Integer> list6 = new Node<>(14, list5, null);
        Node<Integer> list7 = new Node<>(16, list6, null);
        list1.setRight(list2);
        list2.setRight(list3);
        list3.setRight(list4);
        list4.setRight(list5);
        list5.setRight(list6);
        list6.setRight(list7);
        Assert.assertEquals(ConvertBinarySearchTree.convert(tree1), list1);
    }

    // 没有左子节点的二叉树
    @Test
    public void testConvert_NoLeft() {
        Node<Integer> tree4 = new Node<>(4, null, null);
        Node<Integer> tree3 = new Node<>(3, null, tree4);
        Node<Integer> tree2 = new Node<>(2, null, tree3);
        Node<Integer> tree1 = new Node<>(1, null, tree2);
        Node<Integer> list1 = new Node<>(1, null, null);
        Node<Integer> list2 = new Node<>(2, list1, null);
        Node<Integer> list3 = new Node<>(3, list2, null);
        Node<Integer> list4 = new Node<>(4, list3, null);
        list1.setRight(list2);
        list2.setRight(list3);
        list3.setRight(list4);
        Assert.assertEquals(ConvertBinarySearchTree.convert(tree1), list1);
    }

    // 没有右子节点的二叉树
    @Test
    public void testConvert_NoRight() {
        Node<Integer> tree4 = new Node<>(1, null, null);
        Node<Integer> tree3 = new Node<>(2, tree4, null);
        Node<Integer> tree2 = new Node<>(3, tree3, null);
        Node<Integer> tree1 = new Node<>(4, tree2, null);
        Node<Integer> list1 = new Node<>(1, null, null);
        Node<Integer> list2 = new Node<>(2, list1, null);
        Node<Integer> list3 = new Node<>(3, list2, null);
        Node<Integer> list4 = new Node<>(4, list3, null);
        list1.setRight(list2);
        list2.setRight(list3);
        list3.setRight(list4);
        Assert.assertEquals(ConvertBinarySearchTree.convert(tree1), list1);
    }

    // 只有根节点的二叉树
    @Test
    public void testConvert_Sole() {
        Node<Integer> tree = new Node<>(1, null, null);
        Node<Integer> list = new Node<>(1, null, null);
        Assert.assertEquals(ConvertBinarySearchTree.convert(tree), list);
    }

    // 空指针
    @Test
    public void testConvert_Null() {
        Assert.assertNull(ConvertBinarySearchTree.convert(null));
    }

}
