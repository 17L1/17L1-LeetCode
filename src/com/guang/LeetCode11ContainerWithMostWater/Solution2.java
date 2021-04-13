package com.guang.LeetCode11ContainerWithMostWater;
/*
使用对撞指针
 */
public class Solution2 {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end){
            int high;
            int width = end - start;
            if (height[start] < height[end]){
                high = height[start];
                start++;
            }else {
                high = height[end];
                end--;
            }
            int temp = high * width;
            if (temp > max){
                max = temp;
            }

        }
        return max;

    }
}
