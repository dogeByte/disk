package com.jing._10;

import org.junit.Assert;
import org.junit.Test;

public class NumberOf1InBinaryTest {

    @Test
    public void testCalculate1() {
        Assert.assertEquals(1, NumberOf1InBinary.calculate1(Integer.MIN_VALUE));
        Assert.assertEquals(26, NumberOf1InBinary.calculate1(-2017));
        Assert.assertEquals(32, NumberOf1InBinary.calculate1(-1));
        Assert.assertEquals(0, NumberOf1InBinary.calculate1(0));
        Assert.assertEquals(1, NumberOf1InBinary.calculate1(1));
        Assert.assertEquals(7, NumberOf1InBinary.calculate1(2017));
        Assert.assertEquals(31, NumberOf1InBinary.calculate1(Integer.MAX_VALUE));
    }

    @Test
    public void testCalculate2() {
        Assert.assertEquals(1, NumberOf1InBinary.calculate1(Integer.MIN_VALUE));
        Assert.assertEquals(26, NumberOf1InBinary.calculate1(-2017));
        Assert.assertEquals(32, NumberOf1InBinary.calculate1(-1));
        Assert.assertEquals(0, NumberOf1InBinary.calculate1(0));
        Assert.assertEquals(1, NumberOf1InBinary.calculate1(1));
        Assert.assertEquals(7, NumberOf1InBinary.calculate1(2017));
        Assert.assertEquals(31, NumberOf1InBinary.calculate1(Integer.MAX_VALUE));
    }

}
