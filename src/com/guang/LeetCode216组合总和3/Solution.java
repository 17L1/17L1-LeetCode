package com.guang.LeetCode216组合总和3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: 17L1
 * @date: 2021年05月12日 11:31 下午
 * @method：
 */
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(k == 0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        //boolean[] used = new boolean[k];

        dfs(res,path,1,n,k);

        return res;
    }

    private void dfs(List<List<Integer>> res, Deque<Integer> path,int begin, int residue, int k) {
        if (residue < 0){
            return;
        }
        if (k == 0){
            if (residue == 0){
                res.add(new ArrayList<>(path));
                return;
            }
            return;
        }
        for (int i = begin; i <= 9; i++) {
            path.addLast(i);
            dfs(res,path,i+1,residue-i,k-1);
            path.removeLast();
        }
    }
}
