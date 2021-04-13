package com.guang.leetcode70ClimbingStairs;

public class Solution2 {
    public int climbStairs(int n){
        int sum = 0;
        if (n == 1){
            return 1;
        }
        int pre = 1;
        int cur = 2;
        for (int i = 3; i <= n ; i++) {
            sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return sum;
    }
}
