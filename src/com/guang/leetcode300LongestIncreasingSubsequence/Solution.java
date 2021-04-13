package com.guang.leetcode300LongestIncreasingSubsequence;

public class Solution {
    public static int lengthOfLIS(int[] nums){
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int LISmax = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
            LISmax = Math.max(LISmax,dp[i]);
        }
        return LISmax;
    }
}