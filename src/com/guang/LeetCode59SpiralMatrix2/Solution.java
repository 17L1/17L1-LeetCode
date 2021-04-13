package com.guang.LeetCode59SpiralMatrix2;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int target = n * n;
        int l = 0, r = n - 1, t = 0, b = n-1;
        int num = 1;
        while (num <= target){
            for (int i = l;i <= r;i++) {
                res[t][i] = num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                res[i][r] = num++;
            }
            r--;
            for (int i = r; i >= l ; i--) {
                res[b][i] = num++;
            }
            b--;
            for (int i = b; i >= t ; i--) {
                res[i][l] = num++;
            }
            l++;
        }
        return res;
    }
}
