package com.jing._03;

/**
 * 在一个行和列都递增排序的二维数组中查找指定的元素
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class FindInPartiallySortedMatrix {

    public static <T extends Comparable<T>> boolean find(T[][] array, T key) {
        if (key == null) {
            return false;
        }
        int rowNum = array.length;
        int colNum = array[0].length;
        int i = 0;
        int j = colNum - 1;
        while ((i < rowNum) && (j >= 0)) {
            T t = array[i][j];
            if (t.compareTo(key) > 0) {
                j--;
            } else if (t.compareTo(key) < 0) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
