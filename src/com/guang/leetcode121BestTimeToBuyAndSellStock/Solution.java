package com.guang.leetcode121BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2){
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = 0;
        int max = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (prices[i] > prices[j]){
                    dp[i] = Math.max(dp[i],(prices[i] - prices[j]));
                }
            }
            if (dp[i] > max){
                max = dp[i];
            }
        }
        return max;

    }
}
