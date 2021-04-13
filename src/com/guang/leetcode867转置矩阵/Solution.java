package com.guang.leetcode867转置矩阵;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int[][] res = new int[len2][len1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
