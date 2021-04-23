package com.guang.leetcode60排列序列;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        int num = 0;
        DFS(res,path,n);
        return res.get(k).toString();

    }

    private void DFS(List<List<Integer>> res, Deque<Integer> path, int n) {
        if (path.size() == n){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 1; i <= n ; i++) {
            path.addLast(i);
            DFS(res,path,n);
            path.removeLast();
        }
    }
}
