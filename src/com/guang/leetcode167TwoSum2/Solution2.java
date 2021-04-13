package com.guang.leetcode167TwoSum2;

public class Solution2 {
    public int[] twoSum(int[] numbers, int target){
        int[] res = new int[2];
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left < right){
            if (numbers[left] + numbers[right] > target){
                right--;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            }else {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
        }
        return res;
    }
}
