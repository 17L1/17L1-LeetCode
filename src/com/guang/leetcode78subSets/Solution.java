package com.guang.leetcode78subSets;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(res,path,0,nums);
        return res;

    }
    private void dfs(List<List<Integer>> res, Deque<Integer> path, int index, int[] nums) {
        res.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(res,path,i+1,nums);
            path.removeLast();
        }
    }
}
