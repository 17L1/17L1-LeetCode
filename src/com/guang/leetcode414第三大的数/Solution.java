/*
 * @Description: 排序 时间复杂度O(nlogn)
 * @Author: lilongguang
 * @Date: 2022-03-18 10:12:41
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-18 10:21:25
 */
package com.guang.leetcode414第三大的数;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if (len < 3) {
            return nums[len-1];
        }
        int idx = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx++;
            }
            if (idx == 3) {
                return nums[i];
            }
        }
        return nums[len-1];
    }
}
