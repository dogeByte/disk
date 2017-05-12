package com.jing._16;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseListTest {

    // 循环实现：链表包含多个节点
    @Test
    public void testReserve_Multiple() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Node<String> newHead = ReverseList.reverse(node1);
        while (newHead != null) {
            System.out.println(newHead.getValue());
            newHead = newHead.getNext();
        }
        String expected = "node5" + LINE_SEPARATOR + "node4" + LINE_SEPARATOR + "node3"
            + LINE_SEPARATOR + "node2" + LINE_SEPARATOR + "node1" + LINE_SEPARATOR;
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 循环实现：链表只有唯一节点
    @Test
    public void testReverse_Sole() {
        Node<String> node = new Node<>("node", null);
        Node<String> newHead = ReverseList.reverse(node);
        while (newHead != null) {
            System.out.print(newHead.getValue());
            newHead = newHead.getNext();
        }
        String expected = "node";
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 循环实现：空指针
    @Test
    public void testReverse_Null() {
        Assert.assertNull(ReverseList.reverse(null));
    }

    // 递归实现：链表包含多个节点
    @Test
    public void testReserveRecursively_Multiple() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Node<String> newHead = ReverseList.reverseRecursively(node1);
        while (newHead != null) {
            System.out.println(newHead.getValue());
            newHead = newHead.getNext();
        }
        String expected = "node5" + LINE_SEPARATOR + "node4" + LINE_SEPARATOR + "node3"
            + LINE_SEPARATOR + "node2" + LINE_SEPARATOR + "node1" + LINE_SEPARATOR;
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 递归实现：链表只有唯一节点
    @Test
    public void testReverseRecursively_Sole() {
        Node<String> node = new Node<>("node", null);
        Node<String> newHead = ReverseList.reverseRecursively(node);
        while (newHead != null) {
            System.out.print(newHead.getValue());
            newHead = newHead.getNext();
        }
        String expected = "node";
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 递归实现：空指针
    @Test
    public void testReverseRecursively_Null() {
        Assert.assertNull(ReverseList.reverseRecursively(null));
    }

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
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
