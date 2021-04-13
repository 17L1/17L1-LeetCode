package com.guang.leetcode91DecodeWays;

public class Solution {
    public int numDecodings(String s){
        int l = s.length();
        if (l == 0){
            return 0;
        }
        int[] dp = new int[l+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= l; i++) {
            if (s.charAt(i-1) >= '1' && s.charAt(i-1) <= '9'){
                dp[i] += dp[i-1];
            }
            if (s.charAt(i-2) == '1' && s.charAt(i-1) >= '0' && s.charAt(i-1) <= '9'){
                dp[i] += dp[i-2];
            }
            if (s.charAt(i-2) == '2' && s.charAt(i-1) >= '0' && s.charAt(i-1) <= '6'){
                dp[i] += dp[i-2];
            }

        }
        return dp[l];
    }
//    private static int charArrayToNumber(String s){
//        char[] chars = s.toCharArray();
//        int n = 0;
//        for (int i = 0; i < n ; i--) {
//            n *= 10;
//            n += chars[i] - '0';
//        }
//        return n;
//    }
}
