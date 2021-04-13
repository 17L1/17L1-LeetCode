package com.guang.leetcode377combinationSum4;

/**
 * author: 17L1
 * time: 2021/4/9
 * method:动态规划
 */
public class Solution2 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <=target ; i++) {
            for (int num : nums){
                if (num <= i){
                    dp[i] += dp[i-num];
                }
            }
        }
        return dp[target];
    }
}
