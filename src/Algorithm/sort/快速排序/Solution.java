package Algorithm.sort.快速排序;

import javax.swing.plaf.ProgressBarUI;

public class Solution {
    public static int[] sortArray(int[] nums){
        int len = nums.length;
        quickSort(nums,0,len - 1);
        return nums;
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left < right){
            int index = patrition(nums,left,right);
            quickSort(nums,left,index-1);
            quickSort(nums,index + 1,right);
        }
    }

    private static int patrition(int[] nums, int left, int right) {
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
    private static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,5};
        int[] res = sortArray(nums);
        for (int i : res){
            System.out.println(i);
        }
    }
}
