package com.guang.leetcode43字符串相乘;

/**
 * @author: 17L1
 * @date: 2022年03月04日 7:38 下午
 * @method：
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.length() == 0) {
            return "0";
        }
        if(num2.length() == 0) {
            return "0";
        }
        long num1Long = stringToLong(num1);
        long num2Long = stringToLong(num2);
        return String.valueOf(num1Long * num2Long);
    }

    private long stringToLong(String num) {
        char[] c = num.toCharArray();
        long res = 0;
        for(int i = 0; i < c.length; i++) {
            res += res * 10 + (c[i] - '0' );
        }
        return res;
    }
}
