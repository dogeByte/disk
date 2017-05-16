package com.jing._20;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintMatrixTest {

    // 正方形矩阵
    @Test
    public void testPrint_Square() {
        Integer[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        PrintMatrix.print(matrix);
        String actual = out.toString();
        String expected = "1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10, ";
        Assert.assertEquals(expected, actual);
    }

    // 瘦矩阵
    @Test
    public void testPrint_Thin() {
        Integer[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        PrintMatrix.print(matrix);
        String actual = out.toString();
        String expected = "1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8, ";
        Assert.assertEquals(expected, actual);
    }

    // 胖矩阵
    @Test
    public void testPrint_Fat() {
        Integer[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        PrintMatrix.print(matrix);
        String actual = out.toString();
        String expected = "1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7, ";
        Assert.assertEquals(expected, actual);
    }

    // 行向量
    @Test
    public void testPrint_SoleRow() {
        Integer[][] matrix = { { 1, 2, 3, 4 } };
        PrintMatrix.print(matrix);
        String actual = out.toString();
        String expected = "1, 2, 3, 4, ";
        Assert.assertEquals(expected, actual);
    }

    // 列向量
    @Test
    public void testPrint_SoleColumn() {
        Integer[][] matrix = { { 1 }, { 2 }, { 3 }, { 4 } };
        PrintMatrix.print(matrix);
        String actual = out.toString();
        String expected = "1, 2, 3, 4, ";
        Assert.assertEquals(expected, actual);
    }

    // 只有一个元素
    @Test
    public void testPrint_SoleElement() {
        Integer[][] matrix = { { 1 } };
        PrintMatrix.print(matrix);
        String actual = out.toString();
        String expected = "1, ";
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
