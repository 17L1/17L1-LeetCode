package com.guang.LeetCode153寻找旋转排序数组中的最小值;

public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if(len < 1){
            return 0;
        }
        int left = 0;
        int right = len - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[right];

    }
}
