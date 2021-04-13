package com.guang.leetcode435无重叠区间;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len1 = intervals.length;
        if (len1 < 1) {
            return 0;
        }
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int[] f = new int[len1];
        Arrays.fill(f,1);
        for (int i = 1; i < len1; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[i][0] >= intervals[j][1]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }

        }
        int res = len1 - Arrays.stream(f).max().getAsInt();
        return res;
    }
}

