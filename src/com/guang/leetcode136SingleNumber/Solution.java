package com.guang.leetcode136SingleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        if (nums.length<1){
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
