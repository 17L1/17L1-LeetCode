/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-16 14:06:55
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-16 14:38:57
 */
package com.guang.leetcode318最大单词长度乘积;

public class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        int idx = 0;
        int[] masks = new int[len];
        for (String w : words) {
            int t = 0;
            for (int i = 0; i < w.length(); i++) {
                int u = w.charAt(i) - 'a';
                t |= (1 << u);
            }
            masks[idx++] = t;
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        
        }
        return ans;
    }
}
