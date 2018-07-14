package day05;

import java.util.Arrays;

public class MatrixRotation {

    public static int[][] rotateMatrix (int[][] aa) {
        int rowLen = aa.length;
        int colLen = aa[0].length;
        int[][] result = new int[rowLen][colLen];

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                result[col][rowLen - 1 - row] = aa[row][col];
            }
        }

        return result;
    }
}
