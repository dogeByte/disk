package com.jing._20;

/**
 * 顺时针打印矩阵
 * 
 * @version 1.0.0
 * @author JingBo
 */

public class PrintMatrix {

    public static <T> void print(T[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        for (int start = 0; start <= row >>> 1 && start <= column >>> 1; start++) {
            int endX = column - 1 - start;
            int endY = row - 1 - start;
            for (int i = start; i <= endX; i++) {
                System.out.print(matrix[start][i] + ", ");
            }
            if (start < endY) {
                for (int i = start + 1; i <= endY; i++) {
                    System.out.print(matrix[i][endX] + ", ");
                }
            }
            if (start < endX && start < endY) {
                for (int i = endX - 1; i >= start; i--) {
                    System.out.print(matrix[endY][i] + ", ");
                }
            }
            if (start < endX && start < endY - 1) {
                for (int i = endY - 1; i > start; i--) {
                    System.out.print(matrix[i][start] + ", ");
                }
            }
        }
    }

}
