package com.guang.leetcode120Triangle;

import java.util.List;

public class Solution2 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len1 = triangle.size();
        if (len1 < 1){
            return 0;
        }
        int[][] dp = new int[len1][len1];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < len1; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if(j==0){
                    dp[i][j] = dp[i-1][0] + triangle.get(i).get(j);
                }else if (j == triangle.get(i).size() - 1){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
                }else {
                    dp[i][j] =triangle.get(i).get(j) +  Math.min(dp[i - 1][j - 1],dp[i-1][j]);                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < len1; i++) {
            res = Math.min(res,dp[len1-1][i]);
        }
        return res;
    }
}
