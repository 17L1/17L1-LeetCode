package com.guang.leetcode69SqrtX;

public class Solution {
    public int mySqrt(int x) {
//        int low = 1;
//        int high = x;
//        int mid;
//        if (x == 0){
//            return 0;
//        }
//        if (x == 1){
//            return 1;
//        }
//        while ( low <= high){
//            mid = low + (high - low) / 2;
//            if (mid * mid == x){
//                return mid;
//            }
//            if (mid * mid < x && (mid + 1) * (mid + 1) > x){
//                return mid;
//            }
//            if (mid * mid < x){
//                low = mid + 1;
//            }else {
//                high = mid - 1;
//            }
//        }
//        return low;

        if (x == 0){
            return 0;
        }
        int low = 1;
        int high = x;
        int res = 0;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (mid < x / mid){
                low = mid + 1;
                res = mid;
            }else if (mid == x / mid){
                return mid;
            }else {
                high = mid - 1;
            }
        }
        return res;
    }
}
