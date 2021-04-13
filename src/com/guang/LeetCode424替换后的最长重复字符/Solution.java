package com.guang.LeetCode424替换后的最长重复字符;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int characterReplacement(String s, int k){
        int max = 0;
        int len = s.length();
        int left = 0;
        int[] arr = new int[26];
        int right = 0;
        for (; right < len; right++) {
            int index = s.charAt(right) - 'A';
            arr[index]++;
            max = Math.max(max,arr[index]);
            if (max + k < right -left + 1){
                arr[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return right - left;
    }
}
