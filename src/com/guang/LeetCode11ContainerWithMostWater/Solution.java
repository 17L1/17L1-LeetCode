package com.guang.LeetCode11ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height){
        int max = Integer.MIN_VALUE;
        if (height.length < 2){
            return 0;
        }
        int area;
        for (int i = 0; i < height.length - 1 ; i++) {
            for (int j = i + 1; j < height.length; j++) {
                area =( height[i] > height[j] ? height[j] : height[i]) * (j - i);
                if (area >max){
                    max = area;
                }
            }
        }
        return max;
    }
}
