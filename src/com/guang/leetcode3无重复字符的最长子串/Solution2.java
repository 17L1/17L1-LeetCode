package com.guang.leetcode3无重复字符的最长子串;

import java.util.Arrays;

/**
 * @author: 17L1
 * @date: 2021年07月25日 5:31 下午
 * @method：滑动窗口优化
 */
public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int[] windows = new int[128];
        Arrays.fill(windows, -1);

        char[] arr = s.toCharArray();
        int res = 1;
        int left = 0;
        for (int right = 0; right < len; right++) {
            if (windows[arr[right]] != -1){
                left = Math.max(left, windows[arr[right]]);
            }
            windows[arr[right]] = right;
            res = Math.max(res, right - left + 1);
        }
        return res;

    }
}