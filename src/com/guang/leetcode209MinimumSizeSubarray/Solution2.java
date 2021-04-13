package com.guang.leetcode209MinimumSizeSubarray;

public class Solution2 {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        if (len < 1){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        int valid = 0;
        int left = 0;
        int right = 0;
        while (right < len){
            valid += nums[right];
            right++;
            while (valid >= target){
                valid -= nums[left];
                res = Math.min(res, right - left);
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
