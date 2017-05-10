package com.jing._05;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintListReversinglyTest {

    // 链表有多个节点
    @Test
    public void testPrint_MultiNode() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        String expected = "node5 node4 node3 node2 node1 ";
        PrintListReversingly.printRecursively(node1);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 链表只有一个节点
    @Test
    public void testPrint_SoleNode() {
        Node<String> head = new Node<>("node", null);
        String expected = "node ";
        PrintListReversingly.print(head);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 空指针
    @Test
    public void testPrint_Null() {
        String expected = "";
        PrintListReversingly.print(null);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

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

    private PrintStream console = null;
    private OutputStream out = null;

}
