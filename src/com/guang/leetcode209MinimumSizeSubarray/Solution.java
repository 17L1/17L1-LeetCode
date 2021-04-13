package com.guang.leetcode209MinimumSizeSubarray;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len < 1){
            return 0;
        }
        int left = 0, right = -1, res = len + 1, sum = 0;
        while (left < len){
            if (right + 1 < len && sum < s){
                right++;
                sum += nums[right];
            }else {
                sum -= nums[left];
                left++;
            }
            if (sum >= s){
                res = Math.min(res,right-left+1);
            }
        }
        if (res == len + 1){
            return 0;
        }
        return res;
    }
}
