package com.guang.LeetCode26Remove_Duplicates_from_Sorted_Array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;//该变量记录重复的次数
        /*
        此次的循环从i = 1开始，因为两个重复的数字只相当于后面的数字往前移一位
         */
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                cnt++;//当后面的数字与前面一个数字相似时，都将该数字往前移
            }
            nums[i - cnt] = nums[i];//数组中往左移是减去一个数
        }
        return nums.length - cnt;
    }
}
