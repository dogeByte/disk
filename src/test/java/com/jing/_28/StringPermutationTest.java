package com.jing._28;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringPermutationTest {

    // 字符串中包含多个字符
    @Test
    public void testPrint_MultiChar() {
        StringPermutation.print("abc");
        String actual = out.toString();
        String expected = "[a, b, c]" + LINE_SEPARATOR + "[a, c, b]" + LINE_SEPARATOR + "[b, a, c]" + LINE_SEPARATOR
                + "[b, c, a]" + LINE_SEPARATOR + "[c, b, a]" + LINE_SEPARATOR + "[c, a, b]" + LINE_SEPARATOR;
        Assert.assertEquals(expected, actual);
    }

    // 字符串中只有一个字符
    @Test
    public void testPrint_SoleChar() {
        StringPermutation.print("a");
        String actual = out.toString();
        String expected = "[a]" + LINE_SEPARATOR;
        Assert.assertEquals(expected, actual);
    }

    // 空字符串
    @Test
    public void testPrint_Blank() {
        StringPermutation.print("");
        String actual = out.toString();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }

    // 空指针
    @Test
    public void testPrint_Null() {
        StringPermutation.print(null);
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
