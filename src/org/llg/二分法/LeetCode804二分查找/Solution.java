package org.llg.二分法.LeetCode804二分查找;

/**
 * @author: 17L1
 * @date: 2021年07月09日 10:13 下午
 * @method：
 */
public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len < 1){
            return -1;
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
        if (nums[left] == target){
            return left;
        }
        return -1;
    }
}
