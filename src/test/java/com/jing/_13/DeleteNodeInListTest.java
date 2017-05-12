package com.jing._13;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteNodeInListTest {

    // 从有多个节点的链表中删除中间的某个节点
    @Test
    public void testDelete_Middle() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        String expected = "node1 node2 node4 node5 ";
        DeleteNodeInList.delete(node1, node3);
        while (node1 != null) {
            System.out.print(node1.getValue() + " ");
            node1 = node1.getNext();
        }
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 从有多个节点的链表中删除头结点
    @Test
    public void testDelete_Head() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        String expected = "node2 node3 node4 node5 ";
        DeleteNodeInList.delete(node1, node1);
        while (node1 != null) {
            System.out.print(node1.getValue() + " ");
            node1 = node1.getNext();
        }
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 从有多个节点的链表中删除尾结点
    @Test
    public void testDelete_Tail() {
        Node<String> node5 = new Node<>("node5", null);
        Node<String> node4 = new Node<>("node4", node5);
        Node<String> node3 = new Node<>("node3", node4);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        String expected = "node1 node2 node3 node4 ";
        DeleteNodeInList.delete(node1, node5);
        while (node1 != null) {
            System.out.print(node1.getValue() + " ");
            node1 = node1.getNext();
        }
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 从只有一个节点的链表中删除节点
    @Test
    public void testDelete_Sole() {
        Node<String> node = new Node<>("node", null);
        DeleteNodeInList.delete(node, node);
        Assert.assertNull(node.getValue());
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
