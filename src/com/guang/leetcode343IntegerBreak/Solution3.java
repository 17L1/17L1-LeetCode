package com.guang.leetcode343IntegerBreak;

import java.util.Arrays;

public class Solution3 {
    public int integerBreak(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return dfs(memo,n);
    }

    private int dfs(int[] memo, int n) {
        if (memo[n] == -1){
            return 1;
        }
        if (memo[n] != -1){
            return memo[n];
        }
        int res = 1;
        for (int i = 1; i <= n -1 ; i++) {
            res = Math.max(res,Math.max(i * (n - i), i * dfs(memo,n-i)));

        }
        memo[n] = res;
        return res;
    }

}
