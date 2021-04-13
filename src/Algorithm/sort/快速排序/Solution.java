package Algorithm.sort.快速排序;

import javax.swing.plaf.ProgressBarUI;

public class Solution {
    public int[] sortArray(int[] nums){
        int len = nums.length;
        quickSort(nums,0,len - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        while (left < right){
            int index = patrition(nums,left,right);
            quickSort(nums,left,index-1);
            quickSort(nums,index + 1,right);
        }
    }

    private int patrition(int[] nums, int left, int right) {
        int tmp = nums[left];
        int start = left;
        while (left < right){
            while (left < right && nums[right] >= tmp){
                right--;
            }
            while (left < right && nums[left] <= tmp){
                left++;
            }
            if (left >= right){
                break;
            }
            swap(nums,left,right);
        }
        swap(nums,left,start);
        return left;
    }
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
