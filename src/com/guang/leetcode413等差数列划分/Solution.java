package com.guang.leetcode413等差数列划分;
/*
 *
 * @author 17L1
 * @date 2022/3/18 9:59 上午
 * @method: 动态规划
 * @return null
 */
public class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        int[] dp = new int[len];
        int res = 0;
        for (int i = 2; i < len; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                dp[i] = dp[i-1] + 1;
                res += dp[i];
            }
        }
        return res;
     }
}
