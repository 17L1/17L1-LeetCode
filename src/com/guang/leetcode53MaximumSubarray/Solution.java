package com.guang.leetcode53MaximumSubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int res = 0;
        int p = 0;
        while( p < nums.length){
            res += nums[p];
            if (res > max){
                max = res;
            }
            if (res < 0){
                res = 0;
            }
             p++;
        }
        return max;
    }
}
