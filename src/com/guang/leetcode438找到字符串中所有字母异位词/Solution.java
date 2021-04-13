package com.guang.leetcode438找到字符串中所有字母异位词;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Solution {
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();
        int lenS = s.length();
        int lenP = p.length();
        if (lenS < lenP){
            return res;
        }
        int left = 0;
        int right =0;
        int valid = 0;
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < lenP; i++) {
            need.put(p.charAt(i),need.getOrDefault(p.charAt(i),0) + 1);

        }
        HashMap<Character, Integer> have = new HashMap<>();
        while (right < lenS){
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)){
                have.put(c,have.getOrDefault(c,0) + 1);
                if (have.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            while (right - left >= lenP){
                if (valid == need.size()){
                    res.add(left);
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)){
                    if (have.get(d).equals(need.get(d))){
                        valid--;
                    }
                    have.put(d,have.get(d)-1);
                }

            }

//            while (valid == need.size()){
//                res.add(left);
//                char d = s.charAt(left);
//            }

        }
        return res;

    }
}
