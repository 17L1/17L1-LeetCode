package com.guang.leetcode697DegreeOfAnArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        int len = nums.length;
        if (len < 2){
            return len;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int numsMax = 0;
        for (int i = 0; i < len; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            numsMax = Math.max(map.get(nums[i]),numsMax);
        }
        int left = 0;
        int res = len + 1;
        int right = 0;
        Map<Integer, Integer> map2 = new HashMap<>();
        while (right < len){
            map.put(nums[right],map.getOrDefault(nums[right], 0) + 1);
            right++;
            while (map.get(nums[right - 1 ]) == numsMax){
                res = Math.min(res,right - left);
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;

            }


        }
        return res;
    }
}
