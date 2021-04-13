package com.guang.LeetCode198HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length < 1){
            return 0;
        }
        if (nums.length < 2){
            return nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            int tmp = 0;
            for (int j = 0; j < i-1; j++) {
                if (nums[j] > tmp){
                    tmp = nums[j];
                }

            }
            nums[i] = tmp + nums[i];
        }
        return Math.max(nums[nums.length-1],nums[nums.length-2]);
    }
}
