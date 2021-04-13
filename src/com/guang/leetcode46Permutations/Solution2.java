package com.guang.leetcode46Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 1){
            return res;
        }
        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(res,path,used,nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path,boolean[] used, int[] nums) {
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            dfs(res,path,used,nums);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}
