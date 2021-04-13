package com.guang.leetcode279numsSquares;

import java.util.Arrays;

public class Solution {
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return dfs(n,memo);
    }

    private int dfs(int n, int[] memo) {
        if (n == 0){
            return 0;
        }
        if (memo[n] != -1){
            return memo[n];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; n - i * i >= 0; i++) {
            res = Math.min(res,1 + dfs(n-i*i,memo));
        }
        return memo[n] = res;
    }
}
