package com.guang.leetcode343IntegerBreak;

public class Solution2 {
    public int integerBreak(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] =1;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],j*Math.max(dp[i-j],i-j));
            }
        }
        return dp[n];
    }
}
