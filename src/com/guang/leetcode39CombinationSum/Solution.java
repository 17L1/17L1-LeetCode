package com.guang.leetcode39CombinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(candidates,0,target,list);
        return res;
    }

    private void backtrack(int[] candidates, int begin, int target, LinkedList<Integer> list) {
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0){
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(candidates,i,target - candidates[i], list);
            list.removeLast();
        }

    }
}
