/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-16 15:30:00
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-16 15:47:53
 */
package com.guang.leetcode345反转字符串中的元音字母;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                sb.append(c);
            }
        }
        sb.reverse();
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if(set.contains(c)) {
                ans.append(sb.charAt(idx));
                idx++;
            }else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
