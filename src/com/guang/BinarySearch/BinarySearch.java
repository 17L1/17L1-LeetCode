package com.guang.BinarySearch;

public class BinarySearch {
    public boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high){
            mid = low  + (high - low) / 2;
            if (nums[mid] == target){
                return true;
            }else if (target > nums[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return false;

    }
}
