package com.jing._15;

import org.junit.Assert;
import org.junit.Test;

public class AnnulusTest {

    // 元素个数>2且为偶数，环形
    @Test
    public void testIsAnnular_EvenAnnulus() {
        Node<String> node6 = new Node<>("node6", null);
        Node<String> node5 = new Node<>("node5", node6);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        node6.setNext(node1);
        Assert.assertTrue(Annulus.isAnnular(node1));
    }

    // 元素个数>2且为奇数，环形
    @Test
    public void testIsAnnular_OddAnnulus() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        node5.setNext(node1);
        Assert.assertTrue(Annulus.isAnnular(node1));
    }

    // 元素个数>2且为偶数，非环形
    @Test
    public void testIsAnnular_EvenNotAnnulus() {
        Node<String> node6 = new Node<>("node6", null);
        Node<String> node5 = new Node<>("node5", node6);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertFalse(Annulus.isAnnular(node1));
    }

    // 元素个数>2且为奇数，非环形
    @Test
    public void testIsAnnular_OddNotAnnulus() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertFalse(Annulus.isAnnular(node1));
    }

    // 元素个数=2，环形
    @Test
    public void testIsAnnular_2Annulus() {
        Node<String> node2 = new Node<>("node2", null);
        Node<String> node1 = new Node<>("node1", node2);
        node2.setNext(node1);
        Assert.assertTrue(Annulus.isAnnular(node1));
    }

    // 元素个数=2， 非环形
    @Test
    public void testIsAnnular_2NotAnnulus() {
        Node<String> node2 = new Node<>("node2", null);
        Node<String> node1 = new Node<>("node1", node2);
        Assert.assertFalse(Annulus.isAnnular(node1));
    }

    // 元素个数=1，环形
    @Test
    public void testIsAnnular_1Annulus() {
        Node<String> node = new Node<>("node1", null);
        node.setNext(node);
        Assert.assertTrue(Annulus.isAnnular(node));
    }

    // 元素个数=1， 非环形
    @Test
    public void testIsAnnular_1NotAnnulus() {
        Node<String> node = new Node<>("node1", null);
        Assert.assertFalse(Annulus.isAnnular(node));
    }

    // 空指针
    @Test
    public void testIsAnnular_Null() {
        Assert.assertFalse(Annulus.isAnnular(null));
    }

}
