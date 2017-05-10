package com.jing._09;

/**
 * 计算斐波那契数列的第n项
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class Fibonacci {

    public static long calculate(int n) {
        if (n < 2) {
            return n;
        }
        long minus1 = 1L;
        long minus2 = 0L;
        long result = 0L;
        for (int i = 2; i <= n; i++) {
            result = minus1 + minus2;
            minus2 = minus1;
            minus1 = result;
        }
        return result;
    }
}
