package com.guang.leetcode31下一个排列;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        int[] num = {1,2,3};
        so.nextPermutation(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
