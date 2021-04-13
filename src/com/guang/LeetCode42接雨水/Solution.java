package com.guang.LeetCode42接雨水;

public class Solution {
    public int trap(int[] height){
        int len = height.length;
        if (len < 3){
            return 0;
        }
        int res = 0;
        int leftMax = height[0];
        int rightMax = height[len - 1];
        int left = 1;
        int right = len - 2;
        while (left <= right){
            int minVal = Math.min(leftMax, rightMax);
            if (minVal == leftMax){
                if (minVal > height[left]){
                    res += minVal - height[left];

                }
                leftMax = Math.max(height[left],minVal);
                left++;
            }else{
                if (minVal > height[right]){
                    res += minVal - height[right];
                }
                rightMax = Math.max(minVal,height[right]);
                right--;
            }
        }
        return res;
    }
}
