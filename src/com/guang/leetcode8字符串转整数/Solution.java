package com.guang.leetcode8字符串转整数;


public class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int ans = 0;
        if (len < 1) {
            return 0;
        }
        char[] c = s.toCharArray();
        boolean flag = true;
        int index = 0;
        while (index < len && c[index] == ' ') {
            index++;
        }
        if(index == len){
            return 0;
        }
        if (c[index] == '-') {
            flag = false;
            index++;
        }else if (c[index] == '+') {
            flag = true;
            index++;
        }else if (!Character.isDigit(c[index])) {
            return 0;
        }
        while (index < len) {
            if (!Character.isDigit(c[index])) {
                break;
            }else {
                if (flag) {
                    if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && c[index] - '0' > 7) {
                        return Integer.MAX_VALUE;
                    }
                }else {
                    if (-ans < Integer.MIN_VALUE / 10 || -ans == Integer.MIN_VALUE / 10 && c[index] - '0' > 8) {
                        return Integer.MIN_VALUE;
                    }
                }
            }
            ans = ans * 10 + c[index] - '0';
            index++;
        }
        return flag ? ans : -ans;
    }
}