/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-17 12:28:14
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-17 12:28:14
 */
package com.guang.leetcode393Utf_8编码验证;

class Solution {
    static int b = 0b10000000, m = 0b11000000;
    public boolean validUtf8(int[] data) {
        int cnt = 0;
        for (int d: data) {
            if (cnt > 3) return false; // 超过4字节，不合法
            else if (cnt > 0) { // 不是首字节
                if ((d & m) != b) return false; // 必须以 10 开头
                else --cnt;
            }
            else {
                if ((d & b) == 0) continue; // 一字节的字符
                else if ((d & m) == b) return false; // 不能以10开头
                while ((d & b) != 0) {
                    ++cnt;
                    d <<= 1;
                }
                --cnt;
            }
        }
        return cnt == 0;
    }
}
