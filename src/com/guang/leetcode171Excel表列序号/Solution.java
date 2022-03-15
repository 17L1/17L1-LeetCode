/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-09 11:45:16
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-09 11:52:23
 */
package com.guang.leetcode171Excel表列序号;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            int cur = columnTitle.charAt(i) - 'A';
            res = res * 26 + cur + 1;
        }
        return res;
    }
}
