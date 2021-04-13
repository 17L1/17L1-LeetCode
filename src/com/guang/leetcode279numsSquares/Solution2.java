package com.guang.leetcode279numsSquares;

import java.util.Arrays;

public class Solution2 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,4);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i ; j++) {
                dp[i] = Math.min(dp[i],dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
