package com.jing._11;

/**
 * 幂函数
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class Power {

    public static final double PERCISION = 0.000001D;

    public static double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1D;
        }
        if (exponent == 1) {
            return base;
        }
        if (exponent < 0) {
            if (Math.abs(base - 0D) < PERCISION) {
                throw new ArithmeticException("无穷大");
            }
            return 1 / pow(base, -exponent);
        }
        double result = pow(base, exponent >>> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }

}
