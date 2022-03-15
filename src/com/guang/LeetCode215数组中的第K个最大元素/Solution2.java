package com.guang.LeetCode215数组中的第K个最大元素;

/**
 * @author: 17L1
 * @date: 2021年07月26日 11:50 下午
 * @method：
 */
public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int n = len - 1;
        for (int i = n / 2; i >= 0 ; i--) {
            sink(nums, i, n);
        }

        for (int i = 0; i < k - 1; i++) {
            swap(nums, 0, n--);

            sink(nums, 0, n);
        }
        return nums[0];
    }

    private void sink(int[] nums, int k, int len) {
        while (2 * k + 1 <= len){
            int j = 2 * k + 1;
            if (j + 1 <= len && nums[j + 1] > nums[j]) {
                j = j + 1;
            }
//            if (nums[k] >= nums[j]){
//                break;
//            }
//            swap(nums, k, j);
//            k  = j;
            if (nums[k] < nums[j]){
                swap(nums, k, j);
            }else {
                break;
            }
            k = j;
        }
    }

    private void swap(int[] nums, int k, int j) {
        int temp = nums[k];
        nums[k] = nums[j];
        nums[j] = temp;
    }
}