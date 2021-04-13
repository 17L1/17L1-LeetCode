package com.guang.LeetCode76最小覆盖子串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t){
        int left = 0;
        int start = 0;
        int right = 0;
        int sLen = s.length();
        int len = Integer.MAX_VALUE;
        int valid = 0;
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        while (right < sLen){
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)){
                have.put(c,have.getOrDefault(c,0) + 1);
                if (have.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            while (valid == need.size()){
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                char a = s.charAt(left);
                left++;
                if (need.containsKey(a)){
                    if (need.get(a).equals(have.get(a))){
                        valid--;
                    }
                    have.put(a,have.get(a) - 1);
                }
            }

        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start,start + len);
    }
}
