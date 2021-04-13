package com.guang.LeetCode349IntersectionOfTwoArrays;

import java.util.Arrays;

public class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int p1 = 0, p2 = 0;
        int[] intersection = new int[len1 + len2];
        int index = 0;
        while (p1 < len1 && p2 < len2){
            int num1 = nums1[p1];
            int num2 = nums2[p2];
            if(num1 == num2){
                if (index == 0 || intersection[index-1] != num1){
                    intersection[index++] = num1;
                    p1++;
                    p2++;
                }

            }
            if (num1 > num2){
                p2++;
            }else {
                p1++;
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
    }

}
