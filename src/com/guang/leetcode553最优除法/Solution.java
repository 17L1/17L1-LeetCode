package com.guang.leetcode553最优除法;

public class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            str.append(nums[i]);
            if (i + 1 < n) {
                str.append("/");
            }
        }
        if (n > 2) {
            str.insert(str.indexOf("/") + 1,"(");
            str.append(")");
        }
        return str.toString();
    }
}
