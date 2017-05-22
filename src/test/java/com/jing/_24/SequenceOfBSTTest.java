package com.jing._24;

import org.junit.Assert;
import org.junit.Test;

public class SequenceOfBSTTest {

    // 完全二叉树
    @Test
    public void testVerify_Complete() {
        Integer[] postorder = { 5, 7, 6, 9, 11, 10, 8 };
        Assert.assertTrue(SequenceOfBST.verify(postorder));
    }

    // 没有左子节点的二叉树
    @Test
    public void testVerify_NoLeft() {
        Integer[] postorder = { 1, 2, 3, 4 };
        Assert.assertTrue(SequenceOfBST.verify(postorder));
    }

    // 没有右子节点的二叉树
    @Test
    public void testVerify_NoRight() {
        Integer[] postorder = { 4, 3, 2, 1 };
        Assert.assertTrue(SequenceOfBST.verify(postorder));
    }

    // 只有根节点的二叉树
    @Test
    public void testVerify_Sole() {
        Integer[] postorder = { 1 };
        Assert.assertTrue(SequenceOfBST.verify(postorder));
    }

    // 后序遍历序列不对应任何一棵二叉搜索树
    @Test
    public void testVerify_False() {
        Integer[] postorder = { 7, 4, 5, 6 };
        Assert.assertFalse(SequenceOfBST.verify(postorder));
    }

    // 空指针
    @Test
    public void testVerify_Null() {
        Assert.assertFalse(SequenceOfBST.verify(null));
    }

}
