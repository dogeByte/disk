package com.jing._10;

/**
 *  计算二进制数中1的个数
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class NumberOf1InBinary {

    public static int calculate1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag <<= 1;
        }
        return count;
    }

    public static int calculate2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }
}
