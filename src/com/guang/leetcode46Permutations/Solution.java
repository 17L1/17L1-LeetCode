package com.guang.leetcode46Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        if (nums.length < 1){
            return res;
        }
        List<Integer> list = new ArrayList<>();

        backtrack(nums,list);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> list){
        if (list.size() == nums.length){
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            backtrack(nums,list);
            list.remove(nums[i]);
        }
    }
}
