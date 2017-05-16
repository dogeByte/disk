package com.jing._21;

import org.junit.Assert;
import org.junit.Test;

public class MinInStackTest {

    @Test
    public void test() {
        MinInStack<Integer> stack = new MinInStack<>();
        stack.push(3);
        stack.push(4);
        Assert.assertEquals(Integer.valueOf(3), stack.min());
        stack.push(2);
        Assert.assertEquals(Integer.valueOf(2), stack.min());
        stack.push(5);
        Assert.assertEquals(Integer.valueOf(5), stack.pop());
        Assert.assertEquals(Integer.valueOf(2), stack.pop());
    }

}
