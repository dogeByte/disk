package com.jing._04;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceBlankTest {

    // 空格位于字符串的最前面
    @Test
    public void testReplace_FirstSpace() {
        Assert.assertEquals("%20Jing", ReplaceBlank.replace(" Jing"));
    }

    // 空格位于字符串的最后面
    @Test
    public void testReplace_LastSpace() {
        Assert.assertEquals("Bo%20", ReplaceBlank.replace("Bo "));
    }

    // 空格位于字符串中间
    @Test
    public void testReplace_InnerSpace() {
        Assert.assertEquals("I%20come%20from%20SCU", ReplaceBlank.replace("I come from SCU"));
    }

    // 连续多个空格
    @Test
    public void testReplace_MultiSpace() {
        Assert.assertEquals("Jing%20%20%20Bo", ReplaceBlank.replace("Jing   Bo"));
    }

    // 没有空格
    @Test
    public void testReplace_NoSpace() {
        Assert.assertEquals("JingBo", ReplaceBlank.replace("JingBo"));
    }

    // 空指针
    @Test
    public void testReplace_Null() {
        Assert.assertNull(ReplaceBlank.replace(null));
    }

    // 空字符串
    @Test
    public void testReplace_Empty() {
        Assert.assertEquals("", ReplaceBlank.replace(""));
    }

    // 只有一个空格
    @Test
    public void testReplace_SpaceOnly() {
        Assert.assertEquals("%20", ReplaceBlank.replace(" "));
    }

    // 连续多个空格
    @Test
    public void testReplace_MultiSpaceOnly() {
        Assert.assertEquals("%20%20%20", ReplaceBlank.replace("   "));
    }

}
