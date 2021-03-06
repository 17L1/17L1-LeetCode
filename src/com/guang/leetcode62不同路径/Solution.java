package com.guang.leetcode62不同路径;

/**
 * author: 17L1
 * time: 2021/4/9
 * method: 动态规划
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == 0 && j == 0){
                    continue;
                }
                if (i==0){
                    dp[i][j] = dp[i][j-1];
                }else if (j == 0){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
