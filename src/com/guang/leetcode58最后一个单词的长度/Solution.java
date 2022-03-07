/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-04 20:42:29
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-04 20:44:17
 */
package com.guang.leetcode58最后一个单词的长度;

public class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int res = 0;
        if (len == 1) {
            return 1;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && res != 0){
                return res;
            }else if (s.charAt(i) == ' '){
                continue;
            }
            res++;
        }
        return res;
    }
}