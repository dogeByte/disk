package com.jing._15;

import org.junit.Assert;
import org.junit.Test;

public class LastKthNodeTest {

    // 倒数第k个节点在链表的中间
    @Test
    public void testFind_Middle() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertEquals(node3, LastKthNode.find(node1, 3));
    }

    // 倒数第k个节点是链表的头结点
    @Test
    public void testFind_Head() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertEquals(node1, LastKthNode.find(node1, 5));
    }

    // 倒数第k个节点是链表的尾节点
    @Test
    public void testFind_Tail() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertEquals(node5, LastKthNode.find(node1, 1));
    }

    // 空指针
    @Test
    public void testFind_Null() {
        Assert.assertNull(LastKthNode.find(null, 1));
    }

    // k过大
    @Test
    public void testFind_TooLarge() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertNull(LastKthNode.find(node1, 6));
    }

    // k过小
    @Test
    public void testFind_TooSmall() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertNull(LastKthNode.find(node1, 0));
    }

}
