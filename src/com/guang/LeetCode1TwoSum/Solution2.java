package com.guang.LeetCode1TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i]) && map.get(nums[i]) != i) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return nums;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
