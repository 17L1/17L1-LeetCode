package com.guang.leetcode322CoinChange;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    private int[] memo;
    public int coinChange(int[] coins, int amount){
        memo = new int[amount + 1];
        Arrays.fill(memo,-2);
        Arrays.sort(coins);
        int ans = dfs(amount,coins);
        return ans;
    }

    private int dfs(int amount, int[] coins) {
        if (amount == 0){
            return 0;
        }
        if (memo[amount] != -2){
            return memo[amount];
        }
        int res = amount + 1;
        for (int coin : coins){
            if (amount - coin < 0){
                break;
            }
            int subRes = dfs(amount - coin, coins);
            if (subRes == -1){
                continue;
            }
            res = Math.min(res,subRes + 1);
        }
        if (res == amount + 1){
            memo[amount] = -1;
            return -1;
        }
        memo[amount] = res;
        return res;
    }
}
