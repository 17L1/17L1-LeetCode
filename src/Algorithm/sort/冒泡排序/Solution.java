package Algorithm.sort.冒泡排序;

public class Solution {
    public int[] sortArray(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = i; j < len; j++) {
                if (nums[i] > nums[j]){
                    swap(nums,i,j);
                }
            }
        }
        return nums;
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
