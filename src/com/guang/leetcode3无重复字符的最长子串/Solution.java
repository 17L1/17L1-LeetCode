package com.guang.leetcode3无重复字符的最长子串;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len < 2){
            return len;
        }
        char[] charArray = s.toCharArray();
        int[] n = new int[128];
        int res = 1;
        for (int left = 0,right = 0;right < len; right++) {
            n[charArray[left]]++;
            if (n[charArray[left]] == 2){
                while (n[charArray[left]] == 2){
                    n[charArray[left]]--;
                    left++;
                }
            }
            res = Math.max(res,right - left + 1);
        }
        return res;
    }
}
