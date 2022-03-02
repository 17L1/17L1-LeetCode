package com.guang.LeetCode93复原IP地址;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: 17L1
 * @date: 2021年05月13日 12:23 上午
 * @method：
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12){
            return res;
        }
        Deque<String> path = new ArrayDeque<>();
        dfs(res,path,0,4,s,s.length());
        return res;
    }

    private void dfs(List<String> res, Deque<String> path, int begin, int residue, String s, int len) {
        if (begin == len){
            if (residue == 0){
                res.add(String.join(".",path));
            }
        }
        for (int i = begin; i < begin + 3; i++) {
            if (i >= len){
                break;
            }
            if (residue * 3 < len-i){
                continue;
            }
            if (judIpSegment(s,begin,i)){
                String currentIpSegment = s.substring(begin,i+1);
                path.addLast(currentIpSegment);
                dfs(res,path,i+1,residue-1,s,len);
                path.removeLast();
            }
        }
    }

    private boolean judIpSegment(String s, int left, int right) {
        int len = right - left + 1;
        if (len > 1 && s.charAt(left) == '0'){
            return false;
        }
        int res = 0;
        while (left <= right){
            res = res * 10 + s.charAt(left) - '0';
            left++;
        }
        return res>=0 && res <= 255;
    }
}
