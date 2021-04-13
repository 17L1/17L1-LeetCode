package com.guang.leetcode137SingleNumber2;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32 ; i++) {
            int sum = 0;
            for(int num : nums){
                sum+=(num>>i) & 1;
            }
            res ^= (sum%3 << 1);
        }
        return res;
    }
}
