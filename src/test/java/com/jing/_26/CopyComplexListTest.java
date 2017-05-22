package com.jing._26;

import org.junit.Assert;
import org.junit.Test;

public class CopyComplexListTest {

    // 普通情况
    @Test
    public void testCopy_Normal() {
        Node<Integer> node5 = new Node<>(5, null, null);
        Node<Integer> node4 = new Node<>(4, node5, null);
        Node<Integer> node3 = new Node<>(3, node4, null);
        Node<Integer> node2 = new Node<>(2, node3, node5);
        Node<Integer> node1 = new Node<>(1, node2, node3);
        node4.setSibling(node2);
        Assert.assertEquals(node1, CopyComplexList.copy(node1));
    }

    // sibling指向自身
    @Test
    public void testCopy_SelfSibling() {
        Node<Integer> node5 = new Node<>(5, null, null);
        Node<Integer> node4 = new Node<>(4, node5, null);
        Node<Integer> node3 = new Node<>(3, node4, null);
        Node<Integer> node2 = new Node<>(2, node3, node5);
        Node<Integer> node1 = new Node<>(1, node2, node3);
        node4.setSibling(node2);
        node3.setSibling(node3);
        Assert.assertEquals(node1, CopyComplexList.copy(node1));
    }

    // 两个sibling成环
    @Test
    public void testCopy_AnnularSibling() {
        Node<Integer> node5 = new Node<>(5, null, null);
        Node<Integer> node4 = new Node<>(4, node5, null);
        Node<Integer> node3 = new Node<>(3, node4, null);
        Node<Integer> node2 = new Node<>(2, node3, node5);
        Node<Integer> node1 = new Node<>(1, node2, node3);
        node4.setSibling(node2);
        node3.setSibling(node1);
        Assert.assertEquals(node1, CopyComplexList.copy(node1));
    }

    // 链表中只有一个节点
    @Test
    public void testCopy_Sole() {
        Node<Integer> node = new Node<>(5, null, null);
        node.setSibling(node);
        Assert.assertEquals(node, CopyComplexList.copy(node));
    }

    // 空指针
    @Test
    public void testCopy_Null() {
        Assert.assertNull(CopyComplexList.copy(null));
    }

}
