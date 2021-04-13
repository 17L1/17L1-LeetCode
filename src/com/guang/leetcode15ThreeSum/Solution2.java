package com.guang.leetcode15ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 3){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] ==nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = len - 1;
            while (left < right){
                if (nums[left] + nums[right] < target){
                    left++;
                }else if (nums[left] + nums[right] > target){
                    right--;
                }else {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[left]);
                    cur.add(nums[right]);
                    res.add(cur);
                    while (left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }

            }
        }
        return res;
    }
}
