package com.guang.leetcode438找到字符串中所有字母异位词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public List<Integer> findAnagrams(String s, String p){
        int lenS = s.length();
        int lenP = p.length();
        List<Integer> res = new ArrayList<>();
        if (lenS < lenP){
            return res;
        }
        int[] pArray = new int[26];
        int[] sArray = new int[26];
        for (int i = 0; i < lenP; i++) {
            pArray[p.charAt(i) - 'a']++;
            sArray[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pArray,sArray)){
            res.add(0);
        }
        for (int i = lenP; i < lenS; i++) {
            sArray[s.charAt(i - lenP) - 'a']--;
            sArray[s.charAt(i) - 'a']++;
            if (Arrays.equals(sArray,pArray)){
                res.add(i);
            }
        }
        return res;
    }
}
