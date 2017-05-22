package com.jing._23;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintFromTopToButtomTest {

    // 不完全二叉树
    @Test
    public void testPrint_Incomplete() {
        Node<Integer> node8 = new Node<>(8, null, null);
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node6 = new Node<>(6, node8, null);
        Node<Integer> node5 = new Node<>(5, null, null);
        Node<Integer> node4 = new Node<>(4, null, node7);
        Node<Integer> node3 = new Node<>(3, node5, node6);
        Node<Integer> node2 = new Node<>(2, node4, null);
        Node<Integer> node1 = new Node<>(1, node2, node3);
        String expected = "1, 2, 3, 4, 5, 6, 7, 8, ";
        PrintFromTopToButtom.print(node1);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 完全二叉树
    @Test
    public void testPrint_Complete() {
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
        String expected = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, ";
        PrintFromTopToButtom.print(node1);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 没有右子节点的二叉树
    @Test
    public void testPrint_NoRight() {
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(3, node4, null);
        Node<Integer> node2 = new Node<>(2, node3, null);
        Node<Integer> node1 = new Node<>(1, node2, null);
        String expected = "1, 2, 3, 4, ";
        PrintFromTopToButtom.print(node1);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 没有左子节点的二叉树
    @Test
    public void testPrint_NoLeft() {
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(3, null, node4);
        Node<Integer> node2 = new Node<>(2, null, node3);
        Node<Integer> node1 = new Node<>(1, null, node2);
        String expected = "1, 2, 3, 4, ";
        PrintFromTopToButtom.print(node1);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 只有根节点的二叉树
    @Test
    public void testPrint_SoleRoot() {
        Node<Integer> node = new Node<>(1, null, null);
        String expected = "1, ";
        PrintFromTopToButtom.print(node);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    private PrintStream console = null;
    private OutputStream out = null;

    @Before
    public void setUp() {
        console = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

}
