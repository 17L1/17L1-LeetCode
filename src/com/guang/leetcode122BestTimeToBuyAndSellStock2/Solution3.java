package com.guang.leetcode122BestTimeToBuyAndSellStock2;

public class Solution3 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2){
            return 0;
        }
        int crash = 0;
        int hold = -prices[0];
        int preCrash = crash;
        int preHold = hold;
        for (int i = 1; i < len ; i++) {
            crash = Math.max(preCrash, preHold + prices[i]);
            hold = Math.max(crash - prices[i], preHold);
            preCrash = crash;
            preHold = hold;
        }
        return crash;
    }
}
