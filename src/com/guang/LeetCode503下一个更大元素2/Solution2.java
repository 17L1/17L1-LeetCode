package com.guang.LeetCode503下一个更大元素2;

import java.util.Arrays;
import java.util.Stack;

public class Solution2 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len * 2; i++) {
            while (!stack.isEmpty() && nums[i % len] > nums[stack.peek()]){
                res[stack.pop()] = nums[i % len];
            }
            stack.push(i%len);
        }
        return res;

    }
}
