package com.guang.leetcode16_2SumClosest;

import java.util.Arrays;

public class Solution2 {
    public int threeNum(int[] nums, int target){
        int len = nums.length;
        int res = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right){
                if (Math.abs(nums[i] + nums[left] + nums[right] - target) < res){
                    res = Math.abs(nums[i] + nums[left] + nums[right] - target);
                    ans = nums[i] + nums[left] + nums[right];
                }
                if (nums[i] + nums[left] + nums[right] > target){
                    right--;
                }else if (nums[i] + nums[left] + nums[right] < target){
                    left++;
                }else {
                    return target;
                }
            }
        }
        return ans;
    }
}
