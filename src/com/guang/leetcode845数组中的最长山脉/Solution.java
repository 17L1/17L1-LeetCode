package com.guang.leetcode845数组中的最长山脉;

import java.util.Arrays;

public class Solution {
    public static int longestMountain(int[] arr) {
        int len = arr.length;
        if (len < 1){
            return 0;
        }
        int[] dp1 = new int[len];
        int[] dp2 = new int[len];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for (int i = 1; i < len - 1; i++) {
            if (arr[i] > arr[i-1]){
                dp1[i] = dp1[i-1] + 1;
//                System.out.print(dp1[i] + "\t");
//                System.out.println();
            }
        }
        for (int i = len - 2; i >=0 ; i--) {
            if (arr[i] > arr[i+1]){
                dp2[i] = dp2[i+1]+1;
//                System.out.print(dp2[i] + "\t");
//                System.out.println();
            }
        }
        int res = 0;
        for (int i = 0; i <len-1 ; i++) {
            if (dp1[i] > 1 && dp2[i] > 1){
                res = Math.max(res,dp1[i]+dp2[i] - 1);
//                System.out.print(res + "\t");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,7,3,2,5};
        int res = longestMountain(arr);
        System.out.println("\n" + res);
    }
}
