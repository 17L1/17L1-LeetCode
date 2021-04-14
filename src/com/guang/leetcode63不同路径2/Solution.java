package com.guang.leetcode63不同路径2;

import java.util.Arrays;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1){
            return 0;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0){
                    continue;
                }else if (i == 0 && obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i][j-1];
                }else if (j == 0 && obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i-1][j];
                }else if (obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }

            }
        }
        return dp[m-1][n-1];
    }
}
