package com.guang.leetcode665NonDecreasingArray;

public class Solution{
    public boolean checkPossibility(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]){
                res++;
            }
            if (res > 1){
                return false;
            }
        }
        return true;
    }
}
