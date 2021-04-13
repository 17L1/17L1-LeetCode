package com.guang.LeetCode354俄罗斯套娃信封问题;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public int maxEnvelopes(int[][] envelopes) {
        int len1 = envelopes.length;
        if (len1 < 1){
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
            }
        });
        int[] dp = new int[len1];
        int res = 1;
        Arrays.fill(dp,1);
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][1] >envelopes[j][1]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                    res = Math.max(res, dp[i]);
                }
            }
        }
        return res;
    }
}
