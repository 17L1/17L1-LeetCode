package com.guang.leetcode16_2SumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
                if (sum - target == 0){
                    return res;
                }
                if (sum > target){
                    k--;
                }
                if (sum < target){
                    j++;
                }
            }
        }
        return res;
    }
}
