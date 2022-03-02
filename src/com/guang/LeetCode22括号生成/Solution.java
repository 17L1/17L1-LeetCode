package com.guang.LeetCode22括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 17L1
 * @date: 2021年05月13日 12:16 上午
 * @method：
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0){
            return res;
        }
        dfs(res,"",n,n);
        return res;
    }

    private void dfs(List<String> res, String s, int left, int right) {
        if (left == 0 && right == 0){
            res.add(s);
            return;
        }
        if (left > right){
            return;
        }
        if (left > 0){
            dfs(res, s+"(",left-1,right);
        }
        if (right > 0){
            dfs(res, s+")",left,right-1);
        }
    }
}
