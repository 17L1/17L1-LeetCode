package com.guang.leetcode322CoinChange;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 ){
                    dp[i] = Math.min(dp[i],dp[i-coin] + 1);
                }
            }
        }
        if (dp[amount] == amount + 1){
            return -1;
        }
        return dp[amount];
    }
}
