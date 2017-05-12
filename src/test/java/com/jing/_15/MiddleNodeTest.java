package com.jing._15;

import org.junit.Assert;
import org.junit.Test;

public class MiddleNodeTest {

    // 元素个数>2且为偶数
    @Test
    public void testFind_Even() {
        Node<String> node6 = new Node<>("node6", null);
        Node<String> node5 = new Node<>("node5", node6);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertEquals(node4, MiddleNode.find(node1));
    }

    // 元素个数>2且为奇数
    @Test
    public void testFind_Odd() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertEquals(node3, MiddleNode.find(node1));
    }

    // 元素个数=2
    @Test
    public void testFind_Double() {
        Node<String> node2 = new Node<>("node2", null);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertEquals(node2, MiddleNode.find(node1));
    }

    // 元素个数=1
    @Test
    public void testFind_Sole() {
        Node<String> head = new Node<>("head", null);
        Assert.assertEquals(head, MiddleNode.find(head));
    }

    // 空指针
    @Test
    public void testFind_Null() {
        Assert.assertNull(MiddleNode.find(null));
    }

}
