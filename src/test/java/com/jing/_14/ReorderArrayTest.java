package com.jing._14;

import org.junit.Assert;
import org.junit.Test;

public class ReorderArrayTest {

    // 乱序数组
    @Test
    public void testReorder_Normal() {
        int[] array = {4, 6, 1, 8, 9, 3, 7, 0, 2, 5};
        ReorderArray.reorder(array);
        int[] expecteds = {5, 7, 1, 3, 9, 8, 6, 0, 2, 4};
        Assert.assertArrayEquals(expecteds, array);
    }

    // 奇偶交替
    @Test
    public void testReorder_Alternate() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ReorderArray.reorder(array);
        int[] expecteds = {9, 1, 7, 3, 5, 4, 6, 2, 8, 0};
        Assert.assertArrayEquals(expecteds, array);
    }

    // 所有偶数都在奇数之前
    @Test
    public void testReorder_EvenFirst() {
        int[] array = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        ReorderArray.reorder(array);
        int[] expecteds = {9, 7, 5, 3, 1, 8, 6, 4, 2, 0};
        Assert.assertArrayEquals(expecteds, array);
    }

    // 所有偶数都在奇数之前
    @Test
    public void testReorder_OddFirst() {
        int[] array = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        ReorderArray.reorder(array);
        int[] expecteds = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
        Assert.assertArrayEquals(expecteds, array);
    }

    // 空指针
    @Test
    public void testReorder_Null() {
        ReorderArray.reorder(null);
    }

    // 数组中只有一个元素
    @Test
    public void testReorder_Sole() {
        int[] array = {1};
        ReorderArray.reorder(array);
        int[] expecteds = {1};
        Assert.assertArrayEquals(expecteds, array);
    }

}
