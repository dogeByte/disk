package com.jing._08;

/**
 * 找出旋转数组中的最小元素
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class MinInRotatedArray {

    public static <T extends Comparable<T>> T getMin(T[] array) {
        if (array == null) {
            return null;
        }
        int minIndex = getMinIndex(array, 0, array.length - 1);
        return array[minIndex];
    }

    private static <T extends Comparable<T>> int getMinIndex(T[] array, int head, int tail) {
        if (array[head].compareTo(array[tail]) <= 0) {
            return head;
        }
        if (tail - head <= 1) {
            return tail;
        }
        int middle = head + tail >>> 1;
        if ((array[head].equals(array[middle])) && (array[middle].equals(array[tail]))) {
            int min = head;
            for (int i = head + 1; i <= tail; i++) {
                if (array[i].compareTo(array[min]) < 0) {
                    min = i;
                }
            }
            return min;
        }
        if (array[middle].compareTo(array[head]) >= 0) {
            return getMinIndex(array, middle, tail);
        }
        if (array[middle].compareTo(array[tail]) <= 0) {
            return getMinIndex(array, head, middle);
        }
        return -1;
    }
}
