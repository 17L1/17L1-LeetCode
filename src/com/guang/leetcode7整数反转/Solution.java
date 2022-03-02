package com.guang.leetcode7整数反转;

public class Solution {
    public int reverse(int x) {
        if (x / 10 == 0) {
            return x;
        }
        int ans = 0;
        while (x != 0) {
            int tmp = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && tmp > 7){
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE / 10 && tmp < -8) {
                return 0;
            }
            ans = ans * 10 + tmp;
            x /= 10;
        }
        return ans;
    }
}
