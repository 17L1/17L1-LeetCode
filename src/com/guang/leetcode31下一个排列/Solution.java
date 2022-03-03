package com.guang.leetcode31下一个排列;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return;
        }
        int i = len - 2, j = len -1, k = len - 1;
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }
        if (i >= 0) {
            while (nums[i] >= nums[k]){
                k--;
            }
            exchange(nums,i,k);
        }
        for (i = j, j = len - 1; i < j; i++, j--) {
            exchange(nums,i,j);
        }
    }

    private void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
