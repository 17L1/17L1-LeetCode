package com.guang.leetcode5最长回文子串;

public class Solution2 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 1) {
            return "";
        }
        StringBuilder sReverse = new StringBuilder(s).reverse();
        int[] dp = new int[len];
        int maxEnd = 0;
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[j] = 1;
                    }else {
                        dp[j] = dp[j - 1] + 1;
                    }
                }else {
                    dp[j] = 0;
                }
                if (dp[j] > maxLen) {
                    if (len - 1 - j - 1 == i) {
                        maxLen = dp[j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd +1);
    }
}
