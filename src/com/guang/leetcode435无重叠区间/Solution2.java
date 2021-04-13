package com.guang.leetcode435无重叠区间;

import java.util.Arrays;

public class Solution2 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        if (len < 1){
            return 0;
        }
        int ans = 1;
        Arrays.sort(intervals,(a,b) -> a[1] - b[1]);
        int right = intervals[0][1];
        for (int i = 1; i < len; i++) {
            if (intervals[i][0] >= right){
                ans++;
                right = intervals[i][1];
            }
        }
        return len - ans;
    }
}
