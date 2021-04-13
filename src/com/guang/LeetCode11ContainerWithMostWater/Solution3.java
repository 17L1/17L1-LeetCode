package com.guang.LeetCode11ContainerWithMostWater;

public class Solution3 {
    public int maxArea(int[] height){
        int len = height.length;
        if (len < 2){
            return 0;
        }
        int res = 0;
        int left = 0;
        int right = len - 1;
        while (left < right){
            if (height[left] < height[right]){
                res = Math.max(height[left] * (right - left), res);
                left++;
            }else{
                res = Math.max(height[right] * (right - left), res);
                right--;
            }
        }
        return res;
    }
}
