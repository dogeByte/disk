package com.jing._08;

import org.junit.Assert;
import org.junit.Test;

public class MinInRotatedArrayTest {

    // 无重复元素的旋转数组
    @Test
    public void testGetMin_NotRepeat() {
        Integer[] array = {3, 4, 5, 6, 7, 8, 9, 10, -1, 0, 1, 2};
        int actual = ((Integer) MinInRotatedArray.getMin(array)).intValue();
        Assert.assertEquals(-1, actual);
    }

    // 有重复元素的旋转数组
    @Test
    public void testGetMin_Repeat() {
        Integer[] array = {3, 3, 4, 4, 5, 6, 7, 8, 9, 10, -1, -1, -1, 0, 1, 2};
        int actual = ((Integer) MinInRotatedArray.getMin(array)).intValue();
        Assert.assertEquals(-1, actual);
    }

    // 升序数组
    @Test
    public void testGetMin_Ascend() {
        Integer[] array = {-1, -1, -1, 0, 1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        int actual = ((Integer) MinInRotatedArray.getMin(array)).intValue();
        Assert.assertEquals(-1, actual);
    }

    // 只有一个元素的数组
    @Test
    public void testGetMin_Sole() {
        Integer[] array = {Integer.valueOf(-1)};
        int actual = ((Integer) MinInRotatedArray.getMin(array)).intValue();
        Assert.assertEquals(-1, actual);
    }

    // 空指针
    @Test
    public void testGetMin_Null() {
        Assert.assertEquals(null, MinInRotatedArray.getMin(null));
    }

}
