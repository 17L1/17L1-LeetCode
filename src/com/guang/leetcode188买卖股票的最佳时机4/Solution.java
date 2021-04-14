package com.guang.leetcode188买卖股票的最佳时机4;

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        if (k >= len / 2) {
            return maxProfit(prices);
        }
        int[][][] dp = new int[len][k+1][2];
        for (int i = 1; i <= k; i++) {
            dp[0][i][0] = 0;
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < len; i++) {
            for (int j = k; j > 0 ; j--) {
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j-1][0]-prices[i],dp[i-1][j][1]);
            }
        }
        return dp[len-1][k][0];
    }
    private int maxProfit(int[] prices){
        int len = prices.length;
        if (len < 2){
            return 0;
        }
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + prices[i],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        return dp[len-1][0];
    }
}
