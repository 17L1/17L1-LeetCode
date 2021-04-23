package com.guang.leetcode90子集2;

import java.util.*;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(nums);
        DFS(res,path,0,nums);
        return res;
    }

    private void DFS(List<List<Integer>> res, Deque<Integer> path, int index, int[] nums) {
        res.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i-1]){
                continue;
            }
            path.addLast(nums[i]);

            DFS(res,path,i+1,nums);
            path.removeLast();
        }
    }
}
