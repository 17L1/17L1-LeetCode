package com.guang.LeetCode215数组中的第K个最大元素;

public class Solution {
    public int findKthLargest(int[] nums, int k){
        int len = nums.length;
        int[] a =new  int[len+1];
        for (int i = 1; i <= len; i++) {
            a[i] = nums[i-1];
        }
        for (int i = 1; i <= k ; i--) {
            sink(a,i,len);
        }
        for (int i = 1; i < k; i++) {
            swap(a,1,len--);
            sink(a,1,len);
        }
        return a[1];

    }
    private static void sink(int[] a, int k, int len){
        while (2 * k <= len){
            int j = 2 * k;
            if (j < len && a[j] < a[j+1]){
                j += 1;
            }
            if (a[j] > a[k]){
                swap(a,j,k);
            }else{
                break;
            }
            k = j;
        }
    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
