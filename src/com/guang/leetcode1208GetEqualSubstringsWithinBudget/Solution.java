package com.guang.leetcode1208GetEqualSubstringsWithinBudget;

import java.util.Arrays;

public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int len = s.length();
        int left = 0;
        int right = 0;
        int res = 0;
        int sum = 0;
        while (right < len){
            sum += Math.abs(s.charAt(right) - t.charAt(right));
            while (sum > maxCost){
                sum -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            res = Math.max(res,right - left + 1);
            right++;
        }
        return res;
    }
}
