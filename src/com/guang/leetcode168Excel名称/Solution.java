/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-09 10:33:40
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-09 11:45:08
 */
package com.guang.leetcode168Excel名称;

import java.util.HashMap;
import java.util.Map;
public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            res.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }    
}
