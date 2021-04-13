package com.guang.leetcode40CombinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        if (len < 1){
            return res;
        }
        LinkedList<Integer> list = new LinkedList<>();
        boolean[] used = new boolean[len];
        Arrays.sort(candidates);
        backtrack(candidates,0,target,len,list,used);
        return res;
    }

    private void backtrack(int[] candidates, int begin, int target, int len, LinkedList<Integer> list,boolean[] used) {
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0){
            return;
        }
        for (int i = begin; i < len; i++) {
            if (!used[i]){
                if (i > 0 && candidates[i] == candidates[i-1] && !used[i-1]){
                    continue;
                }
                used[i] = true;
                list.addLast(candidates[i]);
                backtrack(candidates, i + 1, target - candidates[i], len, list, used);
                list.removeLast();
                used[i] = false;
            }
        }
    }
}

