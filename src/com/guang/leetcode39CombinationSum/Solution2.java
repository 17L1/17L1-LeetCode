package com.guang.leetcode39CombinationSum;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if (len < 1){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        DFS(res,path,0,candidates,target);
        return res;
    }

    private void DFS(List<List<Integer>> res, Deque<Integer> path, int index, int[] candidates, int target) {
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        if (target < 0){
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            DFS(res, path, i , candidates, target - candidates[i]);
            path.removeLast();
        }

    }
}