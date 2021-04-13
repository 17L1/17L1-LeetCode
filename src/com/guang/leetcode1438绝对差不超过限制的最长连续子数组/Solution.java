package com.guang.leetcode1438绝对差不超过限制的最长连续子数组;

import java.util.TreeMap;

public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int len = nums.length;
        if (len < 2){
            return len;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < len){
            map.put(nums[right],map.getOrDefault(nums[right],0) + 1);
            while (map.lastKey() - map.firstKey() > limit){
                map.put(nums[left],map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            res = Math.max(res,right+1-left);
            right++;
        }
        return res;
    }
}
