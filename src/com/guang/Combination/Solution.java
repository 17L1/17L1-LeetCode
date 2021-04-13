package com.guang.Combination;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n <k){
            return res;
        }
        if (k == 0){
            return res;
        }
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(n,0,k,list);


        return res;
    }

    private void backtrack(int n, int begin, int k, LinkedList<Integer> list) {
        if (list.size() == k){
            res.add(new ArrayList<>(list));
        }
        for (int i = begin; i <= n ; i++) {
            if (!list.isEmpty() && i < list.getLast()){
                continue;
            }
            list.add(i);
            backtrack(n,i + 1, k,list);
            list.removeLast();
        }
    }
}
