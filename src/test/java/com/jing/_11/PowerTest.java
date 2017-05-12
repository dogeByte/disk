package com.jing._11;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PowerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // 0^0
    @Test
    public void testPow_ZeroPowZero() {
        Assert.assertEquals(Math.pow(0D, 0D), Power.pow(0D, 0), Power.PERCISION);
    }

    // 0^正
    @Test
    public void testPow_ZeroPowPositive() {
        Assert.assertEquals(Math.pow(0D, 10D), Power.pow(0D, 10), Power.PERCISION);
    }

    // 0^负
    @Test
    public void testPow_ZeroPowNegative() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("无穷大");
        Power.pow(0D, -10);
    }

    // 正^0
    @Test
    public void testPow_PositivePowZero() {
        Assert.assertEquals(Math.pow(2.017D, 0D), Power.pow(2.017D, 0), Power.PERCISION);
    }

    // 正^正
    @Test
    public void testPow_PositivePowPositive() {
        Assert.assertEquals(Math.pow(2.017D, 10D), Power.pow(2.017D, 10), Power.PERCISION);
    }

    // 正^负
    @Test
    public void testPow_PositivePowNegative() {
        Assert.assertEquals(Math.pow(2.017D, -10D), Power.pow(2.017D, -10), Power.PERCISION);
    }

    // 负^0
    @Test
    public void testPow_NegativePowZero() {
        Assert.assertEquals(Math.pow(-2.017D, 0D), Power.pow(-2.017D, 0), Power.PERCISION);
    }

    // 负^正
    @Test
    public void testPow_NegativePowPositive() {
        Assert.assertEquals(Math.pow(-2.017D, 10D), Power.pow(-2.017D, 10), Power.PERCISION);
    }

    // 负^负
    @Test
    public void testPow_NegativePowNegative() {
        Assert.assertEquals(Math.pow(-2.017D, -10D), Power.pow(-2.017D, -10), Power.PERCISION);
    }

}
