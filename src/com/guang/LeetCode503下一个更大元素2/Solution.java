package com.guang.LeetCode503下一个更大元素2;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        if(len < 1){
            return new int[0];
        }
        if(len == 1){
            return new int[]{-1};
        }
        int[] res= new int[len];
        for(int i = 0; i < len; i++){
            int light = 0;
            for(int j = i; j < len; j++){
                if(nums[j] > nums[i]){
                    res[i] = nums[j];
                    light = 1;
                    break;
                }
            }
            if(light == 0){
                for(int k = 0; k < i; k++){
                    if(nums[k] > nums[i]){
                        res[i] = nums[k];
                        light = 1;
                        break;
                    }
                }
            }
            if(light == 0){
                res[i] = -1;
            }
            //res[i] = -1;
        }
        return res;
    }
}
