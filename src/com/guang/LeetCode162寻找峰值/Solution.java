package com.guang.LeetCode162寻找峰值;

public class Solution {
    public int findPeakElement(int[] nums){
        int len = nums.length;
        if (len < 2){
            return nums[0];
        }
        int left = 0;
        int right = len -1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (nums[mid] < nums[mid - 1]){
                right = mid - 1;
            }
            if (nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
        }
        return 0;
    }
}
