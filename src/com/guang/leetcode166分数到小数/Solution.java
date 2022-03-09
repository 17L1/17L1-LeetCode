/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-08 11:51:03
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-09 10:44:45
 */
package com.guang.leetcode166分数到小数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long a = numerator;
        long b = denominator;
        StringBuilder res = new StringBuilder("");
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            res.append("-");
        }
        if (a == 0) {
            return "0";
        }
        a = Math.abs(a);
        b = Math.abs(b);
        res.append(String.valueOf(a/b) + ".");
        a = a % b;
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        while(a != 0) {
            map.put(a, res.length());
            a *= 10;
            res.append(String.valueOf(a / b));
            a = a % b;
            if(map.containsKey(a)) {
                int u = map.get(a);
                return String.format("%s(%s)", res.substring(0,u), res.substring(u));
            }
        }
        if(res.charAt(res.length() - 1) == '.'){
            return res.substring(0, res.length() - 1);
        }
        return res.toString();

    }
}
