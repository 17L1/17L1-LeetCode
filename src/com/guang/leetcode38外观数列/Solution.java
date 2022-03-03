package com.guang.leetcode38外观数列;

public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        if (n == 1) {
            return str;
        }
        int[] num = {1,2,3,4,5,6,7,8,9};
        while (n >= 1) {
            char[] c = str.toCharArray();
            StringBuilder nextStr = new StringBuilder("");
            int len = str.length();
            int count = 1;
            for (int i = 1; i < len; i++) {
                if (c[i] == c[i-1]) {
                    count++;
                }else if(i == len - 1) {
                    nextStr.append(count + c[i-1]);
                    nextStr.append("1" + c[i]);
                }else {
                    nextStr.append(count + c[i-1]);
                    count = 1;
                }
            }
            str = nextStr.toString();
            n--;
        }
        return str;
    }
}
