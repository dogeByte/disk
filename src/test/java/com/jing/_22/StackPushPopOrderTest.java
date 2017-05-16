package com.jing._22;

import org.junit.Assert;
import org.junit.Test;

public class StackPushPopOrderTest {

    // 序列包含多个元素，匹配
    @Test
    public void testIsPopOrder_Match() {
        Integer[] pushArray = { 1, 2, 3, 4, 5 };
        Integer[] popArray = { 4, 5, 3, 2, 1 };
        Assert.assertTrue(StackPushPopOrder.isPopOrder(pushArray, popArray));
    }

    // 序列包含多个元素，不匹配
    @Test
    public void testIsPopOrder_NotMatch() {
        Integer[] pushArray = { 1, 2, 3, 4, 5 };
        Integer[] popArray = { 4, 3, 5, 1, 2 };
        Assert.assertFalse(StackPushPopOrder.isPopOrder(pushArray, popArray));
    }

    // 序列只有一个元素，匹配
    @Test
    public void testIsPopOrder_SoleMatch() {
        Integer[] pushArray = { 1 };
        Integer[] popArray = { 1 };
        Assert.assertTrue(StackPushPopOrder.isPopOrder(pushArray, popArray));
    }

    // 序列只有一个元素，不匹配
    @Test
    public void testIsPopOrder_SoleNotMatch() {
        Integer[] pushArray = { 1 };
        Integer[] popArray = { 0 };
        Assert.assertFalse(StackPushPopOrder.isPopOrder(pushArray, popArray));
    }

    // 空指针
    @Test
    public void testIsPopOrder_Null() {
        Assert.assertFalse(StackPushPopOrder.isPopOrder(null, null));
    }

}
