package com.jing._28;

import java.util.Arrays;

/**
 * 打印字符串中字符的全排列
 * 
 * @version 1.0.0
 * @author JingBo
 */

public class StringPermutation {

    public static void print(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        print(str.toCharArray(), 0);
    }

    private static void print(char[] array, int start) {
        int length = array.length;
        if (start >= length) {
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = start; i < length; i++) {
            swap(array, start, i);
            print(array, start + 1);
            swap(array, start, i);
        }
    }

    private static void swap(char[] array, int i, int j) {
        if (i == j) {
            return;
        }
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
