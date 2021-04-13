package com.guang.leetcode50PowXn;

public class Solution {
    public double myPow(double x, int n) {
        double res = 1.0f;
        if (n == 0){
            return 1;
        }
        if (n < 0){
            x = 1 / x;
            n = - n;
        }
        if (n == 1){
            return x;
        }
        while (n > 0){
            if (n % 2 == 0){
                x *= x;
                n /= 2;
            }else{
                res *= x;
                n--;
            }
        }
        return res;

    }
}
