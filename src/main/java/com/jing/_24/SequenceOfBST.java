package com.jing._24;

import java.util.Arrays;

/**
 * 判断一个序列是否是某个二叉搜索树的后序遍历序列，假设序列中没有重复的元素
 * 
 * @version 1.0.0
 * @author JingBo
 */

public class SequenceOfBST {

    public static <T extends Comparable<T>> boolean verify(T[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return false;
        }
        int length = postorder.length;
        T root = postorder[length - 1];
        int index = 0;
        while (index < length - 1 && postorder[index].compareTo(root) < 0) {
            index++;
        }
        for (int i = index; i < length; i++) {
            if (postorder[i].compareTo(root) < 0) {
                return false;
            }
        }
        boolean left = true;
        boolean right = true;
        if (index > 0) {
            T[] leftPostorder = Arrays.copyOfRange(postorder, 0, index);
            left = verify(leftPostorder);
        }
        if (index < length - 1) {
            T[] rightPostorder = Arrays.copyOfRange(postorder, index, length - 1);
            right = verify(rightPostorder);
        }
        return left && right;
    }

}
