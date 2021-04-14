package com.guang.leetcode123买卖股票的最佳时机3;

public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2){
            return 0;
        }
        //第二维的0没有意义，1表示交易进行了一次，2表示交易进行了2次
        //为了使得第2维的数值1和2有意义，这里将第2维的长度设置为了3
        int[][][] dp = new int[len][3][2];
        dp[0][1][1] = -prices[0];
        dp[0][2][1] = Integer.MIN_VALUE;
        for (int i = 1; i < len; i++) {
            dp[i][1][1] = Math.max(dp[i-1][1][1], -prices[i]);
            dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][1][1]+prices[i]);
            dp[i][2][1] = Math.max(dp[i-1][2][1],dp[i-1][1][0]-prices[i]);
            dp[i][2][0] = Math.max(dp[i-1][2][0],dp[i-1][2][1] + prices[i]);
        }
        return Math.max(dp[len-1][1][0],dp[len-1][2][0]);
    }
}
