package com.guang.leetcode553最优除法;

public class Solution2 {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        Node[][] dp = new Node[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                dp[i][j] = new Node();
            }
        }
        for (int i = 0; i < n; i++) {
            dp[i][i].maxValue = nums[i];
            dp[i][i].minValue = nums[i];
            dp[i][i].maxStr = String.valueOf(nums[i]);
            dp[i][i].minStr = String.valueOf(nums[i]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; i + j < n ; j++) {
                for (int k = j; k < i + j; k++) {
                    if (dp[j][j + i].maxValue < dp[j][k].maxValue / dp[k + 1][i + j].minValue) {
                        dp[j][i + j].maxValue = dp[j][k].maxValue / dp[k + 1][i + j].minValue;
                        if (k + 1 == i + j) {
                            dp[j][i + j].maxStr = dp[j][k].maxStr + "/" + dp[k + 1][i + j].minStr;
                        }else {
                            dp[j][i + j].maxStr = dp[j][k].maxStr + "/(" + dp[k + 1][i + j].minStr +")";
                        }
                    }
                    if (dp[j][i + j].minValue > dp[j][k].minValue / dp[k + 1][i + j].maxValue) {
                        dp[j][i + j].minValue = dp[j][k].minValue / dp[k + 1][i + j].maxValue;
                        if (k + 1 == i + j) {
                            dp[j][i + j].minStr = dp[j][k].minStr + "/" + dp[k + 1][i + j].maxStr;
                        }else {
                            dp[j][i + j].minStr = dp[j][k].minStr + "/(" + dp[k + 1][i + j].maxStr +")";
                        }
                    }
                }
            }
        }
        return dp[0][n-1].maxStr;




    }
}
class Node {
    double maxValue = 0;
    double minValue = 1000;
    String maxStr = "";
    String minStr = "";
}
