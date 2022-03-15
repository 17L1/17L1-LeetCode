package com.guang.leetcode66加一;

import java.util.*;

/**
 * @author: 17L1
 * @date: 2022年03月05日 11:42 上午
 * @method：
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int num = 0;
        int t = 0;
        digits[len - 1]++;
        List<Integer> res = new ArrayList<>();
        for (int i = len - 1; i >= 0 || t != 0; i--) {
            int x = i >=0 ? digits[i] + t : t;
            res.add(x % 10);
            t = x / 10;
        }
        Collections.reverse(res);
        len = res.size();
        int[] ans = new int[len];
        int i = 0;
        for (int j = 0; j < len; j++) {
            ans[j] = res.get(j);
        }
        return ans;

    }
}
