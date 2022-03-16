/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-16 15:41:00
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-16 15:45:34
 */
package com.guang.leetcode345反转字符串中的元音字母;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        if (set.contains('A')) {
            System.out.println("yes");
        }
        System.out.println("No-------");
    }
}

