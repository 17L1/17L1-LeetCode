/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-17 12:59:23
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-17 13:34:10
 */
package com.guang.leetcode400第N位数字;

public class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        int weigh = 1;//len表示当前数的位数，weigh表示当前位的权重(10^i)
        while(n > (long) 9 * weigh * len) {
            n -= 9 * weigh * len;
            len++;
            weigh += 10;
        }
        int curNum = (n-1) / len + weigh;
        int res = 0;
        for (int i = (n-1) % 10; i < len; i++) {
            res = curNum % 10;
            curNum /= 10;
        }
        return res;
    }
}
