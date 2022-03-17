/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-17 12:16:46
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-17 12:23:57
 */
package com.guang.leetcode383赎金信;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        for (char c : magazine.toCharArray()) {
            a[c -'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (a[c-'a'] == 0) {
                return false;
            }
            a[c - 'a']--;
        }
        return true;
    }
}

