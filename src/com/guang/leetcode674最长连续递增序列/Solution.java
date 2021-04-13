package com.guang.leetcode674最长连续递增序列;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if (len < 1){
            return 0;
        }
        int pre = 1;
        int res = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i-1]){
                pre = pre + 1;
            }else {
                pre = 1;
            }
            res = Math.max(res,pre);
        }
        return res;
    }
}
