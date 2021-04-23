package com.guang.leetcode77组合;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        DFS(res,path,1,n,k);
        return res;
    }

    private void DFS(List<List<Integer>> res, Deque<Integer> path, int index, int n, int k) {
        if (path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i <= n; i++) {
            path.addLast(i);
            DFS(res,path,i + 1,n,k);
            path.removeLast();
        }
    }
}
