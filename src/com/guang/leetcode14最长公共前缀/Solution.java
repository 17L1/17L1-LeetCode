package com.guang.leetcode14最长公共前缀;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 1) {
            return strs[0];
        }
        int minArrLen = 200;
        for (int i = 0; i < len; i++) {
            if (strs[i].length() < minArrLen) {
                minArrLen = strs[i].length();
            }
        }
        int[] dp = new int[minArrLen];
        for (int i = 0; i < minArrLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                if (strs[j].charAt(j) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0,minArrLen + 1);
    }
}
