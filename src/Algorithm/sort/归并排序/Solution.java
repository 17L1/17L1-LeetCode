package Algorithm.sort.归并排序;

import java.util.Arrays;

public class Solution {
    public int[] sortArray(int[] nums){
        int len = nums.length;
        if (len < 2){
            return nums;
        }
        mergeSort(nums,0,len - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        while (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(nums,left, mid);
            mergeSort(nums,mid + 1, right);
            merge(nums,left,mid,right);
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] arr = new int[right - left + 1];
        int temp1= left;
        int temp2 = mid + 1;
        int index = 0;
        while (temp1 <= mid && temp2 <= right){
            if (nums[temp1] <= nums[temp2]){
                arr[index++] = nums[temp1++];
            }else {
                arr[index++] = nums[temp2++];
            }
        }
        while (temp1<=mid){
            arr[index++] = nums[temp1++];
        }
        while (temp2<=right){
            arr[index++] = nums[temp2++];
        }
        System.arraycopy(arr,0,nums,left,right - left + 1);
    }
}
