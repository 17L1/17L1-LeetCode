package com.guang.leetcode120Triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 0 ){
            return 0;
        }
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0){
                    dp[i][j] = dp[i-1][0] + triangle.get(i).get(j);
                }else if (j == triangle.get(i).size() - 1){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
                }else {
                    dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            res = Math.min(dp[n-1][i],res);
        }
        return res;

    }
}
