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
        boolean[] used = new boolean[n];
        DFS(res,path,n,used);
        List<Integer> list = new ArrayList<>(res.get(k));
        String ans = "";
        for (Integer i : list){
            ans+=i;
        }
        return ans;

    }

    private void DFS(List<List<Integer>> res, Deque<Integer> path, int n, boolean[] used) {
        if (path.size() == n){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n ; i++) {
            if (used[i]){
                continue;
            }
            path.addLast(i+1);
            used[i] = true;
            DFS(res,path,n, used);
            path.removeLast();
            used[i] = false;
        }
    }
}
