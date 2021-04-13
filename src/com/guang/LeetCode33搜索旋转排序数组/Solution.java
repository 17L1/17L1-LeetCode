package com.guang.LeetCode33搜索旋转排序数组;

public class Solution{
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len < 1){
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while(left < right){
            int mid = left + (right - left + 1) / 2;
            if(nums[mid] < nums[right]){
                if(target >= nums[mid] && target <= nums[right]){
                    left = mid;
                }else{
                    right = mid - 1;
                }
            }else{
                if(target >= nums[left] && target <= nums[mid-1]){
                    right = mid - 1;
                }else{
                    left = mid;
                }
            }
        }
        if(nums[left] == target){
            return left;
        }
        return -1;
    }
}
