package com.guang.leetcode724FindPivotIndex;

public class Solution {
    public int pivotIndex(int[] nums){
        if (nums.length < 3){
            return -1;
        }
        int p = 1;
        int sumLeft = 0;
        while (p < nums.length - 1){
            int sumRight = 0;
            for (int i = p + 1; i < nums.length; i++) {
                sumRight += nums[i];
            }
            if (sumLeft == sumRight){
                return p;
            }
            sumLeft += nums[p];
            p++;


        }
        return -1;
    }
}
