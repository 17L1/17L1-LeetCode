/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-18 10:02:59
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-18 10:10:56
 */
package com.guang.leetcode413等差数列划分;

public class Solution2 {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return 0;
        }
        int L = 2;
        int left = 0;
        int right = 2;
        int gap = nums[1] - nums[0];
        int res = 0;
        for (int i = 2; i < len; i++) {
            int curGap = nums[i] - nums[i-1];
            if(curGap == gap) {
                L++;
            }else {
                res += (L-1) * (L-2) / 2;
                L = 2;
                gap = curGap;
            }
        }
        res += (L - 1) * (L - 2) / 2;
        return res;
    }
}

