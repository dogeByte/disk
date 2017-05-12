package com.jing._17;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortedListTest {

    @Test
    public void testMerge() {
        Node<Integer> node1_4 = new Node<>(7, null);
        Node<Integer> node1_3 = new Node<>(4, node1_4);
        Node<Integer> node1_2 = new Node<>(2, node1_3);
        Node<Integer> node1_1 = new Node<>(1, node1_2);
        Node<Integer> node2_4 = new Node<>(8, null);
        Node<Integer> node2_3 = new Node<>(6, node2_4);
        Node<Integer> node2_2 = new Node<>(5, node2_3);
        Node<Integer> node2_1 = new Node<>(3, node2_2);
        Node<Integer> head = MergeSortedList.merge(node1_1, node2_1);
        while (head != null) {
            System.out.println(head.getValue());
            head = head.getNext();
        }
        String actual = out.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            sb.append(i).append(LINE_SEPARATOR);
        }
        Assert.assertEquals(sb.toString(), actual);
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
