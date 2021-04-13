package com.guang.leetcode1438绝对差不超过限制的最长连续子数组;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> queMax = new LinkedList<>();
        Deque<Integer> queMin = new LinkedList<>();
        int n = nums.length;
        int left = 0,right = 0;
        int res = 0;
        while (right < n){
            while (!queMax.isEmpty() && queMax.peekLast() < nums[right]){
                queMax.pollLast();
            }
            while (!queMin.isEmpty() && queMin.peekLast() > nums[right]){
                queMin.pollLast();
            }
            queMax.offerLast(nums[right]);
            queMin.offerLast(nums[right]);
            while(!queMax.isEmpty() && !queMin.isEmpty() &&queMax.peekFirst() - queMin.peekFirst() > limit){
                if (nums[left] == queMin.peekFirst()){
                    queMin.pollFirst();
                }
                if (nums[left] == queMax.peekFirst()){
                    queMax.pollFirst();
                }
                left++;
            }
            res = Math.max(res,right + 1 - left);
            right++;


        }
        return res;
    }
}
