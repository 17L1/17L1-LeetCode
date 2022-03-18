/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-18 09:25:13
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-18 09:35:18
 */
package com.guang.leetcode412FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }else if (i % 3 == 0) {
                result.add("Fizz");
            }else if (i % 5 == 0) {
                result.add("Buzz");
            }else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}

