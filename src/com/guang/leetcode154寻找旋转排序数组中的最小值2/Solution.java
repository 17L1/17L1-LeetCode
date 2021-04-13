package com.guang.leetcode154寻找旋转排序数组中的最小值2;

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
            }else if(nums[mid] < nums[right]){
                right = mid;
            }else{
                right--;
            }
        }
        return nums[left];


    }
}
