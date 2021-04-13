package com.guang.leetcode239滑动窗口最大值;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k){
        int len = nums.length;
        if (len < 1 || len < k){
            return new int[0];
        }
        int[] res = new int[len - k + 1];
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < len ; i++) {
            //判断队首元素是否移除滑动窗口
            if (i >= k && !list.isEmpty() && list.peekFirst() == i - k){
                list.removeFirst();
            }
            //依次判断待添加元素是否比队首元素大，注意可以取等号
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]){
                list.removeLast();
            }
            list.addLast(i);
            if (i >= k -1){
                res[i] = nums[list.peekFirst()];
            }
        }
        return res;
    }

}
