package com.guang.leetcode6Z字形变换;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (len < 1 || numRows < 2) {
            return s;
        }
        List<StringBuilder> res = new ArrayList<>();
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < numRows; i++) {
            res.add(new StringBuilder(""));
        }
        int i = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            res.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = - flag;
            }
            i += flag;
        }
        for (StringBuilder str : res) {
            ans.append(str);
        }
        return ans.toString();
    }
}
