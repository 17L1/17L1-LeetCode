package com.guang.leetcode343IntegerBreak;

public class Solution {
    public int integerBreak(int n) {
        if (n <= 3){
            return n-1;
        }
        int x = n / 3;
        int y = n % 3;
        if (y == 0){
            return (int)Math.pow(3,x);
        }
        if (y==1){
            return (int)Math.pow(3,x-1) * 4;
        }
        return (int)Math.pow(3,x) * 2;

    }
}
