package com.guang.LeetCode354俄罗斯套娃信封问题;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
            }
        });
        int[] height = new int[len];
        for (int i = 0; i < len; i++) {
            height[i] = envelopes[i][1];
        }
        return lengthOfLIS(height);
    }

    private int lengthOfLIS(int[] height) {
        int len = height.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (height[j] > height[i]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
