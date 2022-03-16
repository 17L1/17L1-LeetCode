/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-16 15:47:45
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-16 15:57:34
 */
package com.guang.leetcode345反转字符串中的元音字母;

public class Solution2 {
    static boolean[] hash = new boolean[128];
    static char[] vowels = new char[]{'a','e','i','o','u'};
    static {
        for(char c : vowels) {
            hash[c - ' '] = hash[Character.toUpperCase(c) - ' '] = true;
        }
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int len = s.length();
        int left = 0, right = len - 1;
        while(left < right) {
            if (hash[ch[left] - ' '] && hash[ch[right] - ' ']) {
                swap(ch, left++, right--);
            }
            if (!hash[ch[left] - ' ']) {
                left++;
            }
            if (!hash[ch[right] - ' ']) {
                right--;
            }
        }
        return String.valueOf(ch);
    }
    private void swap(char[] ch, int left, int right) {
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
    }
}
