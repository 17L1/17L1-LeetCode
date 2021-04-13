package com.guang.leetcode213HouseRobber2;

public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        if (len == 1){
            return nums[0];
        }
        if (len == 2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(robHelper(nums,0,len-2),robHelper(nums,1,len-1));

    }

    private int robHelper(int[] nums, int start, int end) {
        int preMax = nums[start];
        int curMax= Math.max(preMax,nums[start+1]);
        for (int i = start + 2; i <= end; i++) {
            int tmp = curMax;
            curMax = Math.max(curMax,nums[i] + preMax);
            preMax = curMax;
        }
        return curMax;
    }
}
