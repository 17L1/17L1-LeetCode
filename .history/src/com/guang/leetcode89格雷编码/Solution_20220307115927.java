/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-07 11:39:06
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-07 11:59:27
 */
package com.guang.leetcode89格雷编码;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        while (n-- > 0) {
            int m = result.size();
            for (int i = m - 1; i >= 0; i--) {
                result.set(i, result.get(i) << 1);
                result.add(result.get(i) + 1);
            }
        }
        return result;    
        }
}
