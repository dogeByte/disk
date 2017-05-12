package com.jing._12;

/**
 * 打印从1到最大的n位数
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class Print1ToMaxOfNDigits {

    public static void print(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        printRecursively(number, 0);
    }

    private static void printRecursively(char[] number, int index) {
        if (index >= number.length) {
            printNumber(number);
            return;
        }
        for (char i = '0'; i <= '9'; i++) {
            number[index] = i;
            printRecursively(number, index + 1);
        }
    }

    private static void printNumber(char[] number) {
        boolean flag = false; // 执行打印的标记
        for (int i = 0; i < number.length; i++) {
            char ch = number[i];
            if (!flag && ch != '0') {
                flag = true;
            }
            if (flag) {
                System.out.print(ch);
            }
        }
        if (flag) {
            System.out.print(" ");
        }
    }

}
