package com.guang.leetcode5最长回文子串;

public class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            //若回文串长度为奇数
            int l = i - 1;
            int r = i + 1;
            String sub = getString(s, l, r);
            if (sub.length() > res.length()) {
                res = sub;
            }

            //若回文串长度为偶数
            l = i - 1;
            r = i;
            sub = getString(s, l, r);
            if (sub.length() > res.length()) {
                res = sub;
            }
        }
        return res;
    }

    private String getString(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
