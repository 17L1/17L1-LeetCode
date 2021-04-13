package com.guang.LeetCode832翻转图像;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;

        for (int i = 0; i < len; i++) {
            int left = 0;
            int right = len - 1;
            while (left < right){
                if (A[i][left] == A[i][right]){
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }else {
                    A[i][left] = A[i][right] ^ 1;
                    A[i][right] = A[i][left] ^ 1;
                }
                left++;
                right--;
            }
            if (left == right){
                A[i][left] ^= 1;
            }
        }
        return A;
    }
}
