package com.guang.剑指offer58_1;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            int j = i;
            while (s.charAt(i) != ' ' && i >= 0){
                i--;
            }
            ans.append(s.substring(i+1,j+1));
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
