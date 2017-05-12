package com.jing._12;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Print1ToMaxOfNDigitsTest {

    // 位数为正
    @Test
    public void testPrint_Positive() {
        String expected = "1 2 3 4 5 6 7 8 9 ";
        Print1ToMaxOfNDigits.print(1);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 位数为0
    @Test
    public void testPrint_Zero() {
        String expected = "";
        Print1ToMaxOfNDigits.print(0);
        String actual = out.toString();
        Assert.assertEquals(expected, actual);
    }

    // 位数为负
    @Test
    public void testPrint_Negative() {
        String expected = "";
        Print1ToMaxOfNDigits.print(-1);
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
