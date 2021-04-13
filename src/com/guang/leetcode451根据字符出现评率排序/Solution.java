package com.guang.leetcode451根据字符出现评率排序;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String frequencySort(String s) {
        int len = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);

        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(((o1, o2) -> o2.getValue()- o1.getValue()));
        StringBuilder str = new StringBuilder();
        for ( Map.Entry<Character,Integer> m: list
             ) {
            for (int i = 0; i < m.getValue(); i++) {
                str.append(m.getKey());
            }

        }
        return str.toString();

    }
}
