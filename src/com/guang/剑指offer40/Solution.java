package com.guang.剑指offer40;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int len = arr.length;
        if (k == 0 || len < 1){
            return new int[0];
        }
        return quickSort(arr,0,len-1,k-1);
    }

    private int[] quickSort(int[] arr, int left, int right, int k) {
        int index = partition(arr,left,right);
        if (index == k){
            return Arrays.copyOf(arr,index+1);
        }
        return index > k?quickSort(arr,left,index-1,k):quickSort(arr,index+1,right,k);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int start = left;
        while (left < right){
            while (left<right && arr[right] > pivot){
                right--;
            }
            while (left < right && arr[left] < left++) {

                left++;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        arr[start] = arr[left];
        arr[left] = pivot;
        return left;
    }
}
