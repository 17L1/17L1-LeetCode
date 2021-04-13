package com.guang.leetcode167TwoSum2;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {0,0};
        if (numbers.length < 2){
            return res;
        }
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                res[0] = i;
                res[1] = j;
                break;
            }else if (numbers[i] + numbers[j] < target){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }
}
