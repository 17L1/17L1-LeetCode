/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-08 10:35:01
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-08 11:50:08
 */
package com.guang.leetcode165比较版本号;

public class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length(); 
        int i = 0, j = 0;
        while (i < len1 || j < len2) {
            int v1 = 0;
            int v2 = 0;
            while (i < len1 && version1.charAt(i) != '.') {
                v1 = v1 * 10 + version1.charAt(i) - '0';
                i++;
            }

            while (j < len2 && version2.charAt(j) != '.') {
                v2 = v2 * 10 + version2.charAt(j) - '0';
                j++;
            }

            if (v1 > v2) {
                return 1;
            }else if (v1 < v2) {
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
