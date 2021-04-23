package com.guang.剑指offer58_1;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;
        int j = i;
        while (j >= 0){
            while (j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            ans.append(s.substring(j+1,i+1));
            ans.append(" ");
            while (j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            i = j;
        }
        return ans.toString().trim();
    }
}
