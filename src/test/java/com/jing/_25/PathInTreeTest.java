package com.jing._25;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathInTreeTest {

    // 只有一条匹配的路径
    @Test
    public void testPrint_SolePath() {
        Node<Integer> node5 = new Node<>(7, null, null);
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(12, null, null);
        Node<Integer> node2 = new Node<>(5, node4, node5);
        Node<Integer> node1 = new Node<>(10, node2, node3);
        PathInTree.print(node1, 19);
        String actual = out.toString();
        String expected = "[10, 5, 4]" + LINE_SEPARATOR;
        Assert.assertEquals(expected, actual);
    }

    // 存在多条匹配的路径
    @Test
    public void testPrint_MultiPath() {
        Node<Integer> node5 = new Node<>(7, null, null);
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(12, null, null);
        Node<Integer> node2 = new Node<>(5, node4, node5);
        Node<Integer> node1 = new Node<>(10, node2, node3);
        PathInTree.print(node1, 22);
        String actual = out.toString();
        String expected = "[10, 5, 7]" + LINE_SEPARATOR + "[10, 12]" + LINE_SEPARATOR;
        Assert.assertEquals(expected, actual);
    }

    // 不存在匹配的路径
    @Test
    public void testPrint_NotMatch() {
        Node<Integer> node5 = new Node<>(7, null, null);
        Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node3 = new Node<>(12, null, null);
        Node<Integer> node2 = new Node<>(5, node4, node5);
        Node<Integer> node1 = new Node<>(10, node2, node3);
        PathInTree.print(node1, 1);
        String actual = out.toString();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }

    // 空指针
    @Test
    public void testPrint_Null() {
        PathInTree.print(null, 1);
        String actual = out.toString();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }

    private PrintStream console = null;
    private OutputStream out = null;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

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
