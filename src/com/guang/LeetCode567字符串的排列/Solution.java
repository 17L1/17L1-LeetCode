package com.guang.LeetCode567字符串的排列;

import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2){
            return false;
        }
//        int left = 0;
//        int right = 0;
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for (int i = 0; i < len1; i++) {
            s1Array[s1.charAt(i) - 'a']++;
            s2Array[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Array,s2Array)){
            return true;
        }
        for (int i = len1; i < len2; i++) {
            s2Array[s2.charAt(i - len1) - 'a']--;
            s2Array[s2.charAt(i) - 'a']++;
            if (Arrays.equals(s2Array,s1Array)){
                return true;
            }
        }
        return false;
    }
}
