package com.guang.LeetCode47Permutation2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length < 1){
            return res;
        }
        LinkedList<Integer> list = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,0,list,used);
        return res;
    }

    private void backtrack(int[] nums, int index, LinkedList<Integer> list, boolean[] used) {
        if (list.size() == nums.length){
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
                if (i > 0 && nums[i] == nums[i-1] && !used[i - 1]){
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                backtrack(nums,index + 1, list, used);
                list.removeLast();
                used[i] = false;
            }
        }
    }
}
