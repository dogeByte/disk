package com.jing._14;

/**
 * 把数组按照某种规则，分为前后两部分
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class ReorderArray {

    public static void reorder(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int head = 0;
        int tail = array.length - 1;
        while (head < tail) {
            while (head < tail && rule(array[head])) {
                head++;
            }
            while (head < tail && !rule(array[tail])) {
                tail--;
            }
            if (head < tail) {
                int temp = array[head];
                array[head] = array[tail];
                array[tail] = temp;
            }
        }
    }

    private static boolean rule(int t) {
        return ((t & 1) == 1);
    }

}
