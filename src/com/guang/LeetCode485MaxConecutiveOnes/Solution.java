package com.guang.LeetCode485MaxConecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int tmp = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1){
                tmp++;
            }else {
                tmp = 0;
            }
            ans = Math.max(ans,tmp);

        }
        return ans;
    }
}
