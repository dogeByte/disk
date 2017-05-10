package com.jing._09;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testCalculate() {
        Assert.assertEquals(Fibonacci.calculate(0), 0L);
        Assert.assertEquals(Fibonacci.calculate(1), 1L);
        Assert.assertEquals(Fibonacci.calculate(2), 1L);
        Assert.assertEquals(Fibonacci.calculate(3), 2L);
        Assert.assertEquals(Fibonacci.calculate(5), 5L);
        Assert.assertEquals(Fibonacci.calculate(10), 55L);
        Assert.assertEquals(Fibonacci.calculate(100), 3736710778780434371L);
    }
}
