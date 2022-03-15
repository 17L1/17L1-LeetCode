package org.llg.二分法.LeetCode35搜索插入位置;

/**
 * @author: 17L1
 * @date: 2021年07月09日 11:01 下午
 * @method：给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len < 1){
            return 0;
        }
        if (nums[len - 1] < target){
            return len;
        }
        int left = 0;
        int right = len - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
