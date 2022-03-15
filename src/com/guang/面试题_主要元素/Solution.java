package com.guang.面试题_主要元素;

/**
 * @author: 17L1
 * @date: 2021年07月09日 10:36 下午
 * @method：
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        if (len < 1){
            return -1;
        }
        int x = -1;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (cnt == 0){
                x = nums[i];
                cnt = 1;
            }else {
                cnt += x == nums[i] ? 1 : -1;
            }
        }
        cnt = 0;
        for(int i : nums){
            if (x == i){
                cnt++;
            }
        }
        if (cnt > len / 2){
            return x;
        }
        return -1;
    }
}
