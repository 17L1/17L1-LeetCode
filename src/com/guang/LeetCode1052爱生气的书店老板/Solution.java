package com.guang.LeetCode1052爱生气的书店老板;

public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int len = customers.length;
        int res = 0;
        int leftSum = 0;
        int winSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        for (int i = X; i < len; i++) {
            if (grumpy[i] == 0){
                rightSum += customers[i];
            }

        }
        for (int i = 0; i < X; i++) {
            winSum += customers[i];
        }
        maxSum = winSum + leftSum + rightSum;
        int left = 1;
        int right = X;

        while (right < len){
            if (grumpy[left - 1] == 0){
                leftSum += customers[left - 1];
            }
            winSum -= customers[left - 1];
            winSum += customers[right];
            if (grumpy[right] == 0){
                rightSum -= customers[right];
            }
            maxSum = Math.max(maxSum,leftSum + rightSum + winSum);
            left++;
            right++;
        }
        return maxSum;


    }
}
