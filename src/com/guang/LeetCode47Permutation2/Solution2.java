package com.guang.LeetCode47Permutation2;

import java.util.*;

public class Solution2 {
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        int len = nums.length;
        if (len < 1){
            return res;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(path,0,used,len,nums);
        return res;
    }

    private void dfs(Deque<Integer> path, int i, boolean[] used, int len, int[] nums) {
        if (path.size() == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0; j < len; j++) {
            if (used[j]){
                continue;
            }
            if (j > 0 && nums[j] == nums[j-1] && !used[j-1]){
                continue;
            }
            path.addLast(nums[j]);
            used[j] = true;
            dfs(path,i+1,used,len,nums);
            used[j] = false;
            path.removeLast();
        }
    }
}
